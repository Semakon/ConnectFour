package Model;

/**
 * Created by Martijn on 4-6-2015.
 */
public enum Mark {
    XX, OO, EMPTY;

    public Mark other() {
        if (this == XX) {
            return OO;
        } else if (this == OO) {
            return XX;
        } else {
            return EMPTY;
        }
    }

    public String toString() {
        if (this == XX) {
            return "XX";
        } else if (this == OO) {
            return "OO";
        } else {
            return "--";
        }
    }

}
