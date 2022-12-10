import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class WL extends JFrame implements WindowListener
{
Container c;
JTextArea txt1;
WL()
{
c=getContentPane();
txt1=new JTextArea(10,20);
c.add(txt1);
addWindowListener(this);
}
public void windowActivated(WindowEvent e){ txt1.append("WA \n"); }
public void windowClosed(WindowEvent e){ txt1.append("WCD \n"); }
public void windowClosing(WindowEvent e){ txt1.append("WCG \n"); }
public void windowDeactivated(WindowEvent e){ txt1.append("WDA \n"); }
public void windowDeiconified(WindowEvent e){ txt1.append("WDI \n"); }
public void windowIconified(WindowEvent e){ txt1.append("WI \n"); }
public void windowOpened(WindowEvent e){ txt1.append("WO \n"); }

public static void main(String z[])
{
WL k=new WL();
k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
k.setBounds(700,300,300,200);
k.setTitle("Window Events");
k.setVisible(true);
}
}