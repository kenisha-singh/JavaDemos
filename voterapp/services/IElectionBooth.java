package com.voterapp.services;

public interface IElectionBooth {
  boolean checkEligibility(int age, String loacality, int voterId) throws InValidVoterException;
   
}
