import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.pack();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridBagLayout());
        frame.add(panel);
        JLabel conForm = new JLabel("Contact Form");
        panel.add(conForm);
        JLabel firstNameLabel = new JLabel("First Name");
        panel.add(firstNameLabel);
        JTextField firstNameText = new JTextField("First Name...");
        panel.add(firstNameText);
        JLabel surnameLabel = new JLabel("Surname");
        panel.add(surnameLabel);
        JTextField surnameText = new JTextField("Surname...");
        panel.add(surnameText);
        JLabel emailLabel = new JLabel("Email");
        panel.add(emailLabel);
        JTextField emailText = new JTextField("Email...");
        panel.add(emailText);
        frame.setVisible(true);
    }
}
