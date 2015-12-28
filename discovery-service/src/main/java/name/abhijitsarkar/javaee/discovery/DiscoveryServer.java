package name.abhijitsarkar.javaee.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Abhijit Sarkar
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServer extends SpringBootServletInitializer {
    /* Deep stuff: https://github.com/spring-cloud/spring-cloud-netflix/issues/432 */
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServer.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DiscoveryServer.class);
    }
}
