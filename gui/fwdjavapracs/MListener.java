import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ML extends JFrame implements MouseListener
{
Container c;
JTextArea txt1;
ML()
{
c=getContentPane();
txt1=new JTextArea(10,20);
c.add(txt1);
txt1.addMouseListener(this);
}
public void mousePressed(MouseEvent e){ txt1.append("MP \n"); }
public void mouseReleased(MouseEvent e){ txt1.append("MR \n"); }
public void mouseEntered(MouseEvent e){ txt1.append("MEn \n"); }
public void mouseExited(MouseEvent e){ txt1.append("MEx \n"); }
public void mouseClicked(MouseEvent e){ txt1.append("MC \n"); }

public static void main(String z[])
{
ML k=new ML();
k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
k.setBounds(700,300,300,200);
k.setTitle("Mouse Events");
k.setVisible(true);
}
}