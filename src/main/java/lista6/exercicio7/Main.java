package lista6.exercicio7;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList("example@gmail.com", "test@yahoo.com", "user@gmail.com", "admin@hotmail.com");

        List<String> filteredEmails = emails.stream()
                .filter(email -> email.contains("@gmail.com"))
                .sorted()
                .toList();

        filteredEmails.forEach(System.out::println);
    }
}