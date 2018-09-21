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
@Profile("de")
public class GreetingServiceDeProfileImpl implements GreetingService {

	public static final String DE_PROFILE = "De profile Impl !!!!";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.anil.defaultprofile.services.GreetingService#getGreetings()
	 */
	@Override
	public String getGreetings() {
		// TODO Auto-generated method stub
		return DE_PROFILE;
	}

}
