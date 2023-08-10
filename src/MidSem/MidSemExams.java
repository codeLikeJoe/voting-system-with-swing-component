package MidSem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MidSemExams {
    private JPanel framePanel;
    private JButton pBtn2;
    private JPanel secondPanel;
    private JPanel thirdPanel;
    private JPanel fourthPanel;
    private JPanel firstPanel;
    private JLabel positionLabel1;
    private JLabel clickLabel1;
    private JButton pBtn1;
    private JButton presidentSubmitBtn;
    private JPanel innerPanel1;
    private JLabel headingLabel;
    private JLabel positionLabel2;
    private JLabel clickLabel2;
    private JButton secretaryBtn1;
    private JButton secretaryBtn3;
    private JButton secretaryBtn2;
    private JButton secretarySubmitBtn;
    private JPanel innerPanel2;
    private JLabel positionLabel3;
    private JLabel clickLabel3;
    private JButton treasurerBtn1;
    private JButton treasurerSubmitBtn;
    private JButton treasurerBtn2;
    private JPanel innerPanel3;
    private JPanel fifthPanel;
    private JLabel firstPImageLabel;
    private JLabel secondPImageLabel;
    private JLabel firstSImageLabel;
    private JLabel secondSImageLabel;
    private JLabel thirdSImageLabel;
    private JLabel firstTImageLabel;
    private JLabel secondTImageLabel;
    private JButton presidentResetBtn;
    private JButton secretaryResetBtn;
    private JButton treasurerResetBtn;
    private JCheckBox treasurerVoteCheckBox2;
    private JCheckBox treasurerVoteCheckBox1;
    private JCheckBox secretaryVoteCheckBox3;
    private JCheckBox secretaryVoteCheckBox2;
    private JCheckBox secretaryVoteCheckBox1;
    private JCheckBox presidentVoteCheckBox2;
    private JCheckBox presidentVoteCheckBox1;
    private JButton presidentSkipBtn;
    private JButton secretarySkipBtn;
    private JPanel secretaryBtnPanel;
    private JPanel presidentBtnPanel;
    private JButton treasurerSkipBtn;
    private JPanel treasurerBtnPanel;
    private JLabel finishLabel;
    private JLabel justLabel;
    private JButton doneButton;
    private JLabel refreshBtnLabel;
    private JButton loginBtn;
    private JScrollPane resultPanel;
    private JTextField userNameField;
    private JLabel userNameLabel;
    private JPanel loginFieldPanel;
    private JTextField studentIdField;
    private JLabel userIdLabel;
    private JLabel loginLogoLabel;
    private JLabel welcomeLoginLabel;
    private JPanel portFolioPanel;
    private JLabel newAsparantName;
    private JTextField newAsparantNameTxtField;
    private JTextField newAsparantIdTxtField;
    private JComboBox newAsparantPositionComboBox;
    private JButton newAsparantUploadImageBtn;
    private JButton portfolioSubmitBtn;
    private JLabel newAsparantIdLabel;
    private JLabel newAsparantPositionLabel;
    private JLabel newAsparantUploadImageLabel;
    private JButton refreshBtn;

    private ArrayList<NewStudent> student;

    Accumulator accumulate = new Accumulator();

    //Constructor for items in the class Mid-semester Exams
    public MidSemExams() {
        //Creating an array list to save login detail of each student
        student = new ArrayList<>();

        //Setting every panel to false except the fifth panel which contains the login button
        firstPanel.setVisible(false);
        secondPanel.setVisible(false);
        thirdPanel.setVisible(false);
        fourthPanel.setVisible(false);
        fifthPanel.setVisible(true);
        portFolioPanel.setVisible(false);


        presidentSubmitBtn.setEnabled(false);
        secretarySubmitBtn.setEnabled(false);
        treasurerSubmitBtn.setEnabled(false);
        presidentResetBtn.setEnabled(false);
        secretaryResetBtn.setEnabled(false);
        treasurerResetBtn.setEnabled(false);
//        loginBtn.setEnabled(false);

        /*setting background color for framePanel, fifthPanel,
         loginFieldPanel and portFolioPanel*/
        framePanel.setBackground(Color.white);
        fifthPanel.setBackground(Color.white);
        loginFieldPanel.setBackground(Color.white);
        portFolioPanel.setBackground(Color.white);


        //Creating action listener for login button to allow user to vote
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = userNameField.getText().replaceAll("\\s", "");
                String indexNumber = studentIdField.getText().replaceAll("\\s", "");

                if ((userNameField.getText().equals("") || userNameField.getText().equals(" ")) ||
                        (studentIdField.getText().equals("") || studentIdField.getText().equals(" "))) {
                    JOptionPane.showMessageDialog(null, "Please enter your name and id");
                } else if (name.length() <= 6 || ((name.contains("0")) || (name.contains("1")) || (name.contains("2"))
                        || (name.contains("3")) || (name.contains("4")) || (name.contains("5")) || (name.contains("6"))
                        || (name.contains("7")) || (name.contains("8")) || (name.contains("9")) ||
                        (name.contains(".")) || (name.contains(",")) || (name.contains("/")) || (name.contains("?"))
                        || (name.contains(">")) || (name.contains("<")) || (name.contains("'")) || (name.contains(";"))
                        || (name.contains(":")) || (name.contains("{")) || (name.contains("}")) || (name.contains("["))
                        || (name.contains("]")) || (name.contains("\\")) || (name.contains("|")) || (name.contains("="))
                        || (name.contains("+")) || (name.contains("-")) || (name.contains("_")) || (name.contains("("))
                        || (name.contains(")")) || (name.contains("*")) || (name.contains("&")) || (name.contains("^"))
                        || (name.contains("%")) || (name.contains("$")) || (name.contains("#")) || (name.contains("@"))
                        || (name.contains("!"))) || (name.contains("\"\""))) {
                    JOptionPane.showMessageDialog(null, "Please check your name");
                } else if ((indexNumber.length() != 9) || ((indexNumber.contains(".")) || (indexNumber.contains(","))
                        || (indexNumber.contains("/")) || (indexNumber.contains("?")) || (indexNumber.contains(">"))
                        || (indexNumber.contains("<")) || (indexNumber.contains("'")) || (indexNumber.contains(";"))
                        || (indexNumber.contains(":")) || (indexNumber.contains("{")) || (indexNumber.contains("}"))
                        || (indexNumber.contains("[")) || (indexNumber.contains("]")) || (indexNumber.contains("\\"))
                        || (indexNumber.contains("|")) || (indexNumber.contains("=")) || (indexNumber.contains("+"))
                        || (indexNumber.contains("-")) || (indexNumber.contains("_")) || (indexNumber.contains("("))
                        || (indexNumber.contains(")")) || (indexNumber.contains("*")) || (indexNumber.contains("&"))
                        || (indexNumber.contains("^")) || (indexNumber.contains("%")) || (indexNumber.contains("$"))
                        || (indexNumber.contains("#")) || (indexNumber.contains("@")) || (indexNumber.contains("\"\"")))
                        || (indexNumber.contains("!"))) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid id");
                } else {
                    String lastChar = String.valueOf(indexNumber.charAt(indexNumber.length() - 1));
                    String eightChar = String.valueOf(indexNumber.charAt(indexNumber.length() - 2));
                    String seventhChar = String.valueOf(indexNumber.charAt(indexNumber.length() - 3));
                    String sixthChar = String.valueOf(indexNumber.charAt(indexNumber.length() - 4));
                    String fifthChar = String.valueOf(indexNumber.charAt(indexNumber.length() - 5));
                    String fourthChar = String.valueOf(indexNumber.charAt(indexNumber.length() - 6));
                    String thirdChar = String.valueOf(indexNumber.charAt(indexNumber.length() - 7));
                    String secondChar = String.valueOf(indexNumber.charAt(indexNumber.length() - 8));
                    String firstChar = String.valueOf(indexNumber.charAt(0));

                    if (!lastChar.equalsIgnoreCase("d")) {
                        JOptionPane.showMessageDialog(null, "Check your index number");
                    } else if (firstChar.equalsIgnoreCase("q") || firstChar.equalsIgnoreCase("w") ||
                            firstChar.equalsIgnoreCase("e") || firstChar.equalsIgnoreCase("r") ||
                            firstChar.equalsIgnoreCase("t") || firstChar.equalsIgnoreCase("y") ||
                            firstChar.equalsIgnoreCase("u") || firstChar.equalsIgnoreCase("i") ||
                            firstChar.equalsIgnoreCase("o") || firstChar.equalsIgnoreCase("p") ||
                            firstChar.equalsIgnoreCase("a") || firstChar.equalsIgnoreCase("l") ||
                            firstChar.equalsIgnoreCase("s") || firstChar.equalsIgnoreCase("z") ||
                            firstChar.equalsIgnoreCase("d") || firstChar.equalsIgnoreCase("x") ||
                            firstChar.equalsIgnoreCase("f") || firstChar.equalsIgnoreCase("c") ||
                            firstChar.equalsIgnoreCase("g") || firstChar.equalsIgnoreCase("v") ||
                            firstChar.equalsIgnoreCase("h") || firstChar.equalsIgnoreCase("b") ||
                            firstChar.equalsIgnoreCase("j") || firstChar.equalsIgnoreCase("n") ||
                            firstChar.equalsIgnoreCase("k") || firstChar.equalsIgnoreCase("m")) {
                        JOptionPane.showMessageDialog(null, "Your index number might contain some" +
                                "\n characters that are not allowed." +
                                "\n\nPlease check!");
                    } else if (secondChar.equalsIgnoreCase("q") || secondChar.equalsIgnoreCase("w") ||
                            secondChar.equalsIgnoreCase("e") || secondChar.equalsIgnoreCase("r") ||
                            secondChar.equalsIgnoreCase("t") || secondChar.equalsIgnoreCase("y") ||
                            secondChar.equalsIgnoreCase("u") || secondChar.equalsIgnoreCase("i") ||
                            secondChar.equalsIgnoreCase("o") || secondChar.equalsIgnoreCase("p") ||
                            secondChar.equalsIgnoreCase("a") || secondChar.equalsIgnoreCase("l") ||
                            secondChar.equalsIgnoreCase("s") || secondChar.equalsIgnoreCase("z") ||
                            secondChar.equalsIgnoreCase("d") || secondChar.equalsIgnoreCase("x") ||
                            secondChar.equalsIgnoreCase("f") || secondChar.equalsIgnoreCase("c") ||
                            secondChar.equalsIgnoreCase("g") || secondChar.equalsIgnoreCase("v") ||
                            secondChar.equalsIgnoreCase("h") || secondChar.equalsIgnoreCase("b") ||
                            secondChar.equalsIgnoreCase("j") || secondChar.equalsIgnoreCase("n") ||
                            secondChar.equalsIgnoreCase("k") || secondChar.equalsIgnoreCase("m")) {
                        JOptionPane.showMessageDialog(null, "Your index number might contain some" +
                                "\n characters that are not allowed." +
                                "\n\nPlease check!");
                    } else if (thirdChar.equalsIgnoreCase("q") || thirdChar.equalsIgnoreCase("w") ||
                            thirdChar.equalsIgnoreCase("e") || thirdChar.equalsIgnoreCase("r") ||
                            thirdChar.equalsIgnoreCase("t") || thirdChar.equalsIgnoreCase("y") ||
                            thirdChar.equalsIgnoreCase("u") || thirdChar.equalsIgnoreCase("i") ||
                            thirdChar.equalsIgnoreCase("o") || thirdChar.equalsIgnoreCase("p") ||
                            thirdChar.equalsIgnoreCase("a") || thirdChar.equalsIgnoreCase("l") ||
                            thirdChar.equalsIgnoreCase("s") || thirdChar.equalsIgnoreCase("z") ||
                            thirdChar.equalsIgnoreCase("d") || thirdChar.equalsIgnoreCase("x") ||
                            thirdChar.equalsIgnoreCase("f") || thirdChar.equalsIgnoreCase("c") ||
                            thirdChar.equalsIgnoreCase("g") || thirdChar.equalsIgnoreCase("v") ||
                            thirdChar.equalsIgnoreCase("h") || thirdChar.equalsIgnoreCase("b") ||
                            thirdChar.equalsIgnoreCase("j") || thirdChar.equalsIgnoreCase("n") ||
                            thirdChar.equalsIgnoreCase("k") || thirdChar.equalsIgnoreCase("m")) {
                        JOptionPane.showMessageDialog(null, "Your index number might contain some" +
                                "\n characters that are not allowed." +
                                "\n\nPlease check!");
                    } else if (fourthChar.equalsIgnoreCase("q") || fourthChar.equalsIgnoreCase("w") ||
                            fourthChar.equalsIgnoreCase("e") || fourthChar.equalsIgnoreCase("r") ||
                            fourthChar.equalsIgnoreCase("t") || fourthChar.equalsIgnoreCase("y") ||
                            fourthChar.equalsIgnoreCase("u") || fourthChar.equalsIgnoreCase("i") ||
                            fourthChar.equalsIgnoreCase("o") || fourthChar.equalsIgnoreCase("p") ||
                            fourthChar.equalsIgnoreCase("a") || fourthChar.equalsIgnoreCase("l") ||
                            fourthChar.equalsIgnoreCase("s") || fourthChar.equalsIgnoreCase("z") ||
                            fourthChar.equalsIgnoreCase("d") || fourthChar.equalsIgnoreCase("x") ||
                            fourthChar.equalsIgnoreCase("f") || fourthChar.equalsIgnoreCase("c") ||
                            fourthChar.equalsIgnoreCase("g") || fourthChar.equalsIgnoreCase("v") ||
                            fourthChar.equalsIgnoreCase("h") || fourthChar.equalsIgnoreCase("b") ||
                            fourthChar.equalsIgnoreCase("j") || fourthChar.equalsIgnoreCase("n") ||
                            fourthChar.equalsIgnoreCase("k") || fourthChar.equalsIgnoreCase("m")) {
                        JOptionPane.showMessageDialog(null, "Your index number might contain some" +
                                "\n characters that are not allowed." +
                                "\n\nPlease check!");
                    } else if (fifthChar.equalsIgnoreCase("q") || fifthChar.equalsIgnoreCase("w") ||
                            fifthChar.equalsIgnoreCase("e") || fifthChar.equalsIgnoreCase("r") ||
                            fifthChar.equalsIgnoreCase("t") || fifthChar.equalsIgnoreCase("y") ||
                            fifthChar.equalsIgnoreCase("u") || fifthChar.equalsIgnoreCase("i") ||
                            fifthChar.equalsIgnoreCase("o") || fifthChar.equalsIgnoreCase("p") ||
                            fifthChar.equalsIgnoreCase("a") || fifthChar.equalsIgnoreCase("l") ||
                            fifthChar.equalsIgnoreCase("s") || fifthChar.equalsIgnoreCase("z") ||
                            fifthChar.equalsIgnoreCase("d") || fifthChar.equalsIgnoreCase("x") ||
                            fifthChar.equalsIgnoreCase("f") || fifthChar.equalsIgnoreCase("c") ||
                            fifthChar.equalsIgnoreCase("g") || fifthChar.equalsIgnoreCase("v") ||
                            fifthChar.equalsIgnoreCase("h") || fifthChar.equalsIgnoreCase("b") ||
                            fifthChar.equalsIgnoreCase("j") || fifthChar.equalsIgnoreCase("n") ||
                            fifthChar.equalsIgnoreCase("k") || fifthChar.equalsIgnoreCase("m")) {
                        JOptionPane.showMessageDialog(null, "Your index number might contain some" +
                                "\n characters that are not allowed." +
                                "\n\nPlease check!");
                    } else if (sixthChar.equalsIgnoreCase("q") || sixthChar.equalsIgnoreCase("w") ||
                            sixthChar.equalsIgnoreCase("e") || sixthChar.equalsIgnoreCase("r") ||
                            sixthChar.equalsIgnoreCase("t") || sixthChar.equalsIgnoreCase("y") ||
                            sixthChar.equalsIgnoreCase("u") || sixthChar.equalsIgnoreCase("i") ||
                            sixthChar.equalsIgnoreCase("o") || sixthChar.equalsIgnoreCase("p") ||
                            sixthChar.equalsIgnoreCase("a") || sixthChar.equalsIgnoreCase("l") ||
                            sixthChar.equalsIgnoreCase("s") || sixthChar.equalsIgnoreCase("z") ||
                            sixthChar.equalsIgnoreCase("d") || sixthChar.equalsIgnoreCase("x") ||
                            sixthChar.equalsIgnoreCase("f") || sixthChar.equalsIgnoreCase("c") ||
                            sixthChar.equalsIgnoreCase("g") || sixthChar.equalsIgnoreCase("v") ||
                            sixthChar.equalsIgnoreCase("h") || sixthChar.equalsIgnoreCase("b") ||
                            sixthChar.equalsIgnoreCase("j") || sixthChar.equalsIgnoreCase("n") ||
                            sixthChar.equalsIgnoreCase("k") || sixthChar.equalsIgnoreCase("m")) {
                        JOptionPane.showMessageDialog(null, "Your index number might contain some" +
                                "\n characters that are not allowed." +
                                "\n\nPlease check!");
                    } else if (seventhChar.equalsIgnoreCase("q") || seventhChar.equalsIgnoreCase("w") ||
                            seventhChar.equalsIgnoreCase("e") || seventhChar.equalsIgnoreCase("r") ||
                            seventhChar.equalsIgnoreCase("t") || seventhChar.equalsIgnoreCase("y") ||
                            seventhChar.equalsIgnoreCase("u") || seventhChar.equalsIgnoreCase("i") ||
                            seventhChar.equalsIgnoreCase("o") || seventhChar.equalsIgnoreCase("p") ||
                            seventhChar.equalsIgnoreCase("a") || seventhChar.equalsIgnoreCase("l") ||
                            seventhChar.equalsIgnoreCase("s") || seventhChar.equalsIgnoreCase("z") ||
                            seventhChar.equalsIgnoreCase("d") || seventhChar.equalsIgnoreCase("x") ||
                            seventhChar.equalsIgnoreCase("f") || seventhChar.equalsIgnoreCase("c") ||
                            seventhChar.equalsIgnoreCase("g") || seventhChar.equalsIgnoreCase("v") ||
                            seventhChar.equalsIgnoreCase("h") || seventhChar.equalsIgnoreCase("b") ||
                            seventhChar.equalsIgnoreCase("j") || seventhChar.equalsIgnoreCase("n") ||
                            seventhChar.equalsIgnoreCase("k") || seventhChar.equalsIgnoreCase("m")) {
                        JOptionPane.showMessageDialog(null, "Your index number might contain some" +
                                "\n characters that are not allowed." +
                                "\n\nPlease check!");
                    } else if (eightChar.equalsIgnoreCase("q") || eightChar.equalsIgnoreCase("w") ||
                            eightChar.equalsIgnoreCase("e") || eightChar.equalsIgnoreCase("r") ||
                            eightChar.equalsIgnoreCase("t") || eightChar.equalsIgnoreCase("y") ||
                            eightChar.equalsIgnoreCase("u") || eightChar.equalsIgnoreCase("i") ||
                            eightChar.equalsIgnoreCase("o") || eightChar.equalsIgnoreCase("p") ||
                            eightChar.equalsIgnoreCase("a") || eightChar.equalsIgnoreCase("l") ||
                            eightChar.equalsIgnoreCase("s") || eightChar.equalsIgnoreCase("z") ||
                            eightChar.equalsIgnoreCase("d") || eightChar.equalsIgnoreCase("x") ||
                            eightChar.equalsIgnoreCase("f") || eightChar.equalsIgnoreCase("c") ||
                            eightChar.equalsIgnoreCase("g") || eightChar.equalsIgnoreCase("v") ||
                            eightChar.equalsIgnoreCase("h") || eightChar.equalsIgnoreCase("b") ||
                            eightChar.equalsIgnoreCase("j") || eightChar.equalsIgnoreCase("n") ||
                            eightChar.equalsIgnoreCase("k") || eightChar.equalsIgnoreCase("m")) {
                        JOptionPane.showMessageDialog(null, "Your index number might contain some" +
                                "\n characters that are not allowed." +
                                "\n\nPlease check!");
                    } else {
                        boolean doesExist = false;

                        //checking if user details already exist
                        for (NewStudent s : student) {
                            if (name.equalsIgnoreCase(s.getName()) && indexNumber.equalsIgnoreCase(s.getNumber())) {
                                //setting boolean value to true if user details already exist
                                doesExist = true;
                            }
                        }
                        if (doesExist) {
                            //if user details already exist
                            JOptionPane.showMessageDialog(null,
                                    "You have voted already!\n" +
                                            "you cannot vote twice!!",
                                    "Voting Confirmation", JOptionPane.OK_OPTION);
                            firstPanel.setVisible(false);
                            fifthPanel.setVisible(true);
                        } else {
                            //if user details does not exist
                            firstPanel.setVisible(true);
                            fifthPanel.setVisible(false);

                            //saving user new user details into an arraylist
                            NewStudent main = new NewStudent(name, indexNumber);
                            student.add(main);
                        }
                    }

                }


            }
        });

        //creating a listener for presidential checkboxes
        ActionListener presidentVoteCheckBox = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presidentVoteCheckBox1.setEnabled(false);
                presidentVoteCheckBox2.setEnabled(false);
                presidentSubmitBtn.setEnabled(true);
                presidentResetBtn.setEnabled(true);
            }
        };
        presidentVoteCheckBox2.addActionListener(presidentVoteCheckBox);
        presidentVoteCheckBox1.addActionListener(presidentVoteCheckBox);

        //creating ActionListener for president submit button
        presidentSubmitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstPanel.setVisible(false);
                secondPanel.setVisible(true);

                if (presidentVoteCheckBox1.isSelected()) {
                    int p1 = accumulate.getPresident1VoteCount();
                    accumulate.setPresident1VoteCount(p1 + 1);
                } else if (presidentVoteCheckBox2.isSelected()) {
                    int p2 = accumulate.getPresident2VoteCount();
                    accumulate.setPresident2VoteCount(p2 + 1);
                }
            }
        });

        //creating ActionListener for president reset button
        presidentResetBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presidentVoteCheckBox1.setEnabled(true);
                presidentVoteCheckBox2.setEnabled(true);
                presidentSubmitBtn.setEnabled(false);
                presidentResetBtn.setEnabled(false);
                presidentVoteCheckBox1.setSelected(false);
                presidentVoteCheckBox2.setSelected(false);
            }
        });

        //creating ActionListener for president skip button
        presidentSkipBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (presidentVoteCheckBox1.isSelected() || presidentVoteCheckBox2.isSelected()) {
                    int confirm = JOptionPane.showConfirmDialog(null,
                            "Are you sure you want to skip this menu?\n" +
                                    "Your vote wouldn't count!",
                            "Confirm Skip", JOptionPane.YES_NO_OPTION);

                    if (confirm == 0) {
                        secondPanel.setVisible(true);
                        firstPanel.setVisible(false);
                    } else {
                        firstPanel.setVisible(true);
                        secondPanel.setVisible(false);
                    }
                } else {
                    secondPanel.setVisible(true);
                    firstPanel.setVisible(false);
                }
            }
        });

        //creating a listener for secretary checkboxes
        ActionListener secretaryVoteCheck = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secretaryVoteCheckBox1.setEnabled(false);
                secretaryVoteCheckBox2.setEnabled(false);
                secretaryVoteCheckBox3.setEnabled(false);
                secretarySubmitBtn.setEnabled(true);
                secretaryResetBtn.setEnabled(true);
            }
        };
        secretaryVoteCheckBox3.addActionListener(secretaryVoteCheck);
        secretaryVoteCheckBox2.addActionListener(secretaryVoteCheck);
        secretaryVoteCheckBox1.addActionListener(secretaryVoteCheck);

        //creating ActionListener for secretary submit button
        secretarySubmitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (secretaryVoteCheckBox1.isSelected()) {
                    int s1 = accumulate.getSecretary1VoteCount();
                    accumulate.setSecretary1VoteCount(s1 + 1);
                } else if (secretaryVoteCheckBox2.isSelected()) {
                    int s2 = accumulate.getSecretary2VoteCount();
                    accumulate.setSecretary2VoteCount(s2 + 1);
                } else if (secretaryVoteCheckBox3.isSelected()) {
                    int s3 = accumulate.getSecretary3VoteCount();
                    accumulate.setSecretary3VoteCount(s3 + 1);
                }
                secondPanel.setVisible(false);
                thirdPanel.setVisible(true);
            }
        });

        //creating ActionListener for secretary reset button
        secretaryResetBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secretaryVoteCheckBox1.setEnabled(true);
                secretaryVoteCheckBox2.setEnabled(true);
                secretaryVoteCheckBox3.setEnabled(true);
                secretaryVoteCheckBox1.setSelected(false);
                secretaryVoteCheckBox2.setSelected(false);
                secretaryVoteCheckBox3.setSelected(false);
                secretaryResetBtn.setEnabled(false);
                secretarySubmitBtn.setEnabled(false);
            }
        });

        //creating ActionListener for secretary skip button
        secretarySkipBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (secretaryVoteCheckBox1.isSelected() || secretaryVoteCheckBox2.isSelected() || secretaryVoteCheckBox3.isSelected()) {
                    int confirm = JOptionPane.showConfirmDialog(null,
                            "Are you sure you want to skip this menu?\n" +
                                    "Your vote wouldn't count!",
                            "Confirm Skip", JOptionPane.YES_NO_OPTION);

                    if (confirm == 0) {
                        secondPanel.setVisible(false);
                        thirdPanel.setVisible(true);
                    } else {
                        secondPanel.setVisible(true);
                        thirdPanel.setVisible(false);
                    }
                } else {
                    secondPanel.setVisible(false);
                    thirdPanel.setVisible(true);
                }
            }
        });

        //creating a listener for treasurer checkboxes
        ActionListener treasurerVoteCheckBox = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                treasurerVoteCheckBox1.setEnabled(false);
                treasurerVoteCheckBox2.setEnabled(false);
                treasurerSubmitBtn.setEnabled(true);
                treasurerResetBtn.setEnabled(true);
            }
        };
        treasurerVoteCheckBox2.addActionListener(treasurerVoteCheckBox);
        treasurerVoteCheckBox1.addActionListener(treasurerVoteCheckBox);

        //creating ActionListener for treasurer submit button
        treasurerSubmitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (treasurerVoteCheckBox1.isSelected()) {
                    int t1 = accumulate.getTreasurer1VoteCount();
                    accumulate.setTreasurer1VoteCount(t1 + 1);
                } else if (treasurerVoteCheckBox2.isSelected()) {
                    int t2 = accumulate.getTreasurer2VoteCount();
                    accumulate.setTreasurer2VoteCount(t2 + 1);
                }
                thirdPanel.setVisible(false);
                fourthPanel.setVisible(true);
            }
        });

        //creating ActionListener for treasurer reset button
        treasurerResetBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                treasurerVoteCheckBox1.setEnabled(true);
                treasurerVoteCheckBox2.setEnabled(true);
                treasurerSubmitBtn.setEnabled(false);
                treasurerResetBtn.setEnabled(false);
                treasurerVoteCheckBox1.setSelected(false);
                treasurerVoteCheckBox2.setSelected(false);
            }
        });

        //creating ActionListener for treasurer skip button
        treasurerSkipBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (treasurerVoteCheckBox1.isSelected() || treasurerVoteCheckBox2.isSelected()) {
                    int confirm = JOptionPane.showConfirmDialog(null,
                            "Are you sure you want to skip this menu?\n" +
                                    "Your vote wouldn't count!",
                            "Confirm Skip", JOptionPane.YES_NO_OPTION);

                    if (confirm == 0) {
                        thirdPanel.setVisible(false);
                        fourthPanel.setVisible(true);
                    } else {
                        thirdPanel.setVisible(true);
                        fourthPanel.setVisible(false);
                    }
                } else {
                    thirdPanel.setVisible(false);
                    fourthPanel.setVisible(true);
                }
            }
        });

        //creating a listener for done button
        doneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fourthPanel.setVisible(false);
                loginFieldPanel.setVisible(true);

                fifthPanel.setVisible(true);
                userNameField.setText("");
                studentIdField.setText("");

                presidentVoteCheckBox1.setSelected(false);
                presidentVoteCheckBox2.setSelected(false);
                secretaryVoteCheckBox1.setSelected(false);
                secretaryVoteCheckBox2.setSelected(false);
                secretaryVoteCheckBox3.setSelected(false);
                presidentSubmitBtn.setEnabled(false);
                secretarySubmitBtn.setEnabled(false);
                presidentResetBtn.setEnabled(false);
                secretaryResetBtn.setEnabled(false);
                presidentVoteCheckBox1.setEnabled(true);
                presidentVoteCheckBox2.setEnabled(true);
                secretaryVoteCheckBox1.setEnabled(true);
                secretaryVoteCheckBox2.setEnabled(true);
                secretaryVoteCheckBox3.setEnabled(true);
                treasurerVoteCheckBox1.setSelected(false);
                treasurerVoteCheckBox1.setEnabled(true);
                treasurerVoteCheckBox2.setSelected(false);
                treasurerVoteCheckBox2.setEnabled(true);
                treasurerResetBtn.setEnabled(false);
                treasurerSubmitBtn.setEnabled(false);
            }
        });

    }

    //creating a method to return JMenuBar
    public static JMenuBar createMenuBar() {
        //creating an instance of the class - MidSemExams
        MidSemExams mid = new MidSemExams();

        //creating a menuBar
        JMenuBar jMenuBar = new JMenuBar();

        //creating menus
        JMenu file = new JMenu("File");
        JMenu display = new JMenu("Display");
        JMenu help = new JMenu("Help");

        //creating menuItems for the menus above
        JMenuItem add = new JMenuItem("Add");
        JMenuItem exit = new JMenuItem("Exit");
        JMenuItem result = new JMenuItem("Result");
        JMenuItem about = new JMenuItem("About");

        //setting Mnemonics for the menus
        file.setMnemonic(KeyEvent.VK_F);
        display.setMnemonic(KeyEvent.VK_D);
        help.setMnemonic(KeyEvent.VK_H);

        //setting Accelerator for some menuItems
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
        result.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));

        //adding an actionListener to 'add' menu item
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new portfolio();
            }
        });


        //adding an actionListener to 'exit' menu item
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //adding an actionListener to 'result' menu item
        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ElectionResults();
            }
        });

        //adding an actionListener to 'about' menu item
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Group seven members");
                frame.setVisible(true);
                frame.setSize(400, 300);
                frame.setLocationRelativeTo(null);

                JPanel panel = new JPanel();
                frame.add(panel);
                panel.setVisible(true);
                JTextArea textArea = new JTextArea("        Group members" +
                        "\n\n\n" + " Joshua Modunu - 01204961D\n" +
                        " Ampaw Justice Safo - 01203769D\n" +
                        " Gankui Wisdom Kwame - 01200035D\n" +
                        " James Mckeown Awuah - 01202207D\n" +
                        " Obeng Bright - 01200663D\n" +
                        " Antwi Blessed - 01200329D\n" +
                        " Sandra Aklasu - 01203745D\n" +
                        " Agyin Joseph - 01200712D\n" +
                        "Mustapha-Sey Khadijah Umme - 01201185D\n" +
                        "Bernard Asiamah Ankah - 01202159D\n" +
                        "Othniel Thompson - 01203721D\n");
                textArea.setEditable(false);
                panel.add(textArea);
                panel.setBackground(Color.white);
            }
        });

        /*adding 'add' and 'exit' menu item to file
        menu with a separator - separating them*/
        file.add(add);
        file.addSeparator();
        file.add(exit);

        //adding 'result' menu item to display menu
        display.add(result);

        //adding 'about' menu item to help menu
        help.add(about);

        //adding all menu to the menuBar
        jMenuBar.add(file);
        jMenuBar.add(display);
        jMenuBar.add(help);

        //returning the menuBar as it is required as the method's datatype
        return jMenuBar;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Voting App");
        frame.setBounds(300, 200, 699, 500);
        frame.setJMenuBar(createMenuBar());
        frame.setContentPane(new MidSemExams().framePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
