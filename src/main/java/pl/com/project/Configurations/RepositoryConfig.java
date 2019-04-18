package pl.com.project.Configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import pl.com.project.Notices.Notice;
import pl.com.project.Users.Person;

@Configuration
    public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
        @Override
        public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
            config.exposeIdsFor(Person.class);
            config.exposeIdsFor(Notice.class);
        }
    }