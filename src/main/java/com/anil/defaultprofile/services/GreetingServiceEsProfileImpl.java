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
@Profile("es")
public class GreetingServiceEsProfileImpl implements GreetingService {

	public static final String ES_PROFILE = "ES Profile !!!!";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.defaultprofile.services.GreetingService#getGreetings()
	 */
	@Override
	public String getGreetings() {
		// TODO Auto-generated method stub
		return ES_PROFILE;
	}

}
