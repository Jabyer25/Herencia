import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        CalculadoraAvanzada miCalculadora = new CalculadoraAvanzada();

        do {
            // Mostrar el menú de operaciones matemáticas
            mostrarMenu();

            opcion = scanner.nextInt();

            int n1, n2;
            double numero1, numero2;

            // Procesar la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    n1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    n2 = scanner.nextInt();
                    System.out.println("Resultado: " + miCalculadora.sumar(n1, n2));
                    break;

                case 2:
                    System.out.print("Ingrese un número para elevar al cuadrado: ");
                    n1 = scanner.nextInt();
                    System.out.println("Resultado: " + miCalculadora.elevarCuadrado(n1));
                    break;

                case 3:
                    System.out.print("Ingrese el primer número: ");
                    n1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    n2 = scanner.nextInt();
                    System.out.println("Resultado: " + miCalculadora.resta(n1, n2));
                    break;

                case 4:
                    System.out.print("Ingrese el primer número: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    numero2 = scanner.nextDouble();
                    try {
                        System.out.println("Resultado: " + miCalculadora.dividir(numero1, numero2));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    System.out.print("Ingrese un número para calcular la raíz cuadrada: ");
                    numero1 = scanner.nextDouble();
                    try {
                        System.out.println("Resultado: " + miCalculadora.raizCuadrada(numero1));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 6:
                    System.out.print("Ingrese un número para calcular el factorial: ");
                    n1 = scanner.nextInt();
                    try {
                        System.out.println("Resultado: " + miCalculadora.factorial(n1));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 7:
                    System.out.print("Ingrese un ángulo en radianes para calcular el seno: ");
                    numero1 = scanner.nextDouble();
                    System.out.println("Resultado: " + miCalculadora.seno(numero1));
                    break;

                case 8:
                    System.out.print("Ingrese un ángulo en radianes para calcular el coseno: ");
                    numero1 = scanner.nextDouble();
                    System.out.println("Resultado: " + miCalculadora.coseno(numero1));
                    break;

                case 9:
                    System.out.print("Ingrese el cateto número 1: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Ingrese el cateto número 2: ");
                    numero2 = scanner.nextDouble();
                    System.out.println("Resultado: " + miCalculadora.Hipotenusa(numero1, numero2));
                    break;

                case 10:
                    System.out.print("Ingrese el radio del círculo: ");
                    numero1 = scanner.nextDouble();
                    System.out.println("Resultado: " + miCalculadora.perimetroCirculo(numero1));
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }

            // Preguntar si se desea continuar
            System.out.println("¿Desea realizar otra operación? (s/n): ");
            String continuar = scanner.next();

            // Limpiar la pantalla simulando varias líneas en blanco
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }

            // Salir del bucle si la respuesta no es 's'
            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }

        } while (true);

        scanner.close();
    }

    // Método para mostrar el menú
    private static void mostrarMenu() {
        System.out.println("Menú de Operaciones Matemáticas:");
        System.out.println("1. Sumar");
        System.out.println("2. Elevar al cuadrado");
        System.out.println("3. Resta");
        System.out.println("4. Dividir");
        System.out.println("5. Raíz cuadrada");
        System.out.println("6. Factorial");
        System.out.println("7. Seno");
        System.out.println("8. Coseno");
        System.out.println("9. Hipotenusa");
        System.out.println("10. Perímetro de un círculo");
        System.out.print("Seleccione una opción: ");
    }
}
