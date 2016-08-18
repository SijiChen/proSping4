package ch02;

/**
 * Created by sjchen on 8/17/16.
 */
public interface MessageRender {
    void render();
    void setMessageProvider(MessageProvider messageProvider);
    MessageProvider getMessageProvider();
}
