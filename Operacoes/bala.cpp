/*@bala: Distância entre dois pontos*/

/*@bala: Distância entre dois pontos*/

#include <iostream>
#include <cmath>
#include <iomanip>
#include <locale>
using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese");
    
    double x1, x2, y1, y2;

    cin >> x1;
    cin >> y1;
    cin >> x2;
    cin >> y2;

    double distancia = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));

    cout << fixed << setprecision(2);
    cout << distancia << endl;
    return 0;
}