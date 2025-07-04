/*@impar: Ímpar ou par - OBI 2016 - F1P1*/

#include <iostream>
#include <locale>
using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese");
    int p, d1, d2;
    
    cin >> p;
    cin >> d1;
    cin >> d2;

    int soma = d1 + d2;

    if ((soma % 2 == 0 && p == 0) || (soma % 2 != 0 && p == 1)) {
      cout << 0 << endl; 
    } else {
      cout << 1 << endl; 
    }
    return 0;
}