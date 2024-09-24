import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ActionEventExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("ActionEvent example");

        JButton button = new JButton("Haz clic aquí");

        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Botón clickeado");
        });

        frame.add(button);

        frame.setSize(500, 300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }
}
