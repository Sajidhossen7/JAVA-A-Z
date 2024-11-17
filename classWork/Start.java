import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Start {
    JFrame startFrame;
    JLabel welcomeLabel;
    JButton teacherLoginButton, studentLoginButton;

    Start() {
        // Create the frame
        startFrame = new JFrame("University Management System");

        // Create the welcome label
        welcomeLabel = new JLabel("Welcome to University Management System");
        welcomeLabel.setFont(new Font("Segoe UI", Font.BOLD, 30));
        welcomeLabel.setBounds(300, 50, 800, 50);
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Create buttons for teacher and student login
        teacherLoginButton = new JButton("Teacher Login");
        teacherLoginButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
        teacherLoginButton.setBounds(400, 150, 300, 50);
        teacherLoginButton.setBackground(new Color(25, 118, 211));
        teacherLoginButton.setForeground(Color.white);
        teacherLoginButton.setFocusPainted(false);

        studentLoginButton = new JButton("Student Login");
        studentLoginButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
        studentLoginButton.setBounds(400, 250, 300, 50);
        studentLoginButton.setBackground(new Color(25, 118, 211));
        studentLoginButton.setForeground(Color.white);
        studentLoginButton.setFocusPainted(false);

        // Add action listeners for buttons
        teacherLoginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startFrame.setVisible(false);
                new UniversityManagement("", "").r1.setSelected(true); // Select teacher login
            }
        });

        studentLoginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startFrame.setVisible(false);
                new UniversityManagement("", "").r2.setSelected(true); // Select student login
            }
        });

        // Adding components to the frame
        startFrame.add(welcomeLabel);
        startFrame.add(teacherLoginButton);
        startFrame.add(studentLoginButton);

        // Frame settings
        startFrame.setSize(1200, 600);
        startFrame.setLayout(null);
        startFrame.setLocationRelativeTo(null);
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new Start();
    }
}
