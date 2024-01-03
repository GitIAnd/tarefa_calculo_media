public class CalculoMedia {

    public static void main (String args[]) {
        calculaMedia();
    }

    public static void calculaMedia() {

        int nota1 = 7;
        int nota2 = 3;
        int nota3 = 6;
        int nota4 = 10;

        int somaNotas = nota1 + nota2 + nota3 + nota4;

        int mediaNotas = somaNotas / 4;

        System.out.print("Media: " + mediaNotas);
    }
}
