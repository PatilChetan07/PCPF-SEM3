//2 ways - EXTEND THREAD , IMPLEMENT RUNNABLE
import java.lang.*;

class Mythread1 extends Thread{
    //overriding thread.java
    @Override
    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.printf("%d X %d = %d\n",19,i,19*i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Mythread2 extends Thread{
    @Override
    public void run() {
        char c;
        for(c = 'A'; c <= 'Z'; c++)
            System.out.println(c + " ");
       try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        //start is used to run thread
        t1.start();
        t2.start();
    }
}
