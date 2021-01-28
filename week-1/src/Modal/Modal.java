package Modal;

import javax.swing.*;

public class Modal extends JDialog {

    public Modal(JFrame parent, String heading, String message) {
        super(parent, heading, true);

        JPanel p = new JPanel();
        JLabel l = new JLabel(message);

        p.add(l);
        getContentPane().add(p);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void render(JFrame parent, String heading, String message) {
        new Modal(parent, heading, message);
    }
}