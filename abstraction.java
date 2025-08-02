abstract class Animal {
    // Abstract method that can be overridden by subclasses
    abstract void speak();
}

class Dog extends Animal {
  
    void speak() { // Overriding the speak method
        System.out.println("Dog barks");
    }

    // Dog-specific method
    void barks() {
        System.out.println("Dog barks again");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();  // Outputs: Dog barks
        dog.barks();  // Outputs: Dog barks again
    }
}
