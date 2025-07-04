/*@sobrou: Calculando quanto sobrou*/

#include <iostream>
#include <iomanip>
#include <locale>
using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese");
    int qtd1, qtd2, qtd3;
    double p1, p2, p3;
    double qtdDinheiro;

    cin >> qtd1;
    cin >> qtd2;
    cin >> qtd3;
    cin >> p1;
    cin >> p2;
    cin >> p3;
    cin >> qtdDinheiro;

    double total = (qtd1 * p1) + (qtd2 * p2) + (qtd3 * p3);
    double troco = qtdDinheiro - total;
    cout << fixed << setprecision(2);
    cout << troco << "\n";
    return 0;
}