package br.edu.infnet.petshoptddapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PetShopTddApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetShopTddApiApplication.class, args);
	}

}
