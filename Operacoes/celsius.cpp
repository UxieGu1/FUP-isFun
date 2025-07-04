/*@celsius: Conversor para Fahrenheit*/

#include <iostream>
#include <locale>
#include <iomanip>
#include <cmath>
using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese");

    double celsius;
    double fahrenheit;

    cin >> celsius;
    fahrenheit = 1.80f * (celsius) + 32;

    cout << fixed << setprecision(6);
    cout << ceil(fahrenheit) << "\n";
    
    return 0;
}