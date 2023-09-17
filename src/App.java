import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception { 
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero da agencia por gentileza:");
        String agency = input.next();
        System.out.println("Digite o número da conta por gentileza:");
        int numberAccount = input.nextInt();
        System.out.println("Digite o seu nome por gentilza:");
        String nameClient = input.next();
        double balancy = 237.48;

        System.out.println("Olá " + nameClient + " obrigado por criar uma conta em nosso banco, sua agencia é " + agency + " sua conta é " + numberAccount + " e o seu saldo é " + balancy);

        input.close();
    }
}
