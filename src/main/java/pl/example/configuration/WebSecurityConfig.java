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
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import pl.example.models.CityEntity;
import pl.example.models.UserrEntity;
import pl.example.repository.CityRepository;
import pl.example.repository.UserRepository;
import pl.example.service.UserService;


import java.util.Arrays;

@EnableWebSecurity
@EnableOAuth2Sso
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final long MAX_AGE_SECS = 3600;

    @Autowired
    UserService userService = new UserService();

    @Autowired
    CityRepository cityRepository;

    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("Access-Control-Allow-Origin", "*"));
        configuration.setAllowedHeaders(Arrays.asList("Access-Control-Request-Headers", "*"));
        configuration.setAllowedMethods(Arrays.asList("Access-Control-Allow-Methods" , "DELETE,GET, pOST, PTIONS,  PUT, PATCH"));
        configuration.setAllowedHeaders(Arrays.asList("Access-Control-Allow-Origin", "Origin, X-Requested-With,X-HTTP-Method-Override, Content-Type, Accept, Authorization"));
        configuration.setAllowCredentials(true);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/profileedit**", "/addnotice**", "/contact**", "/addopinion**", "/login**")
                .authenticated()
                .antMatchers("/index**")
                .permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("https://projekt-l4-2019.github.io/index.html").permitAll();
       // http.cors().configurationSource(request -> new CorsConfiguration().applyPermitDefaultValues());
        http.csrf().disable();
    }

    @Bean
    public PrincipalExtractor principalExtractor(UserRepository userRepository){
        return map -> {
            String email = (String)map.get("email");
            CityEntity city = cityRepository.findById(1).get();
            UserrEntity userr = userRepository.findByEmail(email);
            if(userr == null){
                userr = new UserrEntity();
                userr.setName((String)map.get("given_name"));
                userr.setSurname((String)map.get("family_name"));
                userr.setEmail((String)map.get("email"));
                userr.setAvatar((String)map.get("picture"));
                userr.setCityByCityIdCity(city);
                userRepository.save(userr);
            }
            userService.setCurrentUserId(userr.getIdUser());
            return userr;
        };
    }
}