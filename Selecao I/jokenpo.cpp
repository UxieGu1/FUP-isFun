/*@jokenpo: Jokenpo das tartarugas*/

#include <iostream>
#include <locale>
using namespace std;

int main(){
    setlocale(LC_ALL, "Portuguese");
    
    char jog1, jog2;
    
    cin >> jog1;
    cin >> jog2;
    
    if((jog1 == 'R' && jog2 == 'S') || (jog1 == 'P' && jog2 == 'R') || (jog1 == 'S' && jog2 == 'P')){
        cout << "jog1\n";
    }else if((jog2 == 'R' && jog1 == 'S') || (jog2 == 'P' && jog1 == 'R') || (jog2 == 'S' && jog1 == 'P')){
        cout << "jog2\n";
    }else{
        cout << "empate\n";
    }
    return 0;
}
