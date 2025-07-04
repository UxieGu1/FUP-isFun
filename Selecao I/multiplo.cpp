/*@multiplo: Múltiplo de sete*/

#include <iostream>
#include <locale>
using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese");
    
    int n; 
    cin >> n;

    if(n % 2 == 0){
        cout << "SIM" << endl;
    }else{
        cout << "NAO" << endl;
    }
    return 0;
}