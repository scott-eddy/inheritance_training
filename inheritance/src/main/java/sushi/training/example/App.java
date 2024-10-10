package sushi.training.example;

/**
 * Entry point of our App
 */
public class App 
{
    public static void main( String[] args )
    {
        /// Create a bunch of different Animals
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();

        System.out.printf("Animal's name is: %s%n", animal.name);
        System.out.printf("Cat's name is: %s%n", cat.name);  // What is the output of this?
        System.out.printf("Dog's name is %s%n", dog.name); 

        /// Call each inherited classes overridden function
        animal.speak();
        cat.speak();
        dog.speak(); 
        fish.speak();  // What is the output of this?
    }
}
