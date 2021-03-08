package librarymgmt;

import java.awt.*;
import java.sql.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author abish
 */
public class Library extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */

    public Library() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        librarianLoginFrame = new javax.swing.JFrame();
        librarianLoginPanel = new javax.swing.JPanel();
        libLoginLabel = new javax.swing.JLabel();
        libUserNameLabel = new javax.swing.JLabel();
        libUserNameTextField = new javax.swing.JTextField();
        libLoginPassLabel = new javax.swing.JLabel();
        libLoginPassTextField = new javax.swing.JPasswordField();
        linLogBtn = new javax.swing.JButton();
        studentLoginFrame = new javax.swing.JFrame();
        studentLoginPanel = new javax.swing.JPanel();
        studentLoginLabel = new javax.swing.JLabel();
        studentUserNameLabel = new javax.swing.JLabel();
        studentUserNameTextField = new javax.swing.JTextField();
        studentLoginPassLabel = new javax.swing.JLabel();
        studentLoginPassTextField = new javax.swing.JPasswordField();
        stuLogBtn = new javax.swing.JButton();
        facultyLoginFrame = new javax.swing.JFrame();
        facultyLoginPanel = new javax.swing.JPanel();
        facultyLoginLabel = new javax.swing.JLabel();
        facultyUserNameLabel = new javax.swing.JLabel();
        facultyUserNameTextField = new javax.swing.JTextField();
        facultyLoginPassLabel = new javax.swing.JLabel();
        facultyLoginPassTextField = new javax.swing.JPasswordField();
        facLogBtn = new javax.swing.JButton();
        signUpFrame = new javax.swing.JFrame();
        signUpPanel = new javax.swing.JPanel();
        facultySignUpBtn = new javax.swing.JButton();
        studentSignUpBtn = new javax.swing.JButton();
        signUpFrameLabel = new javax.swing.JLabel();
        facultySignUpFrame = new javax.swing.JFrame();
        facultySignUpPanel = new javax.swing.JPanel();
        facSignUpFrameLabel = new javax.swing.JLabel();
        facultySignUpNameLabel = new javax.swing.JLabel();
        facultySignUpIDLabel = new javax.swing.JLabel();
        facultySignUpUserNameLabel = new javax.swing.JLabel();
        facultySignUpPassLabel = new javax.swing.JLabel();
        facultySignUpEmailLabel = new javax.swing.JLabel();
        facultySignUpAddressLabel = new javax.swing.JLabel();
        facultySignUpNameField = new javax.swing.JTextField();
        facultySignUpIDField = new javax.swing.JTextField();
        facultySignUpEmailField = new javax.swing.JTextField();
        facultySignUpUserNameField = new javax.swing.JTextField();
        facultySignUpPassField = new javax.swing.JPasswordField();
        facultySignUpConPassLabel = new javax.swing.JLabel();
        facultySignUpConPassField = new javax.swing.JPasswordField();
        facSignUpFrameBtn = new javax.swing.JButton();
        facSignUpAddressScrollPane = new javax.swing.JScrollPane();
        facSignUpAddressArea = new javax.swing.JTextArea();
        studentSignUpFrame = new javax.swing.JFrame();
        studentSignUpPanel = new javax.swing.JPanel();
        stuSignUpFormLabel = new javax.swing.JLabel();
        stuSignUpNameLabel = new javax.swing.JLabel();
        stuSignUpIDLabel = new javax.swing.JLabel();
        stuSignUpUserNameLabel = new javax.swing.JLabel();
        stuSignUpPassLabel = new javax.swing.JLabel();
        stuSignUpEmailLabel = new javax.swing.JLabel();
        stuSignUpAddressLabel = new javax.swing.JLabel();
        stuSignUpNameField = new javax.swing.JTextField();
        stuSignUpIDField = new javax.swing.JTextField();
        stuSignUpEmailField = new javax.swing.JTextField();
        stuSignUpAddScrollPane = new javax.swing.JScrollPane();
        stuSignUpAddressArea = new javax.swing.JTextArea();
        stuSignUpUserNameField = new javax.swing.JTextField();
        stuSignUpPassField = new javax.swing.JPasswordField();
        stuSignUpConPassLabel = new javax.swing.JLabel();
        stuSignUpConPassField = new javax.swing.JPasswordField();
        stuSignUpFormBtn = new javax.swing.JButton();
        stuSignUpBankFrame = new javax.swing.JFrame();
        stuSignUpBankPanel = new javax.swing.JPanel();
        stuBankDetailFrameLabel = new javax.swing.JLabel();
        stuBankDetailCardNoLabel = new javax.swing.JLabel();
        stuBankDetailCardNameLabel = new javax.swing.JLabel();
        stuBankDetailExpDateLabel = new javax.swing.JLabel();
        stuBankDetailCardNameField = new javax.swing.JTextField();
        stuBankDetailCardNoField = new javax.swing.JTextField();
        stuBankDetailExpDateField = new javax.swing.JTextField();
        stuBankDetailSubBtn = new javax.swing.JButton();
        startPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        librarianBtn = new javax.swing.JButton();
        studentBtn = new javax.swing.JButton();
        facultyBtn = new javax.swing.JButton();
        becomeMemberBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        stuBankFormIDLabel = new javax.swing.JLabel();
        stuBankFormIDTextField = new javax.swing.JTextField();
        searchBookFrame = new javax.swing.JFrame();
        searchBookPanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        yesRadioButton = new javax.swing.JRadioButton();
        noRadioButton = new javax.swing.JRadioButton();
        availabilityLabel = new javax.swing.JLabel();
        clickYesToBorrowLabel = new javax.swing.JLabel();
        yesOrNoDisplayLabel = new javax.swing.JLabel();
        borrowYesOrNoSubmitBtn = new javax.swing.JButton();
        borrowOrNotGroup = new ButtonGroup();
        returnBtn = new javax.swing.JButton();
        copyrightsLabel = new javax.swing.JLabel();
        fileMenu = new javax.swing.JMenu();
        librarianFramePanel = new javax.swing.JPanel();
        librarianFrameBooksBorrowedLabel = new javax.swing.JLabel();
        studentBooksBorowedButton = new javax.swing.JButton();
        librarianFrame = new javax.swing.JFrame();
        facultyBooksBorrowedButton = new javax.swing.JButton();
        studentBooksBorowedButton = new javax.swing.JButton();



        librarianLoginFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        librarianLoginFrame.setMaximumSize(new java.awt.Dimension(400, 300));
        librarianLoginFrame.setMinimumSize(new java.awt.Dimension(400, 300));

        librarianLoginPanel.setMaximumSize(new java.awt.Dimension(400, 300));
        librarianLoginPanel.setMinimumSize(new java.awt.Dimension(400, 300));

        libLoginLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        libLoginLabel.setText("Librarian Log In");

        libUserNameLabel.setText("Username");

        libUserNameTextField.setToolTipText("Enter your username");

        becomeMemberBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                becomeMemberBtnActionPerformed(actionEvent);
            }
        });
        libLoginPassLabel.setText("Password");

        libLoginPassTextField.setToolTipText("Enter your password here");

        linLogBtn.setText("Log In");

        linLogBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                libLogBtnActionPerformed(actionEvent);
            }
        });

        javax.swing.GroupLayout librarianLoginPanelLayout = new javax.swing.GroupLayout(librarianLoginPanel);
        librarianLoginPanel.setLayout(librarianLoginPanelLayout);
        librarianLoginPanelLayout.setHorizontalGroup(
                librarianLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(librarianLoginPanelLayout.createSequentialGroup()
                                .addGroup(librarianLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(librarianLoginPanelLayout.createSequentialGroup()
                                                .addGap(146, 146, 146)
                                                .addComponent(libLoginLabel))
                                        .addGroup(librarianLoginPanelLayout.createSequentialGroup()
                                                .addGap(85, 85, 85)
                                                .addGroup(librarianLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(libLoginPassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(libUserNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                                                .addGap(44, 44, 44)
                                                .addGroup(librarianLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(libUserNameTextField)
                                                        .addComponent(libLoginPassTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                                .addContainerGap(88, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, librarianLoginPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(linLogBtn)
                                .addGap(101, 101, 101))
        );
        librarianLoginPanelLayout.setVerticalGroup(
                librarianLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(librarianLoginPanelLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(libLoginLabel)
                                .addGap(35, 35, 35)
                                .addGroup(librarianLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(libUserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(libUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(librarianLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(libLoginPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(libLoginPassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(linLogBtn)
                                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout librarianLoginFrameLayout = new javax.swing.GroupLayout(librarianLoginFrame.getContentPane());
        librarianLoginFrame.getContentPane().setLayout(librarianLoginFrameLayout);
        librarianLoginFrameLayout.setHorizontalGroup(
                librarianLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(librarianLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        librarianLoginFrameLayout.setVerticalGroup(
                librarianLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(librarianLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        studentLoginFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        studentLoginFrame.setMaximumSize(new java.awt.Dimension(400, 300));
        studentLoginFrame.setMinimumSize(new java.awt.Dimension(400, 300));

        studentLoginPanel.setMaximumSize(new java.awt.Dimension(400, 300));
        studentLoginPanel.setMinimumSize(new java.awt.Dimension(400, 300));

        studentLoginLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        studentLoginLabel.setText("Student Log In");

        studentUserNameLabel.setText("Username");

        studentUserNameTextField.setToolTipText("Enter your username");

        studentLoginPassLabel.setText("Password");

        studentLoginPassTextField.setToolTipText("Enter your password here");

        stuLogBtn.setText("Log In");

        stuLogBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stuLogBtnActionPerformed(actionEvent);
            }
        });

        javax.swing.GroupLayout studentLoginPanelLayout = new javax.swing.GroupLayout(studentLoginPanel);
        studentLoginPanel.setLayout(studentLoginPanelLayout);
        studentLoginPanelLayout.setHorizontalGroup(
                studentLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(studentLoginPanelLayout.createSequentialGroup()
                                .addGroup(studentLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(studentLoginPanelLayout.createSequentialGroup()
                                                .addGap(146, 146, 146)
                                                .addComponent(studentLoginLabel))
                                        .addGroup(studentLoginPanelLayout.createSequentialGroup()
                                                .addGap(85, 85, 85)
                                                .addGroup(studentLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(studentLoginPassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(studentUserNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                                                .addGap(44, 44, 44)
                                                .addGroup(studentLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(studentUserNameTextField)
                                                        .addComponent(studentLoginPassTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                                .addContainerGap(88, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentLoginPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(stuLogBtn)
                                .addGap(101, 101, 101))
        );
        studentLoginPanelLayout.setVerticalGroup(
                studentLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(studentLoginPanelLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(studentLoginLabel)
                                .addGap(35, 35, 35)
                                .addGroup(studentLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(studentUserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studentUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(studentLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(studentLoginPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studentLoginPassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(stuLogBtn)
                                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout studentLoginFrameLayout = new javax.swing.GroupLayout(studentLoginFrame.getContentPane());
        studentLoginFrame.getContentPane().setLayout(studentLoginFrameLayout);
        studentLoginFrameLayout.setHorizontalGroup(
                studentLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(studentLoginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        studentLoginFrameLayout.setVerticalGroup(
                studentLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(studentLoginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        facultyLoginFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        facultyLoginFrame.setMaximumSize(new java.awt.Dimension(400, 300));
        facultyLoginFrame.setMinimumSize(new java.awt.Dimension(400, 300));
        facultyLoginFrame.setPreferredSize(new java.awt.Dimension(400, 300));

        facultyLoginPanel.setMaximumSize(new java.awt.Dimension(400, 300));
        facultyLoginPanel.setMinimumSize(new java.awt.Dimension(400, 300));

        facultyLoginLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        facultyLoginLabel.setText("Faculty Log In");

        facultyUserNameLabel.setText("Username");

        facultyUserNameTextField.setToolTipText("Enter your username");

        facultyLoginPassLabel.setText("Password");

        facultyLoginPassTextField.setToolTipText("Enter your password here");

        facLogBtn.setText("Log In");

        facLogBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                facLogBtnActionPerformed(actionEvent);
            }
        });

        javax.swing.GroupLayout facultyLoginPanelLayout = new javax.swing.GroupLayout(facultyLoginPanel);
        facultyLoginPanel.setLayout(facultyLoginPanelLayout);
        facultyLoginPanelLayout.setHorizontalGroup(
                facultyLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(facultyLoginPanelLayout.createSequentialGroup()
                                .addGroup(facultyLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(facultyLoginPanelLayout.createSequentialGroup()
                                                .addGap(146, 146, 146)
                                                .addComponent(facultyLoginLabel))
                                        .addGroup(facultyLoginPanelLayout.createSequentialGroup()
                                                .addGap(85, 85, 85)
                                                .addGroup(facultyLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(facultyLoginPassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(facultyUserNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                                                .addGap(44, 44, 44)
                                                .addGroup(facultyLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(facultyUserNameTextField)
                                                        .addComponent(facultyLoginPassTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                                .addContainerGap(88, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, facultyLoginPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(facLogBtn)
                                .addGap(101, 101, 101))
        );
        facultyLoginPanelLayout.setVerticalGroup(
                facultyLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(facultyLoginPanelLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(facultyLoginLabel)
                                .addGap(35, 35, 35)
                                .addGroup(facultyLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(facultyUserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(facultyUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(facultyLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(facultyLoginPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(facultyLoginPassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(facLogBtn)
                                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout facultyLoginFrameLayout = new javax.swing.GroupLayout(facultyLoginFrame.getContentPane());
        facultyLoginFrame.getContentPane().setLayout(facultyLoginFrameLayout);
        facultyLoginFrameLayout.setHorizontalGroup(
                facultyLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(facultyLoginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        facultyLoginFrameLayout.setVerticalGroup(
                facultyLoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(facultyLoginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        signUpFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        signUpFrame.setMaximumSize(new java.awt.Dimension(400, 300));
        signUpFrame.setMinimumSize(new java.awt.Dimension(400, 300));
        signUpFrame.setPreferredSize(new java.awt.Dimension(400, 300));

        signUpPanel.setMaximumSize(new java.awt.Dimension(400, 300));
        signUpPanel.setMinimumSize(new java.awt.Dimension(400, 300));
        signUpPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        facultySignUpBtn.setText("Faculty");
        facultySignUpBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                facultySignUpBtnActionPerformed(actionEvent);
            }
        });

        studentSignUpBtn.setText("Student");
        studentSignUpBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                studentSignUpBtnActionPerformed(actionEvent);
            }
        });

        signUpFrameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        signUpFrameLabel.setText("Who are you?");

        javax.swing.GroupLayout signUpPanelLayout = new javax.swing.GroupLayout(signUpPanel);
        signUpPanel.setLayout(signUpPanelLayout);
        signUpPanelLayout.setHorizontalGroup(
                signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(signUpPanelLayout.createSequentialGroup()
                                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(signUpPanelLayout.createSequentialGroup()
                                                .addGap(160, 160, 160)
                                                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(studentSignUpBtn)
                                                        .addComponent(facultySignUpBtn)))
                                        .addGroup(signUpPanelLayout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(signUpFrameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(166, Short.MAX_VALUE))
        );
        signUpPanelLayout.setVerticalGroup(
                signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(signUpPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(signUpFrameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(facultySignUpBtn)
                                .addGap(36, 36, 36)
                                .addComponent(studentSignUpBtn)
                                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout signUpFrameLayout = new javax.swing.GroupLayout(signUpFrame.getContentPane());
        signUpFrame.getContentPane().setLayout(signUpFrameLayout);
        signUpFrameLayout.setHorizontalGroup(
                signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(signUpPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        signUpFrameLayout.setVerticalGroup(
                signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(signUpPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        facultySignUpFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        facultySignUpFrame.setMaximumSize(new java.awt.Dimension(500, 550));
        facultySignUpFrame.setMinimumSize(new java.awt.Dimension(500, 550));
        facultySignUpFrame.setPreferredSize(new java.awt.Dimension(500, 550));

        facultySignUpPanel.setMinimumSize(new java.awt.Dimension(500, 550));

        facSignUpFrameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        facSignUpFrameLabel.setText("Faculty Sign Up");

        facultySignUpNameLabel.setText("Full Name");

        facultySignUpIDLabel.setText("ID");

        facultySignUpUserNameLabel.setText("User Name");

        facultySignUpPassLabel.setText("Password");

        facultySignUpEmailLabel.setText("Email");

        facultySignUpAddressLabel.setText("Address");

        facultySignUpConPassLabel.setText("Confirm Password");

        facSignUpFrameBtn.setText("Sign Up");
        facSignUpFrameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facSignUpFrameBtnActionPerformed(evt);
            }
        });

        facSignUpAddressArea.setColumns(20);
        facSignUpAddressArea.setRows(5);
        facSignUpAddressScrollPane.setViewportView(facSignUpAddressArea);

        javax.swing.GroupLayout facultySignUpPanelLayout = new javax.swing.GroupLayout(facultySignUpPanel);
        facultySignUpPanel.setLayout(facultySignUpPanelLayout);
        facultySignUpPanelLayout.setHorizontalGroup(
                facultySignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(facultySignUpPanelLayout.createSequentialGroup()
                                .addGroup(facultySignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(facultySignUpPanelLayout.createSequentialGroup()
                                                .addGap(193, 193, 193)
                                                .addComponent(facSignUpFrameLabel))
                                        .addGroup(facultySignUpPanelLayout.createSequentialGroup()
                                                .addGap(79, 79, 79)
                                                .addGroup(facultySignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(facultySignUpUserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(facultySignUpPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(facultySignUpConPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(facultySignUpNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(facultySignUpIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(facultySignUpEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(facultySignUpAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(46, 46, 46)
                                                .addGroup(facultySignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(facultySignUpEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(facultySignUpIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(facultySignUpNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(facultySignUpUserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(facultySignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(facSignUpFrameBtn)
                                                                .addGroup(facultySignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(facultySignUpConPassField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                                                        .addComponent(facultySignUpPassField, javax.swing.GroupLayout.Alignment.LEADING)))
                                                        .addComponent(facSignUpAddressScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(61, Short.MAX_VALUE))
        );
        facultySignUpPanelLayout.setVerticalGroup(
                facultySignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(facultySignUpPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(facSignUpFrameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(facultySignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(facultySignUpPanelLayout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(facultySignUpNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(facultySignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(facultySignUpIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(facultySignUpIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(facultySignUpPanelLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(facultySignUpNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addGroup(facultySignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(facultySignUpEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(facultySignUpEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(facultySignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(facultySignUpAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(facSignUpAddressScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(facultySignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(facultySignUpUserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(facultySignUpUserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(facultySignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(facultySignUpPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(facultySignUpPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(facultySignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(facultySignUpConPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(facultySignUpConPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(facSignUpFrameBtn)
                                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout facultySignUpFrameLayout = new javax.swing.GroupLayout(facultySignUpFrame.getContentPane());
        facultySignUpFrame.getContentPane().setLayout(facultySignUpFrameLayout);
        facultySignUpFrameLayout.setHorizontalGroup(
                facultySignUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(facultySignUpFrameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(facultySignUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        facultySignUpFrameLayout.setVerticalGroup(
                facultySignUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(facultySignUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        studentSignUpFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        studentSignUpFrame.setMaximumSize(new java.awt.Dimension(500, 550));
        studentSignUpFrame.setMinimumSize(new java.awt.Dimension(500, 550));
        studentSignUpFrame.setPreferredSize(new java.awt.Dimension(500, 550));

        studentSignUpPanel.setMinimumSize(new java.awt.Dimension(500, 550));

        stuSignUpFormLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        stuSignUpFormLabel.setText("Student Sign Up");

        stuSignUpNameLabel.setText("Full Name");

        stuSignUpIDLabel.setText("ID");

        stuSignUpUserNameLabel.setText("User Name");

        stuSignUpPassLabel.setText("Password");

        stuSignUpEmailLabel.setText("Email");

        stuSignUpAddressLabel.setText("Address");

        stuSignUpAddressArea.setColumns(20);
        stuSignUpAddressArea.setRows(5);
        stuSignUpAddScrollPane.setViewportView(stuSignUpAddressArea);

        stuSignUpConPassLabel.setText("Confirm Password");

        stuSignUpFormBtn.setText("Sign Up");
        stuSignUpFormBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuSignUpFormBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentSignUpPanelLayout = new javax.swing.GroupLayout(studentSignUpPanel);
        studentSignUpPanel.setLayout(studentSignUpPanelLayout);
        studentSignUpPanelLayout.setHorizontalGroup(
                studentSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(studentSignUpPanelLayout.createSequentialGroup()
                                .addGroup(studentSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(studentSignUpPanelLayout.createSequentialGroup()
                                                .addGap(193, 193, 193)
                                                .addComponent(stuSignUpFormLabel))
                                        .addGroup(studentSignUpPanelLayout.createSequentialGroup()
                                                .addGap(79, 79, 79)
                                                .addGroup(studentSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(studentSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(studentSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(stuSignUpIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(stuSignUpEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(stuSignUpAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(stuSignUpNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(studentSignUpPanelLayout.createSequentialGroup()
                                                                        .addComponent(stuSignUpUserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(15, 15, 15)))
                                                        .addComponent(stuSignUpPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(stuSignUpConPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(46, 46, 46)
                                                .addGroup(studentSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(stuSignUpEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(stuSignUpIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(stuSignUpNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(stuSignUpAddScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(stuSignUpUserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(studentSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(stuSignUpFormBtn)
                                                                .addGroup(studentSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(stuSignUpConPassField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                                                        .addComponent(stuSignUpPassField, javax.swing.GroupLayout.Alignment.LEADING))))))
                                .addContainerGap(61, Short.MAX_VALUE))
        );
        studentSignUpPanelLayout.setVerticalGroup(
                studentSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(studentSignUpPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(stuSignUpFormLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(studentSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(studentSignUpPanelLayout.createSequentialGroup()
                                                .addGap(69, 69, 69)
                                                .addGroup(studentSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(stuSignUpIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(stuSignUpIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(studentSignUpPanelLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(studentSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(stuSignUpNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(stuSignUpNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(26, 26, 26)
                                .addGroup(studentSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(stuSignUpEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(stuSignUpEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(studentSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(stuSignUpAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(stuSignUpAddScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(studentSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(stuSignUpUserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(stuSignUpUserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(studentSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(stuSignUpPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(stuSignUpPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(studentSignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(stuSignUpConPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(stuSignUpConPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(stuSignUpFormBtn)
                                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout studentSignUpFrameLayout = new javax.swing.GroupLayout(studentSignUpFrame.getContentPane());
        studentSignUpFrame.getContentPane().setLayout(studentSignUpFrameLayout);
        studentSignUpFrameLayout.setHorizontalGroup(
                studentSignUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(studentSignUpFrameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(studentSignUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        studentSignUpFrameLayout.setVerticalGroup(
                studentSignUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(studentSignUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );


        stuSignUpBankFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        stuSignUpBankFrame.setMaximumSize(new java.awt.Dimension(500, 550));
        stuSignUpBankFrame.setMinimumSize(new java.awt.Dimension(500, 550));
        stuSignUpBankFrame.setPreferredSize(new java.awt.Dimension(500, 550));

        stuBankDetailFrameLabel.setText("Bank Details");

        stuBankDetailCardNoLabel.setText("Card Number");

        stuBankDetailCardNameLabel.setText("Name on Card");

        stuBankDetailExpDateLabel.setText("Expiry Date");

        stuBankDetailSubBtn.setText("Submit");

        stuBankDetailSubBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stuBankDetailSubBtnActionPerformed(actionEvent);
            }
        });

        stuBankFormIDLabel.setText("Student ID");


        javax.swing.GroupLayout stuSignUpBankPanelLayout = new javax.swing.GroupLayout(stuSignUpBankPanel);
        stuSignUpBankPanel.setLayout(stuSignUpBankPanelLayout);
        stuSignUpBankPanelLayout.setHorizontalGroup(
                stuSignUpBankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(stuSignUpBankPanelLayout.createSequentialGroup()
                                .addGroup(stuSignUpBankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(stuSignUpBankPanelLayout.createSequentialGroup()
                                                .addGap(151, 151, 151)
                                                .addComponent(stuBankDetailFrameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(stuSignUpBankPanelLayout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addGroup(stuSignUpBankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(stuSignUpBankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(stuBankDetailCardNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(stuBankDetailCardNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                                                        .addComponent(stuBankDetailExpDateLabel)
                                                        .addComponent(stuBankFormIDLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                                .addGroup(stuSignUpBankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(stuBankDetailCardNameField)
                                                        .addComponent(stuBankDetailCardNoField, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                                        .addComponent(stuBankDetailExpDateField)
                                                        .addComponent(stuBankFormIDTextField))))
                                .addGap(53, 53, 53))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stuSignUpBankPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(stuBankDetailSubBtn)
                                .addGap(80, 80, 80))
        );
        stuSignUpBankPanelLayout.setVerticalGroup(
                stuSignUpBankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(stuSignUpBankPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(stuBankDetailFrameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(stuSignUpBankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stuSignUpBankPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(stuBankFormIDLabel)
                                                .addGap(23, 23, 23))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stuSignUpBankPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                                .addComponent(stuBankFormIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                .addGroup(stuSignUpBankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(stuBankDetailCardNoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(stuBankDetailCardNoField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(stuSignUpBankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(stuBankDetailCardNameLabel)
                                        .addComponent(stuBankDetailCardNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(stuSignUpBankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(stuBankDetailExpDateLabel)
                                        .addComponent(stuBankDetailExpDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addComponent(stuBankDetailSubBtn)
                                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout stuSignUpBankFrameLayout = new javax.swing.GroupLayout(stuSignUpBankFrame.getContentPane());
        stuSignUpBankFrame.getContentPane().setLayout(stuSignUpBankFrameLayout);
        stuSignUpBankFrameLayout.setHorizontalGroup(
                stuSignUpBankFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(stuSignUpBankPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        stuSignUpBankFrameLayout.setVerticalGroup(
                stuSignUpBankFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(stuSignUpBankPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        searchBookPanel.setMaximumSize(new java.awt.Dimension(400, 300));
        searchBookPanel.setMinimumSize(new java.awt.Dimension(400, 300));
        searchBookPanel.setPreferredSize(new java.awt.Dimension(400, 300));

        welcomeLabel.setEnabled(false);

        searchField.setToolTipText("Search here...");
        searchField.setBorder(javax.swing.BorderFactory.createEtchedBorder());



        searchButton.setText("Search");

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                searchButtonActionPerformed(actionEvent);
            }
        });

        searchBookFrame.setPreferredSize(new Dimension(400, 300));
        searchBookFrame.setMaximumSize(new Dimension(400, 300));
        searchBookFrame.setMinimumSize(new Dimension(400, 300));

        searchBookFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(searchBookFrame,
                        "Are you sure you want to close this window?", "Close Window?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                    searchBookFrameItemsSetVisibleAndTextFalse();
                    searchBookFrame.dispose();
                }
                else {
                    searchBookFrame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                }
            }
        });

        yesRadioButton.setText("Yes");
        yesRadioButton.setEnabled(false);
        yesRadioButton.setActionCommand("yes");

        noRadioButton.setText("No");
        noRadioButton.setEnabled(false);
        noRadioButton.setActionCommand("no");

        borrowOrNotGroup.add(yesRadioButton);
        borrowOrNotGroup.add(noRadioButton);

        availabilityLabel.setText("Availability");
        availabilityLabel.setEnabled(false);

        clickYesToBorrowLabel.setText("Click Yes to borrow");
        clickYesToBorrowLabel.setEnabled(false);

        yesOrNoDisplayLabel.setEnabled(false);

        borrowYesOrNoSubmitBtn.setText("Submit");

        borrowYesOrNoSubmitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                borrowYesOrNoSubmitBtnActionPerformed(actionEvent);
            }
        });

        returnBtn.setText("Return Book");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchBookPanelLayout = new javax.swing.GroupLayout(searchBookPanel);
        searchBookPanel.setLayout(searchBookPanelLayout);
        searchBookPanelLayout.setHorizontalGroup(
                searchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(searchBookPanelLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(availabilityLabel)
                                .addGap(97, 97, 97)
                                .addComponent(yesOrNoDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(searchBookPanelLayout.createSequentialGroup()
                                .addGroup(searchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(searchBookPanelLayout.createSequentialGroup()
                                                .addGap(109, 109, 109)
                                                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(returnBtn))
                                        .addGroup(searchBookPanelLayout.createSequentialGroup()
                                                .addGap(92, 92, 92)
                                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(searchBookPanelLayout.createSequentialGroup()
                                                .addGap(162, 162, 162)
                                                .addComponent(searchButton)))
                                .addContainerGap(10, Short.MAX_VALUE))
                        .addGroup(searchBookPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(searchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(clickYesToBorrowLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(borrowYesOrNoSubmitBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(searchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(yesRadioButton)
                                        .addComponent(noRadioButton))
                                .addGap(107, 107, 107))
        );
        searchBookPanelLayout.setVerticalGroup(
                searchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(searchBookPanelLayout.createSequentialGroup()
                                .addGroup(searchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(searchBookPanelLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchBookPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(returnBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(searchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(searchBookPanelLayout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addGroup(searchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(availabilityLabel)
                                                        .addComponent(yesOrNoDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(searchBookPanelLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(searchButton)))
                                .addGroup(searchBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(searchBookPanelLayout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(clickYesToBorrowLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(borrowYesOrNoSubmitBtn))
                                        .addGroup(searchBookPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(yesRadioButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(noRadioButton)))
                                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout searchBookFrameLayout = new javax.swing.GroupLayout(searchBookFrame.getContentPane());
        searchBookFrame.getContentPane().setLayout(searchBookFrameLayout);
        searchBookFrameLayout.setHorizontalGroup(
                searchBookFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
                        .addGroup(searchBookFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(searchBookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchBookFrameLayout.setVerticalGroup(
                searchBookFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
                        .addGroup(searchBookFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(searchBookPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        librarianFramePanel.setMaximumSize(new java.awt.Dimension(400, 300));
        librarianFramePanel.setMinimumSize(new java.awt.Dimension(400, 300));
        librarianFramePanel.setPreferredSize(new Dimension(400,300));

        librarianFrame.setPreferredSize(new Dimension(400,300));
        librarianFrame.setMinimumSize(new Dimension(400,300));
        librarianFrame.setMaximumSize(new Dimension(400,300));

        librarianFrameBooksBorrowedLabel.setText("Books Borrowed");

        facultyBooksBorrowedButton.setText("Faculty");
        facultyBooksBorrowedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyBooksBorrowedButtonActionPerformed(evt);
            }
        });

        studentBooksBorowedButton.setText("Student");
        studentBooksBorowedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentBooksBorowedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout librarianFramePanelLayout = new javax.swing.GroupLayout(librarianFramePanel);
        librarianFramePanel.setLayout(librarianFramePanelLayout);
        librarianFramePanelLayout.setHorizontalGroup(
                librarianFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(librarianFramePanelLayout.createSequentialGroup()
                                .addGroup(librarianFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(librarianFramePanelLayout.createSequentialGroup()
                                                .addGap(149, 149, 149)
                                                .addComponent(librarianFrameBooksBorrowedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(librarianFramePanelLayout.createSequentialGroup()
                                                .addGap(159, 159, 159)
                                                .addGroup(librarianFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(studentBooksBorowedButton)
                                                        .addComponent(facultyBooksBorrowedButton))))
                                .addContainerGap(145, Short.MAX_VALUE))
        );
        librarianFramePanelLayout.setVerticalGroup(
                librarianFramePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(librarianFramePanelLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(librarianFrameBooksBorrowedLabel)
                                .addGap(52, 52, 52)
                                .addComponent(facultyBooksBorrowedButton)
                                .addGap(32, 32, 32)
                                .addComponent(studentBooksBorowedButton)
                                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout librarianFrameLayout = new javax.swing.GroupLayout(librarianFrame.getContentPane());
        librarianFrame.getContentPane().setLayout(librarianFrameLayout);
        librarianFrameLayout.setHorizontalGroup(
                librarianFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
                        .addGroup(librarianFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(librarianFramePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        librarianFrameLayout.setVerticalGroup(
                librarianFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
                        .addGroup(librarianFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(librarianFramePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));

        startPanel.setMaximumSize(new java.awt.Dimension(700, 500));
        startPanel.setPreferredSize(new java.awt.Dimension(700, 500));

        titleLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Digital Library, UCE (BIT Campus), Trichy");

        loginLabel.setText("Login");
        loginLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        librarianBtn.setText("Librarian");
        librarianBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librarianBtnActionPerformed(evt);
            }
        });

        studentBtn.setText("Student");
        studentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentBtnActionPerformed(evt);
            }
        });

        facultyBtn.setText("Faculty");
        facultyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyBtnActionPerformed(evt);
            }
        });

        becomeMemberBtn.setText("Become A Member");

        copyrightsLabel.setText("Copyright © 2019 - All Rights Reserved");

        javax.swing.GroupLayout startPanelLayout = new javax.swing.GroupLayout(startPanel);
        startPanel.setLayout(startPanelLayout);
        startPanelLayout.setHorizontalGroup(
                startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(startPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(becomeMemberBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74))
                        .addGroup(startPanelLayout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(librarianBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(studentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(facultyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 171, Short.MAX_VALUE))
                        .addGroup(startPanelLayout.createSequentialGroup()
                                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(startPanelLayout.createSequentialGroup()
                                                .addGap(234, 234, 234)
                                                .addComponent(copyrightsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(startPanelLayout.createSequentialGroup()
                                                .addGap(323, 323, 323)
                                                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        startPanelLayout.setVerticalGroup(
                startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(startPanelLayout.createSequentialGroup()
                                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                .addGap(67, 67, 67)
                                .addComponent(becomeMemberBtn)
                                .addGap(40, 40, 40)
                                .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                .addGap(61, 61, 61)
                                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(librarianBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(studentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(facultyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(148, 148, 148)
                                .addComponent(copyrightsLabel)
                                .addContainerGap())
        );

        fileMenu.setText("File");

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        exitMenuItem.setLabel("Exit");
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                exitMenuItemActionPerformed(actionEvent);
            }
        });

        fileMenu.add(exitMenuItem);

        jMenuBar1.add(fileMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(startPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(startPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        pack();
    }

    private void librarianBtnActionPerformed(java.awt.event.ActionEvent evt) {
        librarianLoginFrame.setVisible(true);
    }

    private void studentBtnActionPerformed(java.awt.event.ActionEvent evt) {
        studentLoginFrame.setVisible(true);
    }

    private void facultyBtnActionPerformed(java.awt.event.ActionEvent evt) {
        facultyLoginFrame.setVisible(true);
    }


    private void facSignUpFrameBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String name = facultySignUpNameField.getText();
        int id = Integer.parseInt(facultySignUpIDField.getText());
        String email = facultySignUpEmailField.getText();
        String address = facSignUpAddressArea.getText();
        String user_name = facultySignUpUserNameField.getText();
        String password = String.valueOf(facultySignUpPassField.getPassword());
        String con_pass = String.valueOf(facultySignUpConPassField.getPassword());
        if (name != null && String.valueOf(id) != null && email != null && address != null && user_name != null && password != null && con_pass != null) {
            if (password.equals(con_pass)) {
                Statement statement = createDBConnection();
//                ResultSet resultSet = null;
                if (statement != null) {
                    try {
                        statement.executeUpdate("insert into faculty_info values(" + id + ", '" + name + "', '" + email + "', '" + address + "', '" + user_name + "', '" + password + "')");
                        statement.executeUpdate("insert into faculty_login_info values(" + id + ", '" + user_name + "', '" + password + "')");
                        System.out.println("You are a member now " + name + "!");
                        facultySignUpNameField.setText("");
                        facultySignUpConPassField.setText("");
                        facultySignUpIDField.setText("");
                        facultySignUpEmailField.setText("");
                        facSignUpAddressArea.setText("");
                        facultySignUpUserNameField.setText("");
                        facultySignUpPassField.setText("");
                        facultySignUpFrame.dispose();
                        facultyLoginFrame.setVisible(true);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                }
            } else {
                System.out.println("Passwords don't match");
            }
        } else {
            System.out.println("Every field is mandatory!");
        }
    }

    private void stuSignUpFormBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String name = stuSignUpNameField.getText();
        int id = Integer.parseInt(stuSignUpIDField.getText());
        String email = stuSignUpEmailField.getText();
        String address = stuSignUpAddressArea.getText();
        String user_name = stuSignUpUserNameField.getText();
        String password = String.valueOf(stuSignUpPassField.getPassword());
        String con_pass = String.valueOf(stuSignUpConPassField.getPassword());
        if (name != null && String.valueOf(id) != null && email != null && address != null && user_name != null && password != null && con_pass != null) {
            if (password.equals(con_pass)) {
                Statement statement = createDBConnection();
//                ResultSet resultSet = null;
                if (statement != null) {
                    try {
                        statement.executeUpdate("insert into student_info values(" + id + ", '" + name + "', '" + email + "', '" + address + "', '" + user_name + "', '" + password + "')");
                        statement.executeUpdate("insert into student_login_info values(" + id + ", '" + user_name + "', '" + password + "')");

                        System.out.println("Now fill in your bank details!");

                        stuSignUpBankFrame.setVisible(true);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                }
            } else {
                System.out.println("Passwords don't match");
            }
        } else {
            System.out.println("Every field is mandatory!");
        }
    }

    private void becomeMemberBtnActionPerformed(java.awt.event.ActionEvent actionEvent) {
        signUpFrame.setVisible(true);
    }

    private void facultySignUpBtnActionPerformed(java.awt.event.ActionEvent actionEvent) {
        signUpFrame.dispose();
        facultySignUpFrame.setVisible(true);
    }

    private void studentSignUpBtnActionPerformed(java.awt.event.ActionEvent actionEvent) {
        signUpFrame.dispose();
        studentSignUpFrame.setVisible(true);
    }


///////////////////////////////////Librarian Login Button/////////////////////////////////////////////////////////////
    private void libLogBtnActionPerformed(java.awt.event.ActionEvent actionEvent) {
        String user_name = libUserNameTextField.getText();
        System.out.println(user_name);
        String password = String.valueOf(libLoginPassTextField.getPassword());
        System.out.println(password);
        int flag = 0;
        int flag_user = 0;
        if(user_name != null) {
            Statement statement = createDBConnection();
            ResultSet resultSet = null;
            if (statement != null) {
                try {
                    resultSet = statement.executeQuery("select * from librarian_info");
                    assert resultSet != null;
                  //  System.out.println(resultSet.getString("user_name"));
                    while (resultSet.next()) {
                        System.out.println(resultSet.getString("user_name"));
                        if(user_name.equals(resultSet.getString("user_name"))) {
                            flag_user = 1;
                            if(password.equals(resultSet.getString("password"))){
                                flag = 1;
                                System.out.println("Login accepted!");
                                libUserNameTextField.setText("");
                                libLoginPassTextField.setText("");
                                librarianLoginFrame.dispose();
                                librarianFrame.setVisible(true);
                                break;
                            }
                        }

                    }
                    if(flag == 0 && flag_user == 1) {
                        System.out.println("Login denied");
                        JOptionPane.showMessageDialog(librarianLoginFrame, "Check your password!");
                    }
//                    if(flag_user == 0) {
//                        System.out.println("Sign Up to become a member!");
//                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            else {
                System.out.println("Statement object returned null");
            }
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private void stuLogBtnActionPerformed(java.awt.event.ActionEvent actionEvent) {
        String user_name = studentUserNameTextField.getText();
        System.out.println(user_name);
        String password = String.valueOf(studentLoginPassTextField.getPassword());
        System.out.println(password);
        int flag = 0;
        int flag_user = 0;
        if(user_name != null) {
            Statement statement = createDBConnection();
            ResultSet resultSet = null;
            if (statement != null) {
                try {
                    resultSet = statement.executeQuery("select * from student_login_info");
                    assert resultSet != null;
                    //  System.out.println(resultSet.getString("user_name"));
                    while (resultSet.next()) {
                        System.out.println(resultSet.getString("username"));
                        if(user_name.equals(resultSet.getString("username"))) {
                            flag_user = 1;
                            if(password.equals(resultSet.getString("password"))){
                                flag = 1;
                                System.out.println("Login accepted!");
                                studentUserNameTextField.setText("");
                                studentLoginPassTextField.setText("");
                                studentLoginFrame.dispose();
                                searchBookFrame.setVisible(true);
                                welcomeLabel.setEnabled(true);
                                welcomeLabel.setText("Welcome student " + user_name);
                                break;
                            }
                        }
                    }
                    if(flag == 0) {
                        System.out.println("Login denied");
                    }
                    if(flag == 0 && flag_user == 1) {
                        System.out.println("Check your password " + user_name + "!");
                        JOptionPane.showMessageDialog(studentLoginFrame, "Check your password " + user_name);
                    }
                    if(flag_user == 0) {
                        System.out.println("Sign Up to become a member!");
                        JOptionPane.showMessageDialog(studentLoginFrame, "Sign up to become a member!");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            else {
                System.out.println("Statement object returned null");
            }
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////Faculty Login Button/////////////////////////////////
    private void facLogBtnActionPerformed(java.awt.event.ActionEvent actionEvent) {
        String user_name = facultyUserNameTextField.getText();
        System.out.println(user_name);
        String password = String.valueOf(facultyLoginPassTextField.getPassword());
        System.out.println(password);
        int flag = 0;
        int flag_user = 0;
        if(user_name != null) {
            Statement statement = createDBConnection();
            ResultSet resultSet = null;
            if (statement != null) {
                try {
                    resultSet = statement.executeQuery("select * from faculty_login_info");
                    assert resultSet != null;
                    //  System.out.println(resultSet.getString("user_name"));
                    while (resultSet.next()) {
                        System.out.println(resultSet.getString("username"));
                        if(user_name.equals(resultSet.getString("username"))) {
                            flag_user = 1;
                            if(password.equals(resultSet.getString("password"))){
                                flag = 1;
                                System.out.println("Login accepted!");
                                facultyUserNameTextField.setText("");
                                facultyLoginPassTextField.setText("");
                                facultyLoginFrame.dispose();
                                welcomeLabel.setEnabled(true);
                                welcomeLabel.setText("Welcome faculty " + user_name);
                                searchBookFrame.setVisible(true);
                                break;
                            }
                        }

                    }
                    if(flag == 0) {
                        System.out.println("Login denied");
                    }
                    if(flag == 0 && flag_user == 1) {
                        System.out.println("Check your password " + user_name + "!");
                        JOptionPane.showMessageDialog(facultyLoginFrame, "Check your password " + user_name);
;                    }
                    if(flag_user == 0) {
                        System.out.println("Sign Up to become a member!");
                        JOptionPane.showMessageDialog(facultyLoginFrame, "Sign up to become a member!");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            else {
                System.out.println("Statement object returned null");
            }
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////////

    private void stuBankDetailSubBtnActionPerformed(ActionEvent actionEvent) {
        int id = Integer.parseInt(stuBankFormIDTextField.getText());
        String name = stuBankDetailCardNameField.getText();
        int card_no = Integer.parseInt(stuBankDetailCardNoField.getText());
        String date = stuBankDetailExpDateField.getText();

        if(String.valueOf(id) != null && name != null && String.valueOf(card_no) != null && date != null) {
            Statement statement = createDBConnection();
            if (statement != null) {
                try {
                    statement.executeUpdate("insert into student_bank_details values(" + id + ", '" + card_no + "', '" + name + "', '" + date + "')");

                    System.out.println("You are a member now " + name + "!");
                    System.out.println("Your bank details have been added!");

                    stuSignUpNameField.setText("");
                    stuSignUpConPassField.setText("");
                    stuSignUpIDField.setText("");
                    stuSignUpEmailField.setText("");
                    stuSignUpAddressArea.setText("");
                    stuSignUpUserNameField.setText("");
                    stuSignUpPassField.setText("");
                    studentSignUpFrame.dispose();
                    stuSignUpBankFrame.dispose();
                    searchBookFrame.setVisible(true);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void searchButtonActionPerformed(ActionEvent actionEvent) {
        String searchText = searchField.getText();
        int flag = 0;
        if(searchText != null) {
            Statement statement = createDBConnection();
            ResultSet resultSet = null;
            assert resultSet != null;
            try {
                resultSet = statement.executeQuery("select * from books");
                while (resultSet.next()) {
                    if (searchText.equalsIgnoreCase(resultSet.getString("name"))) {
                        searchBookFrameItemsSetVisibleAndText();
                        flag = 1;
                        break;
                    }
                    else if (searchText.equalsIgnoreCase(resultSet.getString("author"))) {
                        searchBookFrameItemsSetVisibleAndText();
                        searchField.setText(resultSet.getString("name"));
                        flag = 1;
                        break;
                    }
                    else {
                        availabilityLabel.setEnabled(true);
                        yesOrNoDisplayLabel.setEnabled(true);
                        yesOrNoDisplayLabel.setText("No");

                    }
                }
                if (yesOrNoDisplayLabel.getText().equalsIgnoreCase("No")) {
                    JOptionPane.showMessageDialog(searchBookFrame, "Book unavailable!");
                }


            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void borrowYesOrNoSubmitBtnActionPerformed(ActionEvent actionEvent) {
        String selectedRadio = borrowOrNotGroup.getSelection().getActionCommand();
        String [] arr_name = welcomeLabel.getText().split(" ");
        boolean isFaculty = false;
        if (arr_name[1].equals("faculty")) {
            isFaculty = true;
        }
        String name = arr_name[2];
        String author = "";
        int id = 0;
        if (selectedRadio.equals("yes")) {
            ResultSet resultSet = null;
            try {
                Statement statement = createDBConnection();
                if (isFaculty) {
                    resultSet = statement.executeQuery("select * from books");
                    while (resultSet.next()) {
                        if (searchField.getText().equals(resultSet.getString("name"))) {
                            author = resultSet.getString("author");
                            id = resultSet.getInt(1);
                            break;
                        }
                    }
                    statement.executeUpdate("insert into faculty_borrowed_books values('" + name + "', '" + searchField.getText() + "', '" + author + "' ,'" + id + "')");
                    statement.executeUpdate("delete books where name = '" + searchField.getText() + "'");
                    searchBookFrameItemsSetVisibleAndTextFalse();
                    JOptionPane.showMessageDialog(searchBookFrame, searchField.getText() + " borrowed!");
                }
                else {
                    resultSet = statement.executeQuery("select * from books");
                    while (resultSet.next()) {
                        if (searchField.getText().equals(resultSet.getString("name"))) {
                            author = resultSet.getString("author");
                            id = resultSet.getInt(1);
                            break;
                        }
                    }
                    statement.executeUpdate("insert into student_borrowed_books values('" + name + "', '" + searchField.getText() + "', '" + author +  "' ,'" + id + "')");
                    statement.executeUpdate("delete books where name = '" + searchField.getText() + "'");
                    searchBookFrameItemsSetVisibleAndTextFalse();
                    JOptionPane.showMessageDialog(searchBookFrame, searchField.getText() + " borrowed!");
                }
            } catch (java.sql.SQLIntegrityConstraintViolationException e) {
                JOptionPane.showMessageDialog(searchBookFrame, "Sorry! You have already borrowed a book! Borrow limit is 1 book per person.");
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void returnBtnActionPerformed(ActionEvent evt) {
        String [] arr_name = welcomeLabel.getText().split(" ");
        String designation = arr_name[1];
        System.out.println(designation);
        String username = arr_name[2];
        String author = "";
        Statement statement = createDBConnection();
        int id = 0;
        String book = "";
        ResultSet resultSet = null;
        assert resultSet != null;
        try {
            resultSet = statement.executeQuery("select * from " + designation + "_borrowed_books");
            while (resultSet.next()){
                if (username.equals(resultSet.getString("username"))) {
                    id = resultSet.getInt(4);
                    book = resultSet.getString("book");
                    author = resultSet.getString("author");
                    if (JOptionPane.showConfirmDialog(searchBookFrame,
                            "Are you sure you want to return " + book + "?", "Return book?",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){

//                        searchBookFrame.dispose();
                        statement.executeUpdate("insert into books values('" + id + "', '" + book + "', '" + author + "')");
                        statement.executeUpdate("delete from " + designation + "_borrowed_books where book = '" + book + "'");
                        JOptionPane.showMessageDialog(searchBookFrame, "Book returned!");
                    }
                    break;
                }
            }
            if (book.isBlank() || book.isEmpty()) {
                JOptionPane.showMessageDialog(searchBookFrame, "You have not borrowed any book yet!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void facultyBooksBorrowedButtonActionPerformed(ActionEvent evt) {
        Statement statement = createDBConnection();
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery("select * from faculty_borrowed_books");
            while(resultSet.next()) {
                JOptionPane.showMessageDialog(librarianFrame, "Books borrowed:\n" + resultSet.getString("username") + " : " + resultSet.getString("book") + "\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void studentBooksBorowedButtonActionPerformed(ActionEvent evt) {
        Statement statement = createDBConnection();
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery("select * from student_borrowed_books");
            while(resultSet.next()) {
                JOptionPane.showMessageDialog(librarianFrame, "Books borrowed:\n" + resultSet.getString("username") + " : " + resultSet.getString("book") + "\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void exitMenuItemActionPerformed(ActionEvent actionEvent) {
        Library library = new Library();
        if (JOptionPane.showConfirmDialog(searchBookFrame,
                "Are you sure you want to close this window?", "Close Window?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else {
            library.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }

    private void searchBookFrameItemsSetVisibleAndText() {
        availabilityLabel.setEnabled(true);
        yesOrNoDisplayLabel.setEnabled(true);
        yesOrNoDisplayLabel.setText("Yes");
        clickYesToBorrowLabel.setEnabled(true);
        yesRadioButton.setEnabled(true);
        noRadioButton.setEnabled(true);
    }

    private void  searchBookFrameItemsSetVisibleAndTextFalse() {
        availabilityLabel.setEnabled(false);
        yesOrNoDisplayLabel.setEnabled(false);
        yesOrNoDisplayLabel.setText("");
        clickYesToBorrowLabel.setEnabled(false);
        yesRadioButton.setEnabled(false);
        noRadioButton.setEnabled(false);
        searchField.setText("");
    }



    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */



        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //////////////////////////////JDBC PART//////////////////////////////////



        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Library library = new Library();
                library.setVisible(true);

                library.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                        if (JOptionPane.showConfirmDialog(library,
                                "Are you sure you want to close this window?", "Close Window?",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                            library.dispose();
                        }
                        else {
                            library.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                        }
                    }
                });
            }
        });
    }
    public Statement createDBConnection() {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection conn = DriverManager.getConnection(url, "system", "password");
            Statement statement = conn.createStatement();

            return statement;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Variables declaration - do not modify
    private javax.swing.JButton becomeMemberBtn;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JButton facLogBtn;
    private javax.swing.JTextArea facSignUpAddressArea;
    private javax.swing.JScrollPane facSignUpAddressScrollPane;
    private javax.swing.JButton facSignUpFrameBtn;
    private javax.swing.JLabel facSignUpFrameLabel;
    private javax.swing.JButton facultyBtn;
    private javax.swing.JFrame facultyLoginFrame;
    private javax.swing.JLabel facultyLoginLabel;
    private javax.swing.JPanel facultyLoginPanel;
    private javax.swing.JLabel facultyLoginPassLabel;
    private javax.swing.JPasswordField facultyLoginPassTextField;
    private javax.swing.JLabel facultySignUpAddressLabel;
    private javax.swing.JButton facultySignUpBtn;
    private javax.swing.JPasswordField facultySignUpConPassField;
    private javax.swing.JLabel facultySignUpConPassLabel;
    private javax.swing.JTextField facultySignUpEmailField;
    private javax.swing.JLabel facultySignUpEmailLabel;
    private javax.swing.JFrame facultySignUpFrame;
    private javax.swing.JTextField facultySignUpIDField;
    private javax.swing.JLabel facultySignUpIDLabel;
    private javax.swing.JTextField facultySignUpNameField;
    private javax.swing.JLabel facultySignUpNameLabel;
    private javax.swing.JPanel facultySignUpPanel;
    private javax.swing.JPasswordField facultySignUpPassField;
    private javax.swing.JLabel facultySignUpPassLabel;
    private javax.swing.JTextField facultySignUpUserNameField;
    private javax.swing.JLabel facultySignUpUserNameLabel;
    private javax.swing.JLabel facultyUserNameLabel;
    private javax.swing.JTextField facultyUserNameTextField;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel libLoginLabel;
    private javax.swing.JLabel libLoginPassLabel;
    private javax.swing.JPasswordField libLoginPassTextField;
    private javax.swing.JLabel libUserNameLabel;
    private javax.swing.JTextField libUserNameTextField;
    private javax.swing.JButton librarianBtn;
    private javax.swing.JFrame librarianLoginFrame;
    private javax.swing.JPanel librarianLoginPanel;
    private javax.swing.JButton linLogBtn;
    private javax.swing.JLabel loginLabel;

    private javax.swing.JFrame signUpFrame;
    private javax.swing.JLabel signUpFrameLabel;
    private javax.swing.JPanel signUpPanel;
    private javax.swing.JPanel startPanel;
    private javax.swing.JTextField stuBankDetailCardNameField;
    private javax.swing.JLabel stuBankDetailCardNameLabel;
    private javax.swing.JTextField stuBankDetailCardNoField;
    private javax.swing.JLabel stuBankDetailCardNoLabel;
    private javax.swing.JTextField stuBankDetailExpDateField;
    private javax.swing.JLabel stuBankDetailExpDateLabel;
    private javax.swing.JLabel stuBankDetailFrameLabel;
    private javax.swing.JButton stuBankDetailSubBtn;
    private javax.swing.JButton stuLogBtn;
    private javax.swing.JScrollPane stuSignUpAddScrollPane;
    private javax.swing.JTextArea stuSignUpAddressArea;
    private javax.swing.JLabel stuSignUpAddressLabel;
    private javax.swing.JFrame stuSignUpBankFrame;
    private javax.swing.JPanel stuSignUpBankPanel;
    private javax.swing.JPasswordField stuSignUpConPassField;
    private javax.swing.JLabel stuSignUpConPassLabel;
    private javax.swing.JTextField stuSignUpEmailField;
    private javax.swing.JLabel stuSignUpEmailLabel;
    private javax.swing.JButton stuSignUpFormBtn;
    private javax.swing.JLabel stuSignUpFormLabel;
    private javax.swing.JTextField stuSignUpIDField;
    private javax.swing.JLabel stuSignUpIDLabel;
    private javax.swing.JTextField stuSignUpNameField;
    private javax.swing.JLabel stuSignUpNameLabel;
    private javax.swing.JPasswordField stuSignUpPassField;
    private javax.swing.JLabel stuSignUpPassLabel;
    private javax.swing.JTextField stuSignUpUserNameField;
    private javax.swing.JLabel stuSignUpUserNameLabel;
    private javax.swing.JButton studentBtn;
    private javax.swing.JFrame studentLoginFrame;
    private javax.swing.JLabel studentLoginLabel;
    private javax.swing.JPanel studentLoginPanel;
    private javax.swing.JLabel studentLoginPassLabel;
    private javax.swing.JPasswordField studentLoginPassTextField;
    private javax.swing.JButton studentSignUpBtn;
    private javax.swing.JFrame studentSignUpFrame;
    private javax.swing.JPanel studentSignUpPanel;
    private javax.swing.JLabel studentUserNameLabel;
    private javax.swing.JTextField studentUserNameTextField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel stuBankFormIDLabel;
    private javax.swing.JTextField stuBankFormIDTextField;
    private javax.swing.JFrame searchBookFrame;
    private javax.swing.JPanel searchBookPanel;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton searchButton;
    private javax.swing.JRadioButton yesRadioButton;
    private javax.swing.JRadioButton noRadioButton;
    private javax.swing.JLabel availabilityLabel;
    private javax.swing.JLabel clickYesToBorrowLabel;
    private javax.swing.JLabel yesOrNoDisplayLabel;
    private javax.swing.JButton borrowYesOrNoSubmitBtn;
    private ButtonGroup borrowOrNotGroup;
    private javax.swing.JButton returnBtn;
    private javax.swing.JLabel copyrightsLabel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPanel librarianFramePanel;
    private javax.swing.JLabel librarianFrameBooksBorrowedLabel;
    private javax.swing.JButton facultyBooksBorrowedButton;
    private javax.swing.JButton studentBooksBorowedButton;
    private javax.swing.JFrame librarianFrame;
    // End of variables declaration
}

