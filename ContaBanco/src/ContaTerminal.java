import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    static String agencia;
    static String conta;
    static float saldo = 1500;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("#### Bem vindo ao Banco Java 1.0 ####\n");

        System.out.println(">> Por favor, digite sua agência:");
        agencia = scan.next();
        System.out.println(">> Por favor, digite sua conta:");
        conta = scan.next();

        //limpa o console
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Olá, você está logado!\n");
        System.out.println("Seu saldo atual é de: "+saldo+"\n");
        
        System.out.println(">> Digite o valor a ser depositado:");
        saldo += scan.nextFloat();

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Deposito realizado com sucesso!\n");
        System.out.println("### COMPROVANTE ###\n");
        System.out.println("AG. "+agencia+"       CC: "+conta+"\n");
        
        System.out.println("Seu saldo atual é de: "+saldo);
        
    }
}
