import java.util.Scanner;

class w1s2
{
public static void main(String[] args)
{
String str = new String();
String[] str1= new String[100];
Scanner sc = new Scanner(System.in);
str = sc.nextLine();
int n= str.length();
for(int i=0;i<n;i++)
{
str1= str.split("");
}
for(int i=n;i>=0;i--)
{
System.out.println(str1[i]);
}
}
}

