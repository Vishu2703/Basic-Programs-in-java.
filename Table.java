//Write a program in java to except a number and print its table
class Table{
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		int i;
		int t;
		for(i=0;i<=10;i++){
			t=i*n;
			System.out.println(n+"*"+i+"="+t);
		}
	}
}

