//package com.example.week8_lab_20008831_lethanhtung.configs;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.crypto.password.PasswordEncoder;
//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity
//public class configureGlobal {
//    @Autowired
//    public void globalConfig(AuthenticationManagerBuilder auth, PasswordEncoder encoder)throws Exception{
//        auth.jdbcAuthentication()
//                .withUser(User.withUsername("user")
//                        .password(encoder.encode("user"))
//                        .roles("USER")
//                        .build())
//
//                .withUser(User.withUsername("admin")
//                        .password(encoder.encode("admin"))
//                        .roles("ADMIN","USER")
//                        .build())
//        ;
//    }
//}
