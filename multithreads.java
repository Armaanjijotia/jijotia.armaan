public class multithreads {
    public static void main(String[] args) {
        Thread t1=new Thread( ()-> {
            for(int i = 1; i<=3; i++){
              System.out.println("1st thread" +i);
            }
        } );
        Thread t2=new Thread( ()-> {
            for(int i = 1; i<=3; i++){
              System.out.println("2st thread" +i);
            }
        } );
        t1.start();
        t2.start();
    }
    
}
