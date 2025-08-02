interface Animal {
    // Declare the method in the interface without a body
    public void speak();
}

class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }
    
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
