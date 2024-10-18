package br.com.ideao.classpathscan;


import br.com.ideao.classpathscan.domain.SimpleMovieLister;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args ) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        SimpleMovieLister simpleMovieLister = context.getBean("simpleMovieLister",SimpleMovieLister.class);
        System.out.println(simpleMovieLister);

        context.registerShutdownHook();
    }
}
