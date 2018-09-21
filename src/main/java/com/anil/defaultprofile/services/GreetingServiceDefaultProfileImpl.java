/**
 * 
 */
package com.anil.defaultprofile.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Anil_Ramesh
 *
 */
@Service
@Primary
@Profile({ "en", "default" })
public class GreetingServiceDefaultProfileImpl implements GreetingService {

	public static final String DEFAULT_PROFILE = "Default Profile !!!!";

	@Override
	public String getGreetings() {
		// TODO Auto-generated method stub
		return DEFAULT_PROFILE;
	}

}
