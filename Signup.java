import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;  
import java.net.*;
import java.util.*;
import javax.imageio.*;
import java.awt.image.*;
import java.sql.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.text.*;
import static javax.swing.ScrollPaneConstants.*;
interface UJ
{
	static int asw=0;
}
class RoundedsBorder implements Border 
{
        int radius,asde;
        RoundedsBorder(int radius) 
	{
        this.radius = radius;
	}
        public Insets getBorderInsets(Component c) 
	{
         return new Insets(7,30,7,30);
	}
        public boolean isBorderOpaque() 
	{
            return false;
        }
 public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) 
{
g.setColor(Color.GREEN);
g.drawRect(x,y,width-1,height-1);
}
}
class Signup implements FocusListener
{
	int asq=0;
int aer=0;
int kiko=0;
int finals=0;
ResultSet famid=null;
int checkid=0;
JTextField td1;
JTextField td2;
JComboBox<Object> jstate;
JTextArea jta;
JScrollPane scrolltxt;
JTextField pint;
JTextField cityt;
Dimension top;
static JPanel tempor;
int iisc=0;
int nids=0;
static GridBagLayout gbl;
static JOptionPane old;
ArrayList<JPanel> rembt=new ArrayList<JPanel>();
String ids="";
int count=0;
int flagss=0;
int gits=0;
Connection con=null;
PreparedStatement stmt45=null;
PreparedStatement stmt46=null;
ArrayList<JTextField> bits=new ArrayList<JTextField>();
ArrayList<JComboBox> bits25=new ArrayList<JComboBox>();
JButton mju;
	int io=0;
Font frat=new Font("Segoe UI",Font.PLAIN,20);
JButton tyu;	
Color c1;
JScrollPane jst;
	String ind[]=new String[11];
	int fid=0;
	static JPanel frt;
JPanel frr;
	Object[] objarray1;
	Object[] objarray2;
        JButton b[]=new JButton[4];
	JButton del=null;
	ArrayList<Integer> vec=new ArrayList<Integer>();
	ArrayList<Integer> vec1=new ArrayList<Integer>();
	Thread t1,t2;
	JLabel labelP,labelP1;
	String las[]={"Name","Email ID","Blood Group","Contact","Login_Password","Gender","Designation","DOB(Date of Birth)","DOJ(Date of Join)","Aadhaar number"};
	public JFrame f1=new JFrame("Sign_Up Portal");
	JButton b97;
	int erno=0;
	JPanel main;
	int hexg=0;
	JPanel p1,for1,for2;
	JLabel extra;
	int flags=0;
	int flags1=0;
	JLabel extra1;
	static JButton mj;
	JPanel extraP;
	JPanel p2[];
	JLabel lie1,lie2;
	JPanel extraP1;
	JButton b1;
	JPanel p7;
	JPanel corner;
	static GridBagConstraints gbc,gbcd;
	GridBagLayout layout;
	JPanel temp[];
	JLabel l1[];
	JTextField tf[];
	JLabel l45[];
	int jira=0;
	JPanel kos=null;
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
	public void focusGained(FocusEvent fe)
	{
		if((tf[4].getText()).equals("only 8 alphabets"))
		{
			tf[4].setText("");
			tf[4].setForeground(new Color(0,0,0));
		}
	}
	public void focusLost(FocusEvent fe)
	{
		if((tf[4].getText()).equals("")) {
			tf[4].setForeground(new Color(0,0,0,80));
				tf[4].setText("only 8 alphabets");
		}
		else if((tf[4].getText()).equals("only 8 alphabets"))
		{
			tf[4].setForeground(new Color(0,0,0,80));
		//	tf[4].setText("only 8 characters");
		}
	}
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
f1.dispose();
String qa[]=new String[2];
qa[0]="inijn";
qa[1]="bjnjn";
Home.main(qa);
		}
	}
	Signup()
	{
	}
