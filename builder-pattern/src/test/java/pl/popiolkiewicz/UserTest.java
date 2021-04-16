package pl.popiolkiewicz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dawid Popiołkiewicz
 */
public class UserTest {

    private User user;

    @BeforeEach
    public void setUp(){
        user = User.builder().name("Jan").surname("Kowalski").email("jan@kowalski.pl").phone("123456789").build();
    }

    @Test
    @DisplayName("UserBuilder should return User with all data")
    public void testUserBuilder(){

        final String NAME = "Jan";
        final String SURNAME = "Kowalski";
        final String EMAIL = "jan@kowalski.pl";
        final String PHONE = "123456789";

        assertEquals(NAME, user.getName());
        assertEquals(SURNAME, user.getSurname());
        assertEquals(EMAIL, user.getEmail());
        assertEquals(PHONE, user.getPhone());
    }

}
