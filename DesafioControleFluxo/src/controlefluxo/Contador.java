package controlefluxo;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("### Bem-vindo ao Contador ###\n");
        System.out.println("> Por favor, informe um número:");
        int num1 = scan.nextInt();
        System.out.println("> Agora, informe um número maior que "+num1);
        int num2 = scan.nextInt();
        scan.close(); 

        try {
            contar(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    public static void contar(int num1, int num2) throws ParametrosInvalidosException{
        if(num2<=num1)
            throw new ParametrosInvalidosException();
        
        System.out.println("\nContagem de: "+num1+" até "+num2+"\n");
        
        for(int i=num1; i<=num2; i++)
            System.out.println("> "+i);
    }
}
