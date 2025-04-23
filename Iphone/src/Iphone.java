public class Iphone implements IAparelhoTelefonico, INavegadorInternet, IReprodutorMusical {

    @Override
    public void tocar(){
        System.out.println("Tocando musica");
    }
    
    @Override
    public void pausar(){
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica(String musica){
        System.out.println("Selecionando musica" + musica);   
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

}
