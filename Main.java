package Threads;

public class Main {
    public static void main(String[] args)
    {
        CustomThread CustomThread = new CustomThread();
        Thread thread1 = new Thread(CustomThread);
        Thread thread2 = new Thread(CustomThread);
        Thread thread3 = new Thread(CustomThread);
        thread1.setName("SAFONIY");
        thread2.setName("Jirinowsky");
        thread3.setName("Pushkin");
        thread3.start();
        try{
            thread3.join();
        }catch(InterruptedException exception){
            exception.getStackTrace();
        }
        thread2.start();

        try{
            thread2.join();
        }catch(InterruptedException exception){
            exception.getStackTrace();
        }
        thread1.start();
        try{
            thread1.join();
        }catch(InterruptedException exception){
            exception.getStackTrace();
        }
    }
}
