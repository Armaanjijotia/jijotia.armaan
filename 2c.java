class Employee {
    int id;
    String name;
    double salary;

    // Constructor with no arguments (default constructor)
    Employee() {
        System.out.println("Default constructor called.");
        id = 0;
        name = "Not assigned";
        salary = 0.0;
    }

    // Constructor with two arguments (id and name)
    Employee(int id, String name) {
        System.out.println("Constructor with id and name called.");
        this.id = id;
        this.name = name;
        this.salary = 0.0; // Default salary
    }

    // Constructor with three arguments (id, name, and salary)
    Employee(int id, String name, double salary) {
        System.out.println("Constructor with id, name, and salary called.");
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display the details of the employee
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Employee e1 = new Employee(); // Calls default constructor
        e1.display();

        Employee e2 = new Employee(101, "Alice"); // Calls constructor with id and name
        e2.display();

        Employee e3 = new Employee(102, "Bob", 50000); // Calls constructor with id, name, and salary
        e3.display();
    }
}
