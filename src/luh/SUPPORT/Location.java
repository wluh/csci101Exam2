package luh.SUPPORT;

import java.io.Serializable;

public class Location implements Serializable {

    static final long serialVersionUID = 1L;

    public Location(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    int X;
    int Y;

}
