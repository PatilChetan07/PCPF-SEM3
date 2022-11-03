// c++ program to explain
// Inheritance

#include <iostream>
using namespace std;

class Human{
    public :
    string name;
    int age;
    
    public :
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

class Occupation : public Human{
    public :
    string job;
    
    public :
    void set3(string b){
        job = b;
    }
    string get3(){
        return job;
    }
};

int main(){
    Occupation obj;
    obj.set1("Chetan");
    obj.set2(20);
    obj.set3("Gamer");
    cout<< "Human details\n";
    std::cout << "name   : " << obj.get1() << std::endl;
    std::cout << "age   : " << obj.get2() << std::endl;
    std::cout << "Occupation : " << obj.get3() << std::endl;
}
