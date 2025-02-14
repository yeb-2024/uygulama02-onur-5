import javax.swing.*;
import java.awt.*;

public class giriş {

    JFrame frame;
    JTextField kullanıcıadı;
    JTextField sıfre;



    public giriş(){
        JPanel pabelust    = new JPanel();

        pabelust.setLayout(new FlowLayout(FlowLayout.RIGHT)   );
        JLabel labelust = new JLabel("kullanıcı adı");
        labelust.setFont(new Font("Arial", Font.PLAIN, 20));


        kullanıcıadı = new JTextField();
        kullanıcıadı.setPreferredSize(new Dimension(200,40));
        pabelust.add(labelust);
        pabelust.add(kullanıcıadı);

        JPanel panelalt    = new JPanel();

        panelalt.setLayout(new FlowLayout(FlowLayout.RIGHT)   );
        JLabel labelalt = new JLabel(" şifre");
        labelalt.setFont(new Font("Arial", Font.PLAIN, 20));


        sıfre = new JTextField();
        sıfre.setPreferredSize(new Dimension(200,40));
        panelalt.add(labelalt);
        panelalt.add(sıfre);



        frame= new JFrame("giriş");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        frame.setSize(500,400);
        frame.setLayout(new GridLayout(3,1));
        frame.add(pabelust);
        frame.add(panelalt);
        frame.setVisible(true);


    }}
