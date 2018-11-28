package pw.db.garden;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import pw.db.garden.model.Client;
import pw.db.garden.repository.ClientRepository;

@SpringBootApplication
@EnableJpaAuditing
public class GardenApplication {
	public static void main(String[] args) {
		SpringApplication.run(GardenApplication.class, args);
	}

	@Bean
	ApplicationRunner init(ClientRepository clientRepository){

		return args -> {
			Client client = new Client();
			client.setFirstName("Adam");
			client.setLastName("Adamski");
			client.setEmail("qwe@rg.pl");
			client.setAddressId((long) 123);
			client.setPhoneNumber(123456789);
			clientRepository.save(client);
		};
	}
}
