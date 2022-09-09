import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class option_form {
    private JPanel opanel;
    private JButton imageEncryptionButton;
    private JButton textEncryptionButton;
    private JButton changePasswordButton;
    private JButton backButton;


    public option_form(){
        JFrame oframe = new JFrame();
        oframe.setSize(350,400);
        oframe.setResizable(false);
       //
        oframe.add(opanel);
        oframe.setVisible(true);
       // oframe.pack();
        oframe.setLocationRelativeTo(null);



        imageEncryptionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                oframe.dispose();
                new incryption_project();

            }
        });
        changePasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                oframe.dispose();
                new change_password();

            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                oframe.dispose();
                new mohit();

            }
        });
        textEncryptionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                oframe.dispose();
                new text_Encryption();

            }
        });
    }
}
