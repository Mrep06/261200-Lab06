public class Lab06 {
    public static void main(String[] args) {
        Shark shark = new Shark();
        SurgeonFish surgeonFish = new SurgeonFish();
        FlyingShark flyingShark = new FlyingShark();
        Insect insect = new Insect();

        // Demonstrate dynamic polymorphism
        // The Shark's eat method accepts any Fish subclass
        shark.eat(surgeonFish);
        shark.eat(new Shark());

        // Demonstrate static polymorphism (overloading)
        // The compiler chooses which eat() method based on the parameter type
        flyingShark.eat(new Shark());      // Matches eat(Fish)
        flyingShark.eat(insect);           // Matches eat(Flyable)

        // Demonstrate polymorphic assignments and behaviors
        Fish fish = new Shark();           // Upcasting: A Shark is-a Fish
        Flyable flyer = new FlyingShark(); // Upcasting: A FlyingShark is-a Flyable

        fish.swim();                       // Executes Shark's swim logic
        flyer.fly();                       // Executes FlyingShark's fly logic
    }
}