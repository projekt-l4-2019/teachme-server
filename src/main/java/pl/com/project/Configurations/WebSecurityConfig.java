package pl.com.project.Configurations;


import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import pl.com.project.Users.PeopleRepository;
import pl.com.project.Users.Person;

@Configuration
@EnableOAuth2Sso
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests().antMatchers("/addnotice").authenticated();
        http.cors().configurationSource(request -> new CorsConfiguration().applyPermitDefaultValues());
        http.csrf().disable();
    }

    @Bean
    public PrincipalExtractor principalExtractor(PeopleRepository peopleRepository){
        return map -> {
            String principalId = (String) map.get("id");
            Person person = peopleRepository.findByPrincipalId(principalId);
            if(person == null){
                person = new Person();
                person.setName((String)map.get("given_name"));
                person.setSurname((String)map.get("family_name"));
                person.setEmail((String)map.get("email"));
                person.setAvatar((String)map.get("picture"));
            }
            peopleRepository.save(person);
            return person;
        };
    }
}
