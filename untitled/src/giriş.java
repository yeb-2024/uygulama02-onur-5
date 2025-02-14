import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class giriş implements ActionListener {

    JFrame frame;
    JTextField kullanıcıadı;
    JTextField sıfre;
    JButton girişbutonu;



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

        girişbutonu = new JButton("Giriş");
        girişbutonu.setFont(new Font("Arial", Font.PLAIN, 20));
        girişbutonu.addActionListener(this);




        frame= new JFrame("giriş");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        frame.setSize(500,400);
        frame.setLayout(new GridLayout(3,1));
        frame.add(pabelust);
        frame.add(panelalt);
        frame.add(girişbutonu);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == girişbutonu){
            String kullanıcıadı = this.kullanıcıadı.getText().trim();
            String sifre = this.sıfre.getText().trim();

           if (kullanıcıadı.isEmpty() || sifre.isEmpty()){
               JOptionPane.showMessageDialog(null, "Lütfen boş alan bırakmayın!"  + JOptionPane.ERROR_MESSAGE);
           }
            if(sifre.length() < 5){
                JOptionPane.showMessageDialog(null, "minimum 5 karakter !"  + JOptionPane.ERROR_MESSAGE);

            }
            else if(kullanıcıadı.equals("onur" )&& sifre.equals("12345")){
                JOptionPane.showMessageDialog(null, "Başarılı giriş!"  + JOptionPane.INFORMATION_MESSAGE);



            }
            else {
                JOptionPane.showMessageDialog(null, "Kullanıcı adı veya şifre yanlış!"  + JOptionPane.ERROR_MESSAGE);

            }

        }

    }
}
