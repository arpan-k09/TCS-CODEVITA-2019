#include<iostream>
#include <string.h>
using namespace std;

int main()
{
	int n,q,i;
	cin>>n;
	string s;
	cin>>s;
	cin>>q;

	int *p=new int[q];
	int *count=new int[q];

	for(i=0;i<q;i++)
	{
		cin>>p[i];
	}
	string temp;
	for(i=0;i<q;i++)
	{
		temp=s.substr(0,p[i]-1);
		char c=s.at(p[i]-1);

		for(int j=0;j<temp.length();j++)
		{
			char ch=temp.at(j);
			if(ch==c)
			count[i]++;
		}
	}

	for(i=0;i<q;i++)
	cout<<count[i]<<endl;
	return 0;
}
