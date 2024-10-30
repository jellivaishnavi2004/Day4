import java.util.Scanner;
class ArithmaticOperators{
public static void main(String args[]){
int mod=0;
//Initializing variables
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int num1=sc.nextInt();
int num2=sc.nextInt();
//Displaying num1 and num2
System.out.println("num1="+num1);
System.out.println("num2="+num2);
sum=num1+num2;
sub=num1-num2;
mul=num1*num2;
div=num1+num2;
mod=num1%num2;
System.out.println("The sum="+sum);
System.out.println("The sub="+sub);
System.out.println("The mul="+mul);
System.out.println("The div="+div);
System.out.println("The mod="+mod);

}
}