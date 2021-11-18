public class NavioCargueiro {
    public String recebePermissaoDeAncorar(String mensagem){
        return ControleDeTrafegoMaritmo.getInstancia().recebePermissaoDoPorto(mensagem);
    }

    public String recebeAvisoDeColisao(String mensagem){
        return ControleDeTrafegoMaritmo.getInstancia().recebeAvisoDeColisaoParaPorto(mensagem);
    }

    public String recebeAvisoDeFalhaMecanica(String mensagem){
        return ControleDeTrafegoMaritmo.getInstancia().recebeAvisoDeFalhaMecanicaNoPorto(mensagem);
    }
}
