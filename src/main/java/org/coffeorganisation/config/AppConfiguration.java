package org.coffeorganisation.config;
import org.coffeorganisation.lang.Functions_for_Coffee_Machine;
import org.coffeorganisation.lang.impl.Americano;
import org.coffeorganisation.lang.impl.Cappuchino;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"org.coffeorganisation.bean"})
public class AppConfiguration {

    @Bean(name ="Americano")
    public Functions_for_Coffee_Machine getAmericano() {
        return new Americano();
    }







}