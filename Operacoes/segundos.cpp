/*@segundos: Converter segundos em h:m:s*/

#include <iostream>
#include <locale>
using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese");

    int tempo;
    cin >> tempo;

    int hora = tempo / 3600;
    int resto = tempo % 3600;
    int minutos = resto / 60;
    int segundos = resto % 60;

    cout << hora << ":" << minutos << ":" << segundos << "\n";

    return 0;
}