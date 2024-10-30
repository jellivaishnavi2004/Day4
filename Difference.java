import java.util.Scanner;
class Difference{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int diff=0;
if(a>b)
diff=a-b;
else
diff=b-a;
System.out.println(diff);
}
}