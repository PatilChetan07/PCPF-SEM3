// c++ program to explain
// Encapsulation

#include <iostream>
using namespace std;

class Encapsulation{
    private : 
    int rollNo;          // hidden data
    string name;
    
    public :
    void set1(int a){
        rollNo = a;
    }
    int get1(){
        return rollNo;
    }
    
    void set2(string n){
        name = n;
    }
    string get2(){
        return name;
    }
    
};

int main(){
    Encapsulation obj;
    obj.set1(19);
    obj.set2("Chetan");
    cout<<"student details\n";
    std::cout << "rollNo is :" << obj.get1() <<std::endl;
    std::cout << "name :" <<obj.get2() << std::endl;
    return 0;
}
