package piece;

import game.GameTile;

import java.awt.*;

public class Turtle extends Figure {

    public Turtle(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void render(Graphics g) {

        int x = this.col * (GameTile.TILE_SIZE * 2);
        int y = this.row * (GameTile.TILE_SIZE * 2);

        g.setColor(Color.lightGray);
        g.fillOval(27, 227, 50, 50);
        g.fillOval(425, 228, 50, 50);
        g.setColor(Color.red);
        g.drawOval(27, 227, 50, 50);
        g.drawOval(425, 228, 50, 50);

    }

    public boolean isMoveValid(int moveRow, int moveCol) {
        return false;
    }
}
