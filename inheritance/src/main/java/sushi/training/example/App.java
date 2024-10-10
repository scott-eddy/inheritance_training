package sushi.training.example;

/**
 * Entry point of our App
 */
public class App 
{

    public static void main( String[] args )
    {
        inheritance_example();
        lambda_example();
    }

    /**
     * An example of how inheritance can be used to represent
     * things that are related to eachother but different
     */
    public static void inheritance_example () {

        /// Create a bunch of different Animals
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        
        System.out.printf("Animal's name is: %s %n", animal.name);
        System.out.printf("Cat's name is: %s %n", cat.name);  // What is the output of this?
        System.out.printf("Dog's name is: %s %n", dog.name); 
        
        /// Call each inherited classes overridden function
        animal.speak();
        cat.speak();
        dog.speak(); 
        fish.speak();  // What is the output of this?
    }

    /**
     * Lambda functions are used extensively in the robot code see e.g. 
     * https://github.com/SushiSquad7461/oshi-yoshi-2024/blob/main/src/main/java/frc/robot/subsystems/Elevator/Elevator.java#L68-L72
     * 
     * They have an odd syntax but really just represt the creation of a function that __ISN'T__ executed
     * immediately but can be executed later
     */
    public static void lambda_example() {
        ExampleLambdaInterface function = () -> {System.out.println("Invoked a lambda with no arguments");};
        function.no_param_function();

        // Do this only when the code above has been commented out and you edit the ExampleLambdaInterface
        //ExampleLambdaInterface function_with_param = (int x) -> {System.out.printf("2 times value is %d %n", 2*x);};
        //function_with_param.single_param_function(10); // What does this print
    }

}
