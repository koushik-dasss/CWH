#include <iostream>
using namespace std;
// :: is the scope resolution operator which helps us to access global scope variables inside a local scope , example is std::cout<<"Hello World"<<endl;
int c = 69;
int main(){
    int a = 10 ,b = 20;
    int c = a+b;
    cout<<"The sum is :"<<c<<endl; // local scope accessed 
    cout<<"The global c is:"<<::c<<endl; // global scope accessed  using the scope resolution operator 
    // std::cout<<"Hello World"<<std::endl; usage of scope resolution operator with std system defined header file which is accessed from global scope 
    float d = 69.69f;
    double e = 1.26526757;
    long double f = 69.96l;
    cout<<d<<" and "<<e<< " and "<<f;
    // By default , all the decimal unit of values are double for the compiler and if f is written after the value thne the compiler considers it as a float 
    // checking data  type of a  variable because f is for float and l is for long double and all other  decimal are by default taken as double for cpp compiler 
    // sizeof() operator 
    cout<<sizeof(d)<<endl;
    cout<<sizeof(e)<<endl;
    cout<<sizeof(f)<<endl;


    // Reference Variables
    int x = 69;
    int &y = x ; // ref. var. y has the value of x 
    cout<<x<<" and " <<y<<endl;
    int z = 78 , &g = z ;
    cout<<z<<" and "<<g<<endl;


    // type casting 
    float fl = 69.69;
    int ab = 78;
    cout<<fl+ab<<endl;
    cout<<(int)fl+ab<<endl;
    cout<<int(fl)+ab<<endl;
    cout<<fl+(float)ab<<endl;
    cout<<fl+float(ab)<<endl;



    return 0;
}