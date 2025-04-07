package controlefluxo;
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(){
        super("Parâmetro inválido. Por favor, verifique o padrão solicitado.");
    }
}
