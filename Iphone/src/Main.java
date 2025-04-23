public class Main {
    public static void main(String[] args) throws Exception {
        
        Iphone iphone = new Iphone();

        System.out.println("## FUNÇÕES DA INTERFACE DE MÚSICA ##");
        appMusica(iphone);
        
        System.out.println("## FUNÇÕES DA INTERFACE NAVEGADOR ##");
        appNavegador(iphone);
        
        System.out.println("## FUNÇÕES DA INTERFACE TELEFONE ##");
        appPhone(iphone);

    }

    public static void appMusica(IReprodutorMusical reprodutor){
        reprodutor.selecionarMusica("James Brown - I Feel Good");
        reprodutor.tocar();
        reprodutor.pausar();
    }

    public static void appPhone(IAparelhoTelefonico phone){
        phone.atender();
        phone.ligar("5599999999");
        phone.iniciarCorreioVoz();
    }

    public static void appNavegador(INavegadorInternet nav){
        nav.exibirPagina("www.google.com.br");
        nav.atualizarPagina();
        nav.adicionarNovaAba();
    }

}