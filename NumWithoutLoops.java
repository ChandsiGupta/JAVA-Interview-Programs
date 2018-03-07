import java.util.Scanner;
class NumWithoutLoops
{
 
public static void recursivefun(int n,int l) 
{ 
 
  if(n <= l) {
 
       System.out.println(n); 
         recursivefun(n+1,l);   }
}
 
public static void main(String args[]) 
{
 int l; 
System.out.println("Enter n");
Scanner sc = new Scanner(System.in);
l= sc.nextInt(); 
recursivefun(1,l); 
 
 }
 
}

