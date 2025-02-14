import javax.swing.*;
import java.awt.*;

public class giriş {

    JFrame frame;
    JTextField kullanıcıadı;
    JTextField şifre;



    public giriş(){
        JPanel panelüst    = new JPanel();

        panelüst.setLayout(new FlowLayout(FlowLayout.RIGHT)   );
        JLabel labelğst = new JLabel("kullanıcı adı");
        labelğst.setFont(new Font("Arial", Font.PLAIN, 20));


        kullanıcıadı = new JTextField();
        kullanıcıadı.setPreferredSize(new Dimension(200,40));
        panelüst.add(labelğst);
        panelüst.add(kullanıcıadı);

        JPanel panelalt    = new JPanel();

        panelalt.setLayout(new FlowLayout(FlowLayout.RIGHT)   );
        JLabel labelalt = new JLabel(" şifre");
        labelalt.setFont(new Font("Arial", Font.PLAIN, 20));


        şifre = new JTextField();
        şifre.setPreferredSize(new Dimension(200,40));
        panelalt.add(labelalt);
        panelalt.add(şifre);



        frame= new JFrame("giriş");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        frame.setSize(500,400);
        frame.setLayout(new GridLayout(3,1));
        frame.add(panelüst);
        frame.add(panelalt);
        frame.setVisible(true);


    }}
