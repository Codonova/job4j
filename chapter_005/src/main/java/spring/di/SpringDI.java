package spring.di;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("spring.di");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.askInt("2");
        ui.askStr("Как дела?");
    }

}
