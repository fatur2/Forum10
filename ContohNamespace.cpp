#include <iostream>
#include <conio.h>
#include <string>

using namespace std;
int main()
{
	int umur=12;
	
	if (umur<=19)
	{
		if (umur<=10){
			cout<<"Anak-anak"<<endl;
		}else {
			cout<<"Remaja"<<endl;
		}
	}else {
		cout<<"Bukan usia anak maupun remaja"<<endl;
	}

getch();
}
