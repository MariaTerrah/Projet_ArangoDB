//

package ma.ac.emi.malki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;


import com.arangodb.springframework.core.ArangoOperations;

import ma.ac.emi.malki.entity.Employee;
import ma.ac.emi.malki.repository.EmployeeRepository;

@ComponentScan("ma.ac.emi.malki")
public class CrudRunner implements CommandLineRunner {

  @Autowired
  private ArangoOperations operations;
  @Autowired
  private EmployeeRepository repository;

  @Override
  public void run(final String... args) throws Exception {

	  operations.dropDatabase();
	  final Employee e = new Employee("salmamalki", "casa", 21,15000);
	  repository.save(e);
	  
	  final Employee e1 = new Employee("mariaterrah", "rabat", 22,20000);
	  repository.save(e1);
	  
	  final Employee e2 = new Employee("nouressebabi", "rabat", 22,16000);
	  repository.save(e2);
	  
	  final Employee e3 = new Employee("rimfadili", "kenitra", 31,22000);
	  repository.save(e3);
	  
  }

}
