class Employ {
    int id;
    String name;
    float salary;

   
    void insert(int i, String n, float s) {
        id = i;
        name = n;
        salary = s;
    }

   
    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

 class Testemploy {
    public static void main(String[] args) {
   
        Employ e1 = new Employ();
        Employ e2 = new Employ();
        Employ e3 = new Employ();
      
        e1.insert(101, "suraj", 20000);
        e2.insert(103, "suraj singh", 20000);
        e3.insert(104, "suraj thakur", 20000);
        
        e1.display();
        e2.display();
        e3.display();
    }
}
