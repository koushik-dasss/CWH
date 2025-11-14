#include<iostream> // this is an system defined header files
using namespace std;
#include "this.h" // will give error if this.h is not there in the directory (the file name should be inside " " )
int main(){
    // system defined header files - already given by the system 
    // user defined header files - external files being included in the program which are created by the user on the same directory 
    //operators 
    // arithemtic operators 
    int a = 10 , b = 20;
    cout<<a+b<<endl;
    cout<<a-b<<endl;
    cout<<a*b<<endl;
    cout<<a/b<<endl; // decimal part is truncated as it's an int division 
    cout<<a%b<<endl;
    cout<<a++<<endl; // 10 then 11 
    cout<<++a<<endl; // 12 then stay 12 only
    cout<<b--<<endl ; // 20 then 19
    cout<<--b<<endl; // 18 then stay 18 only 
    // assignment operators 
    a+=b; // 12 + 18 = 30
    b-=a; // 18 - 30 = -12 
    cout<<a<<" and "<<b<<endl;
    // comparison operators , == , != , >= ,<= , > , < 
    // Logical operators , LOGICAL AND  , LOGICAL OR , true and true = true , false or false = false (exception)
    // bitwise operators 




    
    return 0;
}