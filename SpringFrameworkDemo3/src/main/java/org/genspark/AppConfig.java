package org.genspark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Student getStudent() {
        return new Student();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Address getAddress() {
        return new Address();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Phone getPhone() {
        return new Phone();
    }

}