Signup(int bhyt)
	{
top=new Dimension(100,100);
tempor=new JPanel();
tempor.setLayout(new GridLayout(1,1));
old=new JOptionPane();
tyu=new JButton("Bank & Family");
try
{
	 UIManager.setLookAndFeel(
UIManager.getSystemLookAndFeelClassName());
	}
	catch(Exception mk){}
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
b1=new JButton("Submit");
extraP=new JPanel();
extraP.setBackground(Color.white);
extraP1=new JPanel();
extraP1.setBackground(Color.white);		
try
{
nh=new JPanel();
nh.setLayout(new GridLayout(1,1));
JLabel kj=new JLabel("Sign_Up Portal");
labelP = new JLabel(new ImageIcon(getClass().getResource(URLEncoder.encode("cray.jpg", "UTF-8"))));
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
jdob1=new JComboBox<>(objarray1);  // jdob1
jdob2=new JComboBox<>(dob2);
jdob2.addItemListener(new Item(0));
jdob3=new JComboBox<>(objarray2); // jdob3
jdob3.addItemListener(new Item(0));
jdoj1=new JComboBox<>(objarray1);  // jdoj1
jdoj2=new JComboBox<>(dob2);
jdoj2.addItemListener(new Item(1));
jdoj3=new JComboBox<>(objarray2);  // jdoj3
jdoj3.addItemListener(new Item(1));
jcb0=new JComboBox<>(las512);
jcb5=new JComboBox<>(las1024);
		main=new JPanel();
		corner =new JPanel();
corner.setBackground(Color.white);
		corner.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		temp=new JPanel[15];
		l45=new JLabel[15];
		l1=new JLabel[15];
		tf=new JTextField[15];
tf[4]=new JTextField(30);
tf[4].setForeground(new Color(0,0,0,80));
tf[4].setText("only 8 alphabets");
tf[4].setForeground(new Color(0,0,0,80));
tf[4].addFocusListener(this);
p2=new JPanel[15];
f1.setBackground(Color.white);
JPanel jes=new JPanel();
jes.setLayout(new GridLayout(1,2));
JPanel jet=new JPanel();
jet.setLayout(new FlowLayout(FlowLayout.CENTER));
p1=new JPanel();
p1.setBackground(Color.white);
layout = new GridBagLayout();
p1.setLayout(layout);        
gbc = new GridBagConstraints();
gbc.fill = GridBagConstraints.HORIZONTAL;
gbc.gridx = 0;      
gbc.gridy = 0;
gbc.insets=new Insets(0,0,20,0);
p7=new JPanel();
p7.setBackground(Color.white);
p7.setLayout(new GridLayout(20,1,0,0));
main.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));	
main.setBackground(Color.white);
f1.setLayout(new BorderLayout());
f1.setVisible(true);
f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
f1.setResizable(false);
jcb1.setPrototypeDisplayValue("Bits Pilani Hyb campus is awesome but not as ");
jcb2.setPrototypeDisplayValue("Bits Pilani Hyb campus is awesome but not as ");
jcb3.setPrototypeDisplayValue("Bits Pilani Hyb campus is awesome but not as ");
jcb0.setPrototypeDisplayValue("Bits Pilani Hyb campus is awesome but not as ");
jcb5.setPrototypeDisplayValue("Bits Pilani Hyb campus is awesome but not as ");
JLabel ko1=new JLabel("/");
JLabel ko2=new JLabel("/");
JLabel ko3=new JLabel("/");
JLabel ko4=new JLabel("/");
for(int i=0;i<10;i++)
{
l45[i]=new JLabel(":");
temp[i]=new JPanel();
temp[i].setBackground(Color.white);
p2[i]=new JPanel();
p2[i].setBackground(Color.white);
GridBagLayout layouts = new GridBagLayout();
p2[i].setLayout(layouts);        
GridBagConstraints gbcde = new GridBagConstraints();
gbcde.fill = GridBagConstraints.HORIZONTAL;
gbcde.insets=new Insets(0,0,0,0);
temp[i].setLayout(new FlowLayout(FlowLayout.LEFT));
JPanel loo=new JPanel();
l1[i]=new JLabel(las[i]);
l1[i].setFont(frat);
l1[i].setLayout(new FlowLayout(FlowLayout.RIGHT));
if(i!=4) tf[i]=new JTextField(30);
else {
	tf[4].setForeground(new Color(0,0,0,80));
}
	tf[4].setForeground(new Color(0,0,0,80));
	tf[4].setText("only 8 alphabets");
temp[i].add(l45[i]);
if(i==2)		
{
temp[i].add(jcb3);
}
else if(i==5) 
{
	temp[i].add(jcb0);
}
	else if(i==6) 
{
	temp[i].add(jcb5);
}
	else if(i==7) 
{
temp[i].add(jdob3);
temp[i].add(ko1);
temp[i].add(jdob2);
temp[i].add(ko2);
temp[i].add(jdob1);
}
else if(i==8) 
{
temp[i].add(jdoj3);
temp[i].add(ko4);
temp[i].add(jdoj2);
temp[i].add(ko3);
temp[i].add(jdoj1);
} 
else		
{
JLabel jto;
if(i==4) 
{
c1=new Color(0,0,0,80);
tf[i].setForeground(new Color(0,0,0));
flags=0;
}
else if(i==9)        
{
c1=new Color(0,0,0,80);
tf[i].setForeground(new Color(0,0,0));
tf[i].setText("");
flags1=0;
}
temp[i].add(tf[i]);
}
gbcde.gridx = 0;      
gbcde.gridy = 0;
p2[i].add(l1[i],gbcde);
gbcde.gridx = 1;      
gbcde.gridy = 0;
p2[i].add(temp[i],gbcde);
gbc.gridx = 0;      
gbc.gridy = i;
p1.add(l1[i],gbc);
gbc.gridx = 1;      
gbc.gridy = i;
p1.add(temp[i],gbc);
	}
