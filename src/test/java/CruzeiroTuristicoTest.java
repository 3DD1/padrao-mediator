import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CruzeiroTuristicoTest {
    @Test
    void deveSolicitarPermissaoAoPorto(){
        CruzeiroTuristico cruzeiro = new CruzeiroTuristico();
        assertEquals("Recebemos o seu contato.\nO Porto Juvenau Carneiro, responde conforme a solicitação\n"+
                ">>O Porto, recebeu o seu comunicado, seu navio tem permissão",
                cruzeiro.recebePermissaoDeAncorar("Estamos a 5km do Porto, solicitou permissão de Ancorar."));
    }
    @Test
    void deveAvisarSobreColisaoAoPorto(){
        CruzeiroTuristico cruzeiro = new CruzeiroTuristico();
        assertEquals("Recebemos o seu contato.\nO Porto Juvenau Carneiro, responde conforme a solicitação\n"+
                        ">>O Porto, estara enviando apoio, mais rápido possível",
                cruzeiro.recebeAvisoDeColisao("Tivemos uma colisão com Iceberg, solicito resposta mais rápido possível."));
    }

    @Test
    void deveAvisarFalhaMecanicaAoPorto(){
        CruzeiroTuristico cruzeiro = new CruzeiroTuristico();
        assertEquals("Recebemos o seu contato.\nO Porto Juvenau Carneiro, responde conforme a solicitação\n"+
                        ">>O Porto, enviamos equipe de manutenção ao seu local",
                cruzeiro.recebeAvisoDeFalhaMecanica("Cruzeiro sem Fim, teve uma falha mecânica, necessito de apoio."));
    }

}