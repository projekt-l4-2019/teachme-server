package pl.example.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import pl.example.models.UserEntity;
import pl.example.repository.UserRepository;
import pl.example.service.UserService;


import javax.jws.soap.SOAPBinding;
import javax.persistence.GeneratedValue;
import java.util.Arrays;
import java.util.Date;

@EnableWebSecurity
@EnableOAuth2Sso
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final long MAX_AGE_SECS = 3600;

    @Autowired UserService userService;

    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("https://projekt-l4-2019.github.io","https://rhubarb-cobbler-84890.herokuapp.com"));
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "OPTIONS", "DELETE", "PUT", "PATCH"));
        configuration.setAllowedHeaders(Arrays.asList("X-Requested-With", "Origin", "Content-Type", "Accept", "Authorization"));
        configuration.setAllowCredentials(true);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/login", "/hello")
                .authenticated()
                .antMatchers("/*")
                .permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("https://accounts.google.com/o/oauth2/v2/auth/exit");
        http.cors().configurationSource(request -> new CorsConfiguration().applyPermitDefaultValues());
        http.csrf().disable();
    }

    @Bean
    public PrincipalExtractor principalExtractor(UserRepository userRepository){
        return map -> {
            String email2 = (String)map.get("email");
            Date date = new Date();
            userService.setUserRepository(userRepository);
            UserEntity user = userRepository.findByEmail(email2);
            if(user == null){
                user = new UserEntity();
                user.setIdUser(3);
                user.setName((String)map.get("given_name"));
                user.setSurname((String)map.get("family_name"));
                user.setEmail((String)map.get("email"));
                user.setAvatar((String)map.get("picture"));
                user.setBirthDate((java.sql.Date) date);
                userService.addUser(user);
            }
            return user;
        };
    }
}