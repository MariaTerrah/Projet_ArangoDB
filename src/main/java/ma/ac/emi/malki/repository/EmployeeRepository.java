package ma.ac.emi.malki.repository;

import ma.ac.emi.malki.entity.Employee;
import com.arangodb.springframework.repository.ArangoRepository;
 
public interface EmployeeRepository extends ArangoRepository<Employee,String> {

}

