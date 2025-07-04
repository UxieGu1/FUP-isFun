/*@ou: É 3 ou 5*/

#include <iostream>
#include <locale>
using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese");
    
    int n;
    cin >> n;

    if(n == 3 || n == 5){
        cout << "SIM" << endl;
    }else{
        cout << "NAO" << endl;
    }
    return 0;
}