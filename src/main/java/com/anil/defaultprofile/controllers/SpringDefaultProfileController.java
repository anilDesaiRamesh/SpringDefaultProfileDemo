/**
 * 
 */
package com.anil.defaultprofile.controllers;

import org.springframework.stereotype.Controller;

import com.anil.defaultprofile.services.GreetingService;

/**
 * @author Anil_Ramesh
 *
 */
@Controller
public class SpringDefaultProfileController {

	private GreetingService greetingService;

	public SpringDefaultProfileController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.getGreetings();
	}

}
