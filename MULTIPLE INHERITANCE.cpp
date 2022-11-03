// c++ program to explain
// Multiple Inheritance

#include <iostream>
using namespace std;

class Human{
    public :
    string name;
    int age;
    
    void set1(string n){
        name = n;
    }
    string get1(){
        return name;
    }
    
    void set2(int a){
        age = a;
    }
    int get2(){
        return age;
    }
};

class Occupation{
    public :
    string job;
    
    void set3(string b){
        job = b;
    }
    string get3(){
        return job;
    }
};

class Address : public Human,public Occupation{
    public :
    string location;
    
    void set4(string l){
        location = l;
    }
    string get4(){
        return location;
    }
};

int main(){
    Address obj;
    obj.set1("Chetan");
    obj.set2(20);
    obj.set3("Gamer");
    obj.set4("Mumbai");
    cout<< "Human details\n";
    std::cout << "name   : " << obj.get1() << std::endl;
    std::cout << "age   : " << obj.get2() << std::endl;
    std::cout << "Occupation : " << obj.get3() << std::endl;
    std::cout << "Address : " << obj.get4() << std::endl;
}
