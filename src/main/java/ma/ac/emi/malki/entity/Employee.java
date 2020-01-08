package ma.ac.emi.malki.entity;

import org.springframework.data.annotation.Id;
import com.arangodb.springframework.annotation.Document;
 
@Document("Employees")
public class Employee {
 
  @Id
  private String id;
 
  private String name;
  private String city;
  private Integer age;
  private Integer salary;
 
  public Employee() {
    super();
  }
 
  public Employee(final String name, final String city, final Integer age, final Integer salary ) {
    super();
    this.name = name;
    this.city = city;
    this.age = age;
    this.salary=salary;
  }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

public Integer getSalary() {
	return salary;
}

public void setSalary(Integer salary) {
	this.salary = salary;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}
  
  
 
  
  
 
}