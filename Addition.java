import java.util.Scanner;
class Subtraction{
public static void main(String args[]){
int sub=0;
//Initializing variables
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
//Displaying num1 and num2
System.out.println("num1="+num1);
System.out.println("num2="+num2);
sub=num1-num2;//adding num1 and num2
System.out.println("The sub="+sub);
System.out.println(num1+"-"+num2+"="+sub);
}
}