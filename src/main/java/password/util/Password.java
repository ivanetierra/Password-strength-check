package password.util;

public class Password {


    public enum Strength {
        WEAK, MEDIUM, STRONG
    }

    public Strength check(String password) {
        if (password.length() < 8) {
            return Strength.WEAK;

        } else if (password.matches("[a-zA-Z]*") || password.matches("[0-9]*")) {
            return Strength.WEAK;

        } else if (password.matches("[a-zA-Z0-9]*")) {
            return Strength.MEDIUM;

        }else {
            return Strength.STRONG;
        }


    }
}
