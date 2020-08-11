package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Demo1Application.class, args);
		
		System.out.println("---------- I18n");
		I18nController i18nController = ctx.getBean(I18nController.class);
		System.out.println(i18nController.sayHello());
		
		
		System.out.println("---------- Primary");
		MyController c = (MyController)ctx.getBean("myController");		
		System.out.println(c.sayGreeting());
		
		System.out.println("---------- Property");
		PropertyInjectedController propertyInjectedController = ctx.getBean(PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("---------- Setter");
		SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("---------- Constructor");
		ConstructorInjectedController constructorInjectedController = ctx.getBean(ConstructorInjectedController.class);
		System.out.println(constructorInjectedController.getGreeting());
	}

}
