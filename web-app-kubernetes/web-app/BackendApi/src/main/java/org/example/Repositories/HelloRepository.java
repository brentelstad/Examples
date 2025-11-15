package org.example.Repositories;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

	public String hello() {
		return "Hello World!";
	}
}
