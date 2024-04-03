public class Nested{
public static void main(String args[]){
	int num = Integer.parseInt(args[0]);
	int num1 = Integer.parseInt(args[1]);
	int num2 = Integer.parseInt(args[2]);
	
if(num>num1){
	if(num>num2){
		System.out.println("Greater is " + num);
	}
}else if(num1>num){
	if(num1>num2){
	System.out.println("Greater is " + num1);
}
}
else if(num2>num){
	if(num2>num1){
	System.out.println("Greater is " + num2);
}
}
else{
System.out.println("Enter valid number ");
}
}
}