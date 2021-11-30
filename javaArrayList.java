// import the array List lib
// it have methods like size , get ,set, etc

import java.util.ArrayList;

// iterator

import java.util.Iterator;


public class javaArrayList {


    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<String>();
        car.add("volvo");
        car.add("mini_copper");
        car.add("bmw");
        System.out.println(car);
        car.add("uo");
        car.get(2);
        car.set(0, "lambo");
        System.out.println(car);
        car.remove("lambo");
        System.out.println(car);
    
        for( String i : car){
            System.out.println(i);
        }
        
        System.out.println(car);

       Iterator<String>  start = car.iterator();
       

    // printing through the list 
    // note :if previously we have used .next() the the index of car has already incremented
    System.out.println("Printing the list with the iterator method");
    while(start.hasNext()){    //hasNext will chec mif any next node is available in the list
        System.out.println(start.next());

    }

    // creating a lamba function
    // a lamba function is just like the short version of for  loop (parameter1, parameter2) -> expression
    System.out.println("Printing the list throw a lambda function");
    car.forEach(
        (n)-> System.out.println(n)
        );

        

    


    }

    
}
