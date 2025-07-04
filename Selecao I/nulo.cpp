/*@nulo: Positivo, nulo ou negativo*/

#include <iostream>
#include <locale>
using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese");
    
    int n;
    cin >> n;

    if(n > 0){
        cout << "+" << endl;
    }else if(n == 0){
        cout << "0" << endl;
    }else{
        cout << "-" << endl;
    }
    return 0;
}