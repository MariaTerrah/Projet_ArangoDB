package ma.ac.emi.malki.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ma.ac.emi.malki.entity.Employee;
import ma.ac.emi.malki.repository.EmployeeRepository;

@Controller
@RequestMapping(value="/Employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping(value="/Index")	
	public String index()
	{	
		return "employes";
	}
	
	@RequestMapping(value="/Index", method=RequestMethod.POST)
	public String index(Model model,@RequestParam(name="name", defaultValue="") String name, @RequestParam(name="city", defaultValue="") String city)
	{	
		Iterable<Employee> employees= null;
		if(name.length()==0 && city.length()==0) {
			
			employees= employeeRepository.findAll();
			
		}
		
		if(name.length()==0 && city.length()!=0) {
			
			Employee e=new Employee();
			e.setCity(city);
			employees=employeeRepository.findAll(Example.of(e));
		}
		
		if(name.length()!=0 && city.length()==0) {
			
			Employee e=new Employee();
			e.setName(name);
			employees=employeeRepository.findAll(Example.of(e));	
		}
		
		if(name.length()!=0 && city.length()!=0) {
			
			Employee e=new Employee();
			e.setCity(city);
			e.setName(name);
			employees=employeeRepository.findAll(Example.of(e));
		}
		
		model.addAttribute("employees", employees);		
	return "employes";

	}
}
