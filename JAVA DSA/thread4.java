// public class thread4 {
//     public static class Innerthread4 extends Thread {
//         public void run(){
//             System.out.println(this.currentThread().getName());

//         }
    
        
//     }
//     public static void main(String[] args) {
//         Innerthread4 t4 = new Innerthread4();
//         t4.start();
        

//     }
// }
// public class thread4 {

//     public static void main(String[] args) {
//         Thread t1 = new Thread(()->{
//             System.out.println(Thread.currentThread().getName());
//         });
//         Thread t2 = new Thread(()->{
//             System.out.println(Thread.currentThread().getName());

//         });
//         Thread t3 = new Thread(()->{
//             System.out.println(Thread.currentThread().getName());
//         });
//         t1.start();
//         t2.start();
//         t3.start();
//         System.out.println(Thread.currentThread().getName());
//     }
// }

public class thread4 {
    public static class myRunnable implements Runnable{
        public void run(){
            System.out.println(Thread.currentThread().getName());
        }

    }
    public static void main(String[] args)throws InterruptedException{
        Thread t1 = new Thread(new myRunnable());
        t1.setName("ishu");
        t1.start();
        t1.join();
        t1.run();
        System.out.println(Thread.currentThread().getName());


    }
}