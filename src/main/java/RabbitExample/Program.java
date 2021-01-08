package RabbitExample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@SpringBootApplication
@EntityScan
@Slf4j
public class Program {
    @Autowired
    protected void configure(AuthenticationManagerBuilder auth) throws Exception { }

    public static void main(String[] args) {
        SpringApplication.run(Program.class, args);
    }
}
