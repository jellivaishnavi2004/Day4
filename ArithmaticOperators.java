import java.util.Scanner;
class ArithmaticOperators{
public static void main(String args[]){ 
//Initializing variables
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int num1=sc.nextInt();
int num2=sc.nextInt();
//Displaying num1 and num2
System.out.println("num1="+num1);
System.out.println("num2="+num2);
int sum=num1+num2;
int sub=num1-num2;
int mul=num1*num2;
int div=num1/num2;
int mod=num1%num2;
System.out.println("The sum:"+sum);
System.out.println(num1+"+"+num2+"="+sum);
System.out.println("The sub:"+sub);
System.out.println(num1+"-"+num2+"="+sub);
System.out.println("The mul:"+mul);
System.out.println(num1+"*"+num2+"="+mul);
System.out.println("The div:"+div);
System.out.println(num1+"/"+num2+"="+div);
System.out.println("The mod:"+mod);
System.out.println(num1+"%"+num2+"="+mod);

}
}