public class ContadorDeCaracteres {
    public static int contarCaracteres(String str) {
        if (str == null)
            return 0;
        return str.length();
    }

    public static void main(String[] args) {
        String exemplo = "Hello mundo!";
        int numeroDeCaracteres = contarCaracteres(exemplo);

        System.out.println(exemplo + " tem " + numeroDeCaracteres + " caracteres.");
    }
}