JLabel lte=new JLabel("Division");
lte.setFont(frat);
lte.setBackground(Color.white);
JLabel lte1=new JLabel("Grade Pay");
lte1.setBackground(Color.white);
lte1.setFont(frat);
p2[11]=new JPanel();
p2[11].setLayout(new GridLayout(1,2));
p2[11].setBackground(Color.white);
p2[10]=new JPanel();
p2[10].setBackground(Color.white);
p2[10].setLayout(new GridLayout(1,2));
p2[10].add(lte);
extraP.add(extra1);
extraP.add(jcb1);
p2[10].add(extraP);
p2[11].add(lte1);
gbc.gridx = 0;      
gbc.gridy = 10;
p1.add(lte,gbc);
gbc.gridx = 0;      
gbc.gridy = 11;
p1.add(lte1,gbc);
gbc.gridx = 1;      
gbc.gridy = 10;
JPanel pos1=new JPanel();
pos1.setBackground(Color.WHITE);
pos1.setLayout(new FlowLayout(FlowLayout.LEFT));
pos1.add(extra);
pos1.add(jcb1);
p1.add(pos1,gbc);
gbc.gridx = 1;      
gbc.gridy = 11; 
JPanel pos12=new JPanel();
pos12.setBackground(Color.WHITE);
pos12.setLayout(new FlowLayout(FlowLayout.LEFT));
pos12.add(extra1);
pos12.add(jcb2);
p1.add(pos12,gbc);
JButton hya=new JButton("BITS");
jet.add(p1);
jes.add(jet);
jes.add(p7);
jes.setBackground(Color.WHITE);
jet.setBackground(Color.WHITE);
JPanel jo=new JPanel();
jo.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
jo.setBackground(Color.WHITE);
jo.add(b1);
jo.add(b97);
gbc.gridx = 0;      
gbc.gridy = 12;
gbc.gridwidth=2;;
tyu.setBackground(Color.WHITE);
tyu.setForeground(Color.BLACK);
tyu.setFocusPainted(false);
tyu.setFont(frat);
tyu.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
p1.add(tyu,gbc);
main.add(p1);
f1.add(main,"Center");
f1.add(labelP,"North");
f1.add(jo,"South");
tyu.addMouseListener(new MKI(3," ",0));
b97.addMouseListener(new MKI(2," ",0));
b97.setFont(b97.getFont().deriveFont(14.0f));
b1.addMouseListener(new MKI(1," ",0));
b1.setFont(b1.getFont().deriveFont(14.0f));
b1.setBorder(new RoundedsBorder(20));	
b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
b1.setPreferredSize(new Dimension(140,40));
b1.setBounds(20,50,20,50);
b1.setForeground(Color.WHITE);	
b1.setBackground(Color.GREEN);
b97.setPreferredSize(new Dimension(140,40));
b97.setBackground(Color.GREEN);
b97.setBounds(20,50,20,50);
b97.setBorder(new RoundedsBorder(20));	
b97.setForeground(Color.WHITE);
tyu.setFont(tyu.getFont().deriveFont(14.0f));	
b97.setCursor(new Cursor(Cursor.HAND_CURSOR));
tyu.setBackground(Color.WHITE);
tyu.setCursor(new Cursor(Cursor.HAND_CURSOR));    
b[1]=b1;
b[2]=b97;	
b[3]=tyu;
for(int as=1;as<=2;as++)
{
 	b[as].setFont(b[as].getFont().deriveFont(14.0f));
	b[as].setUI(new BasicButtonUI() {
        @Override
        public void update(Graphics g, JComponent c) {
            if (c.isOpaque()) {
		   g.setColor(Color.WHITE);
		    g.fillRect(-10, -10, c.getWidth()+10,c.getHeight()+10);            	    
	    }
            paint(g, c);
        }
    });		
b[as].setUI(new BasicButtonUI() {
        @Override
        public void update(Graphics g, JComponent c) {
            if(c.isOpaque()) {
                Color fillColor = new Color(0,255,0);
	g.setColor(fillColor);
                g.fillRect(0, 0, c.getWidth()-1,c.getHeight()-1);
            }
            paint(g, c);
        }
    });   
} 
int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED ;
int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED ;
JScrollPane js = new JScrollPane( p1, v, h ) ;
f1.add(js, BorderLayout.CENTER);		
js.setBorder(new LineBorder(Color.WHITE));
	}
