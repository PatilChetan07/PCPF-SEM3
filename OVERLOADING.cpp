// Method Overloading in c++
#include <iostream>
using namespace std;

int add(int x,int y){
    return x + y;
}

int add(int x,int y,int z){
    return x + y +z;
}

int main(){
    cout << "addition using Method Overloading\n";
    std::cout << "addition of x + y is : "  << add(5,10) << std::endl;
    std::cout << "addition of x + y + z is : " << add(5,10,15) << std::endl;
}
