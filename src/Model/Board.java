package Model;

import Model.Configuration.Configuration;

/**
 * Created by Martijn on 2-6-2015.
 */
public class Board {

    private Player[] players = new Player[Configuration.PLAYERS];
    private Mark[] field = new Mark[Configuration.WIDTH * Configuration.HEIGHT];

    public Board(Player p1, Player p2) {
        players[0] = p1;
        players[1] = p2;
        clearField();
    }

    public void clearField() {
        for (int i = 0; i < Configuration.WIDTH * Configuration.HEIGHT; i++) {
            setField(i, Mark.EMPTY);
        }
    }

    public Mark getField(int i) {
        return field[i];
    }

    public Mark getField(int x, int y) {
        assert Configuration.WIDTH > x && x >= 0;
        assert Configuration.HEIGHT > y && y >= 0;
        return getField(Configuration.WIDTH * y + x);
    }

    public void setField(int i, Mark m) {
        field[i] = m;
    }

    public void setField(int x, int y, Mark m) {
        assert Configuration.WIDTH > x && x >= 0;
        assert Configuration.HEIGHT > y && y >= 0;
        setField(Configuration.WIDTH * y + x, m);
    }

    public boolean hasVertical(int i, Mark m) {
        boolean hasColumn;
        if (i >= Configuration.WIDTH * Configuration.HEIGHT - 3) {
            hasColumn = false;
        } else {
            int column = 0;
            for (int j = i; j < Configuration.HEIGHT * Configuration.WIDTH; j+= Configuration.WIDTH) {
                if (getField(j) == m) {
                    column++;
                } else {
                    break;
                }
            }
            if (column > 3) {
                hasColumn = true;
            } else {
                hasColumn = false;
            }
        }
        return hasColumn;
    }

    public boolean hasHorizontal(int i, Mark m) {
        boolean hasRow;

        return false;
    }

    /**
     * Gives a representation of the board. This is the board when empty:
     +----+----+----+----+----+----+----+   +----+----+----+----+----+----+----+
     | -- | -- | -- | -- | -- | -- | -- |   | 00 | 01 | 02 | 03 | 04 | 05 | 06 |
     +----+----+----+----+----+----+----+   +----+----+----+----+----+----+----+
     | -- | -- | -- | -- | -- | -- | -- |   | 07 | 08 | 09 | 10 | 11 | 12 | 13 |
     +----+----+----+----+----+----+----+   +----+----+----+----+----+----+----+
     | -- | -- | -- | -- | -- | -- | -- |   | 14 | 15 | 16 | 17 | 18 | 19 | 20 |
     +----+----+----+----+----+----+----+   +----+----+----+----+----+----+----+
     | -- | -- | -- | -- | -- | -- | -- |   | 21 | 22 | 23 | 24 | 25 | 26 | 27 |
     +----+----+----+----+----+----+----+   +----+----+----+----+----+----+----+
     | -- | -- | -- | -- | -- | -- | -- |   | 28 | 29 | 30 | 31 | 32 | 33 | 34 |
     +----+----+----+----+----+----+----+   +----+----+----+----+----+----+----+
     | -- | -- | -- | -- | -- | -- | -- |   | 35 | 36 | 37 | 38 | 39 | 40 | 41 |
     +----+----+----+----+----+----+----+   +----+----+----+----+----+----+----+
     */
    public String toString() {
        String board = Configuration.HORIZONTAL_BORDER;
        for (int x = 0; x < Configuration.HEIGHT; x++) {
            String row = "|";
            for (int y = 0; y < Configuration.WIDTH; y++) {
                row += " " + getField(y, x) + " |";
            }
            board += "\n" + row + "\n" + Configuration.HORIZONTAL_BORDER;
        }
        return board;
    }

}
