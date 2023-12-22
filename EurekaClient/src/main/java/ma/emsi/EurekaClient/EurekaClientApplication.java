package ma.emsi.EurekaClient;

import ma.emsi.EurekaClient.entities.Client;
import ma.emsi.EurekaClient.repositories.ClientRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

	@Bean
	CommandLineRunner initializedH2Database(ClientRepo cr){
		return args -> {
			cr.save(new Client(Long.parseLong("1"),"Mohamed ARRAJ",23));
			cr.save(new Client(Long.parseLong("2"),"Dia ABERANE",23));
			cr.save(new Client(Long.parseLong("3"),"Yaakoub LAGHDACHE",26));
		};
	}

}
