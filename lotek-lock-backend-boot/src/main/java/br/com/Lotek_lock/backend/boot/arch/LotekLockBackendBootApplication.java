package br.com.Lotek_lock.backend.boot.arch;

import br.com.Lotek_lock.backend.boot.arch.cqrs.exception.DomainXptoServiceEventsErrorHandler;
import org.axonframework.config.EventProcessingConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LotekLockBackendBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LotekLockBackendBootApplication.class, args);
	}

	@Autowired
	public void configure(EventProcessingConfigurer configurer) {
		configurer.registerListenerInvocationErrorHandler(
				"domain-xpto",
				configuration -> new DomainXptoServiceEventsErrorHandler()
		);
	}

}
