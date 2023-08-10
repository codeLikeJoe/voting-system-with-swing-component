package MidSem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class portfolio extends JFrame {
    private JPanel portFolioPanel;
    private JTextField newAsparantNameTxtField;
    private JTextField newAsparantIdTxtField;
    private JComboBox newAsparantPositionComboBox;
    private JButton newAsparantUploadImageBtn;
    private JButton portfolioSubmitBtn;
    private JLabel newAsparantUploadImageLabel;
    private JLabel newAsparantPositionLabel;
    private JLabel newAsparantIdLabel;
    private JLabel newAsparantName;

    static JFrame frame = new JFrame("Portfolio");

    public portfolio() {
        frame.setContentPane(portFolioPanel);
        frame.setBounds(400, 200, 500, 300);
        frame.setVisible(true);
        portfolioSubmitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }


}
