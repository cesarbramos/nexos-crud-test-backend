package test.nexos.NexosTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "test.nexos.NexosTest")
public class NexosTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(NexosTestApplication.class, args);
	}

}
