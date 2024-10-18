package br.com.ideao.classpathscan;


import br.com.ideao.classpathscan.config.ComponentScanConfig;
import br.com.ideao.classpathscan.domain.SimpleMovieLister;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class App 
{
    public static void main( String[] args ) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        SimpleMovieLister simpleMovieLister = context.getBean(SimpleMovieLister.class);
        System.out.println(simpleMovieLister);

        context.registerShutdownHook();
    }
}
