//Find maximum number among 3 number
public class Maxthree{
public static void main(String args[]){
	int num = Integer.parseInt(args[0]);
	int num1 = Integer.parseInt(args[1]);
	int num2 = Integer.parseInt(args[2]);
	if(num>num1 && num>num2){
	System.out.println("Greater number is : " +num);
	}
	else if(num1>num && num1>num2){
	System.out.println("Greater number is : " +num1);
	}
	else{
	System.out.println("Greater number is : " +num2);
	}	
}
}