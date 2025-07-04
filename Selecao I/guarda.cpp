/*@guarda: Retornando problemas primeiro*/

#include <iostream>
#include <locale>
using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese");
    int wifi, login, admin;
    
    cin >> wifi;
    cin >> login;
    cin >> admin;
    
    if(wifi == 0) cout << "you must connect to wifi" << endl;
    else if(login == 0) cout << "you need to login first" << endl;
    else if(admin == 0) cout << "you must to login as admin" << endl;
    else cout << "done" << endl;
    return 0;
}