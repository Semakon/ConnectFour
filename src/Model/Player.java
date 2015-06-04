package Model;

/**
 * Created by Martijn on 4-6-2015.
 */
public class Player {

    private String name;
    private Mark m;

    public Player(String name, Mark m) {
        this.name = name;
        this.m = m;
    }

    public String getName() {
        return name;
    }

    public Mark getMark() {
        return m;
    }

}
