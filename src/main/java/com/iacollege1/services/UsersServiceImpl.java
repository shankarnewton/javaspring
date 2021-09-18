package com.iacollege1.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iacollege1.dao.CollegeDao;
import com.iacollege1.dao.UserDao;
import com.iacollege1.entities.College;
import com.iacollege1.entities.Users;

@Service
public class UsersServiceImpl implements UsersService {
		
		@Autowired
		private UserDao userDao;
		
		 List<Users> list;
		
		public UsersServiceImpl() {
			
		//	list = new ArrayList<>();
		//	list.add(new College(1, "NUS", "category/csc.png", "SG", "Singapore", "11", "Computer Science Major Electrical Engineering", "21", "23410", "42", "good college"));
		//	list.add(new College(2, "Imperial College", "category/eee.png", "UK", "London", "12", "Electrical Major with Computer Engineering", "33", "14124", "39", "bad college"));
		//	list.add(new College(3, "Harvard", "category/zxc.png", "US", "MA", "1", "Information Technology", "12", "63246", "44",  "nice college"));	
		//	list.add(new College(4, "UChicago", "category/zxcvw.png", "US", "Chicago", "17", "Environmental Economics", "5", "63254", "42", "nice area"));
		//	list.add(new College(5, "UBC", "category/dsg.png", "Canada", "BC", "23", "Computer Science with Mathematics", "78", "3466", "34", "beautiful campus"));
		//	list.add(new College(6, "UofT", "category/3dshf.png", "Canada", "Toronto", "56", "Electrical Engineering" , "67", "6435", "33", "nice city"));
		//	list.add(new College(7, "NTU", "category/hffh.png", "SG", "Singapore", "13", "Mechanical Engineering" , "9", "8657", "41", "yay city"));
		//	list.add(new College(8, "IIT", "category/GSD.png", "India", "Kolkata", "234", "Computer Science with Finance " , "3", "423", "44", "good reputation"));
		//	list.add(new College(9, "EHT", "category/SDFH.png", "Switzerland", "Zurich", "33", "Physics" , "22", "45454", "40", "einstein's college!"));
		//	list.add(new College(10, "Vanderbilt", "category/gd.png", "US", "Nashville", "54", "PPE Major" , "25", "25315", "38", "nice name!"));
		}

		@Override
		public List<Users> getAllUsers() {
			
			return userDao.findAll();
		}

		@Override
		public Users getAllUsers(long userid) {
			
		//	College c=null;
		//	for(College college:list){
				
		//		if (college.getId()==collegeid) {
		//			c=college;
		//			break;
		//		}
				
		//	}	
			return userDao.getOne(userid);
		}

		@Override
		public String addUser(Users users) {
			
			//list.add(college);
			
			list = new ArrayList<>();
				list.add(new Users(1, "test@gmail.com", "test", "1234", "Student"));
				list.add(new Users(2, "test132@gmail.com", "123", "hello","Parent"));

			
			userDao.saveAll(list);
			return "success";
		}

		@Override
		public Users updateUser(Users users) {
			
//			list.forEach(e -> {
//				if (e.getId() == college.getId()) {
//					e.setName(college.getName());
//					e.setImage(college.getImage());
//					e.setImage(college.getImage());
//					e.setCountry(college.getCountry());
//					e.setCity(college.getCity());
//					e.setRanking(college.getRanking());
//					e.setCourses(college.getCourses());
//					e.setScore(college.getScore());
//					e.setRate(college.getRate());
//					e.setCost(college.getCost());
//					e.setDescription(college.getDescription());
//				}
//				
//			});
			userDao.save(users);
			
			return users;
		}

		@Override
		public void deleteUser(long parseLong) {
		//	list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList()); 
			Users entity=userDao.getOne(parseLong);
			userDao.delete(entity);
		}

	}


