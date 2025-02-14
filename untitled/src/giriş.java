import javax.swing.*;
import java.awt.*;

public class giriş {

    JFrame frame;
    JTextField kullanıcıadı;


    public giriş(){
        JPanel panelüst    = new JPanel();

        panelüst.setLayout(new FlowLayout()   );
        JLabel labelğst = new JLabel("kullanıcı adı");
        labelğst.setFont(new Font("Arial", Font.PLAIN, 20));


        kullanıcıadı = new JTextField();
        kullanıcıadı.setPreferredSize(new Dimension(200,40));
        panelüst.add(labelğst);
        panelüst.add(kullanıcıadı);

        frame= new JFrame("giriş");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        frame.setSize(400,300);
        frame.setLayout(new GridLayout(3,1));
        frame.add(panelüst);
        frame.setVisible(true);


    }}
