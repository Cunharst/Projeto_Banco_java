import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = entrada.nextLine();

        System.out.println("Qual é a sua agência?");
        String agencia = entrada.nextLine();

        System.out.println("Qual é o seu número?");
        int numero = entrada.nextInt();

        System.out.println("Quanto você têm de saldo?");
        double saldo = entrada.nextDouble();

        System.out.println("-----------------");

        System.out.println("Seu nome é" + nome );
        System.out.println("Sua agência é: " + agencia);
        System.out.println("Seu número é: " + numero);
        System.out.println("Você têm essa quantia de saldo: " + saldo);

        entrada.close();
    }
    
}
