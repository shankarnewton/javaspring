package com.iacollege1.services;

import java.util.List;

import com.iacollege1.entities.Studentprof;

public interface StudentprofService {
	
public List<Studentprof> getAllProfiles();
	
	public Studentprof getAllProfiles(long studentprofid);
	
	public Studentprof addProfile(Studentprof studentprof);
	
	public Studentprof updateProfile(Studentprof studentprof);
	
	public void deleteProfile (long parseLong);

}
