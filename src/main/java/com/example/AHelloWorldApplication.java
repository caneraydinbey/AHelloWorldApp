package com.example;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class AHelloWorldApplication {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new SpringApplicationBuilder()
				.sources(AHelloWorldApplication.class)
				.bannerMode(Banner.Mode.OFF)
				.run(args);

		AHelloWorldApplication app = context.getBean(AHelloWorldApplication.class);
		app.start();
	}

	private void start() {
		System.out.println("Hello World!");
	}
}