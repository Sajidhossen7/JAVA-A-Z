import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class TeacherDashboardFrame extends JFrame {
    private JPanel teacherPanel;
    private JButton createQuizButton, assignPasswordButton, logoutButton;

    public TeacherDashboardFrame() {
        super("Teacher Dashboard");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        teacherPanel = new JPanel();
        teacherPanel.setLayout(null);

        // Button to create a quiz (linking to Google Form)
        createQuizButton = new JButton("Create Quiz via Google Forms");
        createQuizButton.setBounds(150, 100, 300, 40);
        teacherPanel.add(createQuizButton);

        // Button to assign passwords to students
        assignPasswordButton = new JButton("Assign Password to Student");
        assignPasswordButton.setBounds(150, 160, 300, 40);
        teacherPanel.add(assignPasswordButton);

        // Logout Button
        logoutButton = new JButton("Logout");
        logoutButton.setBounds(250, 240, 100, 30);
        teacherPanel.add(logoutButton);

        // Google Forms quiz creation (can simply open Google Forms in browser)
        createQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Please visit Google Forms to create a quiz.");
                // Optionally, open Google Forms in browser
                // Desktop.getDesktop().browse(new URI("https://forms.google.com"));
            }
        });

        // Assign password to student
        assignPasswordButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String studentUsername = JOptionPane.showInputDialog("Enter Student Username:");
                String studentPassword = JOptionPane.showInputDialog("Enter New Password:");
                // In a real application, this would update a database
                if (studentUsername != null && studentPassword != null) {
                    JOptionPane.showMessageDialog(null, "Password assigned successfully!");
                }
            }
        });

        // Logout
        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new LoginFrame();
                dispose();
            }
        });

        this.add(teacherPanel);
        this.setVisible(true);
    }
}
