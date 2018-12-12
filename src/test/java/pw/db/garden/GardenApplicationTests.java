package pw.db.garden;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import pw.db.garden.model.*;
import pw.db.garden.repository.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
public class GardenApplicationTests {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private GardenerRepository gardenerRepository ;

	@Autowired
	private StockRepository stockRepository;

	@Autowired
	private PlantRepository plantRepository;

	@Autowired
	private SpeciesRepository speciesRepository;

	@Test
	public void whenFindByName_thenReturnClient(){
		//given
		Client client = new Client();
		client.setFirstName("test");
		entityManager.persist(client);
		entityManager.flush();
		//when
		Client found = clientRepository.findByFirstName(client.getFirstName()).get(0);
		//then
		assertThat(found.getFirstName()).isEqualTo(client.getFirstName());
	}

	@Test
	public void whenFindByName_thenReturnGardener(){
		//given
		Gardener test1 = new Gardener();
		test1.setFirstName("test");
		entityManager.persist(test1);
		entityManager.flush();
		//when
        Gardener found = gardenerRepository.findByFirstName(test1.getFirstName()).get(0);
		//then
		assertThat(found.getFirstName()).isEqualTo(test1.getFirstName());
	}

	@Test
	public void whenFindByName_thenReturnPlant(){
		//given
		Plant test1 = new Plant();
		test1.setName("test");
		entityManager.persist(test1);
		entityManager.flush();
		//when
        Plant found = plantRepository.findByName(test1.getName()).get(0);
		//then
		assertThat(found.getName()).isEqualTo(test1.getName());
	}

	@Test
	public void whenFindByName_thenReturnSpecies(){
		//given
		Species test1 = new Species();
		test1.setName("test");
		entityManager.persist(test1);
		entityManager.flush();
		//when
        Species found = speciesRepository.findByName(test1.getName()).get(0);
		//then
		assertThat(found.getName()).isEqualTo(test1.getName());
	}

	@Test
	public void whenFindByName_thenReturnStock(){
		//given
		Stock test1 = new Stock();
		test1.setName("test");
		entityManager.persist(test1);
		entityManager.flush();
		//when
        Stock found = stockRepository.findByName(test1.getName()).get(0);
		//then
		assertThat(found.getName()).isEqualTo(test1.getName());
	}

}
