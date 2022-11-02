// Intialiastion in Java
class Rectangle{
     int length;
     int breadth;
     
     public Rectangle(int l,int b){
         this.length=l;
         this.breadth=b;
     }
     public int area(){
         return length*breadth;
     }
 }
 
 public class Main{
     public static void main (String[] args) {
         int l = 10;
         int b = 5 ;
         Rectangle re = new Rectangle(l,b);
         int x = re.area();
         System.out.println("area of Rectangle is :" + x);
     }
 }
