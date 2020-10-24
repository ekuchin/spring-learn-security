package ru.projectosnova.springlearnsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SpringBeans {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return (PasswordEncoder) new BCryptPasswordEncoder();
    }
}
