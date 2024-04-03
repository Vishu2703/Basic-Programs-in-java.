public class maxfour{
public static void main(String args[]){
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int c = Integer.parseInt(args[2]);
	int d = Integer.parseInt(args[3]);
	if(a>b && a>c && a>d){
		System.out.println("Greater number is: " +a);
	}else if(b>a && b>c && b>d){
		System.out.println("Greater number is: " +b);
	}else if(c>a && c>b && c>d){
		System.out.println("Greater number is: " +c);
	}else{
		System.out.println("Greater number is: " +d);
	}
}
}
