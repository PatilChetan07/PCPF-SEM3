// finalisation in Java
public class Main{
    public static void main(String args[]){
        Main obj = new Main();
        System.out.println(obj.hashCode());
        obj = null;
        // calling garbage collector 
        System.gc();
        System.out.println("end od garbage collection");
    }
    protected void finalise(){
        System.out.println("finalise method called");
    }
}
