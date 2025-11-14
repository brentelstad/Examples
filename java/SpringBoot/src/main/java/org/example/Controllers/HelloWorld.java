package org.example.Controllers;

import org.example.Services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	private HelloWorldService helloWorldService;

	@GetMapping("/hello-world")
	public String helloWorld() {
		return helloWorldService.sayHello();
	}

	@Autowired
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

}
