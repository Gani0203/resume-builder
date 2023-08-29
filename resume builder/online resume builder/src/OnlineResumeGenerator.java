import javax.swing.*;
import java.awt.*;

public class OnlineResumeGenerator extends JFrame {

     JTextField nameField;
     JTextField emailField;
     JTextArea educationTextArea;
     JTextArea experienceTextArea;
     JButton generateButton;

    public OnlineResumeGenerator() {
        setTitle("Online Resume Generator");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        inputPanel.add(new JLabel("Full Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Email:"));
        emailField = new JTextField();
        inputPanel.add(emailField);

        inputPanel.add(new JLabel("Education:"));
        educationTextArea = new JTextArea(2, 20);
        inputPanel.add(new JScrollPane(educationTextArea));

        inputPanel.add(new JLabel("Experience:"));
        experienceTextArea = new JTextArea(4, 20);
        inputPanel.add(new JScrollPane(experienceTextArea));

        add(inputPanel, BorderLayout.CENTER);

        generateButton = new JButton("Generate Resume");
        generateButton.addActionListener(e -> generateResume());
        add(generateButton, BorderLayout.SOUTH);
    }

    private void generateResume() {
        String name = nameField.getText();
        String email = emailField.getText();
        String education = educationTextArea.getText();
        String experience = experienceTextArea.getText();

        String resumeText = "Resume\n\n"
                + "Name: " + name + "\n"
                + "Email: " + email + "\n\n"
                + "Education:\n" + education + "\n\n"
                + "Experience:\n" + experience;

        JOptionPane.showMessageDialog(this, new JTextArea(resumeText));
    }

    public static void main(String[] args) {
       
            OnlineResumeGenerator resumeGenerator = new OnlineResumeGenerator();
            resumeGenerator.setVisible(true);

    }
}
