/*@quantos: Quantos são iguais*/

#include <iostream>
#include <locale>
using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese");
    int n1, n2, n3;;

    cin >> n1;
    cin >> n2;
    cin >> n3;
    
    if(n1 == n2 && n2 == n3) {
        cout << "3" << endl;  
    }
    else if(n1 == n2 || n1 == n3 || n2 == n3) {
        cout << "2" << endl;  
    }
    else {
        cout << "0" << endl; 
    }
    return 0;
}


