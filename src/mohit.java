import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class mohit  extends  data_encryptionProject{
    private JPanel login;
    private JTextField username;
    private JButton submitButton;
    private JTextField password;
    private JPanel imagePanel;
    private JFrame frame;
   // public static  String usernamed = "mohit";
    //public static String passwordd ="mohi1";






    public mohit() {
        getconnection();

        JFrame frame =new JFrame();
       // frame = new JFrame("login page");
        // frame =new JFrame("login page");
        frame.setTitle("login page");
        frame.setSize(400, 400);
        frame.setResizable(false);
        frame.setVisible(true);
        //frame.setTitle("login page");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        frame.add(login);
        frame.pack();
        frame.setLocationRelativeTo(null);

       // BufferedImage myPicture = ImageIO.read(new File("logo.png"));
      //  JLabel picLabel = new JLabel(new ImageIcon(myPicture));
       // JLabel imgLabel = new JLabel(new ImageIcon("logo.png"));
        //imagePanel.add(imgLabel);

     //   imagePanel.setVisible(true);
       // imagePanel.setSize(400,300);
        
        submitButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String usernam = username.getText();
                String passwor = password.getText();
                try {
                    Connection conn = getconnection();

                    PreparedStatement select = conn.prepareStatement(" SELECT * FROM userandpass;");
                    ResultSet result = select.executeQuery();

                      // String usr = result.getString("username");
                      //String pass = result.getString("password");


                    while (result.next()) {
                        //System.out.println(result.getString("username"));
                      //  System.out.println(result.getString("password"));
                        // System.out.println(usr);
                        //System.out.println(pass);
                          usr = result.getString("username");
                         pass = result.getString("password");
                        System.out.println(usr+"  its inside the while loop");
                        System.out.println(pass+" its inside the while loop");


                    }

                        if (usernam.equals(usr) && passwor.equals(pass)) {
                            System.out.println(usr);
                            System.out.println(pass);


                            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                            frame.dispose();
                            new option_form();


                            } else {
                            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                            frame.dispose();
                            new wrong_password();
                            // System.out.println("wrong password");
                            }
                }catch(Exception g){
                System.out.println(g);
                }
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
