package spring.di;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleInput {
    private Scanner scanner = new Scanner(System.in);
    private List<String> questions = new ArrayList<String>();

    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }


    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }

}
