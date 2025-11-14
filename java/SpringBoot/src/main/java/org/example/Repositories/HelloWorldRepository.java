package org.example.Repositories;

import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldRepository {

	public  String sayHello() {
		return "Hello World!";
	}
}
