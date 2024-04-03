//Write a java program sum of 1 to 10 odd number using array
class SumArray{
	public static void main(String args[]){
		int a[]={1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		int value=Integer.parseInt(args[0]);
		if(value==1){
			System.out.println("Length of array" +a.length);
			System.out.println("Using For loop");
			for(int i=0;i<a.length;i++){
				if(a[i]%2==1){
					sum=sum+a[i];
					
					System.out.println(sum);
				}
			}
		}else if(value==2){
			System.out.println("Using ForEach loop");
			for(int x:a){
				if(x%2==1){
					sum=sum+x;
					
					System.out.println(sum);
				}
			}
		}
		else{
			System.out.println("Enter a valid number");
		}
}
}
