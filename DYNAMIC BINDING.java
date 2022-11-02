/* When type of the object is determined at run-time, it is known as dynamic binding. */

class Animal{  
 void eat(){
    System.out.println("animal is eating...");
    }  
}  
  
class Dog extends Animal{  
 void eat(){
    System.out.println("dog is eating...");
    }
}  
  
public class Main{
    public static void main (String[] args) {
        Dog d = new Dog();                            //dynamic binding.
        d.eat();
    }
}
