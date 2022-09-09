import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class wrong_password {
    private JTextField message;
    private JPanel panel1;
    private JButton clickToRetryButton;
    private JButton exitButton;

    public wrong_password() {
        JFrame wframe = new JFrame();
        wframe.setSize(300,200);
        wframe.setResizable(false);
        wframe.setVisible(true);
     //   wframe.pack();
        wframe.setLocationRelativeTo(null);



        wframe.add(panel1);


        clickToRetryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wframe.setDefaultCloseOperation(wframe.HIDE_ON_CLOSE);
                wframe.dispose();
                new mohit();

            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wframe.setDefaultCloseOperation(wframe.EXIT_ON_CLOSE);

            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wframe.setDefaultCloseOperation(wframe.HIDE_ON_CLOSE);
                wframe.dispose();
            }
        });
    }

}