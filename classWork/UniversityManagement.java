
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class UniversityManagement extends logC {
    JFrame f1;
    JPanel p1;
    JLabel l1, l2, l3, l4, l6, l7;
    JTextField tf1;
    JPasswordField pf1;
    JButton b1, b2, b3, b4;
    JRadioButton r1, r2;
    ButtonGroup bg1;
    int userType = 0; // 1 for Teacher, 2 for Student

    UniversityManagement(String textField1, String textField2) {
        super(textField1, textField2);

        f1 = new JFrame();
        f1.setUndecorated(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setBounds(0, 0, 1366, 768);
        p1.setBackground(new Color(25, 118, 211));

        l1 = new JLabel("University Management System");
        l1.setBounds(950, 120, 400, 60);
        l1.setForeground(Color.white);
        l1.setFont(new Font("Segoe UI", Font.BOLD, 30));

        l2 = new JLabel("User Name");
        l2.setBounds(850, 280, 300, 40);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        l3 = new JLabel("Password");
        l3.setBounds(850, 380, 150, 40);
        l3.setForeground(Color.white);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 20));

        l6 = new JLabel("________________________________________________________");
        l6.setBounds(850, 330, 400, 40);
        l6.setForeground(Color.white);
        l6.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        l7 = new JLabel("________________________________________________________");
        l7.setBounds(850, 430, 400, 40);
        l7.setForeground(Color.white);
        l7.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        tf1 = new JTextField();
        tf1.setBounds(855, 320, 380, 30);
        tf1.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        tf1.setForeground(Color.white);
        tf1.setCaretColor(Color.white);
        tf1.setBorder(null);
        tf1.setOpaque(false);

        pf1 = new JPasswordField();
        pf1.setBounds(855, 420, 380, 30);
        pf1.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        pf1.setForeground(Color.white);
        pf1.setCaretColor(Color.white);
        pf1.setBorder(null);
        pf1.setOpaque(false);

        b1 = new JButton("X");
        b1.setBounds(1320, 4, 30, 40);
        b1.setForeground(Color.white);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);

        b2 = new JButton("Login");
        b2.setBounds(850, 550, 400, 40);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b2.setForeground(new Color(25, 118, 211));
        b2.setBackground(new Color(255, 255, 255));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setFocusPainted(false);

        r1 = new JRadioButton("Teacher Login");
        r1.setBounds(920, 240, 150, 20);
        r1.setFont(new Font("Segoe UI", Font.BOLD, 15));
        r1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        r1.setForeground(Color.white);
        r1.setBorderPainted(false);
        r1.setContentAreaFilled(false);
        r1.setFocusPainted(false);

        r2 = new JRadioButton("Student Login");
        r2.setBounds(1075, 240, 150, 20);
        r2.setFont(new Font("Segoe UI", Font.BOLD, 15));
        r2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        r2.setForeground(Color.white);
        r2.setBorderPainted(false);
        r2.setContentAreaFilled(false);
        r2.setFocusPainted(false);

        bg1 = new ButtonGroup();
        bg1.add(r1);
        bg1.add(r2);

        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l6);
        f1.add(l7);
        f1.add(tf1);
        f1.add(pf1);
        f1.add(b1);
        f1.add(b2);
        f1.add(r1);
        f1.add(r2);
        f1.add(p1);

        f1.setSize(1366, 768);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setResizable(false);

        b1.addActionListener(e -> f1.setVisible(false));

        b2.addActionListener(ae -> {
            String username = tf1.getText().toLowerCase(); // Username
            String password = pf1.getText(); // Password
            if (userType == 1) { // Teacher Login
                if (!username.isEmpty() && !password.isEmpty()) {
                    matchTeacher(username, password);
                    if (s == 1) {
                        f1.setVisible(false);
                        new TeacherDashboard(); // Assuming you have a TeacherDashboard class
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Fill the blank fields", "Message", -1);
                }
            } else if (userType == 2) { // Student Login
                if (!username.isEmpty() && !password.isEmpty()) {
                    matchStudent(username, password);
                    if (s == 2) {
                        f1.setVisible(false);
                        new StudentDashboard(); // Assuming you have a StudentDashboard class
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Fill all fields", "Message", -1);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Choose User Type", "Message", -1);
            }
        });

        r1.addActionListener(e -> userType = 1); // Teacher
        r2.addActionListener(e -> userType = 2); // Student
    }

    public static void main(String[] args) {
        new UniversityManagement("", "");
    }
}

