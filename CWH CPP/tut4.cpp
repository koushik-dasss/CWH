#include<iostream>
using namespace std;
int kd = 78;
void  sum(){
    cout<<kd<<endl;//global variable access 
    kd=90; 
    cout<<kd<<endl;
}
int main(){
    int a = 7 , b = 18;
    cout<<a<<b<<endl;
    float pi = 3.14 , c = 2.56;
    cout<<pi<<c<<endl;
    double p = 2.62763386738, d = 2.789788979;
    cout<<p<<d<<endl;
    char cha = 'a';
    bool val = true;
    cout<<cha<<val<<endl; // a1
    cout<<val<<endl; // val is 1 as boolean has true as 1 and 0 as false
    int kd = 67;
    cout<<kd<<endl;
    kd = 89;
    cout<<kd<<endl;
    sum();
    kd = 789;
    cout<<kd<<endl; 
    return 0;
}