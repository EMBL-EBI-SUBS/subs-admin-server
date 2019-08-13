package uk.ac.ebi.subs.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAdminServer
@SpringBootApplication
public class USIAdminApplication {
 
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication( USIAdminApplication.class);
        ApplicationPidFileWriter applicationPidFileWriter = new ApplicationPidFileWriter();
        springApplication.addListeners( applicationPidFileWriter );
        springApplication.run(args);
    }
}