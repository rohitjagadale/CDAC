// Write a program for matchstick game between the computer and the user.  Your program should ensure that the computer always wins. Rules for the game are as follows:				a. There are 21 matchsticks									b. The computer asks the player to pick 1, 2, 3, or 4 matchsticks.					C. Player is given the chance to pick the sticks first then the computer picks the sticks.		d. Whoever is forced to pick up the last matchstick loses the game.



#include <iostream>
using namespace std;

int main(){
 int match_sticks = 21, user, computer;
    while(match_sticks>=1)
    {
        cout<<"Total Match Sticks:"<<match_sticks<<endl;
        cout<<("Pick up the match sticks between (1 to 4): ");
        cin>>user;

        if(user>4)
        {
            printf("Invalid Entry");
            break;
        }


        computer= 5 - user;
    
        cout<<"Computer picks up the match sticks"<<computer<<endl;
        match_sticks = match_sticks-user-computer;
        if(match_sticks==1)
        {
            cout<<"You have been lost via computer.";
            break;
        }
    }


    return 0;
}