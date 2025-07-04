/*@media: Média de dois inteiros*/

#include <iostream>
#include <locale>
#include <iomanip>
using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese");
    
    int n1, n2;
    cin >> n1;
    cin >> n2;

    float media = (n1 + n2) / 2.0f;

    cout << fixed << setprecision(1);
    cout << media << "\n";

    return 0;
}