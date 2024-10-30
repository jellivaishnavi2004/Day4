import java.util.Scanner;
class Division{
public static void main(String args[]){
int div=0;
//Initializing variables
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
//Displaying num1 and num2
System.out.println("num1="+num1);
System.out.println("num2="+num2);
div=num1/num2;//adding num1 and num2
System.out.println("The div="+div);
System.out.println(num1+"/"+num2+"="+div);
}
}