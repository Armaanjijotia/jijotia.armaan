class Main {
    int id;
    String name;

    // Constructor to initialize id and name
    public Main(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        // Creating objects and printing their details
        Main s1 = new Main(1010, "jijotia");
        System.out.println(s1.id + " " + s1.name);

        Main s2 = new Main(2020, "Armaan jijotia");
        System.out.println(s2.id + " " + s2.name);
    }
}
