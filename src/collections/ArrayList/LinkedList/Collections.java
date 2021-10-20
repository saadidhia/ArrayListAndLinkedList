package collections.ArrayList.LinkedList;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

import api.stream.Person;

public class Collections {

	public static void main(String[] args) {
		
		System.out.println("----------------------ArrayList----------------------------------");
		ArrayList<String> aList=new ArrayList<>();
		ArrayList<String> emptyList=new ArrayList<>();
		ArrayList<String> bList=new ArrayList<>();
		
		for (int i=0;i<10;i++) {
			aList.add("5"); //adding elements at the end of List
		}
		
		System.out.print("First Operation"+aList);
		System.out.println("");
		aList.add(2,"4");
		System.out.print("Second Operation"+aList);
		boolean b=emptyList.addAll(aList); //adding aList to the emptyList and return true if it's added
		System.out.println("");
		System.out.println("Third Operation"+": "+b+" "+emptyList);
		bList.add("Dhia");
		bList.add("fedi");
		boolean c=aList.addAll(2, bList);
		System.out.println("fourth Operation"+": "+c+" "+aList); //adding cList to aList at the second position and return true if it's successfully added
	    String s=aList.get(2);
	    System.out.println("fifth Operation"+": "+s); //get the element from the index 2
	    int i=aList.lastIndexOf("5");
	    System.out.println("sixth Operation"+": "+i); //return the last occurrence index of an element else return -1
	    boolean d=aList.contains("hama");
	    System.out.println("seventh Operation: "+d); //return True if an element exists in the List else false  
        int j=aList.indexOf("5"); 	
        System.out.println("Eighth Operation: "+j); //return the first index occurrence of an element
        String st=aList.remove(4);
        System.out.print("Nineth Operation: "+st+" "+aList); //return the element that you you have removed by index 
        
        ArrayList<String> anotherList=new ArrayList<>(10);
        anotherList.add("chedi");
        anotherList.add("fedi");
        anotherList.add("Ali");
        anotherList.add("Nada");
        anotherList.add("Dalila");
        anotherList.trimToSize(); //reduce the capacity of an arrayList(10--->5)
        
        System.out.print("\n"+"tenth Operation "+"["+anotherList.size() +"] ");
        for(int l=0;l<anotherList.size();l++) {
        	System.out.print(anotherList.get(l)+" ");
        }
        
        System.out.println("\n"+"\n"+"----------------------EndArrayList----------------------------------"+"\n"+"\n");
        
        ArrayList<Person> persons=new ArrayList<>();
        Person person1=new Person("dhia",25,98);
        Person person2=new Person("fedi",27,100);
        Person person3=new Person("chedi",45,70);
        Person person4=new Person("ali",60,80.10);
        Person person5=new Person("dalila",50,80);
        Person person6=new Person("nada",28,70.5);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        System.out.println(Person.ExistePlusAgeQue30(persons));
        Person.PersonsAgeplus30(persons);
       System.out.println("----------------------Persons have age more than 30 except the first one on the list--------------------------------");
        Person.PersonsAgeplus30WithoutTheFirst(persons);
        System.out.println("----------------------get the Somme of ages for persons with age more than 30--------------------------------");
      int sm=Person.getSomeAgeMoreThan30(persons);
      System.out.println(sm);
      System.out.println("----------------------Sort by Age of ArrayList persons--------------------------------");
     Person.SortByName(persons);
       
        	
        
        
        
	}

}
