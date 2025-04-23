package controlefluxo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    private Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    private List<Usuario> usuarios = new ArrayList<Usuario>();

    public App(){
        int opcao = -1;
        do{
            
            System.out.println("Escolha uma opção no menu:");
            System.out.println("1. Cadastro");
            System.out.println("0. Sair");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    cadastro();
                    break;
            
                default:
                    break;
            }
        }
        while(opcao!=0);
    }
    public void cadastro(){
        Usuario usuario = new Usuario();
        System.out.println("Informe seu nome:");
        
        String nome = scan.nextLine();
        usuario.setNome(nome);
        /*usuario.setIdade((int) scan.nextInt());
        usuario.setProfissao((String) scan.next());*/

        this.usuarios.add(usuario);

        usuarios.add(usuario);


        usuarios.forEach( (u) -> {
            System.out.println(">> Cadastrado: " + u.getNome());
        });

    }
}
