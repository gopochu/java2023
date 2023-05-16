package visual_interface;

import javax.swing.*;

public class Window {
    static JFrame frame;

    public static void main(String[] args) {
        frame = new JFrame("ATM");

        frame.setSize(560, 300);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}