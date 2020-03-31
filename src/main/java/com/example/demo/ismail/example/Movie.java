package com.example.demo.ismail.example;

//package org.cei.java8.features;

import java.util.Comparator;

public class Movie implements Comparator<Movie> {

	String name;

	Integer year;

	public Movie(String name, Integer year) {
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
	
	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
