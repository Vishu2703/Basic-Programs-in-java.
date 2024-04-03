public class divisible
{
public static void main(String args[])
{
        int num = Integer.parseInt(args[0]);
        System.out.println("Number is :" +num);
	if(num%7 == 0 && num%3 == 0){
		System.out.println("Number is divisible by 3 and 7");
	}else{
		System.out.println("Number is not divisible by 3 and 7");
	}
}
}
