/*@abs: Valor absoluto*/

#include <iostream>
#include <locale>
using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese");
    
    int n1, n2;

    cin >> n1;
    cin >> n2;

    int diferenca = (n1 - n2);
    
    if(diferenca < 0){
        diferenca = diferenca * -1;
        cout << diferenca << endl;
    }else{
        cout << diferenca << endl;
    }
    
    return 0;
}