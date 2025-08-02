class Multi extends Thread {  // Class name starts with uppercase
    @Override
    public void run() {
        System.out.println("It is running");
    }

    public static void main(String[] args) {
        Multi t1 = new Multi();  // Create a new thread (Multi)
        t1.start();  // Start the thread
    }
}
