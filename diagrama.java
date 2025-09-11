// sumar dos numeros

import java.util.Scanner; // Importar la clase Scanner para leer la entrada del usuario
public class diagrama {
    Scanner in = new Scanner(System.in); 

    private int num1 =  0;
    private int num2 =  0;
    private int suma =  0;

    public void setNum1(){
        System.out.println("Ingrese un numero: "); 
        num1 = in.nextInt();
    }

    public void setNum2(){
        System.out.println("Ingrese un numero: "); 
        num2 = in.nextInt(); 
    }

    public void calcular(){
        suma = num1 + num2;
    }
    public double getSuma(){
        return suma;
    }
    public static void main(String[] args) {
        diagrama po1 = new diagrama();
        po1.setNum1();
        po1.setNum2();
        po1.calcular();
        System.out.println("La suma es: " + po1.getSuma());
    }
    
}