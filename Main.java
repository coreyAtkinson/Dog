// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
	Dog dog = new Dog("Spike");
	System.out.println(dog.getName() + " says " + dog.bark());
	Labrador lab = new Labrador("Bob", "Brown");
      System.out.println(lab.getName() + " says " + lab.bark());
	Yorkshire york = new Yorkshire("tony", 1);
 System.out.println(york.getName() + " says " + york.bark());

      //this doesn't work because lab doesnt iherit from york
lab.waddle();
      york.waddle();


//Phase 2
      Dog[] dogs = new Dog[3];

      dogs[0] = new Labrador("rad","cool color");
      dogs[1] = new Yorkshire("chad",5);
      dogs[2] = new Dog("mad");

      for(int i = 0; i < 3; i++)
        {
          System.out.println(dogs[i].bark());
        }

    for(Dog dog2 : dogs)
      {
        System.out.println(dog2.bark());
      }
//you have to cast for waddle because dog doesnt have a waddle method
      ((Labrador)(dogs[0])).waddle();

ArrayList<Dog> dogg = new ArrayList<Dog>();

      dogg.add(new Labrador("rad","cool color"));
       dogg.add(new Yorkshire("chad",5));
      dogg.add(new Dog("mad"));
      
 for(int i = 0; i < 3; i++)
        {
          System.out.println(dogg.get(i).bark());
        }
 for(Dog dog2 : dogg)
      {
        System.out.println(dog2.bark());
      }
       ((Labrador)(dogg.get(0))).waddle();
      
    }
}
