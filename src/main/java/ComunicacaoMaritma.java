public interface ComunicacaoMaritma {
    String recebePermissaoDeAncorar(String mensagem);
    String recebeAvisoDeColisao(String mensagem);
    String recebeAvisoDeFalhaMecanica(String mensagem);
}
