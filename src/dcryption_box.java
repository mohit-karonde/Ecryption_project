import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dcryption_box extends data_encryptionProject{

    private JButton submit1;
    private JPanel panel1;

    private JButton back1;
    private JTextField textField1;


    dcryption_box (){

        JFrame iframe = new JFrame();
        iframe.setTitle("decryption window");
        iframe.setLocationRelativeTo(null);
        iframe.setResizable(false);
        iframe.setSize(250,400);


        iframe.add(panel1);
        iframe.setVisible(true);


        submit1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  message = textField1.getText();
                System.out.println(message);

                String print = decrypt();
                Object[] options = {"exit with copied text",
                        "exit"};
                int n = JOptionPane.showOptionDialog(null,
                        print,
                        "Decryption tool",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,     //do not use a custom Icon
                        options,  //the titles of buttons
                        options[0]); //default button title

              //  JOptionPane.showMessageDialog(null, print);

                if(n ==JOptionPane.YES_OPTION){
                //String myString = "This text will be copied into clipboard";
                StringSelection stringSelection = new StringSelection(print);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
                String  copiedmessag = "Decrypted message is copied to clipboard";
                JOptionPane.showMessageDialog(null, copiedmessag);
                }else {

                }


                iframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                iframe.dispose();


                new dcryption_box();


            }

        });

        back1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                iframe.dispose();
                new text_Encryption();

            }
        });
    }
    public String decrypt() {



        letters = message.toCharArray();


        for (int i = 0; i < letters.length; i++) {


            for (int j = 0; j < shuffledList.size(); j++) {

                if (letters[i] == shuffledList.get(j)) {

                    letters[i] = list.get(j);

                    break;

                }

            }

        }

        System.out.println("Decrypted: ");
        retu=" ";

        for (char x : letters) {
             retu=retu+x;

            System.out.print(x);

        }

        System.out.println();
        return retu;

    }
}
