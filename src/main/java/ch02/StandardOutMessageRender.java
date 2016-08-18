package ch02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sjchen on 8/17/16.
 */
@Service("messageRender")
public class StandardOutMessageRender implements MessageRender {
    private MessageProvider messageProvider;

    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                            + StandardOutMessageRender.class.getName());
        }

        System.out.println(messageProvider.getMessage());

    }

    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

    @Autowired
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;

    }
}
