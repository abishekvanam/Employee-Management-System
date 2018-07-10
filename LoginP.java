import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;  
import java.net.*;
import java.util.*;
import javax.imageio.*;
import java.awt.image.*;
import java.sql.*;
import java.util.*;
import java.text.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicButtonUI;
public class LoginP extends Signup
{
JPanel south,pos;
	int fid=0;
	Font fat=new Font("Segoe UI",Font.PLAIN,16);
       Font fats=new Font("Segoe UI",Font.PLAIN,16);
	Object[] objarray1;
	Object[] objarray2;
JButton bde=null;
	JButton b[]=new JButton[8];
	ArrayList<Integer> vec=new ArrayList<Integer>();
	ArrayList<Integer> vec1=new ArrayList<Integer>();
	Thread t1,t2;
	JButton save,cancel;
	JLabel labelP,labelP1;
	String las[]={"Identity/PPO.No","Name","Blood Group","Gender","Email ID","Login_Password","Designation","Contact","Gross Salary","Division","Grade Pay","DOB(Date of Birth)","DOJ(Date of Join)","Aadhaar number"};
         JFrame f1=new JFrame("Sign_Up Portal");
	JButton b97;
	JPanel main;
JPanel p11;
	JPanel p1,for1,for2;
	JLabel extra;
	int gits=0;
	int hexg=0;
	JLabel extra1;
	JPanel extraP;
	String idss="",est="",est1="",ads="";
	JPanel p2[];
	JPanel hi;
	JLabel lie1,lie2;
	JPanel extraP1;
	JButton b1;
	JPanel corner;
	JPanel temp[];
	JLabel l1[];
	static JLabel tf[];
	static JTextField tf1[];	
	JLabel l45[];
	String passe="";
	JButton ac1,fa1;
	JComboBox<Object> jcb1,jcb2,jcb3,jcb0,jcb5,jdob2,jdoj2;
	JComboBox<Object> jdoj1,jdoj3,jdob1,jdob3;
	String las512[]={"--Choose--","Female","Male","Prefer not to say"};
        String dob2[]={"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
        String las1024[]={"--Select--","Systems Manager","Senior Engineer","Junior Engineer","Senior Programmer","FA/CAO","GM","Class_4"};	
        String las256[]={"--Select--","A+","A-","B+","B-","O+","O-","AB+","AB-"};
	String las11[]={"--Select DIVISON--","SCR","NR","ER","WR","SWR","CR","NFR"};
        String las111[]={"--Select PAY Scale--","PB1S: 4440-7440(GP-1600)","PB1S: 4440-7440(GP-1650)","PB1: 5200-20200(GP-1600)","PB2: 9300-34800(GP-4600)","PB3: 15600-39100(GP-7600)","PB4: 37400-67000(GP-10000)","HAG2: 67000-79000","APEX1: 90000/- FIXED","MEMBER OF PARLIAMENT"};
	JPanel nh;
	public class Item implements ItemListener
	{
		int hit=0;
		public Item(int hit)
		{
			this.hit=hit;
		}
		boolean leap(int c)
		{
			if(c%100!=0 && c%4==0) return true;
			else if(c%400==0 && c%4==0 && c%100==0) return true;
			else return false;
		}
	public void itemStateChanged(ItemEvent ies)
	{
		hexg=0;
	int yhu=1,jits=0;
	if(hit==0) gits=(jdob2.getSelectedIndex());
	else gits=(jdoj2.getSelectedIndex());
	if(gits>=7) 
	{
	yhu=0;
	jits=1;
	}
if((gits)%2!=0)
{		
	HashSet<Integer> s = new HashSet<Integer>(vec);
	if(hit==0) jdob1.removeAllItems();
	else jdoj1.removeAllItems();
	for(int i=0;i<vec.size()-yhu-hexg;i++)
{
	if(hit==0)
	{
	if(gits==1)
	{
		if(leap(Integer.parseInt((jdob3.getSelectedItem()).toString()))) hexg=1; 
		else hexg=2;
	}
jdob1.addItem((s.toArray())[i]);
	}	
else
{
	if(gits==1)
	{
		if(leap(Integer.parseInt((jdoj3.getSelectedItem()).toString()))) hexg=1; 
		else hexg=2;
	}	
jdoj1.addItem((s.toArray())[i]);
}
}
hexg=0;
}
	else
	{
	if(hit==0)		
	jdob1.removeAllItems();
	else
	jdoj1.removeAllItems();
	HashSet<Integer> s = new HashSet<Integer>(vec);
	for(int i=0;i<vec.size()-jits;i++)
{
		if(hit==0)		
jdob1.addItem((s.toArray())[i]);
		else
jdoj1.addItem((s.toArray())[i]);
}
	}
	}
	}	
	class BITS extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
hi.removeAll();
f1.dispose();
String qa[]=new String[2];
qa[0]="inijn";
qa[1]="bjnjn";
Home.main(qa);
		}
	}
