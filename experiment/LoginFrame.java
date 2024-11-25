import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class LoginFrame extends JFrame {
    private JPanel loginPanel;
    private JLabel usernameLabel, passwordLabel, roleLabel, titleLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JComboBox<String> roleComboBox;
    private JButton loginButton, exitButton;

    // Sample data for student and teacher accounts
    private HashMap<String, String> studentAccounts = new HashMap<>();
    private HashMap<String, String> teacherAccounts = new HashMap<>();

    public LoginFrame() {
        super("Online Quiz - Login");
        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Adding sample accounts
        teacherAccounts.put("teacher1", "teacherpass");
        studentAccounts.put("student1", "studentpass");
        
        loginPanel = new JPanel();
        loginPanel.setLayout(null);

        // Title Label
        titleLabel = new JLabel("Welcome to Online Quiz");
        titleLabel.setBounds(200, 20, 200, 30);
        loginPanel.add(titleLabel);

        // Username Label and TextField
        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(100, 80, 100, 30);
        loginPanel.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(200, 80, 200, 30);
        loginPanel.add(usernameField);

        // Password Label and PasswordField
        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(100, 120, 100, 30);
        loginPanel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(200, 120, 200, 30);
        loginPanel.add(passwordField);

        // Role Label and ComboBox
        roleLabel = new JLabel("Role:");
        roleLabel.setBounds(100, 160, 100, 30);
        loginPanel.add(roleLabel);

        roleComboBox = new JComboBox<>(new String[] { "Student", "Teacher" });
        roleComboBox.setBounds(200, 160, 200, 30);
        loginPanel.add(roleComboBox);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.setBounds(200, 210, 100, 30);
        loginPanel.add(loginButton);

        // Exit Button
        exitButton = new JButton("Exit");
        exitButton.setBounds(310, 210, 100, 30);
        loginPanel.add(exitButton);

        // Login ActionListener
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String role = roleComboBox.getSelectedItem().toString();

                if (role.equals("Teacher") && teacherAccounts.containsKey(username) && teacherAccounts.get(username).equals(password)) {
                    // Open teacher dashboard
                    new TeacherDashboardFrame();
                    dispose();
                } else if (role.equals("Student") && studentAccounts.containsKey(username) && studentAccounts.get(username).equals(password)) {
                    // Open student dashboard
                    new StudentDashboardFrame();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials for " + role);
                }
            }
        });

        // Exit ActionListener
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        this.add(loginPanel);
    }

    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
    }
}
