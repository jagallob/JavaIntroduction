import javax.swing.*;
import java.awt.event.*;

public class VentanaBoton extends JFrame implements ActionListener {

    JButton boton1;

    public VentanaBoton() {

        setLayout(null);

        setBounds(0,0,450,350);
        setTitle("Ejemplo: Botón1");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        boton1=new JButton("Finalizar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new VentanaBoton();
    }
}
