public class PortoJuvenauCarneiro implements ComunicacaoMaritma{
    private static PortoJuvenauCarneiro instancia = new PortoJuvenauCarneiro();

    private PortoJuvenauCarneiro() {}

    public static PortoJuvenauCarneiro getInstancia(){
        return instancia;
    }

    public String recebePermissaoDeAncorar(String mensagem){
        return "O Porto, recebeu o seu comunicado, seu navio tem permissão";
    }

    public  String recebeAvisoDeColisao(String mensagem){
        return "O Porto, estara enviando apoio, mais rápido possível";
    }

    public  String recebeAvisoDeFalhaMecanica(String mensagem){
        return "O Porto, enviamos equipe de manutenção ao seu local";
    }

}
