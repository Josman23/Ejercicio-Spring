package mx.sintelti.cursos.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Factura factura = applicationContext.getBean("factura",Factura.class);
        factura.imprimirFactura();
    }
}
