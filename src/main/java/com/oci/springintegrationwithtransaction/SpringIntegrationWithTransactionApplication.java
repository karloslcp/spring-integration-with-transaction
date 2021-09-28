package com.oci.springintegrationwithtransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("integration.xml")
public class SpringIntegrationWithTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationWithTransactionApplication.class, args);
	}

}
