import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //variaveis
        int numero;
        String agencia;
        String nome_Cliente;
        double saldo;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        numero = teclado.nextInt();
        System.out.println("Por favor, digite nome da Agência !");
        agencia = teclado.next();
        System.out.println("Por favor, digite seu nome completo !");
        teclado.nextLine();
        nome_Cliente = teclado.nextLine();
        System.out.println("Por favor, digite o saldo que deseja depositar em reais!");
        saldo = teclado.nextDouble();


        String saldoFormatado = String.format("R$%.2f", saldo);
        System.out.println("Olá "+ nome_Cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldoFormatado + " já está disponível para saque.");






    }
}