package ma.emsi.carservice;

import ma.emsi.carservice.beans.Car;
import ma.emsi.carservice.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
public class CarserviceApplication {

	@Bean
	public RestTemplate restTemplate() {return new RestTemplate();}
	public static void main(String[] args) {
		SpringApplication.run(CarserviceApplication.class, args);
	}

}
