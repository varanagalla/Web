/**
 * 
 */
package com.vara.algorithm.tutorial.test;

import com.vara.algorithm.tutorial.KeyIndexCount;
import com.vara.algorithm.tutorial.Student;

/**
 * @author vpsrini
 *
 */
public class KICTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] students = new Student[]{
				new Student("Anderson", 2),
				new Student("Brown",3),
				new Student("Davis",3),
				new Student("Garcia",4),
				new Student("Harris",1),
				new Student("Jackson",3),
				new Student("Johnson",4),
				new Student("Jones",3),
				new Student("Martin",1),
				new Student("Martinez",2),
				new Student("Miller",2),
				new Student("Moore",1),
				new Student("Robinson",2),
				new Student("Smith",4),
				new Student("Taylor",3),
				new Student("Thomas",4),
				new Student("Thompson",4),
				new Student("White",2),
				new Student("Willams",3),
				new Student("Wilson",4)
		};
		
		KeyIndexCount kic = new KeyIndexCount();
		kic.sortBySection(students, 5);

	}

}
