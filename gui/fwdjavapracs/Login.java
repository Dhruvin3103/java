import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Login extends JFrame implements ActionListener
{
Container c;
JTextField t1,t2,t3;
JButton b;
JLabel l1;
JRadioButton r,r1;
Choice c1;
Login()
{
    c= getContentPane();
    c.setLayout(new FlowLayout());
    t1 = new JTextField(10);
    t2 = new JTextField(10);
    t3 = new JTextField(10);
    b  = new JButton("Submit");
    l1 = new JLabel("Hello");
    r  = new JRadioButton("Age");
    r1 = new JRadioButton("marks");
    c1 = new Choice();
    c1.add("Easy");c1.add("Normal");c1.add("Hard");
    l1.setBounds(40,40,40,40);
    c.add(b);c.add(t1);c.add(t2);c.add(t3);add(l1);
    c.add(r);c.add(r1);c.add(c1);
    
    b.addActionListener(this);
}

public static void main(String args[])
{
    Login l = new Login();
    l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    l.setBounds(200,200,500,200);
    l.setVisible(true);
    l.setResizable(false);
    l.setTitle("Login");
}

@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    String s = t1.getText();
    String s1 = t2.getText();
    int s3 = Integer.parseInt(t3.getText());
    if(r.isSelected())
    {l1.setText(s+" "+s1+" is "+s3+" years Old");}
    else if(r1.isSelected())
    {l1.setText(s+" "+s1+" score  "+s3+"!!!");}
    else if(c1.getItem(c1.getSelectedIndex())=="Easy")
    {l1.setText("Easyyyyyyyyyyyyyyyyyyyyyy");}
    else if(c1.getItem(c1.getSelectedIndex())=="Normal")
    {l1.setText("Noramlllllllllllllll");}
    else if(c1.getItem(c1.getSelectedIndex())=="Hard")
    {l1.setText("Harddddddddd");}

    
}
}