public	LoginP(String id,String pass)
	{
		try
		{
			UIManager.setLookAndFeel(
					UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception mk){}
		passe=pass;
		idss=id;
		ads=pass;
		save=new JButton("Save");
		cancel=new JButton("Cancel");
try
 {
			  int yesdata=0;
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.91.25:1521:xe","system","oracle");
PreparedStatement stmt=null;
if(pass.equals("8JK5432"))
{
stmt=con.prepareStatement("select * from Bits.employee where id='"+id+"'"); //  and login_password='"+pass+"'");
}
else stmt=con.prepareStatement("select * from Bits.employee where id='"+id+"' and login_password='"+pass+"'");
ResultSet rs=stmt.executeQuery();
if(rs.next());
		ac1=new JButton("Bank Account & Family info.");
		lie1=new JLabel(" ");
	        lie2=new JLabel(" ");
		for1=new JPanel();
		for1.setLayout(new FlowLayout(FlowLayout.LEFT));
		for2=new JPanel();
		for2.setLayout(new FlowLayout(FlowLayout.CENTER));
		for(int i=1;i<=31;i++)
		{
			vec.add(i);
		}
		objarray1 = vec.toArray();
		Calendar now = Calendar.getInstance();
                int year = now.get(Calendar.YEAR);
		for(int i=1900;i<=year;i++)
		{
			vec1.add(i);
		}
objarray2 = vec1.toArray();
f1.addWindowListener(new BITS());
b97=new JButton("Home");
b1=new JButton("Edit");
bde=new JButton("Delete");
extraP=new JPanel();
extraP.setBackground(Color.white);
extraP1=new JPanel();
extraP1.setBackground(Color.white);
try
{
nh=new JPanel();
nh.setLayout(new GridLayout(1,1));
JLabel kj=new JLabel("Sign_Up Portal");
labelP = new JLabel(new ImageIcon(getClass().getResource(URLEncoder.encode("NMJ.jpg", "UTF-8"))));
labelP.setBackground(Color.white);
labelP.setOpaque(true);
for1.add(labelP);
nh.add(labelP);
}
catch(Exception mk)
{
}
nh.setBackground(Color.white);
extraP.setLayout(new FlowLayout(FlowLayout.LEFT));
extraP1.setLayout(new FlowLayout(FlowLayout.LEFT));
extra =new JLabel(":");
extra1 =new JLabel(":");
jcb1=new JComboBox<>(las11);
jcb3=new JComboBox<>(las256);
jcb2=new JComboBox<>(las111);
jdob1=new JComboBox<>(objarray1);
jdob2=new JComboBox<>(dob2);
jdob2.addItemListener(new Item(0));
jdob3=new JComboBox<>(objarray2);
jdob3.addItemListener(new Item(0));
jdoj1=new JComboBox<>(objarray1); 
jdoj2=new JComboBox<>(dob2);
jdoj2.addItemListener(new Item(1));
jdoj3=new JComboBox<>(objarray2);
jdoj3.addItemListener(new Item(1));
jcb0=new JComboBox<>(las512);
jcb5=new JComboBox<>(las1024);
main=new JPanel();
corner =new JPanel();
corner.setBackground(Color.white);
corner.setLayout(new FlowLayout(FlowLayout.RIGHT));
temp=new JPanel[15];
l45=new JLabel[15];
l1=new JLabel[15];
tf=new JLabel[15];
tf1=new JTextField[15];
p2=new JPanel[15];
f1.setBackground(Color.white);
p1=new JPanel();
p1.setBackground(Color.white);
p1.setLayout(new GridLayout(17,1,0,10));
p11=new JPanel();
p11.setBackground(Color.white);
p11.setLayout(new GridLayout(17,1,0,10));
main.setLayout(new FlowLayout(FlowLayout.CENTER,30,10));	
main.setBackground(Color.white);
f1.setLayout(new BorderLayout());
f1.setVisible(true);
f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
f1.setResizable(false);
jcb1.setPrototypeDisplayValue("Bits Pilani Hyb campus is awesome but");
jcb2.setPrototypeDisplayValue("Bits Pilani Hyb campus is awesome but");
jcb3.setPrototypeDisplayValue("Bits Pilani Hyb campus is awesome but");
jcb0.setPrototypeDisplayValue("Bits Pilani Hyb campus is awesome but");
jcb5.setPrototypeDisplayValue("Bits Pilani Hyb campus is awesome but");
jcb1.setFont(fats);
jcb2.setFont(fats);
jcb3.setFont(fats);
jcb0.setFont(fats);
jcb5.setFont(fats);
jdob1.setFont(fats);
jdob2.setFont(fats);
jdob3.setFont(fats);
jdoj1.setFont(fats);
jdoj2.setFont(fats);
jdoj3.setFont(fats);
JLabel ko1=new JLabel("/");
JLabel ko2=new JLabel("/");
JLabel ko3=new JLabel("/");
JLabel ko4=new JLabel("/");
// -----------------------------------------------------------------------------
for(int i=0;i<14;i++)
{
if(i==8) continue;
if(i!=9 && i!=10)
{
JLabel l456=new JLabel(":"); // A label :
l456.setFont(fat);
JPanel temp6=new JPanel();  // temp6 label
temp6.setBackground(Color.white);
JPanel p26=new JPanel();     // p26 label
p26.setBackground(Color.white);
p26.setLayout(new GridLayout(1,2));   // p26 has GridLayout(1,2)
temp6.setLayout(new FlowLayout(FlowLayout.LEFT));  // temp6 has Flow layout to the left
JLabel l16=new JLabel(las[i]);
l16.setFont(fat);
tf1[i]=new JTextField(21);   // JTextField of 30
tf1[i].setFont(fats);   // Font of fats.
temp6.add(l456);
if(i==2 && !(pass.equals("8JK5432")))		
{
jcb3.setSelectedItem(rs.getString(i+1));
temp6.add(jcb3);
}
else if(i==3 && !(pass.equals("8JK5432")))
{
jcb0.setSelectedItem(rs.getString(i+1));
temp6.add(jcb0);
}
else if(i==6) 
{
	jcb5.setSelectedItem(rs.getString(i+1));
	temp6.add(jcb5);
}
else if(i==11 && !(pass.equals("8JK5432")))
{
java.sql.Date date = rs.getDate(i+1);
SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
est=df.format(date);
StringTokenizer st1 =new StringTokenizer(df.format(date), "-");
jdob1.setSelectedItem(Integer.parseInt(st1.nextToken()));
temp6.add(jdob3);
temp6.add(ko1);
jdob2.setSelectedIndex(Integer.parseInt(st1.nextToken())-1);
temp6.add(jdob2);
temp6.add(ko2);
jdob3.setSelectedItem(Integer.parseInt(st1.nextToken()));
temp6.add(jdob1);
}
else if(i==12 && !(pass.equals("8JK5432"))) 
{
java.sql.Date date = rs.getDate(i+1); // wherever you get this from 
SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
est1=df.format(date);
StringTokenizer st1 =new StringTokenizer(df.format(date), "-");
jdoj1.setSelectedItem(Integer.parseInt(st1.nextToken()));
temp6.add(jdoj3);
 temp6.add(ko3);
jdoj2.setSelectedIndex(Integer.parseInt(st1.nextToken())-1);
 temp6.add(jdoj2);
temp6.add(ko4);
jdoj3.setSelectedItem(Integer.parseInt(st1.nextToken()));
temp6.add(jdoj1);
}
else if(i!=0 && i!=8 && i!=13 && !(pass.equals("8JK5432"))) 	
{
tf1[i].setText(rs.getString(i+1));
temp6.add(tf1[i]);
}
else
{
JLabel firsts=null;
if((i==12 || i==11) && (pass.equals("8JK5432")))
{	
StringTokenizer strea=new StringTokenizer(rs.getString(i+1)," ");
firsts=new JLabel(strea.nextToken());  
}
else if((i==6 || i==3 || i==2) && (pass.equals("8JK5432")))
{
firsts=new JLabel(rs.getString(i+1));  
}
else
{
firsts=new JLabel(rs.getString(i+1));  
}
firsts.setFont(fats);
temp6.add(firsts);
}
p26.add(l16);
p26.add(temp6);
p11.add(p26);
}
 }
JLabel lte6=new JLabel("Division");
lte6.setBackground(Color.white);
lte6.setFont(fat);
JLabel lte16=new JLabel("Grade Pay");
lte16.setBackground(Color.white);
lte16.setFont(fat);
JPanel p266=new JPanel();  // p266 is Jpanel
p266.setLayout(new GridLayout(1,2));  // p266 GridLayout of 1,2 
p266.setBackground(Color.white);
JPanel p236=new JPanel(); // p236 is Jpanel
p236.setBackground(Color.white);
p236.setLayout(new GridLayout(1,2));  // p236 GridLayout of 1,2
p266.add(lte6);
extraP.add(extra1);
jcb1.setSelectedItem(rs.getString(10));
extraP.add(jcb1);
p266.add(extraP);  // extrap flowlayout left
p236.add(lte16);
extraP1.add(extra);
jcb2.setSelectedItem(rs.getString(11));
extraP1.add(jcb2);
p236.add(extraP1);   // Extrap1  flowlayout left
p11.add(p266);
p11.add(p236); 
// -------------------------------------------------------
for(int i=0;i<14;i++)
{
if(i==8) continue;
l45[i]=new JLabel(":");
l45[i].setFont(fat);
temp[i]=new JPanel();  // temp[i] JPanel
temp[i].setBackground(Color.white);
p2[i]=new JPanel();
p2[i].setBackground(Color.white);
p2[i].setLayout(new GridLayout(1,2));   // p2[i] gridlayout(1,2) JPanel
temp[i].setLayout(new FlowLayout(FlowLayout.LEFT));  // temp[i] flowlayout left
l1[i]=new JLabel(las[i]);
l1[i].setFont(fat);
if(i==12 || i==11)
{	
	StringTokenizer strea=new StringTokenizer(rs.getString(i+1)," ");
	tf[i]=new JLabel(strea.nextToken());
}
else
	tf[i]=new JLabel(rs.getString(i+1));
tf[i].setFont(fats);
temp[i].add(l45[i]);
temp[i].add(tf[i]);
p2[i].add(l1[i]);
p2[i].add(temp[i]);
p1.add(p2[i]);
}
JLabel lk7=new JLabel(" "); 
p1.add(ac1);
pos=new JPanel();
pos.setLayout(new FlowLayout(FlowLayout.CENTER,20,10));
pos.setBackground(Color.WHITE);
if(pass.equals("8JK5432"))
{
pos.add(bde);
}
pos.add(b1);
pos.add(b97);
// p1.add(pos);
south=new JPanel();
south.setLayout(new FlowLayout(FlowLayout.CENTER,20,10));
// south.add(corner);
south.setBackground(Color.white);
JPanel bls1=new JPanel();
bls1.setLayout(new GridLayout(5,5));
bls1.setBackground(Color.WHITE);
JPanel bls=new JPanel();
bls.setLayout(new BorderLayout());
JButton hya=new JButton("BITS");
JPanel bls2=new JPanel();
bls2.setLayout(new GridLayout(5,5));
bls2.setBackground(Color.WHITE);
main.add(p1);
hi=new JPanel();
hi.setLayout(new BorderLayout());
hi.add(main,"West");
hi.add(bls1,"Center");
f1.add(labelP,"North");
bls.add(bls2,"Center");
hi.add(bls,"South");
f1.add(hi,"West");
f1.add(pos,"South");
if(passe.equals("8JK5432")) ac1.addMouseListener(new MKI(3,id,1));
else ac1.addMouseListener(new MKI(3,id,0));
ac1.setBackground(Color.WHITE);
b97.setBackground(Color.WHITE);
b1.setBackground(Color.WHITE);
b1.setPreferredSize(new Dimension(140,40));
bde.setBackground(Color.WHITE);
bde.setPreferredSize(new Dimension(140,40));
b97.addMouseListener(new MKI7(2));
b97.setPreferredSize(new Dimension(140,40));
ac1.setFont(ac1.getFont().deriveFont(14.0f));
b97.setFont(b97.getFont().deriveFont(14.0f));
b1.addMouseListener(new MKI7(1));
b1.setFont(b1.getFont().deriveFont(14.0f));
b1.setBorder(new RoundedsBorder(20));	
b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
bde.addMouseListener(new MKI7(7));
bde.setFont(b1.getFont().deriveFont(14.0f));
bde.setBorder(new RoundedsBorder(20));	
bde.setCursor(new Cursor(Cursor.HAND_CURSOR));
b97.setBorder(new RoundedsBorder(20));		
b97.setCursor(new Cursor(Cursor.HAND_CURSOR));
ac1.setCursor(new Cursor(Cursor.HAND_CURSOR));
save.addMouseListener(new MKI7(4));
save.setFont(save.getFont().deriveFont(14.0f));
save.setBorder(new RoundedsBorder(20));	
save.setCursor(new Cursor(Cursor.HAND_CURSOR));
save.setPreferredSize(new Dimension(140,40));
cancel.addMouseListener(new MKI7(5));
cancel.setFont(cancel.getFont().deriveFont(14.0f));
cancel.setBorder(new RoundedsBorder(20));	
cancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
cancel.setPreferredSize(new Dimension(140,40));
b[1]=b1;
b[2]=b97;	
b[3]=ac1;
b[4]=save;
b[5]=cancel;
b[7]=bde;
b[3].setBorder(BorderFactory.createLineBorder(Color.GREEN, 1));	
int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED ;
int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED ;
JScrollPane js = new JScrollPane( hi, v, h ) ;
js.setBorder(new LineBorder(Color.WHITE));
f1.add(js , BorderLayout.CENTER);
con.close();
}
catch(Exception m)
{
m.printStackTrace();
}
for(int i=1;i<=7;i++)
{
	if(i==3)
	{
        b[i].setBackground(Color.WHITE);
        b[i].setForeground(Color.BLACK);
	b[i].setFont(b[i].getFont().deriveFont(14.0f));
	b[i].setUI(new BasicButtonUI() {
        @Override
        public void update(Graphics g, JComponent c) {
            if (c.isOpaque()) {
                Color fillColor = Color.WHITE;
                g.setColor(fillColor);
                g.fillRoundRect(-5, -5, c.getWidth()+10,c.getHeight()+10,0,0);
            }
            paint(g, c);
        }
    });
	b[i].setBorder(new RoundedsBorder(0));
	}
	if(i!=3 && i!=6)
	{
        b[i].setBackground(Color.WHITE);
        b[i].setForeground(Color.BLACK);
	b[i].setFont(b[i].getFont().deriveFont(14.0f));
	b[i].setUI(new BasicButtonUI() {
        @Override
        public void update(Graphics g, JComponent c) {
            if (c.isOpaque()) {
                Color fillColor = Color.WHITE;
                g.setColor(fillColor);
                g.fillRoundRect(-5, -5, c.getWidth()+10,c.getHeight()+10,0,0);
            }
            paint(g, c);
        }
    });
	b[i].setBorder(new RoundedsBorder(20));
System.out.println(b[i].getText());
	}
}
	}
 public class MKI7 extends MouseAdapter
{
	int as=0;
	MKI7(int ju)
	{
		as=ju;
	}
		public void mouseEntered(MouseEvent evt) 
		{
					  if(as==3)  
		  {
		  	b[as].setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
		  	b[as].setFont(b[as].getFont().deriveFont(18.0f));
		  }
		  else
		  {
	        b[as].setUI(new BasicButtonUI() {
        @Override
        public void update(Graphics g, JComponent c) {
            if (c.isOpaque()) {
                Color fillColor = Color.WHITE;
                g.setColor(fillColor);
                g.fillRoundRect(-5, -5, c.getWidth()+10,c.getHeight()+10,0,0);
            }
            paint(g, c);
        }
    });
		b[as].setForeground(Color.WHITE);
		t1=new Thread(new Runnable()
		{
			public void run()
			{
				try
				{
				if(t1.isInterrupted())
				{
					throw new Exception();
				}
		b[as].setForeground(Color.WHITE);
		final int yy=5;
            	b[as].setFont(b[as].getFont().deriveFont(14.0f+5));
		     b[as].setUI(new BasicButtonUI() {
        @Override
        public void update(Graphics g, JComponent c) {
            if (c.isOpaque()) {
                Color fillColor =new Color(0,42*yy,0);
                g.setColor(fillColor);
                g.fillRoundRect(0, 0, c.getWidth()-1,c.getHeight()-1, 20, 20);
            }
            paint(g, c);
        }
    });
				}
						catch(Exception ik)
						{
        b[as].setBackground(Color.WHITE);
        b[as].setForeground(Color.BLACK);
	b[as].setFont(b[as].getFont().deriveFont(14.0f));
	b[as].setUI(new BasicButtonUI() 
			{
        @Override
        public void update(Graphics g, JComponent c) 
	{
            if (c.isOpaque()) {
                Color fillColor = Color.WHITE;
                g.setColor(fillColor);
                g.fillRoundRect(-5, -5, c.getWidth()+10,c.getHeight()+10,0,0);
            }
            paint(g, c);
        }
    });
	b[as].setBorder(new RoundedsBorder(20));
						}
			}
		});
t1.setPriority(10);
	t1.start();
		}
		}
    public void mousePressed(MouseEvent evt) 
	    {
		  if(as==3)  
		  {
	             b[as].setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
		     b[as].setFont(b[as].getFont().deriveFont(18.0f));
		  }
			  else
		  {
			  System.out.println("BITS");
b[as].setForeground(Color.BLACK);
		     b[as].setUI(new BasicButtonUI() {
        @Override
        public void update(Graphics g, JComponent c) {
            if (c.isOpaque()) {
                Color fillColor =new Color(255,255,255);
                g.setColor(fillColor);
                g.fillRoundRect(-5, -5, c.getWidth()+10,c.getHeight()+10, 20, 20);
            }
            paint(g,c);
            }
            });	
	    	    	b[as].setBorder(new RoundedsBorder(20));
		  }
	    }
    public void mouseClicked(MouseEvent evt) 
	    {
if(as==7)
{
int a=JOptionPane.showConfirmDialog(null,"Are you sure?","Deletion",JOptionPane.OK_CANCEL_OPTION);
if(a==JOptionPane.YES_OPTION)
{
       try
       {	       
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.91.25:1521:xe","system","oracle");
System.out.println(ads);
PreparedStatement pts=con.prepareStatement("delete from bits.employee where id='"+idss+"'");
pts.executeUpdate();
f1.dispose();
Admin.main(null);
       }
       catch(Exception mju){
       mju.printStackTrace();
       }
       }
}
		  if(as==3)  
		  {
	          b[as].setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
		  b[as].setFont(b[as].getFont().deriveFont(18.0f));
		  b[as].setContentAreaFilled(true);
/*if(nids==0)
{
frt=new JPanel();
		gbl=new GridBagLayout();
			  frt.setLayout(gbl);
}
gbcd = new GridBagConstraints();
gbcd.fill = GridBagConstraints.HORIZONTAL;
gbcd.gridx = 0;      
gbcd.gridy = 0;
gbcd.insets = new Insets(5,5,5,5);
JLabel title=new JLabel("Bank Credentails:");
title.setFont(frat);
JLabel bname=new JLabel("Name (Account Holder's) :");
JLabel bacno=new JLabel("Account No. :");
JLabel bifsc=new JLabel("IFSC Code :");
JLabel title2=new JLabel("Residence:");
title2.setFont(frat);
JLabel city=new JLabel("City :");
JLabel pin=new JLabel("PIN :");
JLabel state=new JLabel("State :");
JLabel address=new JLabel("Address :");
td1=new JTextField(25);
td2=new JTextField(25);
JLabel named=new JLabel(" "+tf[0].getText());
if(nids==0)
{
frt.add(title,gbcd);
gbcd.gridx = 0;      
gbcd.gridy = 1;
frt.add(bname,gbcd);
gbcd.gridx = 1;      
gbcd.gridy = 1;
frt.add(named,gbcd);
gbcd.gridx = 2;      
gbcd.gridy = 1;
frt.add(bacno,gbcd);
gbcd.gridx = 3;      
gbcd.gridy = 1;
frt.add(td1,gbcd);
gbcd.gridx = 4;      
gbcd.gridy = 1;
frt.add(bifsc,gbcd);
gbcd.gridx = 5;      
gbcd.gridy = 1;

String sq[]={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu and Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal","Andaman and Nicobar Islands","Dadar and Nagar Haveli","Daman and Diu","Delhi","Lakshadweep","Puducherry"};
jstate=new JComboBox<>(sq);   // JComboBox<Object> jstate
jta=new JTextArea(5,10);       //JTextArea jta
jta.setLineWrap(true);
jta.setWrapStyleWord(true);
scrolltxt=new JScrollPane();    // JScrollPane scrolltxt
pint=new JTextField(25);              // JTextField pint
cityt=new JTextField(25);   // JTextField cityt
}
if(nids==0)
{
frt.add(td2,gbcd);
gbcd.gridx=0;
gbcd.gridy=2;
frt.add(title2,gbcd);
gbcd.gridx=0;
gbcd.gridy=3;
frt.add(city,gbcd);
gbcd.gridx=1;
gbcd.gridy=3;
frt.add(cityt,gbcd);
gbcd.gridx=2;
gbcd.gridy=3;
frt.add(state,gbcd);
gbcd.gridx=3;
gbcd.gridy=3;
frt.add(jstate,gbcd);
gbcd.gridx=4;
gbcd.gridy=3;
frt.add(pin,gbcd);
gbcd.gridx=5;
gbcd.gridy=3;
frt.add(pint,gbcd);
gbcd.gridx=0;
gbcd.gridy=4;
frt.add(address,gbcd);
gbcd.gridx=1;
gbcd.gridy=4;
gbcd.gridheight=5;
scrolltxt.setViewportView(jta);
scrolltxt.setWheelScrollingEnabled(true);
scrolltxt.setBorder(new LineBorder(Color.WHITE));
if(nids==0) frt.add(scrolltxt,gbcd);		
tyu.setBackground(Color.WHITE);
tyu.setForeground(Color.BLACK);
tyu.setFont(frat);
tyu.setBorder(BorderFactory.createLineBorder(Color.GREEN,5));
}
if(nids==0)
{
mj=new JButton("Add Family");
mj.addMouseListener(new GIT());
JLabel fam=new JLabel("Family Details:");
fam.setFont(frat);
gbcd.gridx=0;
gbcd.gridy=10;
gbcd.gridwidth=2;
gbcd.gridheight=2;
frt.add(fam,gbcd);
gbcd.gridx=1;
gbcd.gridy=10;
gbcd.gridwidth=1;
frt.add(mj,gbcd);
int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED ;
int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED ;
//	JScrollPane js = new JScrollPane( p1, v, h ) ;
jst=new JScrollPane(frt,v,h);
// jst.setViewportView(frt);
jst.setWheelScrollingEnabled(true);
jst.setBorder(new LineBorder(new Color(0,0,0,0)));
jst.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
top = jst.getPreferredSize();
// jst.getVerticalScrollBar().setMaximum(top);
}
if(nids==1)
{
jst=new JScrollPane();
jst.setPreferredSize(top);
jst.setViewportView(frt);
jst.setWheelScrollingEnabled(true);
jst.setBorder(new LineBorder(new Color(0,0,0,0)));
jst.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
jira=1;
}
Object[] options={"    Save    ","    Cancel   "};
old=new JOptionPane();
int result=0;
result=old.showOptionDialog(null,jst,"Bank & Family",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]); */
		  }
			  else
		  {
b[as].setForeground(Color.BLACK);
b[as].setUI(new BasicButtonUI() {
        @Override
        public void update(Graphics g, JComponent c) {
            if (c.isOpaque()) {
                Color fillColor =new Color(255,255,255);
                g.setColor(fillColor);
                g.fillRoundRect(-5, -5, c.getWidth()+10,c.getHeight()+10, 20, 20);
            }
            paint(g,c);
            }
            });	
	    	b[as].setBorder(new RoundedsBorder(20));
}
if(as==1)
{
main.remove(p1);
pos.removeAll();
pos.add(save);
pos.add(cancel);
main.add(p11);
f1.repaint();
}
if(as==2)
{
hi.removeAll();
f1.dispose();
String qa[]=new String[2];
qa[0]="inijn";
qa[1]="bjnjn";
if(passe.equals("8JK5432")) Admin.main(qa);
else Home.main(qa);
}
 if(as==4)
{
			  try {
				  int yesdata = 0;
				  Class.forName("oracle.jdbc.driver.OracleDriver");
				  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.91.25:1521:xe", "system", "oracle");
				  String gt = jdob1.getSelectedItem().toString() + "-" + jdob2.getSelectedItem().toString() + "-" + jdob3.getSelectedItem().toString();
				  SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy");
				  java.util.Date date = sdf1.parse(gt);
				  java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
				  System.out.println(sqlStartDate);
				  String gt5 = jdoj1.getSelectedItem().toString() + "-" + jdoj2.getSelectedItem().toString() + "-" + jdoj3.getSelectedItem().toString();
				  sdf1 = new SimpleDateFormat("dd-MMM-yyyy");
				  date = sdf1.parse(gt5);
				  java.sql.Date sqlStartDate3 = new java.sql.Date(date.getTime());
				  if (!(passe.equals("8JK5432"))) {
					  for (int yu = 1; yu <= 7; yu++) {
						  if (yu == 2 || yu == 3 || yu == 5 || yu == 6) continue;
						  String chk = "";
						  chk = tf1[yu].getText();
						  if (chk.equals("") || chk.charAt(0) == ' ' || chk.charAt(chk.length()-1) == ' ') throw new Exception(las[yu]);
						  if (yu == 4) {
							  int tempcar = 0;
							  String stri = "";
							  int jik = 0, fine = 0;
							  while (tempcar < chk.length()) {
								  if (jik >= 1) {
									  if(chk.charAt(tempcar)>=48 && chk.charAt(tempcar)<=57) throw new Exception(las[yu]);
									  jik++;
									  if (jik >= 4 && chk.charAt(tempcar) == '.') {
										  fine = 1;
									  }
								  }
								  if (fine == 1) stri += chk.charAt(tempcar);
								  if (chk.charAt(tempcar) == '@') jik = 1;
								  tempcar++;
							  }
							  if (stri.length() < 3) throw new Exception(las[yu]);
						  }
						  if (yu == 1) {
							  if(Signup.fsdd1(chk))  throw new Exception(las[yu]);
						  }
						  if (yu == 7) {
							  int tempcar = 0;
							  if (chk.length() != 10) throw new Exception(las[yu]);
							  if(fsdd(chk)) throw new Exception(las[yu]);
						  }
					  }
					  if ((jcb0.getSelectedItem().toString()).equals("--Choose--")) throw new Exception(las[3]);
					  if ((jcb3.getSelectedItem().toString()).equals("--Select--")) throw new Exception(las[2]);

				  int tempcar = 0;
				  String paswq = "";
				  paswq = tf1[5].getText();
				  if (paswq.length() != 8) {
					  throw new Exception("Password");
				  }
					  int xsd=0;
					  while(xsd<paswq.length())
					  {
						  if(!((paswq.charAt(xsd)>= 65 && paswq.charAt(xsd)<=90) || (paswq.charAt(xsd)>= 97 && paswq.charAt(xsd)<=122))) throw new Exception("Password");
						  xsd++;
					  }
				  int goa = 0;
				  PreparedStatement psa = con.prepareStatement("select floor(months_between(to_date('" + gt5 + "','DD-Mon-YYYY'),to_date('" + gt + "','DD-Mon-YYYY')) /12) from dual");
				  ResultSet temps = psa.executeQuery();
				  temps.next();
				  goa = temps.getInt(1);
				  if (goa < 0 || goa < 25 || goa > 50) throw new Exception("Date of Join");
			  }
				  if((jcb5.getSelectedItem().toString()).equals("--Select--")) throw new Exception(las[6]);				if((jcb2.getSelectedItem().toString()).equals("--Select PAY Scale--")) throw new Exception("PAY-SCALE");
				  if((jcb1.getSelectedItem().toString()).equals("--Select DIVISON--")) throw new Exception("DIVISION");
PreparedStatement stmt1=null;
if(!(passe.equals("8JK5432"))) stmt1=con.prepareStatement("update bits.employee set name='"+tf1[1].getText()+"',blood_group='"+jcb3.getSelectedItem()+"',gender='"+jcb0.getSelectedItem()+"',email_id='"+tf1[4].getText()+"',login_password='"+tf1[5].getText()+"',designation='"+jcb5.getSelectedItem()+"',contact="+tf1[7].getText()+",division='"+jcb1.getSelectedItem()+"',grade_pay='"+jcb2.getSelectedItem()+"',dob=to_date('"+sqlStartDate+"','yyyy-mm-dd'),doj=to_date('"+sqlStartDate3+"','yyyy-mm-dd') where id='"+idss+"'");
else stmt1=con.prepareStatement("update bits.employee set designation='"+jcb5.getSelectedItem()+"',division='"+jcb1.getSelectedItem()+"',grade_pay='"+jcb2.getSelectedItem()+"' where id='"+idss+"'");
int rs=stmt1.executeUpdate();
stmt1.execute();
PreparedStatement stmt=con.prepareStatement("select * from Bits.employee where id='"+idss+"'");
ResultSet rss=stmt.executeQuery();
/* 
while(rs.next())
{
yesdata=1;
}			  
String ids="AAAA0000";
if(yesdata==1)
{
ids=rs.getString(1);
}
stmt1.setString(12,ids);
stmt1.setString(1,tf[0].getText());
stmt1.setString(2,tf[1].getText());
stmt1.setString(7,tf[3].getText());
stmt1.setString(5,tf[4].getText());
stmt1.setString(3,jcb0.getSelectedItem().toString());
stmt1.setString(4,jcb3.getSelectedItem().toString());
stmt1.setString(6,jcb5.getSelectedItem().toString());
stmt1.setString(10,jcb2.getSelectedItem().toString());
stmt1.setString(11,jcb1.getSelectedItem().toString());
stmt1.setString(9,jcb3.getSelectedItem().toString());
stmt1.setString(13,tf[9].getText());
String gt=jdob1.getSelectedItem().toString()+"-"+jdob2.getSelectedItem().toString()+"-"+jdob3.getSelectedItem().toString();
SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy");
java.util.Date date = sdf1.parse(gt);
java.sql.Date sqlStartDate = new java.sql.Date(date.getTime()); 
stmt1.setDate(8, sqlStartDate);

gt=jdoj1.getSelectedItem().toString()+"-"+jdoj2.getSelectedItem().toString()+"-"+jdoj3.getSelectedItem().toString();	  
sdf1 = new SimpleDateFormat("dd-MMM-yyyy");
date = sdf1.parse(gt);
sqlStartDate = new java.sql.Date(date.getTime());
stmt1.setDate(9,sqlStartDate);			  */
// con.close();
main.remove(p11);
p1.removeAll();
rss.next();
for(int i=0;i<14;i++)
{
if(i==8) continue;
JLabel l45=new JLabel(":");
l45.setFont(fat);
JPanel temp=new JPanel();
temp.setBackground(Color.white);
JPanel p2=new JPanel();
p2.setBackground(Color.white);
p2.setLayout(new GridLayout(1,2));
temp.setLayout(new FlowLayout(FlowLayout.LEFT));
JLabel l1=new JLabel(las[i]);
l1.setFont(fat);
l1.setLayout(new FlowLayout(FlowLayout.RIGHT));
/* f(i!=10 || i!=11 || i!=13 || i!=9)
{
	if(i==8) tf[i]=new JLabel((rs.getInt(i+1))+"");
	else
	tf[i]=new JLabel(rs.getString(i+1));
} */
JLabel tf=null;
if((i==12 || i==11))
{	
StringTokenizer strea=new StringTokenizer(rss.getString(i+1)," ");
tf=new JLabel(strea.nextToken());  
}
else
tf=new JLabel(rss.getString(i+1));
tf.setFont(fats);
temp.add(l45);
temp.add(tf);
p2.add(l1);
p2.add(temp);
p1.add(p2);
}
p1.add(ac1);
pos.removeAll();
if(passe.equals("8JK5432")) pos.add(b[7]);
pos.add(b[1]);
pos.add(b[2]);
main.add(p1);
f1.repaint();
}
	catch (Exception m) {
		StringTokenizer ders=new StringTokenizer(m.toString()," ");
		ders.nextToken();
	JOptionPane.showMessageDialog(null, "Error: "+ders.nextToken()+" is invalid" , "Invalid Data!", JOptionPane.ERROR_MESSAGE);				}
} 
if(as==5)
{
main.remove(p11);
pos.removeAll();
if(passe.equals("8JK5432")) pos.add(b[7]);
pos.add(b[1]);
pos.add(b[2]);
main.add(p1);			  
f1.repaint();
}
}
    public void mouseReleased(MouseEvent mes)
    {
if(as!=3)
{
        b[as].setBackground(Color.WHITE);
        b[as].setForeground(Color.BLACK);
	b[as].setFont(b[as].getFont().deriveFont(14.0f));
	b[as].setUI(new BasicButtonUI() {
        @Override
        public void update(Graphics g, JComponent c) {
            if (c.isOpaque()) {
                Color fillColor = Color.WHITE;
                g.setColor(fillColor);
                g.fillRoundRect(-5, -5, c.getWidth()+10,c.getHeight()+10,0,0);
            }
            paint(g, c);
        }
    });
	b[as].setBorder(new RoundedsBorder(20));
    }
    }
  public void mouseExited(MouseEvent evt) 
    {
		  if(as==3)  
		  {
	             b[as].setBorder(BorderFactory.createLineBorder(Color.GREEN, 1));
		     b[as].setFont(b[as].getFont().deriveFont(14.0f));
		  }
		  else
		  {
t2=new Thread(new Runnable()
		{
	public void run()
	{
		 b[as].setForeground(Color.BLACK);
	        b[as].setFont(b[as].getFont().deriveFont(19.0f-5));
		final	Color frs=new Color(42*5,255,42*5);
		final int j=5;
	b[as].setUI(new BasicButtonUI() {
        @Override
        public void update(Graphics g, JComponent c) {
            if(c.isOpaque()) {
                Color fillColor = frs;
		g.setColor(fillColor);
		if(j==5) g.setColor(Color.WHITE);
                g.fillRoundRect(0, 0, c.getWidth()-1,c.getHeight()-1, 20,20);
            }
            paint(g, c);
        }
    });
        b[as].setBackground(Color.WHITE);
        b[as].setForeground(Color.BLACK);
	b[as].setFont(b[as].getFont().deriveFont(14.0f));
	b[as].setUI(new BasicButtonUI() {
        @Override
        public void update(Graphics g, JComponent c) {
            if (c.isOpaque()) {
                Color fillColor = Color.WHITE;
                g.setColor(fillColor);
                g.fillRoundRect(-5, -5, c.getWidth()+10,c.getHeight()+10,0,0);
            }
            paint(g, c);
        }
    });
	b[as].setBorder(new RoundedsBorder(20));
	}
		});
if(t1!=null) t1.interrupt();
t2.setPriority(10);
t2.start();
	    } }
}
	public static void main(String asd[])
	{
SwingUtilities.invokeLater(new Runnable()
{
public void run()
{
new LoginP(asd[0],asd[1]);
}
});
}
}
