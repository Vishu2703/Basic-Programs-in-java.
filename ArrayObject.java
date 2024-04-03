class ArrayObject{
	public static void main(String args[]){
		int a[] = new int[5];
		a[0]= 5;
		a[1]= 6;
		a[2]= 7;
		a[3]= 8;
		a[4]= 9;
		System.out.println("******Using Normal Method******");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println("******Using ForEach Loop******");
		for(int x:a)
		System.out.println(x);
		System.out.println("******Using For Loop******");
		System.out.println("Length of Array "+a.length);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}