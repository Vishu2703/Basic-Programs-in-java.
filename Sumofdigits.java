//Write a program to find sum of digit
class Sumofdigits{
public static void main(String args[]){
int r;
int n=Integer.parseInt(args[0]);
int sum=0;
while(n!=0){
	r=n%10;
	sum=sum+r;
	n=n/10;
}
System.out.println("Sum of Given digits is: " +sum );
}
}