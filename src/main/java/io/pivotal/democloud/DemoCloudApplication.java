package io.pivotal.democloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCloudApplication.class, args);
	}

	@RequestMapping("/hi")
	public String hi() {
		return "Hello!!!";
	}

}
