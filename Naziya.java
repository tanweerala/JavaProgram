import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Naziya extends JFrame
{
JLabel  l1,l2,l3,l4,l5,l6;
JTextField t1;
JPasswordField t2;
JButton c1,c2,c3;
Naziya(String p1)
{
super(p1);
}
Naziya()
{
}
void setComponents()
{
l5=new JLabel();
ImageIcon i1=new ImageIcon("C:/Users/TN_khan/Downloads/img2.png");
l5.setIcon(i1);


l6=new JLabel();
ImageIcon i2=new ImageIcon("C:/Users/TN_khan/Downloads/img2.png");
l6.setIcon(i2);

Cursor d1=new Cursor(Cursor.WAIT_CURSOR);
//Cursor d1=new Cursor(Cursor.CROSSHAIR_CURSOR);
Cursor d2=new Cursor(Cursor.CROSSHAIR_CURSOR);



Font f1=new Font("Time New Roman",Font.BOLD,12);

Font f2=new Font("Callibri",Font.ITALIC,15);

Font f3=new Font("Callibri",Font.ITALIC,15);

l1=new JLabel("Welcome to Programming Language  Study");

l1.setFont(f1);
l1.setForeground(Color.BLUE);
//l3.setBackground(Color.BLACK);


l2=new JLabel("USERNAME");
l3=new JLabel("PASSWORD");
l4=new JLabel();


l3.setFont(f2);
l3.setForeground(Color.BLUE);
l3.setBackground(Color.BLACK);

l2.setFont(f3);
l2.setForeground(Color.BLUE);
l2.setBackground(Color.BLACK);

l2.setForeground(Color.BLACK);
   
t1=new JTextField();
t2=new JPasswordField();

c1=new JButton("Login");
c1.setBackground(Color.RED);
c1.setForeground(Color.BLACK);
c1.setCursor(d1);

// c1.setCursor();
c2=new JButton("AutoFill");
c2.setCursor(d2);
c3=new JButton("Add");

setLayout(null);
add(l6);
add(l5);
add(l1);
add(l2);
add(l3);
add(l4);

add(t1);
add(t2);

add(c1);
add(c2);
add(c3);
 
 l5.setBounds(10, 10,150,150);
 l6.setBounds(550, 10,150,150);
 l1.setBounds(200,100,300,30);
 l2.setBounds(100,200,100,30);
 l3.setBounds(100,300,200,30);
 l4.setBounds(100,500,500,30);
 t1.setBounds(300,300,200,30);
 t2.setBounds(300,200,200,30);
// c1.setBounds(200,450,100,30);
 //c2.setBounds(400,450,100,30);
// c3.setBounds(500,550,100,30);

c1.setBounds(200,500,100,30);
c2.setBounds(300,500,100,30);
c3.setBounds(400,500,100,30);




c1.addActionListener(new Log());
c2.addActionListener(new Clear());
c3.addActionListener(new Add());
l2.addMouseListener(new MouseL());
l3.addMouseListener(new MouseLi());
//Cursor d1=new Cursor();


}
class MouseL implements MouseListener 
{
public void mouseClicked(MouseEvent e1)
{
  //l1.setText("Mouse Clicked")
}
public void mousePressed(MouseEvent e1)
{}
public void mouseReleased(MouseEvent e1)
{}
public void mouseEntered(MouseEvent e1)
{
 l2.setForeground(Color.RED);
 
}
 public void mouseExited(MouseEvent e1)
{ 
  l2.setForeground(Color.BLACK);
  
}
}

class MouseLi implements MouseListener 
{
public void mouseClicked(MouseEvent e1)
{
  //l1.setText("Mouse Clicked")
}
public void mousePressed(MouseEvent e1)
{
 l1.setText("");
}
public void mouseReleased(MouseEvent e1)
{
l1.setText("Username");
}
public void mouseEntered(MouseEvent e1)
{
 
 l3.setForeground(Color.GREEN);
}
 public void mouseExited(MouseEvent e1)
{ 
 
  l3.setForeground(Color.BLACK);
}
}
public static void main (String [] args)

{
 Naziya p1=new Naziya("Welcome to Tanweer Khan ");
 p1.setVisible(true);
 p1.setSize(700,700);
 p1.setComponents();
 p1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}


class Log implements ActionListener
{
public void actionPerformed(ActionEvent e1)
{
  String p1=t1.getText();
  String p2=t2.getText();
 if(p1.equals("Tanweer") && p2.equals("Khan"))
{
 JOptionPane.showMessageDialog(null,"Login Successful!!!");
 l4.setText("Login Successful");
}
else
{
JOptionPane.showMessageDialog(null,"Login Unsuccessful");
}
}
}




class Clear implements ActionListener
{
public void actionPerformed(ActionEvent e1)
{
  t1.setText("");
  t2.setText("");

}
}


class Add implements ActionListener
{
public void actionPerformed(ActionEvent e1)
{
 try
{
 int a=Integer.parseInt(t1.getText()); 
 int b=Integer.parseInt(t2.getText());

 int c=a+b;
 l4.setText("Addition is "+c); 
}
catch(Exception e2)
{
  l4.setText("Please Enter a number only");
}

}
}
}
