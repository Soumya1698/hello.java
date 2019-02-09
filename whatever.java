import java.util.Scanner;
import java.util.Arrays;

public class whatever
{
public static void main(String[] args)
{
int[] myarray ={897,56,90,12,123,75};
System.out.println("elements in the array are: ");
System.out.println(Arrays.toString(myarray));
Scanner sc = new Scanner(System.in);
System.out.println("ENter the index of the required element:");
int element= sc.nextInt();
System.out.println("element in the given index is :" + myarray[element]);
}
}