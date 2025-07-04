/*@tres: Soma de três inteiros*/

#include <iostream>
#include <locale>
using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese");
    int a, b, c;

    cin >> a;
    cin >> b;
    cin >> c;

    int soma = (a + b + c);
    cout << soma << "\n";
    return 0;
}