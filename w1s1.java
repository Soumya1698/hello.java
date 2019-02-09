import java.util.Scanner;

public class w1s1
{
public static void main(String[] args)
{
int sum=0;
int[] arr = new int[10];
Scanner sc = new Scanner(System.in);
System.out.println("enter the given nos in an array");
for(int i=0;i<arr.length; i++)
{
arr[i] = sc.nextInt();
}
for(int i=0;i<arr.length;i++)
{
sum+=arr[i];
}
System.out.println(sum);
}
}

