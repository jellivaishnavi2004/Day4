import java.util.Scanner;
class Multiplication{
public static void main(String args[]){
int mul=0;
//Initializing variables
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
//Displaying num1 and num2
System.out.println("num1="+num1);
System.out.println("num2="+num2);
mul=num1-num2;//multiplication  num1 and num2
System.out.println("The mul="+mul);
System.out.println(num1+"*"+num2+"="+mul);
}
}