package pl.popiolkiewicz;

/**
 * @author Dawid Popiołkiewicz
 */
public class Main {

    public static void main(String[] args) {
        User user = User.builder()
                .name("Jan")
                .surname("Kowalski")
                .email("jan@kowalski.pl")
                .phone("123456789")
                .build();
        System.out.println(user);
    }

}
