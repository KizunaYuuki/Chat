

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class App {

    public App() {
        JFrame jFrame = new JFrame("Chit Chat");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);

        // Create components
        JPanel jPanel = new JPanel();

        JTextArea jTextArea = new JTextArea(30,30);

        JTextField jTextField = new JTextField(25);
        jTextField.setText("Field");
        jTextField.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton jButtonOkay = new JButton("OKay");
        jButtonOkay.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // PlaceHolder

        // Add components
        jFrame.add(jPanel);
        jPanel.add(jTextField);
        jPanel.add(jButtonOkay);
        jPanel.add(jTextArea);

        jFrame.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        App app = new App();
        System.out.println("Hello, World!");
        app.toString();
        
    }
}
