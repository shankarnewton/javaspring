package com.iacollege1.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {

	@Id
		private long id;
		private String name;
		private String image;
		private String country;
		private String city;
		private String ranking;
		private String courses;
		private String score;
		private String rate;
		private String cost;
		private String description;
		
		public College() {
			
		}
		
		public College(long id, String name, String image, String country, String city, String ranking, String courses,
				String rate, String cost, String score, String description) {
			super();
			this.id = id;
			this.name = name;
			this.image = image;
			this.country = country;
			this.city = city;
			this.ranking = ranking;
			this.courses = courses;
			this.score = score;
			this.rate = rate;
			this.cost = cost;
			this.description = description;
		}

		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getRanking() {
			return ranking;
		}
		public void setRanking(String ranking) {
			this.ranking = ranking;
		}
		public String getCourses() {
			return courses;
		}
		public void setCourses(String courses) {
			this.courses = courses;
		}
		public String getRate() {
			return rate;
		}
		public void setRate(String rate) {
			this.rate = rate;
		}
		public String getCost() {
			return cost;
		}
		public void setCost(String cost) {
			this.cost = cost;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}

		public String getScore() {
			return score;
		}

		public void setScore(String score) {
			this.score = score;
		}
		
		

	}


