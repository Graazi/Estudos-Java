import java.util.Scanner;

public class CalculaMedia{
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        double n1, n2, media;

        System.out.println("Informe o primeiro número: ");
        n1 = input.nextDouble();
        System.out.println("Informe o segundo número: ");
        n2 = input.nextDouble();

        media = (n1 + n2)/2;
        
        System.out.println("Média = " + media);

    }
}