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
    private AddressRepository addressRepository;

	@Autowired
	private GardenerRepository gardenerRepository ;

    @Autowired
    private GardenRepository gardenRepository;

	@Autowired
	private StockRepository stockRepository;

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private JobTypeRepository jobTypeRepository;

	@Autowired
	private PlantRepository plantRepository;

	@Autowired
	private SpeciesRepository speciesRepository;

    @Autowired
    private StockPlantRepository stockPlantRepository;

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

    @Test
    public void whenFindAll_thenReturnisNotEmptyClient(){
        //given
        Client test1 = new Client();
        entityManager.persist(test1);
        entityManager.flush();
        //when
        Iterable<Client> all = clientRepository.findAll();
        //then
        assertThat(all).isNotEmpty();
    }

    @Test
    public void whenFindAll_thenReturnisNotEmptyGarden(){
        //given
        Garden test1 = new Garden();
        entityManager.persist(test1);
        entityManager.flush();
        //when
        Iterable<Garden> all = gardenRepository.findAll();
        //then
        assertThat(all).isNotEmpty();
    }

    @Test
    public void whenFindAll_thenReturnisNotEmptyGardener(){
        //given
        Gardener test1 = new Gardener();
        entityManager.persist(test1);
        entityManager.flush();
        //when
        Iterable<Gardener> all = gardenerRepository.findAll();
        //then
        assertThat(all).isNotEmpty();
    }

    @Test
    public void whenFindAll_thenReturnisNotEmptyJob(){
        //given
        Job test1 = new Job();
        entityManager.persist(test1);
        entityManager.flush();
        //when
        Iterable<Job> all = jobRepository.findAll();
        //then
        assertThat(all).isNotEmpty();
    }

    @Test
    public void whenFindAll_thenReturnisNotEmptyJobType(){
        //given
        JobType test1 = new JobType();
        entityManager.persist(test1);
        entityManager.flush();
        //when
        Iterable<JobType> all = jobTypeRepository.findAll();
        //then
        assertThat(all).isNotEmpty();
    }

    @Test
    public void whenFindAll_thenReturnisNotEmptyPlant(){
        //given
        Plant test1 = new Plant();
        entityManager.persist(test1);
        entityManager.flush();
        //when
        Iterable<Plant> all = plantRepository.findAll();
        //then
        assertThat(all).isNotEmpty();
    }

    @Test
    public void whenFindAll_thenReturnisNotEmptySpecies(){
        //given
        Species test1 = new Species();
        entityManager.persist(test1);
        entityManager.flush();
        //when
        Iterable<Species> all = speciesRepository.findAll();
        //then
        assertThat(all).isNotEmpty();
    }

    @Test
    public void whenFindAll_thenReturnisNotEmptyStock(){
        //given
        Stock test1 = new Stock();
        entityManager.persist(test1);
        entityManager.flush();
        //when
        Iterable<Stock> all = stockRepository.findAll();
        //then
        assertThat(all).isNotEmpty();
    }

    @Test
    public void whenFindAll_thenReturnisNotEmptyStockPlant(){
        //given
        StockPlant test1 = new StockPlant();
        entityManager.persist(test1);
        entityManager.flush();
        //when
        Iterable<StockPlant> all = stockPlantRepository.findAll();
        //then
        assertThat(all).isNotEmpty();
    }

    @Test
    public void whenFindAll_thenReturnisNotEmptyAddress(){
        //given
        Address test1 = new Address();
        entityManager.persist(test1);
        entityManager.flush();
        //when
        Iterable<Address> all = addressRepository.findAll();
        //then
        assertThat(all).isNotEmpty();
    }


}
