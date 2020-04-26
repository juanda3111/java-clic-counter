import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int cuenta = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI(){
        frame = new JFrame();
        JButton button = new JButton("No se te ocurra dar clic pinche culero");
        button.addActionListener(this);
        label = new JLabel("numero de veces que este culero no hizo caso");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(label);
        panel.add(button);


        // crea el recuadro exterior
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Mi interfaz chingona :v");
        frame.pack();
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        new GUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cuenta++;

        label.setText("numero de veces que este culero no hizo caso " + cuenta);
    }
}
