import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Option_page {
    private JButton imageEncryptionButton;
    private JPanel panel1;
    private JButton textEncryptionButton;


    Option_page(){
        JFrame Oframe = new JFrame();
        Oframe.setSize(200,300);
        Oframe.setResizable(false);
        Oframe.add(panel1);
        Oframe.setVisible(true);
        Oframe.setLocationRelativeTo(null);




        imageEncryptionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Oframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                Oframe.dispose();
                new incryption_project();

            }
        });
    }
}

