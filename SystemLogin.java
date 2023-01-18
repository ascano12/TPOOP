import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class SystemLogin extends JFrame implements ActionListener {
    private JLabel userLabel, passLabel;
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton, signupButton;
    private HashMap<String, String> users;

    public SystemLogin() {
        setTitle("patient");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        userLabel = new JLabel("Username:");
        add(userLabel);

        userField = new JTextField(15);
        add(userField);

        passLabel = new JLabel("Password:");
        add(passLabel);

        passField = new JPasswordField(15);
        add(passField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        add(loginButton);

        signupButton = new JButton("Sign up");
        signupButton.addActionListener(this);
        add(signupButton);

        users = new HashMap<>();
        users.put("admin", "123"); // default username and password

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = userField.getText();
        String password = new String(passField.getPassword());

        if (e.getSource() == loginButton) {
            if (users.containsKey(username) && users.get(username).equals(password)) {
            	
                JOptionPane.showMessageDialog(this, "Welcome, " + username + "!");
                 new patient ().setVisible(true); // Show the FastFoodSystemCabarles window
           
                dispose(); // Close the LoginSystem window
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.");
            }
        }
      
    }
    public static void main(String[] args) {
        new SystemLogin ();
    }
}