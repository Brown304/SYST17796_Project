package solitaire_project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Saad Aziz, Rohit Kumar and Joshua Brown / 2021-04-20
 */

public class Player {

    private String name; //the unique name for this player
    private String pass;

    public Player(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String toString() {
        return this.getName();

    }

}
