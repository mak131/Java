#include<iostream.h>
#include<studio.h>
int main()
int n,r,sum=0,temp;
cout<<"enter the number= ";
cin>>n;
temp=n;
while(n>0)
{
r=n%10;
sum=sum+(r*r*r);
n=n/10;
}

if(temp==sum)
cout<<"armstorng number.">>endl;
else
cout<<"not armstorng number.">>endl;
return 0;

}                        


