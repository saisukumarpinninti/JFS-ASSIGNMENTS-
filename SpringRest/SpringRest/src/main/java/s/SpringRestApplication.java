package s;



import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringRestApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(SpringRestApplication.class, args);
	}

}
