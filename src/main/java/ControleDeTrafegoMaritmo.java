public class ControleDeTrafegoMaritmo {
    private static ControleDeTrafegoMaritmo instancia = new ControleDeTrafegoMaritmo();

    private ControleDeTrafegoMaritmo () {}

    public static ControleDeTrafegoMaritmo getInstancia(){
        return instancia;
    }

    public String recebePermissaoDoPorto(String mensagem){
        return  "Recebemos o seu contato\n"+
                "O Porto Juvenau Carneiro, responde conforme a solicitação\n"+
                ">>" +  PortoJuvenauCarneiro.getInstancia().recebePermissaoDeAncorar(mensagem);
    }
    public String recebeAvisoDeColisaoParaPorto(String mensagem){
        return  "Recebemos o seu contato\n"+
                "O Porto Juvenau Carneiro, responde conforme a solicitação\n"+
                ">>" +  PortoJuvenauCarneiro.getInstancia().recebeAvisoDeColisao(mensagem);
    }
    public String recebeAvisoDeFalhaMecanicaNoPorto(String mensagem){
        return  "Recebemos o seu contato\n"+
                "O Porto Juvenau Carneiro, responde conforme a solicitação\n"+
                ">>" +  PortoJuvenauCarneiro.getInstancia().recebeAvisoDeFalhaMecanica(mensagem);
    }
}
