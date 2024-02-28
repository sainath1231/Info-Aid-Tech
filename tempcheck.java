import java.util.*;
class tempcheck{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("enter 1 to change temp from celsius to fahrenheit");
System.out.println("enter 2 to change temp from farenheit to celsius");
System.out.println("enter 3 to change temp from celsius to kelvin");
System.out.println("enter 4 to change temp from kelvin to farenheit");
System.out.println("enter 5 to change temp from kelvin to celsius");
System.out.println("enter 6 to change temp to farenheit");
System.out.println("enter ur choice");
int n=sc.nextInt();
System.out.println("enter ur temp");
int temp=sc.nextInt();

double c=0,k=0,f=0;
	switch(n)
{
case 1: f=(temp*(9/5))+32;
	  System.out.println("farenheit is: "+f);
		break;
case 2:c=(temp-32)*5/9;
		System.out.println("celsius is: "+c);
		break;
case 3:k=(temp+273.15);
		System.out.println("fekvin is: "+k);
		break;
case 4:f=(temp-273.15);
		System.out.println("farenheit is: "+f);
		break;
case 5:c=((temp-273.15)*9/5)+32;
		System.out.println("celsius is: "+c);
		break;
case 6:f=((temp-32)*5/9)+273.15;
		System.out.println("farenheit is: "+f);
		break;
default:System.out.println("exit");
		break;
}
}
}
