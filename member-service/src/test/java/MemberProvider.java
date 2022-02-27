import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MemberProvider {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring/spring-context.xml");
        context.start();

        System.out.println("-----dubbo开启-----");


    }
}
