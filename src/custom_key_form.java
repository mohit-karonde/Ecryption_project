import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class custom_key_form extends data_encryptionProject {
    private JTextField textField1;
    private JButton button1;
    private JPanel jpanel;


    public custom_key_form() {

        JFrame cufram = new JFrame();
        cufram.add(jpanel);
        cufram.setSize(300,300);
        cufram.setLocationRelativeTo(null);
        cufram.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                useCustomKey();
                cufram.setLocationRelativeTo(null);
                cufram.dispose();


            }
        });
    }

        private  void useCustomKey() {
            character = ' ';
            list.clear();
            shuffledList.clear();
            System.out.println("Enter old key or previously saved key");
            String message = textField1.getText();

            for (int i = 32; i < 127; i++) {

                list.add(Character.valueOf(character));

                character++;

            }

            for (int i = 0; i <= message.length() - 1; i++) {
                shuffledList.add(message.charAt(i));
            }
        }




}
