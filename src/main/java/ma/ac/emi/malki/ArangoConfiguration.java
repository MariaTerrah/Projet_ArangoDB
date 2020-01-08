package ma.ac.emi.malki;

	import org.springframework.context.annotation.Configuration;
	import com.arangodb.ArangoDB;
	import com.arangodb.ArangoDB.Builder;
	import com.arangodb.springframework.annotation.EnableArangoRepositories;
	import com.arangodb.springframework.config.AbstractArangoConfiguration;
	 
	@Configuration
	@EnableArangoRepositories(basePackages = { "ma.ac.emi.malki" })
	public class ArangoConfiguration extends AbstractArangoConfiguration {
	  @Override
	  public Builder arango() {
	    return new ArangoDB.Builder().host("localhost", 8529).user("root").password(null);
	  }
	 
	  @Override
	  public String database() {
	    return "spring-arango";
	  }
	}


