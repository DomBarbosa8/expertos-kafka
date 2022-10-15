package expertostech.kafka.producer;

import expertostech.kafka.producer.events.ProdutorEvento;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ApplicationProducer {

    public static void main(String[] args) {
        ApplicationProducer aplicacao = new ApplicationProducer();
        aplicacao.iniciar();
    }

    public void iniciar() {
        log.info("Iniciando a aplicação");
        ProdutorEvento produtor = new ProdutorEvento();
        produtor.executar();
    }
}
