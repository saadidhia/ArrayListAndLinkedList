package api.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Person {
	
	private String name;
	private int age;
	private double weight;
	
	public Person(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//searching if exist person with an age than 30 .(using API Stream)
	public static String ExistePlusAgeQue30(ArrayList<Person> persons) {
		
		 if(persons.stream().anyMatch(person-> person.getAge()>=30)) { 
	        	return "Il ya une peron age plus que 30 ans";
	        }else {
	        	return "Il ny a aucune peronse plus age que 30 ans";
	        }
		
	}
	
	//finding persons with Age than 30 (Using API Stream)
	public static void PersonsAgeplus30(ArrayList<Person> persons) {
		 List<Person> personsAge30Ans=persons.stream().filter(person->person.getAge()>=30).collect(Collectors.toList());
	       personsAge30Ans.forEach(person->System.out.println(person.getName()+" "+person.getAge()+" "+person.getWeight()));
		
	}
	
	
	
	

}
