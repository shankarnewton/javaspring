package com.iacollege1.services;

import java.util.List;

import com.iacollege1.entities.College;

public interface CollegeService {

 
	public List<College> getAllColleges();
	
	public College getAllColleges(long collegeid);
	
	public College addCollege(College college);
	
	public College updateCollege(College college);
	
	public void deleteCollege (long parseLong);
}
