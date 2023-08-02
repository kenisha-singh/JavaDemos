package com.voterapp.main;

import java.util.Scanner;

import com.voterapp.services.ElectionBoothImpl;

import com.voterapp.services.IElectionBooth;
import com.voterapp.services.InValidVoterException;

public class VoterMain {

	public static  void main(String[] args) throws InValidVoterException {
		IElectionBooth elec = new ElectionBoothImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		 int Age = sc.nextInt();
		 System.out.println("enter your locality");
		 String  locality = sc.next();
		 System.out.println("Enter VoterId: ");
			int voterid=sc.nextInt();
			try {
				if(elec.checkEligibility(Age, locality, voterid)) {
					System.out.println("eligible for Voting");
			}
			else 
				throw new  InValidVoterException("not eligible");
			}catch( InValidVoterException e) {
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("Closing....");
			}
			
		 
		
}
}