import java.util.Scanner;

class w1s5
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int l=1;
System.out.println("Enter the no. of rows:");
int n= sc.nextInt();
int s=n-1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=s;j++)
{
System.out.print(" "); }
for(int j=1;j<=l;j++)
{
System.out.print("*"); }
System.out.println();
s--;
l+=2;
}
}
}

