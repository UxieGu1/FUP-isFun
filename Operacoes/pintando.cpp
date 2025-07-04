/*@pintando: Pintando a casa*/

#include <iostream>
#include <cmath>
#include <iomanip>
#include <locale>
using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese");
    
    float a, b, c;
    cin >> a;
    cin >> b;
    cin >> c;

    float p = (a + b + c) / 2;

    float area = sqrt(p * (p - a) * (p - b) * (p - c));
    cout << fixed << setprecision(2);
    cout << area << "\n";

    return 0;
}