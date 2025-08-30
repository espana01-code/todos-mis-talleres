import java.util.Scanner;

public class taller {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, suma;
        
        // Ingreso de números
        System.out.println("Ingrese un número:  ");
        num1 = in.nextInt();
        System.out.println("Ingrese otro número:  ");
        num2 = in.nextInt();
        
        // Sumar los números
        suma = num1 + num2;
        System.out.println("La suma es " + suma);
        
        // Condición para verificar si la suma es mayor que 10
        if (suma > 10) {
            System.out.println("La suma es mayor que 10: " + suma);
        } else {
            System.out.println("La suma es menor o igual que 10: " + suma);
        }

        
        
        // Cerrar el objeto Scanner
        in.close();
    }
}
