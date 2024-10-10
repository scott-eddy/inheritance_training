package sushi.training.example;

/*
 * A simple example of a class with a field and an method
 */
public class Animal {
    // All Animals will have a name
    public String name;
  
    // Default constructor, sets an animal's name "None"
    public Animal() {
        name = "None";
    }

    public void speak() {
        System.out.println( "I am an Animal");
  }
}