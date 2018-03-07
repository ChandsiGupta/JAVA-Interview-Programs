import java.util.Scanner;
class PrimeNumbers2
{
public static void main(String[] s)
{Scanner sc = new Scanner (System.in);
int n,j;
System.out.println("Enter the numbers to be print");
n = sc.nextInt();
for(int i=2;i<=n;i++)
{
for(j=2;j<=i;j++)
{
 if(i==j)
{
System.out.println(i);
}
if(i%j==0)
{break;
}

}
}}}
