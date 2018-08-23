package com.collabothon.tifors;

import com.collabothon.tifors.bootstrap.Bootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TiforsApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(TiforsApplication.class, args);
		Bootstrap bootstrap = new Bootstrap();
		bootstrap.run();
	}
}
