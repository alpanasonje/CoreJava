package com.tns.streamapi.casestudy;

import java.util.List;
import java.util.stream.Collectors;

public class CandidateStreamingOperations {

	public static void main(String[] args) {
		List<Candidate> candidateList=InterviewRepository.getCandidates();
		System.out.println(candidateList);
		
		//List of candidates from Pune City
		List<Candidate> puneCandidates=candidateList.stream().filter((candidate)->candidate.getCity().equals("Pune")).collect(Collectors.toList());
		System.out.println("------------Pune City Candidates-------------------");
		System.out.println(puneCandidates);
		
		//list city and count of candidates per city
		//list technical expertise and count of candidates
		//list fresher candidates
		//sort the candidates by their years of experience
		//sort the candidates by city name
		
	}

}
