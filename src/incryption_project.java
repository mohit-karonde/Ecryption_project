import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class incryption_project {

    public static void operate(int key)
    {

        JFileChooser fileChooser=new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file=fileChooser.getSelectedFile();
        //file FileInputStream
        try
        {

            FileInputStream fis=new FileInputStream(file);

            byte []data=new byte[fis.available()];
            fis.read(data);
            int i=0;
            for(byte b:data)
            {
                System.out.println(b);
                data[i]=(byte)(b^key);
                i++;
            }

            FileOutputStream fos=new FileOutputStream(file);
            fos.write(data);
            fos.close();
            fis.close();
            JOptionPane.showMessageDialog(null, "Done");

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public incryption_project(){

        System.out.println("this is testing");

        JFrame f=new JFrame();
        f.setTitle("Image Operation");
        f.setSize(500,400);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font=new Font("Roboto",Font.BOLD,25);
        //creating button
        JButton button=new JButton();
        button.setText("Open Image");
        button.setFont(font);

        //creating second button
        JButton button2 = new JButton();
        button2.setText("back");
        button2.setFont(font);
        Dimension size = button2.getPreferredSize();
        button2.setBounds(100, 180, size.width, size.height);


        //creating text field

        JTextField textField=new JTextField(10);
        textField.setFont(font);


        button.addActionListener(e->{
            System.out.println("button clicked");
            String text=textField.getText();
            int temp=Integer.parseInt(text);
            operate(temp);
        });

        button2.addActionListener(e->{
            f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            f.dispose();
            new option_form();
        });

        f.setLayout(new FlowLayout());

        f.add(button);
        f.add(textField);
        f.setVisible(true);
        f.add(button2);

    }
}


