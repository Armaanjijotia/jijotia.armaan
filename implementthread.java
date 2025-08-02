class Multi implements Thread {  // Class name starts with uppercase
    @Override
    public void run() {
        System.out.println("It is running");
    }

    public static void main(String[] args) {
        Multi m1 = new Multi();
        Threads t1=new Threads(m1)  // Create a new thread (Multi)
        t1.start();  // Start the thread
    }
}
