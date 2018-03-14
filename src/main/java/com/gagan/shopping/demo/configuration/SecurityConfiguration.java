package com.gagan.shopping.demo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .and()
                .httpBasic();
        /*The default configuration above:

        Ensures that any request to our application requires the user to be authenticated
        Allows users to authenticate with form based login
        Allows users to authenticate with HTTP Basic authentication*/

    }

    //In memory authentication java configuration
    //Not web-specific
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication() //Adds a UserDetailsManagerConfigurer
                //login, password and supported role
                .withUser("user").password("password").roles("USER").and()
                .withUser("admin").password("dinesh").roles("ADMIN");
    }
}
