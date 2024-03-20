package com.yourcompany.betwin.model;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.authentication.builders.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.config.annotation.web.configuration.*;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        // Exemple d'authentification en mémoire. Dans la pratique, utilisez une authentification basée sur une base de données.
        auth
            .inMemoryAuthentication()
                .withUser("user").password("{noop}password").roles("PARIEUR")
                .and()
                .withUser("admin").password("{noop}admin").roles("BOOKMAKER", "PARIEUR");
    }
}
