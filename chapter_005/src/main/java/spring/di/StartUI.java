package spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {

    private ConsoleInput consoleInput;

    public StartUI(ConsoleInput consoleInput) {
        this.consoleInput = consoleInput;
    }

    public int askInt(String value) {
        return consoleInput.askInt(value);
    }

    public String askStr(String value) {
       return consoleInput.askStr(value);
    }
}
