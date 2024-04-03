//Write a program in java to find factorial of given number
class Factorial{
public static void main(String args[]){
	int fact=1;
	int n=Integer.parseInt(args[0]);
	for(int i=1;i<=n;i++){
		fact=fact*i;
}
System.out.println("Factorial of given number is : " +fact);
}
}