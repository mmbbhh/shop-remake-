/*
package com.mmbbhh.shop.server;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter{
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws
            Exception {
        resources.resourceId("rid").stateless(true);
    }
    @Override
    public void configure(HttpSecurity http)
            throws Exception {
        http.authorizeRequests()
                .antMatchers("/home/**").permitAll()
                .antMatchers("/category/**").permitAll()
                .antMatchers("/goods/**").permitAll()
                .antMatchers("/resign").permitAll()
                .antMatchers("/collect/**").access("hasAnyRole('admin','user')")
                */
/*.antMatchers("/admin/**").hasRole("admin")
                .antMatchers("/db/**").hasRole("dba")
                .antMatchers("/user/**").hasRole("user")*//*

                .anyRequest().authenticated();
    }
}
*/
