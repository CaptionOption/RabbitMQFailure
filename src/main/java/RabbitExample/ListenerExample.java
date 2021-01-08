package RabbitExample;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ListenerExample {
    @RabbitListener(queues = ManagerExample.queueName, containerFactory = "prefetchOneRabbitListenerContainerFactory")
    public static void listen(final String input, final Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) final long tag) throws IOException {
        System.out.println(input);
        channel.basicAck(tag, false);
    }
}