
public class thread {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());

        });
        Thread t2 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());

        });
        Thread t3 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());

        });
        
        t1.setName("Ish");
        t2.setName("Arun");
        t1.setPriority(10);
        t2.setPriority(5); 
        // t2.start();
        // t1.start();
        t1.run();
        t2.run();
    

    }
}
