/*@round: Arredondar número*/

#include <iostream>
#include <cmath>
#include <locale>
using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese");
    char c;
    float n;

    cin >> c;
    cin >> n;

    int resultado;
    if(c == 'r'){
        resultado = round(n);
        cout << resultado << endl;
    }else if(c == 'f'){
        resultado = floor(n);
        cout << resultado << endl;
    }else{
        resultado = ceil(n);
        cout << resultado << endl;
    }
    return 0;
}