package ciklum.rockpaperscissors.backendapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    protected void configure(final HttpSecurity http) throws Exception {
        http.csrf().and().cors().disable().authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/socket").permitAll();
    }
}
