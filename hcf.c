#include<stdio.h>
void main()
{
	printf("Enter 2 numbers\n");
	int a,b;
	scanf("%d %d",&a,&b);
	int max=a>b?a:b;
	int min=a<b?a:b;
	int r=1;
	while(r!=0)
	{
		r=max%min;
		max=min;
		min=r;
	}
	printf("HCF is %d",max);
	
}
