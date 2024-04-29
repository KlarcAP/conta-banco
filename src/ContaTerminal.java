import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("*********************Seja Bem-Vindo!***********************");
        System.out.println( "Por favor, insira seu nome: " );
        String nomeCliente = leitor.next();

        System.out.println( "Digite a agencia: " );
        String agencia = leitor.next();

        System.out.println( "Digite o número: " );
        int numero = leitor.nextInt();

        System.out.println( "Insira seu saldo na conta: " );
        Double saldoConta = leitor.nextDouble();

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +",conta "+ numero +" e seu saldo de "+ saldoConta +" já está disponível para saque");
        
    }
}
