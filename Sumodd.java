//Write a program to find the sum of odd number from 1 to 20
class Sumodd{
public static void main(String args[]){
int sum = 0;
int i ;
for(i=0;i<=20;i++){
if(i%2 == 1){
sum=sum+i;
}
}
System.out.println("Sum of odd number is " +sum);
}
}