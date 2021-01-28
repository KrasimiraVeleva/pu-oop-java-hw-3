package piece;

import game.GameTile;

import java.awt.*;

public class Guard extends Figure{

    public Guard(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /**
     * Метод изобразяващ гардовете на игралната дъска
     * @param g Graphics object
     */
    public void render(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(27, 35, 50, 50);
        g.fillOval(125, 35, 50, 50);
        g.fillOval(225, 35, 50, 50);
        g.fillOval(325, 35, 50, 50);

        g.setColor(Color.green);
        g.fillOval(125, 425, 50, 50);
        g.fillOval(225, 425, 50, 50);
        g.fillOval(325, 425, 50, 50);
        g.fillOval(421, 425, 50, 50);

        g.setColor(Color.green);
        g.drawOval(27, 35, 50, 50);
        g.drawOval(125, 35, 50, 50);
        g.drawOval(225, 35, 50, 50);
        g.drawOval(325, 35, 50, 50);

        g.setColor(Color.yellow);
        g.drawOval(125, 425, 50, 50);
        g.drawOval(225, 425, 50, 50);
        g.drawOval(325, 425, 50, 50);
        g.drawOval(421, 425, 50, 50);

        int x = this.col * GameTile.TILE_SIZE;
        int y = this.row * GameTile.TILE_SIZE;
    }

    /**
     * Метод проверяващ дали движението на гардовете е валидно
     * @param moveRow - редът, на който местим фигурата
     * @param moveCol - колоната, на която местим фигурата
     * @return true, движението на фигурата е валидно; false, движението на фигурата е невалидно
     */
    public boolean isMoveValid(int moveRow, int moveCol) {

        int rowCoefficient = Math.abs(moveRow - this.row);
        int colCoefficient = moveCol - this.col;

        return  rowCoefficient == 1 &&
                colCoefficient == 0;
    }

    /**
     * Метод визуализиращ дали атаката на фигурата е валидна
     * @param attackRow - редът, на който фигурата е атакувана
     * @param attackCol - колоната, на която фигурата е атакувана
     * @return
     */
    public boolean isAttackValid(int attackRow, int attackCol) {
        return false;
    }

    /**
     * Метод визуализиращ преместването на фигурата на друго поле от дъската
     * @param row - редът, на който фигурата ще се премести
     * @param col - колоната, на която фигурата ще се премести
     */
    public void move(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
