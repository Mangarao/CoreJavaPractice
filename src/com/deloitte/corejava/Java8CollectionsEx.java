package com.deloitte.corejava;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Java8CollectionsEx {

	public static void main(String[] args) {

		/*
		 * List<Student> namesList = Arrays.asList(new Student(101, "Manga"), new
		 * Student(102, "Ranga"), new Student(103, "Dhoni"));
		 * 
		 * namesList.forEach((name) -> System.out.println(name));
		 * 
		 * Stream.of("Manga", "Dhoni", "Karthik", "Kohli", "Sachin").map(p -> p +
		 * "123").filter(n -> n.startsWith("K")) .sorted().forEach(System.out::println);
		 * 
		 * int reduce = IntStream.range(1, 6).reduce(10,((a,b)->a+b));
		 * System.out.println(reduce);
		 */
		
		long startTime = new Date().getTime();
		
		/*
		 * Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6),
		 * Arrays.asList(7,8,9)) .parallelStream() .flatMap(list->list.stream())
		 * .collect(Collectors.toList()).forEach(System.out::print); long endTime = new
		 * Date().getTime();
		 */
		
		
		IntStream.range(1, 11).parallel().forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		int sum = numbers.parallelStream().mapToInt(Integer::intValue).sum();
		long endTime = new Date().getTime();
		
		System.out.println("Duration for piece of code execution "+(endTime-startTime));
		
		int product = Arrays.asList(1,2,3,4,5).stream().reduce(0,(num1,num2)-> num1+num2);
		System.out.println("The product is: "+product);
		Optional.empty();

		
	}

}
