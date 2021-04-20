package solitaire_project;

/**
 *
 * @author Saad Aziz, Rohit Kumar and Joshua Brown / 2021-04-20
 */

public class PasswordAuthenticator {

    public boolean authenticate(String pass) {
        boolean auth = true;
        if (pass.length() < 8) {
            auth = false;
        } else {
            auth = true;
        }
        return auth;
    }

}
