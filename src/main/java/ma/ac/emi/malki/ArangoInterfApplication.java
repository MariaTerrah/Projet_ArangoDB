package ma.ac.emi.malki;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ArangoInterfApplication {

	
	public static void main(String[] args) {
		
		final Class<?>[] runner = new Class<?>[] { CrudRunner.class};
		
		SpringApplication.run(runner, args); // lancer CrudRunner et remplir la BD
	}

}
