import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class text_Encryption  extends  data_encryptionProject{
    private JButton generateKeyButton;
    private JButton getKeyButton1;
    private JButton encryptionButton;
    private JButton decryptionButton;
    private JButton exitButton;
    private JPanel text_encryption;
    private JButton customKeyButton;


    text_Encryption() {
        scanner = new Scanner(System.in);

        random = new Random();

        list = new ArrayList();

        shuffledList = new ArrayList();

        character = ' ';

        JFrame tframe = new JFrame();
        tframe.add(text_encryption);
        tframe.setTitle("Text Encrypt");
        tframe.setSize(200, 300);
        //  tframe.pack();
        tframe.setLocationRelativeTo(null);
        tframe.setResizable(false);
        tframe.setVisible(true);




            generateKeyButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    newKey();
                    String message = "key is generated";
                    JOptionPane.showMessageDialog(null, message);


                }
            });
            getKeyButton1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //getKey();
                    if (getKey()=="")
                    {
                    JOptionPane.showMessageDialog(null, "Please generate key first");
                    }else{

                        JOptionPane.showMessageDialog(null, getKey());
                         String message = getKey();
                        StringSelection stringSelection = new StringSelection(message);
                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                        clipboard.setContents(stringSelection, null);
                        String  copiedmessage = "key is copied to clipboard";
                        JOptionPane.showMessageDialog(null, copiedmessage);


                        //JOptionPane.showMessageDialog(null, getKey(),"PopUp4", JOptionPane.CLOSED_OPTION);
                    }


                }
            });
            encryptionButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //tframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                    //tframe.dispose();
                    new encrypt_box();


                }
            });
            decryptionButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                   // tframe.dispose();
                    new dcryption_box();

                }

            });
            exitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                    tframe.dispose();
                    new option_form();

                }
            });

        customKeyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new custom_key_form();


            }
        });
    };





    private void newKey() {


        character = ' ';

      //  list.clear();

       // shuffledList.clear();


        for (int i = 32; i < 127; i++) {

            list.add(Character.valueOf(character));

            character++;

        }


        shuffledList = new ArrayList(list);

        Collections.shuffle(shuffledList);

        System.out.println("*A new key has been generated*");


    }

//    private  void useCustomKey() {
//        character = ' ';
//        list.clear();
//        shuffledList.clear();
//        System.out.println("Enter old key or previously saved key");
//        String message = scanner.nextLine();
//        System.out.println(message);
//
//        for (int i = 32; i < 127; i++) {
//
//            list.add(Character.valueOf(character));
//
//            character++;
//
//        }
//
//        for (int i = 0; i <= message.length() - 1; i++) {
//            shuffledList.add(message.charAt(i));
//        }
//    }


        private String getKey() {

        System.out.println("Key: ");

        for (Character x : list) {

            System.out.print(x);

        }

        System.out.println("");
        str="";

          for (Character x : shuffledList) {


                System.out.print(x);
                str=str+x;


        }

        //System.out.println();

          return str;



    }

//    public String encrypt() {
//        new encrypt_box();
//
//
//      //  System.out.println("Enter a message to be encrypted: ");
//
//        //String message = scanner.nextLine();
//
//
//       // letters = message.toCharArray();
//        letters=input.toCharArray();
//
//
//        for (int i = 0; i < letters.length; i++) {
//
//
//            for (int j = 0; j < list.size(); j++) {
//
//                if (letters[i] == list.get(j)) {
//
//                    letters[i] = shuffledList.get(j);
//
//                    break;
//
//                }
//
//            }
//
//        }
//
//        System.out.println("Encrypted: ");
//
//        for (char x : letters) {
//            rtr=rtr+x;
//
//            System.out.print(x);
//
//
//        }
//        System.out.println();
//
//        return rtr;
//
//
//
//    }

//    private void decrypt() {
//
//        System.out.println("Enter a message to be decrypted: ");
//
//        String message = scanner.nextLine();
//
//
//        letters = message.toCharArray();
//
//
//        for (int i = 0; i < letters.length; i++) {
//
//
//            for (int j = 0; j < shuffledList.size(); j++) {
//
//                if (letters[i] == shuffledList.get(j)) {
//
//                    letters[i] = list.get(j);
//
//                    break;
//
//                }
//
//            }
//
//        }
//
//        System.out.println("Decrypted: ");
//
//        for (char x : letters) {
//
//            System.out.print(x);
//
//        }
//
//        System.out.println();
//
//    }

    private void quit() {

        System.out.println("Thank you, have a nice day bro!");

        System.exit(0);

    }


}
