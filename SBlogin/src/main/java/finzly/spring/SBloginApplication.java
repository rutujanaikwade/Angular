package finzly.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@ComponentScan("finzly.spring.dao.Empdao")
@ComponentScan("finzly.spring.controller")
public class SBloginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SBloginApplication.class, args);
	}

}
