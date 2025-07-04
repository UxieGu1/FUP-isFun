/*@max: Maior de dois números*/

#include <iostream>
#include <locale>
using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese");
    int n1, n2;
    cin >> n1;
    cin >> n2;

    if(n1 > n2){
        cout << n2 << endl;
    }else if(n2 > n1){
        cout << n2 << endl;
    }else{
        cout << n1 << endl;
    }
    return 0;
}