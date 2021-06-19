package password.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static password.util.Password.Strength.*;

class PasswordTest {

    Password password = new Password();
    @Test
    void weakWhenOnlyLetters() {
        assertEquals(WEAK, password.check("asdasdasd"));
        assertEquals(WEAK, password.check("AKAKAKAKAsadsadsafdsf"));
    }

    @Test
    void weakWhenOnlyNumbers() {
        assertEquals(WEAK, password.check("122345"));
        assertEquals(WEAK, password.check(""));
    }

    @Test
    void weakWhenLessThan8Digits() {
        assertEquals(WEAK, password.check("122aa"));
        assertEquals(WEAK, password.check("a11q2w3"));
        assertEquals(WEAK, password.check(""));
    }

    @Test
    void mediumWhenHasLettersAndNumbers() {
        assertEquals(MEDIUM, password.check("122aaaaaaaaaaa"));
        assertEquals(MEDIUM, password.check("a11q2w31111111111"));
        assertEquals(MEDIUM, password.check("1234567a"));
    }

    @Test
    void StrongWhenHasLettersAndNumbersAndSymbols() {
        assertEquals(STRONG, password.check("122aaaaaaaaaaa!"));
        assertEquals(STRONG, password.check("a!*a1234"));
        assertEquals(STRONG, password.check("1234567a!"));
    }
}