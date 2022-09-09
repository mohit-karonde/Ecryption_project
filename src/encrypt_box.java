import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class encrypt_box extends data_encryptionProject{
    private JButton button1;
    private JPanel encryption_window;
    private JTextField textField1;
    private JButton backButton;
  //  static  JDialog j;


    encrypt_box() {
        JFrame eframe = new JFrame();
        eframe.setTitle("encryption window");
        eframe.setLocationRelativeTo(null);
        eframe.pack();
        eframe.setSize(200, 400);
        eframe.setResizable(false);
        eframe.add(encryption_window);
        eframe.setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input = textField1.getText();
                System.out.println(input);
                String mess = encrypt();
                if (mess.length() - 1 > 0) {

                    JOptionPane.showMessageDialog(null, mess);

                    //String myString = "This text will be copied into clipboard";
                    StringSelection stringSelection = new StringSelection(mess);
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    clipboard.setContents(stringSelection, null);
                    String  copiedmessage = "Encrypted message is copied to clipboard";
                    JOptionPane.showMessageDialog(null, copiedmessage);

                } else {
                    System.out.println(mess + "     no value");

                }
                eframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                eframe.dispose();
                new encrypt_box();

            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                eframe.dispose();
                new text_Encryption();

            }
        });

    }




    public String encrypt() {
         //   new encrypt_box();


            //  System.out.println("Enter a message to be encrypted: ");

            //String message = scanner.nextLine();


            // letters = message.toCharArray();
            letters=input.toCharArray();
            //letters1=input.toCharArray();


            for (int i = 0; i < letters.length; i++) {


                for (int j = 0; j < list.size(); j++) {

                    if (letters[i] == list.get(j)) {

                        letters[i] = shuffledList.get(j);

                        break;

                    }

                }

            }

            System.out.println("Encrypted: ");

            rtr="";
            for (char x : letters) {
                rtr=rtr+x;

                System.out.print(x);


            }
            System.out.println();

            return rtr;
    }


}
