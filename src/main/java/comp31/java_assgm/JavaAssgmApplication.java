package comp31.java_assgm;

import comp31.java_assgm.services.InitService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavaAssgmApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaAssgmApplication.class, args);
    }

    @Bean
    CommandLineRunner startUp(InitService initService) {

        return args -> {
            initService.initEvents();
        };
    }
}
