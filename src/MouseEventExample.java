import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MouseEventExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("MouseEvent example");

        JLabel label = new JLabel("Haz click con el botón derecho");

        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if (e.getButton()==MouseEvent.BUTTON3){

                    JOptionPane.showMessageDialog(frame, "Botón derecho clickeado");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {


            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        frame.add(label);

        frame.setSize(400, 200 );

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }
}
