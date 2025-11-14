package org.example.Services;

import org.example.Repositories.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

	private HelloWorldRepository helloWorldRepository;

	public String sayHello() {
		return helloWorldRepository.sayHello();
	}

	@Autowired
	public void setHelloWorldRepository(HelloWorldRepository helloWorldRepository) {
		this.helloWorldRepository = helloWorldRepository;
	}
}
