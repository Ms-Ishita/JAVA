public class thread1 {
    public static void main(String[] args) {
        Thread numbThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                    Thread.sleep(1000); 
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        });

        numbThread.start(); 


        System.out.println("Main application running...");
    }
}

