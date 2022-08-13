package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stacksimplify.restservices.UserDetails.UserDetails;

//Controller
@RestController
public class HelloWorldController {
	
	//method
	//URI - /helloworld
	//GET Method
	
	//@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	@GetMapping("/helloworld")
	public String helloWorld() {
		
		return "Hello World!!";
	}
	
	
	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean() {
		
		return new UserDetails("Aryan","Goswami","Pune");
	}

}
