/*@resto: Resultado e resto na divisão*/

#include <iostream>
#include <locale>
using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese");
    
    int n1, n2;

    cin >> n1;
    cin >> n2;

    float resto = n1 % n2;
    float quociente = n1 / n2;

    cout << quociente << " " << resto << "\n"; 
    return 0;
}