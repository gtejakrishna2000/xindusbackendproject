package com.example.XindusEcommerce.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Autowired
    private  UserDetailsService userDetailsService;

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // security filter chain authorize the user
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // role based authentication only one user presents
        return  http.csrf(csrf -> csrf.disable()) // disable the csrf filter, its not required for us now.mentioned full details about csrf filter in document in security section
                .httpBasic(Customizer.withDefaults())  // basic login option
                .authorizeHttpRequests(req -> req
                        .requestMatchers("/register/**").permitAll()
                        .requestMatchers("/login").permitAll()
                        .requestMatchers("/user/**").hasAnyAuthority("user") // make the authorization according to our  requirements
                        .anyRequest().authenticated()) // any request authenticate

                .userDetailsService(userDetailsService).build();

    }

}
