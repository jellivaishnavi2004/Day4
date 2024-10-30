import java.util.Scanner;
class Difference{
public static void main(String args[]){
int diff=0;
//Initializing variables
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("a="+a);
System.out.println("b="+b);
diff=a-b;
System.out.println("The diff="+diff);
System.out.println(a+"-"+b+"="+diff);
}
}