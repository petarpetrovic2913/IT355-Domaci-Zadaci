
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

@RestController
@EnableAutoConfiguration
public class Application {
        public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
