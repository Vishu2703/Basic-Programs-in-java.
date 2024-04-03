//Write aithmetic operation using switch statement
public class Arithmetic{
public static void main(String args[]){
int op = Integer.parseInt(args[0]);
int a = Integer.parseInt(args[1]);
int b = Integer.parseInt(args[2]);
switch(op){
case 1:
System.out.println("Addition is " +(a+b));
break;
case 2:
System.out.println("Substraction is " +(a-b));
break;
case 3:
System.out.println("multiplication is " +(a*b));
break;
case 4:
System.out.println("Division is " +(a/b));
case 5:
System.out.println("Modulus is " +(a%b));
break;
default:
System.out.println("Invalid number");
}
}
}