public class BITSS extends FocusAdapter
{
	int as=0;
	BITSS(int ds)
	{
		as=ds;
	}
public void focusGained(FocusEvent fe)
{
if(as>=1000)
{	
if(flags==0 && as==1004) 
{
tf[as-1000].setText("");
flags=1;
tf[as-1000].setForeground(Color.BLACK);
}
if(flags1==0 && as==1009) 
{
tf[as-1000].setText("");
flags1=1;
tf[as-1000].setForeground(Color.BLACK);
}
}
}
public void focusLost(FocusEvent fe)
{
if(as>=1000)
{
	if((tf[as-1000].getText()).equals(""))
{
if(as==1004) 
{
tf[as-1000].setText("max 8 characters.(No Whitepaces & must start with an alphabet)");
tf[4].setForeground(new Color(0,0,0));
flags=0;
}
else if(as==1009)        
{
tf[as-1000].setText("ex. 424847152804");
tf[as-1000].setForeground(new Color(0,0,0));
flags1=0;
}	
}
}
}
}
public class GIT implements ActionListener
{
	int asw=0;
public GIT()
	{

	}
public GIT(int a)
	{
		asw=a;
	}
public void actionPerformed(ActionEvent as)
	{
if(del!=null)
{
del.setBackground(new Color(0,0,0,0));
del.setForeground(new Color(0,0,0,0));
del.setBorderPainted(false);
del.setContentAreaFilled(false);
del.setFocusPainted(false);
for( ActionListener al : del.getActionListeners() ) {
        del.removeActionListener( al );
    }
}
if(mju!=null) 
{
frt.remove(mju);
}
if(asw==50)
{
bits.remove(bits.size()-1);
bits.remove(bits.size()-1);
bits.remove(bits.size()-1);
bits25.remove(bits25.size()-1);
bits25.remove(bits25.size()-1);
iisc--;
	if(count>1)
	{
	mju=new JButton("Add Member ?");
	mju.addActionListener(new GIT());
	frt.remove(rembt.get(count-1));
	rembt.remove(count-1);
	gbcd.gridx=0;
	gbcd.gridy=11+io;
	gbcd.gridwidth=1;
	gbcd.gridheight=1;
	gbcd.fill = GridBagConstraints.NONE;
	frt.add(mju,gbcd);
Component[] component = (rembt.get(count-2)).getComponents();
    for(int i=0; i<component.length; i++)
    {
        if (component[i] instanceof JButton)
        {
        JButton del = (JButton)component[i];
        (rembt.get(count-2)).remove(del);
	}
    }
	del=new JButton("Remove?");
	del.addActionListener(new GIT(50));
	(rembt.get(count-2)).add(del);
	 frt.revalidate();
	frt.repaint();	
count--;
io--;
}
else
{
frt.remove(rembt.get(0));
rembt.remove(0);
mj.setVisible(true);
asw=1;   // 4 asw
io=0;
count=0;
}
} 
if(asw==0)
{
	iisc++;   // 1  iisc
	mju=new JButton("Add Member ?");
		mju.addActionListener(new GIT());   // 2  io
		if(io==0)
		{
		io++;
		mj.setVisible(false);
		}
	kos=new JPanel();
	JLabel sno=new JLabel(io+" :");
	kos.setLayout(new FlowLayout(FlowLayout.LEFT,15,10));		
	del=new JButton("Remove?");
	JLabel loi0=new JLabel("UIDAI :");
	JLabel loi=new JLabel("Name :");
	JLabel loi1=new JLabel("Age :");
	JLabel loi2=new JLabel("Relation :");
	JLabel loi3=new JLabel("Gender :");
JTextField loit=new JTextField(22);
JTextField loit1=new JTextField(4);
JTextField loit0=new JTextField(12);
String ret[]={"Select","Child","Spouse"};
String ret1[]={"Choose","Male","Female","Others"};
JComboBox<Object> loit2=new JComboBox<>(ret);
JComboBox<Object> loit3=new JComboBox<>(ret1);
if(checkid==1)
{
	try
	{
	loit.setText(famid.getString(1));
	loit1.setText(famid.getString(3));
loit2.setSelectedItem(famid.getString(4));
loit3.setSelectedItem(famid.getString(2));
loit0.setText(famid.getString(6));	
if(asq==1) {
	loit.setEditable(false);
	loit1.setEditable(false);
	loit0.setEditable(false);
	loit2.setEnabled(false);
	loit3.setEnabled(false);
}
	}
catch(Exception mjki){}	
}
kos.add(sno);	
kos.add(loi0);
kos.add(loit0);
kos.add(loi);
del.addActionListener(new GIT(50));
kos.add(loit);
kos.add(loi1);
kos.add(loit1);
kos.add(loi2);
kos.add(loit2);
kos.add(loi3);
kos.add(loit3);
kos.add(del);
rembt.add(kos);
bits.add(loit0);
bits.add(loit);
bits.add(loit1);
bits25.add(loit2);
bits25.add(loit3);	
GridBagConstraints qaw=new GridBagConstraints();
qaw.gridx=0;
qaw.gridy=11+io;
qaw.gridheight=1;
qaw.gridwidth=jst.getWidth();
qaw.fill = GridBagConstraints.NONE;		
frt.add(kos,qaw);
qaw.gridx=0;
qaw.gridy=11+io+1;
qaw.gridwidth=1;
qaw.gridheight=1;
frt.add(mju,qaw);
frt.revalidate();
frt.setVisible(true);
frt.repaint();
jst.setVisible(true);
jst.revalidate();
jst.repaint();	
io++;
count++;
}
JScrollBar verticalBar = jst.getVerticalScrollBar();
    int topOrBottom = verticalBar.getMaximum();
    AdjustmentListener scroller = new AdjustmentListener() {
        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            Adjustable adjustable = e.getAdjustable();
            adjustable.setValue(topOrBottom);
            verticalBar.removeAdjustmentListener(this);
        }
    };
    verticalBar.addAdjustmentListener(scroller);	
	frt.revalidate();
	frt.setVisible(true);
	frt.repaint();
jst.setVisible(true);
jst.revalidate();
jst.repaint();
if(asq==1) {
	mju.setVisible(false);
	del.setVisible(false);
}
	}
}
class MKI extends MouseAdapter {
	int as = 0;
	String ext;
	int admin=0;
	MKI(int ju, String ext,int admin) {
		as = ju;
		this.ext = ext;
this.admin=admin;
	asq=admin;
	}
	public void mouseEntered(MouseEvent evt) {
		if (as == 3 && ext.equals(" ")) {
b[as].setBackground(Color.GREEN);
			b[as].setFont(frat);
			b[as].setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
		}
		if (ext.equals(" ")) {
			t1 = new Thread(new Runnable() {
				public void run() {
					try {
						if (t1.isInterrupted()) {
							throw new Exception();
						}
						for (int i = 1; i <= 6; i++) {
							final int yy = i;
			b[as].setFont(b[as].getFont().deriveFont(14.0f + i));
							Thread.sleep(25);
						}
					} catch (Exception ik) {
						b[as].setFont(b[as].getFont().deriveFont(14.0f));
					}
				}

			});
			t1.setPriority(10);
			t1.start();
		}
	}
	public void mousePressed(MouseEvent evt) {
		if (as == 3 && ext.equals(" ")) {
			b[as].setFont(frat);
			b[as].setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		}
		if (ext.equals(" ")) {
			b[as].setFont(b[as].getFont().deriveFont(18.0f));
		}
	}

