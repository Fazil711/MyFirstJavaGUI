import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI extends Frame implements ActionListener{
    JTextField t1;
    JButton b;
    JLabel l;
    GUI(){
        t1 = new JTextField();
        b = new JButton("Find IP");
        l = new JLabel();
        t1.setBounds(50,50, 150,20);
        b.setBounds(50, 150, 95, 30);
        l.setBounds(50, 100, 350, 20);
        b.addActionListener(this);
        add(b);add(l);add(t1);
        setSize(400, 250);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        try{
            String host=t1.getText();
            String ip=java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of "+host+" is: "+ip);
        }catch(Exception ex){System.out.println(ex);}
    }
    public static void main(String[] args){
        new GUI();
    }

}
