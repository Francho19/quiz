import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        System.out.println("Ingrese el numero para sacar los números amigos ");
        int num = scanner.nextInt();
        System.out.print("divisores propios de " + num + " son ");
        System.out.print("divisores propios de " + num + " son ");
        for (int numero = 1; numero <= num / 2; numero++) {
            if (num % numero == 0) {
                System.out.print(numero + "");
                suma = numero;
              System.out.println(" son numeros amigos :)");
            } else {
                System.out.println( "No son números amigos :( ");
            }
        }
        System.out.println();

        scanner.close();
    }
}
