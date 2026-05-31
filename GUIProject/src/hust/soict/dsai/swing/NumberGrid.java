package hust.soict.dsai.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberGrid extends JFrame {
    private JButton[] btnNumbers = new JButton[10];
    private JButton btnReset, btnDelete;
    private JTextField tfDisplay;

    public NumberGrid() {
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        tfDisplay = new JTextField();
        tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        cp.add(tfDisplay, BorderLayout.NORTH);

        JPanel panelButtons = new JPanel(new GridLayout(4, 3));
        ButtonListener btnListener = new ButtonListener();

        // Tạo các nút từ 1 đến 9
        for (int i = 1; i <= 9; i++) {
            btnNumbers[i] = new JButton("" + i);
            panelButtons.add(btnNumbers[i]);
            btnNumbers[i].addActionListener(btnListener);
        }

        btnDelete = new JButton("DEL");
        panelButtons.add(btnDelete);
        btnDelete.addActionListener(btnListener);

        btnNumbers[0] = new JButton("0");
        panelButtons.add(btnNumbers[0]);
        btnNumbers[0].addActionListener(btnListener);

        btnReset = new JButton("RESET");
        panelButtons.add(btnReset);
        btnReset.addActionListener(btnListener);

        cp.add(panelButtons, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Number Grid");
        setSize(200, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NumberGrid();
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            String buttonLabel = evt.getActionCommand();
            if (buttonLabel.charAt(0) >= '0' && buttonLabel.charAt(0) <= '9') {
                tfDisplay.setText(tfDisplay.getText() + buttonLabel);
            } else if (buttonLabel.equals("DEL")) {
                String currentStr = tfDisplay.getText();
                if (currentStr.length() > 0) {
                    tfDisplay.setText(currentStr.substring(0, currentStr.length() - 1));
                }
            } else if (buttonLabel.equals("RESET")) {
                tfDisplay.setText("");
            }
        }
    }
}