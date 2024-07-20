public class CalculadoraAvanzada extends Calculadora {
    private String nombre;



    public int elevarCuadrado(int numeroBase){
        return numeroBase * numeroBase;
    }

    protected int resta(int n1, int n2){
        return n1 - n2;
    }

    protected double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("Error: División por cero.");
        }
        return numero1 / numero2;
    }

    protected double raizCuadrada(double numero1) {
        if (numero1 < 0) {
            throw new IllegalArgumentException("Error: No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero1);
    }

    protected long factorial(int n1) {
        if (n1 < 0) {
            throw new IllegalArgumentException("Error: El número debe ser no negativo.");
        }
        long resultado = 1;
        for (int i = 1; i <= n1; i++) {
            resultado *= i;
        }
        return resultado;
    }

    protected double seno(double numero1) {
        return Math.sin(numero1);
    }

    protected double coseno(double numero1 ) {
        return Math.cos(numero1);
    }

    protected double Hipotenusa(double numero1, double numero2) {
        return Math.sqrt(Math.pow(numero1, 2) + Math.pow(numero2, 2));
    }

    protected double perimetroCirculo(double numero1) {
        return 2 * Math.PI * numero1;
    }

}