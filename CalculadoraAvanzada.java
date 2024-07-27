import java.util.ArrayList;
import java.util.List;

public class CalculadoraAvanzada extends Calculadora {
    private List<String> historial = new ArrayList<>();

    // Método para añadir al historial
    private void agregarAlHistorial(String operacion) {
        historial.add(operacion);
    }

    // Método para mostrar el historial
    public void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("El historial está vacío.");
        } else {
            System.out.println("Historial de operaciones:");
            for (String operacion : historial) {
                System.out.println(operacion);
            }
        }
    }

    @Override
    protected int resta(int n1, int n2) {
        int resultado = n1 - n2;
        agregarAlHistorial("Resta: " + n1 + " - " + n2 + " = " + resultado);
        return resultado;
    }

    public int elevarCuadrado(int numeroBase) {
        int resultado = numeroBase * numeroBase;
        agregarAlHistorial("Elevar al cuadrado: " + numeroBase + "^2 = " + resultado);
        return resultado;
    }

    @Override
    protected double dividir(double numero1, double numero2) {
        double resultado;
        if (numero2 == 0) {
            throw new ArithmeticException("Error: División por cero.");
        }
        resultado = numero1 / numero2;
        agregarAlHistorial("Dividir: " + numero1 + " / " + numero2 + " = " + resultado);
        return resultado;
    }

    @Override
    protected double raizCuadrada(double numero1) {
        double resultado;
        if (numero1 < 0) {
            throw new IllegalArgumentException("Error: No se puede calcular la raíz cuadrada de un número negativo.");
        }
        resultado = Math.sqrt(numero1);
        agregarAlHistorial("Raíz cuadrada: √" + numero1 + " = " + resultado);
        return resultado;
    }

    @Override
    protected long factorial(int n1) {
        if (n1 < 0) {
            throw new IllegalArgumentException("Error: El número debe ser no negativo.");
        }
        long resultado = 1;
        for (int i = 1; i <= n1; i++) {
            resultado *= i;
        }
        agregarAlHistorial("Factorial: " + n1 + "! = " + resultado);
        return resultado;
    }

    public double seno(double numero1) {
        double resultado = Math.sin(numero1);
        agregarAlHistorial("Seno: sin(" + numero1 + ") = " + resultado);
        return resultado;
    }

    public double coseno(double numero1) {
        double resultado = Math.cos(numero1);
        agregarAlHistorial("Coseno: cos(" + numero1 + ") = " + resultado);
        return resultado;
    }

    public double hipotenusa(double numero1, double numero2) {
        double resultado = Math.sqrt(Math.pow(numero1, 2) + Math.pow(numero2, 2));
        agregarAlHistorial("Hipotenusa: √(" + numero1 + "^2 + " + numero2 + "^2) = " + resultado);
        return resultado;
    }

    public double perimetroCirculo(double numero1) {
        double resultado = 2 * Math.PI * numero1;
        agregarAlHistorial("Perímetro del círculo: 2 * π * " + numero1 + " = " + resultado);
        return resultado;
    }
}
