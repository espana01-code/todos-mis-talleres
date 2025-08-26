import java.util.Scanner;

public class taller {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, suma;
        System.out.println("Ingrese un numero:  ");
        num1 = in.nextInt();
        System.out.println("Ingrese otro numero:  ");
        num2 = in.nextInt();
        suma = num1 + num2;

        System.out.println("La suma es " + suma);
        if (suma > 10) {
            System.out.println("La suma es mayor que 10: " + suma);
        } else {
            System.out.println("La suma es menor o igual que 10: " + suma);
        }
    }
}