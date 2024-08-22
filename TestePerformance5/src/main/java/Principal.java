public class Principal {
    public static void main(String[] args) {
        int numero = 0;
        int fatorial =  calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
    public static int calcularFatorial(int numero) {

        if (numero == 0) {
            return 1;
        }

        int resultado = 1;

        while (numero > 1){
            resultado  *= numero;
            numero--;
        }
        return resultado;
    }
}
