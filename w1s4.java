import java.util.Scanner;
import java.util.Arrays;

class w1s4
{
public static void main(String[] args)
{
int i,j; 
Scanner sc = new Scanner(System.in);
System.out.println("enter the string:");
String str = sc.nextLine();
char[] c = new char[10];
char[] a = new char[10];
char[] b = new char[10];
int x=str.length();
for(i=0;i<=x;i++)
{
c[i]=str.charAt(i);
}
int n = c.length;
for(j=0;j<=n;j++)
{
if(j%2==0)
{a[j++]=c[i];}
else
{ b[j++]=c[i];}
}
for(j=0;j<n;j++)
{ System.out.print(a[j]); }
for(j=0;j<n;j++)
{ System.out.println(b[j]); }
}
} 