import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class change_password extends data_encryptionProject{
    private JTextField textField1;
    private JTextField textField2;
    private JButton submitButton;
    private JTextField textField3;
    private JPanel change;
    private JLabel oldusername;
    private JLabel oldpassword;
    private JButton backButton;







            public change_password(){
                    //frame.setVisible(false);

                    JFrame Cframe = new JFrame();

                    Cframe.add(change);
                    //  Cframe.setSize(400,350);
                    // Cframe.setResizable(false);

                    Cframe.pack();

                    Cframe.setLocationRelativeTo(null);

                    Cframe.setVisible(true);


                    backButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            Cframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                            Cframe.dispose();
                            new option_form();

                        }
                    });
                    submitButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            String username = textField1.getText();
                            String password = textField2.getText();
                            String new_password = textField3.getText();
                            String ch = "'";
                            new_password = ch+new_password+ch;





                                if (username.equals(usr) & password.equals(pass)) {
                                    System.out.println("correct user name and pass");
                                    //pass = newpassword;
                                   // System.out.println(newpassword);
                                  //  System.out.println(pass);
                                    try {


                                        Connection conn = getconnection();
                                        PreparedStatement select = conn.prepareStatement(" update  userandpass set password = "+new_password+"  where id='1';");
                                        select.executeUpdate();
                                        System.out.println("new password is  "+pass);

                                    }catch (Exception j){
                                        System.out.println(j);
                                    }




                                    System.out.println("new password is  "+pass);

                                    Cframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                                    Cframe.dispose();
                                    new mohit();
                                } else
                                    System.out.println("check username & password again");


                        }
                    });


            }

    public static Connection getconnection(){
        try {
            String driver="com.mysql.cj.jdbc.Driver";
            String datbaseurl="jdbc:mysql://localhost:3306/projects";
            String username  = "root";
            String password ="";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(datbaseurl,username,password);
            System.out.println("database connected");
            return conn;
        }
        catch (Exception e){
            System.out.println(e);
        }
        return  null;
    }


}


//}

