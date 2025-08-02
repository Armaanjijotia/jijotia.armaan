class Main {
    String name;

   
    Main() {
        System.out.println("constructor");
        name = "Singh";
    }

    // Getter method to access the private variable 'name'
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Main object = new Main();
        System.out.print("name is: " + object.getName());  // Accessing the name using the getter method
    }
}
