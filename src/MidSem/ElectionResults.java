package MidSem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElectionResults {
    private JPanel framePanel;
    private JScrollPane resultScrollPane;
    private JPanel resultPanel;
    private JPanel presidentPanel;
    private JPanel secretaryPanel;
    private JPanel treasurerPanel;
    private JTextField pVoteCountField1;
    private JTextField pVoteCountField2;
    private JTextField sVoteCountField1;
    private JTextField sVoteCountField2;
    private JTextField sVoteCountField3;
    private JTextField tVoteCountField1;
    private JTextField tVoteCountField2;
    private JLabel presidentResultLabel;
    private JLabel pRnameLabel1;
    private JLabel pRnameLabel2;
    private JLabel secretaryResultLabel;
    private JLabel treasurerResultLabel;
    private JLabel tVoteCountLabel1;
    private JButton closeBtn;

    Accumulator getResults = new Accumulator();
    static JFrame frame = new JFrame("Results");

    public ElectionResults() {
        frame.add(framePanel);
        frame.setSize(699, 430);
        frame.setVisible(true);

        pVoteCountField1.setText(String.valueOf(getResults.getPresident1VoteCount()));
        pVoteCountField2.setText(String.valueOf(getResults.getPresident2VoteCount()));
        sVoteCountField1.setText(String.valueOf(getResults.getSecretary1VoteCount()));
        sVoteCountField2.setText(String.valueOf(getResults.getSecretary2VoteCount()));
        sVoteCountField3.setText(String.valueOf(getResults.getSecretary3VoteCount()));
        tVoteCountField1.setText(String.valueOf(getResults.getTreasurer1VoteCount()));
        tVoteCountField2.setText(String.valueOf(getResults.getTreasurer2VoteCount()));


        closeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }
}
