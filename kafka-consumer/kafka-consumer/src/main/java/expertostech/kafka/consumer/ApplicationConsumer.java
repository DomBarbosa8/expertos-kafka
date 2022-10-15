package expertostech.kafka.consumer;

import expertostech.kafka.consumer.events.ConsumidorEvento;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ApplicationConsumer {

    public static void main(String[] args) {
        ApplicationConsumer aplicacao = new ApplicationConsumer();
        aplicacao.iniciar();
    }

    public void iniciar() {
        log.info("Iniciando a aplicação");
        ConsumidorEvento consumidor = new ConsumidorEvento();
        consumidor.executar();
    }
}
