#include <iostream>
using namespace std;

bool check(double c);

int main(){
    float due, rec, change;
    cout << " Enter ammount Due :" << endl;
    cin >> due;
    cout <<"Enter ammount recieved : " << endl;
    cin >> rec;
    change = rec - due;
    cout << change << "\n";
    // sets all values to 0
    float cash[9] = {50.00, 20.00,10.00,5.00,1.00,0.50,0.20,0.10,0.05};
    int re[9] = {};

    if (change  < 0 ){
        cout << "Payment outstanding : " << change << endl;
    }
    else{
            for(int i = 0 ; i<10 ;i++){
                if(check(change)){
                    while(change >= cash[i]){
                        change -= cash[i];
                        re[i]++;
                    }
                }
            }
            if((change >0 )&& (change < 0.05)){
                    re[8]++;
            }

    for(int j = 0 ; j < 9; j++){

            cout<<"R"<<cash[j]<< "no. " << re[j] <<endl;
    }
    }// ends else
return 0 ;
}
bool check(double c){
    if (c >  0){
         return true;
    }
    else{
        return false;
    }
}
