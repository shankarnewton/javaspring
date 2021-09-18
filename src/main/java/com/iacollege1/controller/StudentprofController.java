package com.iacollege1.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iacollege1.entities.Studentprof;
import com.iacollege1.services.StudentprofService;

@Controller
public class StudentprofController {
	
	@Autowired
	private StudentprofService studentprofService;
	
	@GetMapping("/studentprofiles")
	public List<Studentprof> getAllProfiles() {
		
		return this.studentprofService.getAllProfiles();
		
	}
	
	@GetMapping("/studentprofiles/{studentprofileid}")
	public Studentprof getAllProfiles(@PathVariable String studentprofileid) {
		return this.studentprofService.getAllProfiles(Long.parseLong(studentprofileid));
		
	}
	@PostMapping("/studentprofiles")
	public Studentprof addProfile(@RequestBody Studentprof studentprof) {
		return this.studentprofService.addProfile(studentprof);
	}
	
	@PutMapping("/studentprofiles")
	public Studentprof updateProfile(@RequestBody Studentprof studentprof) {
		
		return this.studentprofService.updateProfile(studentprof);
	}
	
	@DeleteMapping("/studentprofiles/{studentprofileid}")
	public ResponseEntity<HttpStatus> deleteProfile(@PathVariable String studentprofileid){
		try {
			this.studentprofService.deleteProfile(Long.parseLong(studentprofileid));
			return new ResponseEntity <> (HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity <> (HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
	}
	

}
