public class priority {
    public static void main(String[] args) {
        Thread t1=new Thread();
        System.out.println("THREAd 1"+Thread.currentThread().getPriority());
        t1.setPriority(Thread.MIN_PRIORITY);
        Thread t2=new Thread();
        System.out.println("THREAd 2"+Thread.currentThread().getPriority());
        t2.setPriority(Thread.MIN_PRIORITY);
        Thread t3=new Thread();
        System.out.println("THREAd 3"+Thread.currentThread().getPriority());
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
    
}
