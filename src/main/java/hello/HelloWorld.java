package hello;

import org.joda.time.LocalTime;

/**
 * Created by twcn on 10/1/16.
 */
public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("current time is :" + currentTime);
        Greeter greeter = new Greeter();
        greeter.sayHello();
    }
}
