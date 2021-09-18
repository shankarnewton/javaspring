package com.iacollege1.controller;

import java.util.Arrays;
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

import com.iacollege1.entities.College;
import com.iacollege1.services.CollegeService;

@Controller
public class CollegeController {
	
	@Autowired
	private CollegeService collegeService;
	
	@GetMapping("/colleges")
	public List<College> getAllColleges() {
		
		return this.collegeService.getAllColleges();
		
	}
	
	
	@GetMapping("/colleges/{collegeid}")
	public College getAllColleges(@PathVariable String collegeid) {
		return this.collegeService.getAllColleges(Long.parseLong(collegeid));
		
	}
	@PostMapping("/colleges")
	public College addCollege(@RequestBody College college) {
		return this.collegeService.addCollege(college);
	}
	
	@PutMapping("/colleges")
	public College updateCollege(@RequestBody College college) {
		
		return this.collegeService.updateCollege(college);
	}
	
	@DeleteMapping("/colleges/{collegeid}")
	public ResponseEntity<HttpStatus> deleteCollege(@PathVariable String collegeid){
		try {
			this.collegeService.deleteCollege(Long.parseLong(collegeid));
			return new ResponseEntity <> (HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity <> (HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
	}
	
}
