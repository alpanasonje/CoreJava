package com.tns.streamapi.casestudy;

import java.util.ArrayList;
import java.util.List;

public class InterviewRepository {
	static List<Candidate> candidates;
	
	static
	{
		candidates=new ArrayList<Candidate>();
		candidates.add(new Candidate("Amit","JavaFS","Pune",10));
		candidates.add(new Candidate("Amol","JavaSE","Mumbai",4));
		candidates.add(new Candidate("Dhruv",".NET","Pune",8));
		candidates.add(new Candidate("Pankaj","React","Bangalore",6));
		candidates.add(new Candidate("Shashwat","JavaFS","Pune",3));
		candidates.add(new Candidate("Saurav",".NET","Mumbai",7));
	}
	
	public static List<Candidate> getCandidates()
	{
		return candidates;
	}
}
