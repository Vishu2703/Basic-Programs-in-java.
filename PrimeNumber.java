class PrimeNumber{
public static void main(String args[]){
int n = Integer.parseInt(args[0]);
int i;
int f=0;
for(i=2;i<n;i++){
if(n%i==0){
f=1;
break;
}
}
if(f==1){
System.out.println("The given number is not prime");
}
else
{
System.out.println("The given number is prime");
}
}
}