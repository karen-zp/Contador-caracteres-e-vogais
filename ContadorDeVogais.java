public class ContadorDeVogais {

    public static int contarVogais(String str) {
        str = str.toLowerCase(); 
        String vogais = "aeiou";
        int cont = 0;

        for (char c : str.toCharArray()) {
            if (vogais.indexOf(c) != -1)
                cont++;
        }
        return cont;
    }
    public static void main(String[] args) {
        String exemplo = "Hello mundo!";
        int numeroDeVogais = contarVogais(exemplo);

        System.out.println(exemplo + " tem " + numeroDeVogais + " vogais.");
    }
}
