import javax.swing.*;
import java.awt.event.*;

public class StudentDashboardFrame extends JFrame {
    private JPanel studentPanel;
    private JButton startQuizButton, logoutButton;

    public StudentDashboardFrame() {
        super("Student Dashboard");
        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        studentPanel = new JPanel();
        studentPanel.setLayout(null);

        // Button to start quiz
        startQuizButton = new JButton("Start Quiz");
        startQuizButton.setBounds(200, 100, 200, 40);
        studentPanel.add(startQuizButton);

        // Logout Button
        logoutButton = new JButton("Logout");
        logoutButton.setBounds(250, 180, 100, 30);
        studentPanel.add(logoutButton);

        // Start Quiz (Google Forms link)
        startQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Please open the quiz via Google Forms.");
                // Optionally, open the quiz in the browser
                // Desktop.getDesktop().browse(new URI("https://forms.google.com"));
            }
        });

        // Logout
        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new LoginFrame();
                dispose();
            }
        });

        this.add(studentPanel);
        this.setVisible(true);
    }
}
