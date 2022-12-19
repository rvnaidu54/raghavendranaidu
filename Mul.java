import java.util.Scanner;

public class Mul {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Enter the number for which you want the multiplication table: ");
int num = scan.nextInt();
for (int i = 1; i <= 10; i++) {
System.out.println(num + " x " + i + " = " + num*i);
}
}
}



