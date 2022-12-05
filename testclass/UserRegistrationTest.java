import com.bridgelabz.regex.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    static UserRegistration userRegistration;

    @BeforeAll
    public static void initialize(){
        userRegistration = new UserRegistration();
    }

    @Test
    public void givenFirstName_WhenValid_ShouldReturnsTrue(){
//        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validFirstName("Nayan");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstNameWhenInValidShouldReturnFalse(){
//        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validFirstName("nayan");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastNameWhenValidShouldReturnTrue(){
//        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validLastName("Soni");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastNameWhenInValidShouldReturnFalse(){
        boolean result = userRegistration.validLastName("nayan");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmailWhenValidShouldReturnTrue(){
        boolean result = userRegistration.validEmailId("nayansoni@mail.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmailWhenInValidShouldReturnFalse(){
        boolean result = userRegistration.validEmailId("Nayan.mail.com.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPhoneNumWhenValidShouldReturnTrue(){
        boolean result = userRegistration.validPhoneNumber("91 9922558888");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPhoneNumWhenInValidShouldReturnFalse(){
        boolean result = userRegistration.validPhoneNumber("9234398488");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordWhenValidShouldReturnTrue(){
        boolean result = userRegistration.validPassword("nayan@gmail7.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordWhenInValidShouldReturnFalse(){
        boolean result = userRegistration.validPassword("nayanAgmailcom");
        Assertions.assertFalse(result);
    }
}
