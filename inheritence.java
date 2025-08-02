class Animal {
    void speak() {  // inheritence 
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
   
    void barks() {  // inheritence
        System.out.println("Dog barks");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();  // Outputs: Dog barks
        dog.barks();
    }
}