public class Main{
    public static void main(String args[]){
        int a = 10;
        int b = 0;
        try{
            int c = a/b;
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.print("rest of program is still running");
    }
}
