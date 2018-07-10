import javax.swing.*;
import java.awt.*;
import javax.swing.plaf.*;
import java.sql.*;
import java.awt.event.*;
import java.net.*;
public class EmpLogin extends Home
{
	static int admin=0;
	static int frmt=0;
	static String idss="";
	static String pasw="";
	Logins nho=null;
	static JTextField tf;
	static JPasswordField tf1;
	static JPanel f1;
	JLabel l1,l2,ltf,ltf1;
	JPanel p1,p2,p4;
	static ImageIcon ic;
	Font ft=new Font("Segoe UI",Font.BOLD,14);
	EmpLogin(int a)
	{
		
	}
	EmpLogin()
	{
		try
		{
		ic=new ImageIcon(getClass().getResource(URLEncoder.encode("cons.png", "UTF-8")));
		}
		catch(Exception mk){}
		p1=new JPanel();
		JLabel lol1=new JLabel(":");
		lol1.setFont(ft);
		JLabel lol2=new JLabel(":");		
		lol2.setFont(ft);		
		p1.setLayout(new FlowLayout(FlowLayout.LEFT));
		p4=new JPanel();
		p4.setLayout(new GridLayout(2,2,0,10));
		p2=new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.LEFT));
		l1=new JLabel("Identity/PPO.NO");
		if(admin==1) l1.setText("Admin ID");
		l1.setFont(ft);		
		l2=new JLabel("Passcode");
		l2.setFont(ft);
		tf=new JTextField(7);
		ltf=new JLabel(idss);
		ltf1=new JLabel(pasw);
		tf.setFont(ft);
		tf1=new JPasswordField(7);
f1=new JPanel();
f1.setLayout(new BorderLayout());
tf1.setFont(ft);
p1.add(lol1);
if(frmt==0) p1.add(tf);
else p1.add(ltf);
p2.add(lol2);
if(frmt==0)
p2.add(tf1);
else
p2.add(ltf1);
p4.add(l1);
p4.add(p1);
p4.add(l2);
p4.add(p2);
f1.add(p4,BorderLayout.CENTER);
tf.setFocusable(true);	
	}
public static void infoBox(String infoMessage, String titleBar)
    {
JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.ERROR_MESSAGE);
    }
public static void main(String args[])
{

	if(args.length>2 && (args[2].equals("Admin")))
	{
		System.out.println("iubiujn");
		admin=1;
		new EmpLogin();
	}
	if(admin==1)
	{
Object[] optionsd = {"   SUBMIT   "};		
int yresult=JOptionPane.showOptionDialog(null,f1,"Authentication",JOptionPane.OK_OPTION,0,ic,optionsd,optionsd[0]);
if(yresult==JOptionPane.OK_OPTION)
{
			System.out.println("iubiujn");
String hy=tf.getText();
String hy1=new String(tf1.getPassword());
if(hy.equals("Admin") && (hy1.equals("8JK5432")))
{
	fs.dispose();
Admin.main(null);
}
else
{
infoBox("Wrong Credentials","Authentication Failed");
}
}
	}
	else if(admin!=1)
	{
	if(!(args[0].equals("")))
	{
	frmt=1;
	idss=args[0];
	pasw=args[1];
	}
	try
	{
	 UIManager.setLookAndFeel(
         UIManager.getSystemLookAndFeelClassName());
	}
	catch(Exception mk){}
new EmpLogin();
int result=0;
Object[] options1 = {"   CLOSE   "};
Object[] options = {"   SUBMIT   "};
if(frmt==0) result=JOptionPane.showOptionDialog(null,f1,"Authentication",JOptionPane.OK_OPTION,0,ic,options,options[0]);
if(frmt==1)
{
result=JOptionPane.showOptionDialog(null,f1,"Login_Credentials",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options1,options1[0]);
frmt=0;
}
else
{
if(result==JOptionPane.OK_OPTION)
{
try
{
String hy=tf.getText();
String hy1=new String(tf1.getPassword());
System.out.println(hy+" "+hy1);
int yesdata=0;
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.91.25:1521:xe","system","oracle");  // nikhilesh1997.dlinkddns.com:1521:xe 192.168.0.25 100.70.x.x virtual server port forwarding
PreparedStatement stmt=con.prepareStatement("select * from Bits.employee where id='"+hy+"' and login_password='"+hy1+"'");
ResultSet rs=stmt.executeQuery();
while(rs.next())
{
yesdata++;
}
if(yesdata==0) infoBox("Wrong Credentials","Authentication Failed");
else 
{
fs.dispose();
String qa[]=new String[2];
qa[0]=hy;
qa[1]=hy1;
LoginP.main(qa);
}
con.close();	
}
catch(Exception m)
{
	m.printStackTrace();
}
}
}
} 
}}
