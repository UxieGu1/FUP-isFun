/*@mumia: Criança, jovem, adulto*/

#include <iostream>
#include <locale>
using namespace std;

int main() {
    setlocale(LC_ALL, "Portuguese");
    
    string nome;
    int idade;
    
    getline(cin, nome);
    cin >> idade;
    cin.ignore();

    if(idade < 12){
        cout << nome << " eh crianca\n";
    }else if(idade < 18){ 
        cout << nome << " eh jovem\n";
    }else if(idade < 65){
        cout << nome << " eh adulto\n";
    }else if(idade < 1000){
        cout << nome << " eh idoso\n";
    }else{
        cout << nome << " eh mumia\n";
    }
    return 0;
}