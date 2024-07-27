public abstract class Calculadora {
    private String nombre;
    public int sumar(int n1, int n2){
        return n1 + n2;
    }

    protected abstract int resta(int n1, int n2);

    protected abstract double dividir(double numero1, double numero2);

    protected abstract double raizCuadrada(double numero1);

    protected abstract long factorial(int n1);
}