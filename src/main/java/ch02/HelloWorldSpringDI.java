package ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sjchen on 8/17/16.
 */
public class HelloWorldSpringDI {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext
                ("ch02-app-context.xml");

        MessageRender mr = ctx.getBean("messageRender", MessageRender.class);
        //System.out.println(mr.getMessage());
        mr.render();

//        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//        ctx.load("classpath:ch02-app-context.xml");
//        ctx.refresh();
//        MessageProvider messageProvider = ctx.getBean("messageProvider",
//                MessageProvider.class);
//        System.out.println(messageProvider.getMessage());
    }

}
