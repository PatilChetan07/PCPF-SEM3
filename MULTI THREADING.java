import java.lang.*;

class myThread1 implements Runnable{
    @Override
    public void run(){
        for(int i=1; i<=10;i++ ){
            System.out.printf("%d X %d = %d\n",19,i,19*i);
        }
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}

class myThread2 implements Runnable{
    @Override
    public void run(){
        for(char c ='A'; c<='Z';c++){
            System.out.println(c);
        }
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}

public class Main{
    public static void main (String[] args) {
      myThread1 r1 = new myThread1();
      Thread t1 = new Thread(r1);

      myThread2 r2 = new myThread2();
      Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