	public void mouseClicked(MouseEvent evt) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.91.25:1521:xe", "system", "oracle");
		}
		catch(Exception mj)
		{
			mj.printStackTrace();
		}
		if (as == 3) {
			System.out.println("I entered");
			ResultSet rsty = null;
			ResultSet rstys = null;
			if (!(ext.equals(" "))) {
				try {
					PreparedStatement stmta = con.prepareStatement("select * from Bits.BAA where id='" + ext + "'");
					PreparedStatement stmtas = con.prepareStatement("select name from Bits.employee where id='" + ext + "'");
					rsty = stmta.executeQuery();
					rstys = stmtas.executeQuery();
					rsty.next();
					rstys.next();
					System.out.println("Fetched the name");
				} catch (Exception frt) {
				}
				checkid = 1;
				System.out.println("Made checkid=1 and nids="+nids);
			}
			if (nids == 0) {
				frt = new JPanel();
				gbl = new GridBagLayout();
				frt.setLayout(gbl);
			td1 = new JTextField(25);
			td2 = new JTextField(25);
			}
			gbcd = new GridBagConstraints();
			gbcd.fill = GridBagConstraints.HORIZONTAL;
			gbcd.gridx = 0;
			gbcd.gridy = 0;
			gbcd.insets = new Insets(5, 5, 5, 5);
			JLabel title = new JLabel("Bank Credentails:");
			title.setFont(frat);
			JLabel bname = new JLabel("Name (Account Holder's) :");
			JLabel bacno = new JLabel("Account No. :");
			JLabel bifsc = new JLabel("IFSC Code :");
			JLabel title2 = new JLabel("Residence:");
			title2.setFont(frat);
			JLabel city = new JLabel("City :");
			JLabel pin = new JLabel("PIN :");
			JLabel state = new JLabel("State :");
			JLabel address = new JLabel("Address :");
			JLabel named = null;
			if (checkid == 0)
				named = new JLabel(" " + tf[0].getText());
			if (checkid == 1) {
				try {
					named = new JLabel(rstys.getString(1));
				} catch (Exception mj) {
				}
			}
			if (nids == 0) {
				frt.add(title, gbcd);
				gbcd.gridx = 0;
				gbcd.gridy = 1;
				frt.add(bname, gbcd);
				gbcd.gridx = 1;
				gbcd.gridy = 1;
				frt.add(named, gbcd);
				gbcd.gridx = 2;
				gbcd.gridy = 1;
				frt.add(bacno, gbcd);
				gbcd.gridx = 3;
				gbcd.gridy = 1;
				frt.add(td1, gbcd);
				gbcd.gridx = 4;
				gbcd.gridy = 1;
				frt.add(bifsc, gbcd);
				gbcd.gridx = 5;
				gbcd.gridy = 1;
				String sq[] = {"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal", "Andaman and Nicobar Islands", "Dadar and Nagar Haveli", "Daman and Diu", "Delhi", "Lakshadweep", "Puducherry"};
				jstate = new JComboBox<>(sq);
				jta = new JTextArea(5, 10);       //JTextArea jta
				jta.setBorder(new LineBorder(Color.lightGray,1));
				jta.setLineWrap(true);
				jta.setWrapStyleWord(true);
				scrolltxt = new JScrollPane();    // JScrollPane scrolltxt
				pint = new JTextField(25);              // JTextField pint
				cityt = new JTextField(25);   // JTextField cityt
				if (checkid == 1) {
					try {
						jta.setText(rsty.getString(1));
						cityt.setText(rsty.getString(2));
						pint.setText(rsty.getString(3));
						td1.setText(rsty.getString(5));
						td2.setText(rsty.getString(6));
						jstate.setSelectedItem(rsty.getString(4));
					} catch (Exception mhju) {
					erno=1;
					}
						if (admin == 1)
						{
							System.out.println("Admin came!!!!!!!!!!!!!!");
							jta.setEditable(false);
						cityt.setEditable(false);
						pint.setEditable(false);
						td1.setEditable(false);
						td2.setEditable(false);
						for (Component gh : jstate.getComponents()) {
							if (gh instanceof JButton) {
								gh.setVisible(false);
							}
						}
					jstate.setEnabled(false);
						}
				}
			}
			if (nids == 0) {
				frt.add(td2, gbcd);
				gbcd.gridx = 0;
				gbcd.gridy = 2;
				frt.add(title2, gbcd);
				gbcd.gridx = 0;
				gbcd.gridy = 3;
				frt.add(city, gbcd);
				gbcd.gridx = 1;
				gbcd.gridy = 3;
				frt.add(cityt, gbcd);
				gbcd.gridx = 2;
				gbcd.gridy = 3;
				frt.add(state, gbcd);
				gbcd.gridx = 3;
				gbcd.gridy = 3;
				frt.add(jstate, gbcd);
				gbcd.gridx = 4;
				gbcd.gridy = 3;
				frt.add(pin, gbcd);
				gbcd.gridx = 5;
				gbcd.gridy = 3;
				frt.add(pint, gbcd);
				gbcd.gridx = 0;
				gbcd.gridy = 4;
				frt.add(address, gbcd);
				gbcd.gridx = 1;
				gbcd.gridy = 4;
				gbcd.gridheight = 5;
				scrolltxt.setViewportView(jta);
				scrolltxt.setWheelScrollingEnabled(true);
				scrolltxt.setBorder(new LineBorder(Color.WHITE));
				if (nids == 0) frt.add(scrolltxt, gbcd);
				if (ext.equals(" ")) {
					b[as].setFont(frat);
					b[as].setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
				}
			}
			if (nids == 0) 
			{
				mj = new JButton("Add Family");
				if(erno==1 && admin==1) mj.setVisible(false);
				GIT yhu =new GIT();
				mj.addActionListener(yhu);
				JLabel fam = new JLabel("Family Details:");
				fam.setFont(frat);
				gbcd.gridx = 0;
				gbcd.gridy = 10;
				gbcd.gridwidth = 2;
				gbcd.gridheight = 2;
				frt.add(fam, gbcd);
				gbcd.gridx = 1;
				gbcd.gridy = 10;
				gbcd.gridwidth = 1;
				frt.add(mj, gbcd);
				int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
				int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
				jst = new JScrollPane(frt, v, h);
				jst.setWheelScrollingEnabled(true);
				jst.setBorder(new LineBorder(new Color(0, 0, 0, 0)));
				jst.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
				top = jst.getPreferredSize();
			if(checkid==1) {
				jst.setPreferredSize(top);
				if (erno != 1)
				{
					try {
						PreparedStatement stmta = con.prepareStatement("select * from Bits.family where id='" + ext + "' order by uidai", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
						famid = stmta.executeQuery();
						while (famid.next()) {
							//		if(famid.next()==famid.last()) finals=1;
							mj.doClick();
//					if(famid.next()==famid.last()) finals=1;
						kiko++;
						}
					}
					catch (Exception frt) {
					}
			if(kiko==0 && admin==1) mj.setVisible(false);
				}
			}
			}
			if (nids == 1) 
			{
				jst = new JScrollPane();
				jst.setPreferredSize(top);
				jst.setViewportView(frt);
				jst.setWheelScrollingEnabled(true);
				jst.setBorder(new LineBorder(new Color(0, 0, 0, 0)));
				jst.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
				jira = 1;
			}
			Object[] options = {"    Save    ", "    Cancel   "};
			old = new JOptionPane();
			int result = 0;
			if(admin==1)
			{
				Object[] optionss = {"    Close    "};
				result = old.showOptionDialog(null, jst, "Bank & Family", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE, null, optionss, optionss[0]);
			}
		else	result = old.showOptionDialog(null, jst, "Bank & Family", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
			if (result == JOptionPane.OK_OPTION && admin==0) {
				flagss = 1;
				try {
PreparedStatement stmt465 = con.prepareStatement("select uidai from bits.family");
PreparedStatement stmt4656 = con.prepareStatement("select udai from bits.employee");
	if(checkid==1)	
	{
		PreparedStatement stre=con.prepareStatement("delete from bits.BAA where id='"+ext+"'");
		stre.execute();
		stre=con.prepareStatement("delete from bits.family where id='"+ext+"'");
		stre.execute();
	}
	stmt45 = con.prepareStatement("insert into Bits.BAA(address,city,pin,state,acno,ifsc,id) values(?,?,?,?,?,?,?)");
	String hut=td1.getText();
	if(hut.length()>34 || hut.length()<6) throw new Exception("Account_No.");
/*while(xsd<hut.length())
{
if(!(hut.charAt(xsd)>=48 && hut.charAt(xsd)<=57)) throw new Exception("Account_No.");
xsd++;
} */
					if(fsdd(hut)) throw new Exception("Account_No.");
if(((jta.getText()).equals(""))) throw new Exception("Address");
	stmt45.setString(1, jta.getText());
					String chk="";
					chk=cityt.getText();
					if(chk.length()>20 || chk.equals("") || chk.charAt(0)==' ' || chk.charAt(chk.length()-1)==' ') throw new Exception("City");
					chk=pint.getText();
					if(chk.length()!=6) throw new Exception("PIN");
					else
					{
/*
						int xsd=0;
while(xsd<chk.length())
{
if(!(chk.charAt(xsd)>=48 && chk.charAt(xsd)<=57)) throw new Exception("PIN");
xsd++;
}  */
					if(fsdd(chk)) throw new Exception("PIN");
					}
					chk=td2.getText();
					if(chk.length()!=11) throw new Exception("IFSC");
					if(fsdd(chk)) throw new Exception("IFSC");
					stmt45.setString(2, cityt.getText());
					stmt45.setString(3, pint.getText());
					stmt45.setString(4, jstate.getSelectedItem().toString());
					stmt45.setString(5, td1.getText());
					stmt45.setString(6, td2.getText());
					if((iisc*3)>0)
					{
						int yhus=0;
						for (int i = 0; i < iisc * 3; i += 3) {
							String paswq=(bits.get(i)).getText();
							if(paswq.length()!=12)
							{
								throw new Exception("UIDAI");
							}
							else  if(fsdd(paswq)) throw new Exception("UIDAI");
							else
							{
								ResultSet udais=stmt465.executeQuery();
								ResultSet udaiss=stmt4656.executeQuery();
								while(udais.next())
								{
									if(paswq.equals(udais.getString(1))) throw new Exception("UIDAI-");
								}
								while(udaiss.next())
								{
									if(paswq.equals(udaiss.getString(1))) throw new Exception("UIDAI-");
								}
								int jj=0,jjh=0;
								while(jj<iisc*3)
								{
									if(paswq.equals(bits.get(jj).getText())) jjh++;
									if(jjh>1) throw new Exception("UIDAI-");
									jj+=3;
								}
							}
							paswq=((bits.get(i + 1)).getText());
							if(paswq.length()==0 || paswq.charAt(0)==' ' || paswq.charAt(paswq.length()-1)==' ')    throw new Exception("Name");
							if((fsdd1(paswq))) throw new Exception("Name");
							paswq=(bits.get(i + 2)).getText();
							if(paswq.length()>2) throw new Exception("Age");
if(fsdd(paswq)) throw new Exception("Age");
							if(i>=3) yhus+=1;
							if(((bits25.get(i-yhus)).getSelectedItem().toString()).equals("Select")) throw new Exception("Relation");
							if(((bits25.get(i + 1-yhus)).getSelectedItem().toString()).equals("Choose")) throw new Exception("Gender");
						}
					}
					if(checkid==1)
					{
					stmt45.setString(7,ext);
					stmt45.execute();
int yhus=0;
PreparedStatement stq = con.prepareStatement("insert into Bits.FAMILY(uidai,name,age,relation,gender,id) values(?,?,?,?,?,?)");
				for (int i = 0; i < iisc * 3; i += 3) {
					stq.setString(1,(bits.get(i)).getText());
					stq.setString(2, (bits.get(i + 1)).getText());
					stq.setString(3, (bits.get(i + 2)).getText());
if(i>=3) yhus+=1; 				
stq.setString(4, (bits25.get(i-yhus)).getSelectedItem().toString());
				stq.setString(5, (bits25.get(i + 1-yhus)).getSelectedItem().toString());
					stq.setString(6, ext);
					stq.executeUpdate();
					con.commit();
				}					
				}
					ImageIcon ic = new ImageIcon(getClass().getResource(URLEncoder.encode("MKI.png", "UTF-8")));
					JOptionPane.showMessageDialog(null, "Bank & Family details saved", "Bank & Family Submission", JOptionPane.ERROR_MESSAGE, ic);
				}
	catch (Exception m) 
{
		StringTokenizer ders=new StringTokenizer(m.toString()," ");
		ders.nextToken();
		String mt=ders.nextToken();
		if(mt.equals("UIDAI-"))
		{
		mt="UIDAI already exists";
		}
		else
		{
		mt+=" is invalid";
		}		
	JOptionPane.showMessageDialog(null, "Error: "+mt, "Invalid Data!", JOptionPane.ERROR_MESSAGE);				
	if(aer==0)
	{
	nids = 1;
	this.mouseClicked(evt);
	}
	}
	nids = 1;
	} 
else if(admin==0)
{
nids = 1;
}
		} else {
			if (as == 2) {
				f1.dispose();
				String qa[] = new String[2];
				qa[0] = "inijn";
				qa[1] = "bjnjn";
				Home.main(qa);
			}
			if (as == 1) {				
						String paswq="";
				try {
							for(int yu=0;yu<4;yu++)
					{
					if(yu==2) continue;
					String chk="";
					chk=tf[yu].getText();
					if(chk.equals("") || (chk.charAt(0)==' ') || (chk.charAt(chk.length()-1)==' ')) throw new Exception(las[yu]);
					if(yu==1)
					{
						int tempcar=0;
						String stri="";
						int jik=0,fine=0;
						while(tempcar<chk.length())
						{
							if(jik>=1) 
							{
								if(chk.charAt(tempcar)>=48 && chk.charAt(tempcar)<=57) throw new Exception(las[yu]);
								jik++;
							if(jik>=4 && chk.charAt(tempcar)=='.')
							{
								fine=1;
							}
							}
							if(fine==1) stri+=chk.charAt(tempcar);
					if(chk.charAt(tempcar)=='@') jik=1;	
						tempcar++;
						}
					if(stri.length()<3) throw new Exception(las[yu]);
					}
					if(yu==0)
					{
						if(fsdd1(chk))  throw new Exception(las[yu]);
					}
					if(yu==3)
					{
						int tempcar=0;
						if(chk.length()!=10) throw new Exception(las[yu]);
						if(fsdd(chk)) throw new Exception(las[yu]);
						}
					}
					if((jcb0.getSelectedItem().toString()).equals("--Choose--")) throw new Exception(las[5]);
					if((jcb3.getSelectedItem().toString()).equals("--Select--")) throw new Exception(las[2]);
					if((jcb5.getSelectedItem().toString()).equals("--Choose--")) throw new Exception(las[6]);				if((jcb2.getSelectedItem().toString()).equals("--Select PAY Scale--")) throw new Exception("PAY-SCALE");	
				if((jcb1.getSelectedItem().toString()).equals("--Select DIVISON--")) throw new Exception("DIVISION");
					int yesdata = 0;
					PreparedStatement stmt = con.prepareStatement("select * from Bits.employee order by ID asc", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
					PreparedStatement stmt1 = con.prepareStatement("insert into Bits.employee(name,email_id,gender,blood_group,login_password,designation,contact,dob,doj,grade_pay,division,id,udai) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
					ResultSet rs = stmt.executeQuery();
					while (rs.next()) {
						yesdata = 1;
					}
					ids = "AAAA0000";
					if (yesdata == 1) {
						rs.previous();
						ids = rs.getString(1);
						PPO mk = new PPO();
						ids = mk.f1(ids);
					}
//					System.out.println();
					stmt1.setString(12, ids);
					stmt1.setString(1, tf[0].getText());
					stmt1.setString(2, tf[1].getText());
					stmt1.setString(7, tf[3].getText());
					stmt1.setString(5, tf[4].getText());
					paswq=tf[9].getText();					
					if(paswq.length()!=12)
					{
						throw new Exception("Aadhaar Number");
					}
if(fsdd(paswq)) 			throw new Exception("Aadhaar Number");
					paswq=tf[4].getText();
					if(paswq.length()!=8)
					{
						throw new Exception("Password");
					}
					int xsd=0;
					while(xsd<paswq.length())
					{
						if(!((paswq.charAt(xsd)>= 65 && paswq.charAt(xsd)<=90) || (paswq.charAt(xsd)>= 97 && paswq.charAt(xsd)<=122))) throw new Exception("Password");
						xsd++;
					}
					stmt1.setString(3, jcb0.getSelectedItem().toString());
					stmt1.setString(4, jcb3.getSelectedItem().toString());
					stmt1.setString(6, jcb5.getSelectedItem().toString());
					stmt1.setString(10, jcb2.getSelectedItem().toString());
					stmt1.setString(11, jcb1.getSelectedItem().toString());
					stmt1.setString(9, jcb3.getSelectedItem().toString());
					stmt1.setString(13, tf[9].getText());
					String gt = jdob1.getSelectedItem().toString() + "-" + jdob2.getSelectedItem().toString() + "-" + jdob3.getSelectedItem().toString();
					SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy");
					java.util.Date dates = sdf1.parse(gt);
					java.sql.Date sqlStartDate = new java.sql.Date(dates.getTime());
			String		gt5 = jdoj1.getSelectedItem().toString() + "-" + jdoj2.getSelectedItem().toString() + "-" + jdoj3.getSelectedItem().toString();
					sdf1 = new SimpleDateFormat("dd-MMM-yyyy");
					dates = sdf1.parse(gt5);
					java.sql.Date sqlStartDates = new java.sql.Date(dates.getTime());
int goa=0;
					PreparedStatement psa=con.prepareStatement("select floor(months_between(to_date('"+gt5+"','DD-Mon-YYYY'),to_date('"+gt+"','DD-Mon-YYYY')) /12) from dual");
ResultSet temps=psa.executeQuery();
temps.next();
goa=temps.getInt(1);
if(goa<0 || goa<25 || goa>50) throw new Exception("Date of Join");
					stmt1.setDate(8, sqlStartDate);
					stmt1.setDate(9, sqlStartDates);
					stmt1.execute();
					if (flagss == 1) {
int yhus=0;
for (int i = 0; i < iisc * 3; i += 3) {
stmt46 = con.prepareStatement("insert into Bits.FAMILY(uidai,name,age,relation,gender,id) values(?,?,?,?,?,?)");
stmt46.setString(1,((bits.get(i)).getText()));
stmt46.setString(2, (bits.get(i+1)).getText());
stmt46.setString(3, (bits.get(i + 2)).getText());
if(i>=3) yhus+=1;
stmt46.setString(4, (bits25.get(i-yhus)).getSelectedItem().toString());
stmt46.setString(5, (bits25.get(i + 1-yhus)).getSelectedItem().toString());
stmt46.setString(6, ids);
stmt46.execute();
}
	stmt45.setString(7, ids);
	stmt45.execute();
	flagss = 0;
					}

					con.close();
					String qa[] = new String[2];
					qa[0] = ids;
					qa[1] =paswq ;
ImageIcon ic = new ImageIcon(getClass().getResource(URLEncoder.encode("MKI.png", "UTF-8")));
JOptionPane.showMessageDialog(null, "Successfully Submitted", "Successful Submission", JOptionPane.ERROR_MESSAGE, ic);
					EmpLogin.main(qa);
					f1.dispose();
					Home.main(qa);
				} 
	catch (Exception m) {
		StringTokenizer ders=new StringTokenizer(m.toString()," ");
		ders.nextToken();
		String mt=ders.nextToken();
		if(mt.equals("ORA-00001:"))
		{
		mt="Member already exists";
		}
		else
		{
		mt+=" is invalid";
		}
	JOptionPane.showMessageDialog(null, "Error: "+mt, "Invalid Data!", JOptionPane.ERROR_MESSAGE);				}
}
		}
	}
	public void mouseReleased(MouseEvent mes) {
		if (ext.equals(" ")) {
			if (as != 3) {
				b[as].setFont(b[as].getFont().deriveFont(14.0f));
			}
		}
	}
public void mouseExited(MouseEvent evt) {
		if (as == 3 && ext.equals(" ")) {
			b[as].setFont(frat);
			b[as].setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		}
		if (ext.equals(" ")) {
			t2 = new Thread(new Runnable() {
				public void run() {
					for (int i = 1; i <= 6; i++) {
						b[as].setFont(b[as].getFont().deriveFont(18.0f - i));
						final Color frs = new Color(42 * i, 255, 42 * i);
						final int j = i;
						try {
							Thread.sleep(15);
						} catch (Exception mo) 
						{}
					}
					b[as].setFont(b[as].getFont().deriveFont(14.0f));
				}
			});
			if (t1 != null) t1.interrupt();
			t2.setPriority(10);
			t2.start();
		}
	}
}
static boolean fsdd(String hut)
{
	int xsd=0;
	if(hut.charAt(0)=='0') return true;
	while(xsd<hut.length())
	{
		if(!(hut.charAt(xsd)>=48 && hut.charAt(xsd)<=57)) return true;
		xsd++;
	}
return false;
}
	static boolean fsdd1(String hut)
	{
		int xsd=0;
		while(xsd<hut.length())
		{
			if(!((hut.charAt(xsd)>=65 && hut.charAt(xsd)<=90) || (hut.charAt(xsd)>=97 && hut.charAt(xsd)<=122) || (hut.charAt(xsd)==' '))) return true;
			xsd++;
		}
		return false;
	}
	public static void main(String asd[])
	{
SwingUtilities.invokeLater(new Runnable()
{
public void run()
{
new Signup(1023);
}
});
}
}