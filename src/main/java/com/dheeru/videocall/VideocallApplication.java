package com.dheeru.videocall;

import com.dheeru.videocall.user.User;
import com.dheeru.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
					.username("Anil")
					.email("anil@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("Dheeru")
					.email("dhee@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("Bhuddu")
					.email("bhu@mail.com")
					.password("aaa")
					.build());
		};
	}
}
