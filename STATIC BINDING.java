/*
When type of the object is determined at compiled time(by the compiler), it is known as static binding.
If there is any private, final or static method in a class, there is static binding. */

class Dog{
    private void eat(){
        System.out.println("Dog is eating");
    }
}

public class Main{
    public static void main (String[] args) {
        Dog d = new Dog();                            // static binding.
        d.eat();
    }
}
// unable to access the private class element
