package com.auth.secutirity.authenticate.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private SecurityDatabaseService securityDatabaseService;

    @Autowired
    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(securityDatabaseService).passwordEncoder(NoOpPasswordEncoder.getInstance());
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        this.globalUserDetails(auth);
        /*auth.inMemoryAuthentication()
                .withUser("user")
                .password("{noop}user123")
                .roles("user")
                .and()
                .withUser("admin")
                .password("{noop}master123")
                .roles("manager");*/
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        /*http.csrf().disable();
        http.headers().frameOptions().disable();*/


        http.authorizeHttpRequests()
                .antMatchers("/").permitAll()
                .antMatchers(HttpMethod.POST,"/login").permitAll()
                .antMatchers("/manager").hasAnyRole("manager")
                .antMatchers("/user").hasAnyRole("user","manager")
                .anyRequest().authenticated().and().httpBasic();
                /*.formLogin();*/
    }
}
