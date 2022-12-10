import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class SqFinder extends JFrame implements ActionListener
{
Container c;
JTextField txt1;
JButton btn1;
JLabel lbl1,lbl2;
SqFinder()
{
c=getContentPane();
c.setLayout(new FlowLayout());
lbl1=new JLabel("Enter a Number");
txt1=new JTextField(10);
btn1=new JButton("Answer");
lbl2=new JLabel();

c.add(lbl1);
c.add(txt1);
c.add(btn1);
c.add(lbl2);
btn1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
int a=Integer.parseInt(txt1.getText());
float s=a*a;
lbl2.setText("Square = "+s);
}
public static void main(String z[])
{
SqFinder s=new SqFinder();
s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
s.setBounds(200,200,250,150);
s.setVisible(true);
s.setTitle("SquareFinder");
}
}
