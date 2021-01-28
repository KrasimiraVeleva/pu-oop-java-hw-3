package piece;

import java.awt.*;

public class Leader extends Figure {

    public Leader(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /**
     * Този метод изобразява лидерите на игралната дъска
     * @param g Graphics object
     */
    public void render(Graphics g) {

        g.setColor(Color.yellow);
        g.fillRect(422,35,50,50);

        g.setColor(Color.green);
        g.fillRect(27,420,50,50);
    }
}
