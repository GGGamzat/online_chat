package com.example.online_chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class OnlineChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineChatApplication.class, args);
	}

}
