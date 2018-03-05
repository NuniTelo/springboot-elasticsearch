package com.tims.clone.Tims.System;

import com.tims.clone.Tims.System.People.Model.PeopleModel;
import com.tims.clone.Tims.System.People.Model.PeopleRepositry.PeopleRespositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TimsSystemApplication implements CommandLineRunner {

	@Autowired
	PeopleRespositry respositry;

	public static void main(String[] args) {
		SpringApplication.run(TimsSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		respositry.save(new PeopleModel("1001","testEmri","testMbiemri"));
	}
}
