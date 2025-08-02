class Animal {
    void speak() {   // overriding
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    void speak() {  // Overriding the speak() method
        System.out.println("Dog barks");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();  // Outputs: Dog barks
        dog.speak();  // Outputs: Dog barks
    }
}
