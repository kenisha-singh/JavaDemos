package com.voterapp.services;

import com.voterapp.exception.*;

public class ElectionBoothImpl implements IElectionBooth  {
  String [] localities = {"Bangalore","Chennai"};
	@Override
	public boolean checkEligibility(int age, String loacality, int voterId)throws InValidVoterException {
		
		try {
			if(checkLocality(loacality)){
			if(checkAge(age)) {
			if(checkVoterId(voterId)) {
				return true;
			}
			}
		
			}
		}catch(LocalityNotFoundException e) {
			System.out.println(e.getMessage());
			}
		catch(UnderAgeException e) {
			System.out.println(e.getMessage());
		}
		catch(NoVoterIDException e) {
			System.out.println(e.getMessage());
		}
	return false;
	}
	 


	private  boolean checkAge (int age) throws UnderAgeException {
		if(age>18) {
			return true;
		}else 
			 throw new UnderAgeException ("age not found");
		
	}
	
		 
	
	private boolean checkLocality(String locality) throws LocalityNotFoundException {
		for(String local:localities) {
			if(locality.equalsIgnoreCase(local)) {
				return true;
			}
		}

		throw new LocalityNotFoundException("Locality not found..");
	}

	 private boolean checkVoterId( int voterId) throws NoVoterIDException{
		 if( voterId<1000 || voterId >9999) {
			 throw new NoVoterIDException("No Voter id matched");
		 }
		return true;
	 
	 } 
	}
