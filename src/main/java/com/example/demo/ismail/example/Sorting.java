package com.example.demo.ismail.example;
//package org.cei.java8.features;

import java.util.Comparator;
import java.util.stream.Stream;

public class Sorting {

	public static void main(String[] args) {
		Stream<Movie> movies = Stream.of(new Movie("b", 2021), new Movie("c", 2019), new Movie("a", 2055), 
				 new Movie("a", 2022));

		// imperative style
		/*
		 * movies.sorted((a, b) -> a.getName().compareTo(b.getName())) .forEach(m ->
		 * System.out.println(m.getName()));
		 */
		 
		
		
		
		
		/*
		 * movies.sorted(Comparator.comparing(Movie::getName)) .forEach(m ->
		 * System.out.println(m.getName()));
		 */
		
		
		/*
		 * movies.sorted(Comparator.comparing(Movie::getName).reversed()) .forEach(m ->
		 * System.out.println(m.getName()));
		 */
		
		// multiple comparators
		
		 movies.sorted(Comparator.comparing(Movie::getName).thenComparing(Movie::
		 getYear)) .forEach(m -> System.out.println(m.getName() + "-" + m.getYear()));
		
		 
		 

	}

}
