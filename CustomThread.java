package Threads;

public class CustomThread implements Runnable
{
private String name;
    @Override
    public void run() {
        for(int i =0; i<5; i++){
        System.out.println(Thread.currentThread().getName()+" is Working");
        try {
            Thread.sleep(1200);
        }catch(InterruptedException e){
            e.getStackTrace();
        }
        }
    }
}
