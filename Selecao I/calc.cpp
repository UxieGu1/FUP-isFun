/*@calc: Calculadora numérica*/

#include <iostream>
#include <locale>
using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese");
    int n1, n2;
    char op;
    cin >> n1;
    cin >> n2;
    cin >> op;
    
    if(op == '+') {
        cout << n1 + n2 << endl;
    } else if(op == '-') {
        cout << n1 - n2 << endl;
    } else if(op == '*') {
        cout << n1 * n2 << endl;
    } else if(op == '/') {
        if(n2 != 0) {
            cout << n1 / n2 << endl;
        } else {
            cout << "Erro: Divisão por zero!";
        }
    } else {
        cout << "Operador inválido!";
    }
    return 0;
}