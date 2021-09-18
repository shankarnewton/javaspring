package com.iacollege1.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iacollege1.dao.StudentprofDao;
import com.iacollege1.entities.Studentprof;

@Service
public class StudentprofServiceImpl implements StudentprofService {
	
	@Autowired
	private StudentprofDao studentprofDao;
	
	public StudentprofServiceImpl() {
		
	}

	@Override
	public List<Studentprof> getAllProfiles() {
		
		return studentprofDao.findAll();
			}

	@Override
	public Studentprof getAllProfiles(long studentprofid) {
		
		
		return studentprofDao.getOne(studentprofid);
	}

	@Override
	public Studentprof addProfile(Studentprof studentprof) {
		
		studentprofDao.save(studentprof);
		return studentprof;
	}

	@Override
	public Studentprof updateProfile(Studentprof studentprof) {
		
		studentprofDao.save(studentprof);
		
		return studentprof;
	}

	@Override
	public void deleteProfile(long parseLong) {
		
		Studentprof entity=studentprofDao.getOne(parseLong);
		studentprofDao.delete(entity);
	}

}
