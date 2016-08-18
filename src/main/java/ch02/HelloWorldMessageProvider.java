package ch02;

import org.springframework.stereotype.Service;

/**
 * Created by sjchen on 8/17/16.
 */
@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider{
    public String getMessage() {
        return "Hello World";
    }
}
