// Superclass (Parent class)
class Animal {
    // Method in the superclass
    void sound() {
        System.out.println("Some animal makes a sound");
    }
}

// Subclass (Child class)
class Dog extends Animal {
    // Overriding the sound method in the subclass
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another subclass (Child class)
class Cat extends Animal {
    // Overriding the sound method in the subclass
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class MethodOverridingDemo {
    public static void main(String[] args) {
        // Creating objects of the subclass
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the overridden method
        myDog.sound();  // Output: Dog barks
        myCat.sound();  // Output: Cat meows
    }
}
