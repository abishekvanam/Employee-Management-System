import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.text.JTextComponent;
import javax.imageio.*;
import java.awt.image.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicButtonUI;
public class Admin
{
	int hyuj=0;
	int work=0;
	JPanel jat,jat1,jat2;
	JTextField sat=new JTextField(15);
	ArrayList<JComboBox<Object>> jst=new ArrayList<JComboBox<Object>>();
	public Thread t1,t2;
	public static Thread toa;
	JPanel fs1;
	static JFrame fs; 
JTextComponent editor=null;
	JPanel p1;
	JPanel p0[];
	JLabel nh;
	JLabel l1;
public 	static JButton b[];
	static Signup uh;
	Connection con=null;
	PreparedStatement stmt;
	ResultSet sets,sets2;
	public Admin(int tv)
	{
		try
{
	 UIManager.setLookAndFeel(
UIManager.getSystemLookAndFeelClassName());
	}
catch(Exception mk){
mk.printStackTrace();
}
	try 
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.91.25:1521:xe", "system", "oracle");
		} 
	catch (Exception mj) 
{
			mj.printStackTrace();
		}
	try
	{
nh = new JLabel(new ImageIcon(getClass().getResource(URLEncoder.encode("NMJ.jpg", "UTF-8"))));
nh.setBackground(Color.white);
nh.setOpaque(true);
	}
catch(Exception mk)
{
System.out.println("IMAGE not found ... ");
}
		p0=new JPanel[5];
		b=new JButton[5];
		Font fgt=new Font("Segoe UI",Font.PLAIN,24);
		l1=new JLabel("Railway Employee Management System");
		b[0]=new JButton("Manage Employee Details");
		b[1]=new JButton("Manage Events");
		b[3]=new JButton("Home");
	for(int asq=0;asq<=3;asq++)
{
if(asq==2) continue;
		b[asq].setFont(fgt);
	        b[asq].setUI(new BasicButtonUI() {
        @Override
        public void update(Graphics g, JComponent c) {
            if (c.isOpaque()) {
		   g.setColor(Color.WHITE);
		    g.fillRect(-10, -10, c.getWidth()+10,c.getHeight()+10);            	    
	    g.setColor(Color.BLUE);
                g.drawRoundRect(0, 0, c.getWidth()-1,c.getHeight()-1,20,20);            	    
	    }
            paint(g, c);
        }
    });		
	b[asq].addMouseListener(new BH(asq));
	b[asq].setCursor(new Cursor(Cursor.HAND_CURSOR));
	p0[asq]=new JPanel();	
	p0[asq].setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		p0[asq].setBackground(Color.WHITE);
		p0[asq].add(b[asq]);
		b[asq].setBorder(new RoundedrBorder(20,asq));
}		
		p1=new JPanel();
		p1.setLayout(new GridLayout(3,1,0,20));
		fs=new JFrame("REMS");
		p1.add(p0[0]);
		p1.add(p0[1]);
	        p1.add(p0[3]);
fs.setBounds(0, 0, 5000, 5000);
		fs.setLayout(new BorderLayout());
		fs.setBackground(Color.white);
if(tv==1)	fs.setVisible(true);
else            fs.setVisible(false);
fs.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fs.setResizable(true);
	fs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	p1.setBackground(Color.white);
	nh.setBackground(Color.white);
	fs.add(p1,"Center");
        fs.add(nh,"North");
	}
class BITSS implements ActionListener
{
	int hyu;
public BITSS(int gr)
{
hyu=gr;
}
public void actionPerformed(ActionEvent ae)
{
	System.out.println("OOPS!!");
	String uni[]=null;
try
{
uni=new String[1];
uni[0]=(jst.get(0)).getSelectedItem().toString();
hyuj=0;
}
catch(Exception kjkj)
{
	hyuj=1;
}
	if(hyu>=2)
	{
		System.out.println("OOPS!!");
String universal[]=new String[6];
for(int i=2;i<6;i++)
{
universal[i]=(jst.get(i)).getSelectedItem().toString();
if(universal[i].equals("")) universal[i]="%";
}
try
{
stmt=con.prepareStatement("select id from bits.employee where name like '"+universal[2]+"' and gender like '"+universal[3]+"' and division like '"+universal[4]+"' and Designation like '"+universal[5]+"' order by id asc",ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
sets=stmt.executeQuery();
}
catch(Exception mk){
mk.printStackTrace();
}
(jst.get(0)).removeAllItems();
ArrayList<String> mjki=new ArrayList<String>();
int limit=0;
try
{
while(sets.next())
{
limit++;
mjki.add(sets.getString(1));
}
}
catch(Exception mk)
{
// mk.printStackTrace();
}
TreeSet<String> s = new TreeSet<String>(mjki);
(jst.get(0)).addItem("");
for(int i=0;i<limit;i++)
{
(jst.get(0)).addItem((s.toArray())[i].toString());
}
}
else if(hyu==0 && hyuj==0) {
//	System.out.println((jst.get(0)).getSelectedItem());
		if (!(uni[0].equals(""))) {
			try {
				stmt = con.prepareStatement("select udai from bits.employee where id like '" + uni[0] + "'");
				sets = stmt.executeQuery();
			} catch (Exception mk) {
				mk.printStackTrace();
			}
			try {
				while (sets.next()) {
					sat.setText(sets.getString(1));
				}
			} catch (Exception mk) {
				mk.printStackTrace();
			}
			jat1.revalidate();
			jat1.repaint();
			jat.revalidate();
			jat.repaint();
		}
	else
		{
			sat.setText("");
		}
}
}
}
public class BH extends MouseAdapter
{
	int as=0;
	BH(int hy)
	{
        as=hy;
	}

    public void mouseExited(MouseEvent evt) 
    {
t2=new Thread(new Runnable()
		{
	public void run()
	{
		for(int i=1;i<=6;i++)
		{
if(work==1) 
{
i=6;
work=0;
} 
	        b[as].setFont(b[as].getFont().deriveFont(30.0f-i));
		
		Color frs=new Color(42*i,42*i,255);
		int j=i;
			b[as].setUI(new BasicButtonUI() {
        @Override
        public void update(Graphics g, JComponent c) {
            if (c.isOpaque()) {
                Color fillColor = frs;
                g.setColor(fillColor);
                g.fillRoundRect(0, 0, c.getWidth()-1,c.getHeight()-1, 20,20);
	    }
            paint(g, c);
        }
    });
	try
	{
Thread.sleep(25);
	}
	catch(Exception mo){}
		}	
        b[as].setForeground(Color.BLACK);
	b[as].setFont(b[as].getFont().deriveFont(24.0f));
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
	}
		});
if(t1!=null) t1.interrupt();    // t1.stop();
t2.setPriority(10);
t2.start();
    }
		public void mouseEntered(MouseEvent evt) 
		{
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
				if(!(t1.isInterrupted()))
				{
			for(int i=1;i<=6;i++)
			{
		b[as].setForeground(Color.WHITE);
		final int yy=i;
		Color cd=new Color(0,0,42*i);
            	 b[as].setFont(b[as].getFont().deriveFont(24.0f+i));
		     b[as].setUI(new BasicButtonUI() {
        @Override
        public void update(Graphics g, JComponent c) {
            if (c.isOpaque()) {
                Color fillColor =new Color(0,0,42*yy);
                g.setColor(fillColor);
                g.fillRoundRect(0, 0, c.getWidth()-1,c.getHeight()-1, 20, 20);
	    }
            paint(g, c);
        }
    });
Thread.sleep(35);
			}
			}
			}
			catch(Exception ik){
	b[as].setFont(b[as].getFont().deriveFont(24.0f));
        b[as].setForeground(Color.BLACK);
	b[as].setUI(new BasicButtonUI() {
        @Override
        public void update(Graphics g, JComponent c) {
            if (c.isOpaque()) {
		   g.setColor(Color.WHITE);
		    g.fillRect(-10, -10, c.getWidth()+10,c.getHeight()+10);            	    
	    g.setColor(Color.BLUE);
                g.drawRoundRect(0, 0, c.getWidth()-1,c.getHeight()-1,20,20);            	    
	    }
            paint(g, c);
        }
    });
f178(as);	
			}
			}
		});
t1.setPriority(10);
	t1.start();
b[as].setForeground(Color.BLACK);
	b[as].setUI(new BasicButtonUI() {
        @Override
        public void update(Graphics g, JComponent c) {
            if (c.isOpaque()) {
		   g.setColor(new Color(255,255,255));
		   g.fillRect(-10, -10, c.getWidth()+10,c.getHeight()+10);            	    
	    }
            paint(g, c);
        }
    });
f178(as);	
		}
public void mousePressed(MouseEvent ik)
{
work=1;
	b[as].setFont(b[as].getFont().deriveFont(30.0f));
        b[as].setForeground(Color.BLACK);
	b[as].setUI(new BasicButtonUI() {
        @Override
        public void update(Graphics g, JComponent c) {
            if (c.isOpaque()) {
		   g.setColor(new Color(255,255,255));
		   g.fillRect(-10, -10, c.getWidth()+10,c.getHeight()+10);            	    
	    }
            paint(g, c);
        }
    });
f178(as);	
}
public void mouseReleased(MouseEvent tr)
{b[as].setFont(b[as].getFont().deriveFont(24.0f));
b[as].setForeground(Color.BLACK);
	b[as].setUI(new BasicButtonUI() {
        @Override
        public void update(Graphics g, JComponent c) {
            if (c.isOpaque()) {
		   g.setColor(new Color(255,255,255));
		   g.fillRect(-10, -10, c.getWidth()+10,c.getHeight()+10);            	    
	    }
            paint(g, c);
        }
    });
f178(as);	
}
public void mouseClicked(MouseEvent e)
	{
		Font ftrs=new Font("Segoe UI",Font.BOLD,16);
			Font ftr=new Font("Segoe UI",Font.PLAIN,14);
		if(as==0) 
	{
String admin[]=new String[1];
jat =new JPanel();
jat.setLayout(new GridLayout(2,1));
jat1 =new JPanel();
jat1.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
jat2 =new JPanel();
jat2.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
JLabel hyj=new JLabel("Info for Access:");
hyj.setFont(ftrs);
jat2.add(hyj);
hyj=new JLabel("Filter:");
hyj.setFont(ftrs);
jat1.add(hyj);
JComboBox<Object> jst1=null;
JLabel lss[]=new JLabel[9];
String sqa[]={"ID","UDAI","Name","Gender","Division","Designation"};
for(int i=0;i<6;i++)
{
lss[i]=new JLabel(sqa[i]);
lss[i].setFont(ftr);
if(i==0 || i==1)
{
	jat2.add(lss[i]);
}
else jat1.add(lss[i]);
ArrayList<String> vec1=null;
if(i!=1)
{
try
{
stmt=con.prepareStatement("Select "+sqa[i]+" from bits.employee");
sets=stmt.executeQuery();
vec1=new ArrayList<String>();
vec1.add("");   // i!=0
while(sets.next())
{
vec1.add(sets.getString(1));
}
}
catch(Exception mjk){
mjk.printStackTrace();
}
TreeSet<String> s = new TreeSet<String>(vec1);
jst1=new JComboBox<Object>(s.toArray());
if(i==0) {
	jst1.setEditable(true);
	editor = (JTextComponent) jst1.getEditor().getEditorComponent();
	editor.addKeyListener(new BIRLAA());               // new KeyListener()
/*	{
		public void keyReleased(KeyEvent mki)
		{
			System.out.println("jhbjhb");
		}
		public void keyPressed(KeyEvent mki)
		{
			System.out.println("jhbjhb");
		}
		public void keyTyped(KeyEvent mki)
		{
			System.out.println("jhbjhb");
		}
	}); */
}
if(i!=2) jst1.setPrototypeDisplayValue("Nikhilesh Venkata");
else jst1.setPrototypeDisplayValue("Nikhilesh Venkatasubramanian");
jst1.addActionListener(new BITSS(i));
jst1.setFont(ftr);
jst.add(jst1);
}
else
{
	String hyaq[]={"jb","iun"};
	jst1=new JComboBox<Object>(hyaq);
	jst.add(jst1);
}
if(i==0 || i==1) 
{
	if(i==1) jat2.add(sat);
	else jat2.add(jst1);
if(i==0)
{
hyj=new JLabel("Or");
hyj.setFont(ftr);
jat2.add(hyj);
}
}
else jat1.add(jst1);
}
jat.add(jat1);
jat.add(jat2);
int result = 0;
String options[]=new String[1];
options[0]="Submit";
result = JOptionPane.showOptionDialog(null, jat,"Query", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
try {
	if (result == JOptionPane.OK_OPTION) {
		if(((jst.get(0)).getSelectedItem().toString()).equals("")) throw new Exception("ID");
		if((sat.getText()).equals("")) throw new Exception("UIDAI");
		String sats=sat.getText();
		if(sats.length()!=12) throw new Exception("UIDAI");
		if(Signup.fsdd(sats)) throw new Exception("UIDAI");
		String hys[] = new String[2];
		stmt=con.prepareStatement("Select id from bits.employee where udai="+sat.getText());
		ResultSet rets=stmt.executeQuery();
		rets.next();
		hys[0] = rets.getString(1);
		hys[1] = "8JK5432";
/* ImageIcon ic =null;
int hy=0;
try
{
ic=new ImageIcon(getClass().getResource(URLEncoder.encode("MKI.png", "UTF-8")));
stmt=con.prepareStatement("Select * from bits.employee where id='"+(jst.get(0)).getSelectedItem().toString()+"'");
sets=stmt.executeQuery();
hy=0;
while(sets.next())
{
hy++;
}
}
catch(Exception mk){}  */
		fs.dispose();
		LoginP.main(hys);
	}
}
catch(Exception kjkj)
{
	StringTokenizer awq=new StringTokenizer(kjkj.toString()," ");
	String juj=awq.nextToken();
	JOptionPane.showMessageDialog(null, "Error: "+juj, "is invalid", JOptionPane.ERROR_MESSAGE);
}
	}
	else if(as==1)
	{
	}
	else
	{
fs.dispose();
		String pl[]=new String[2];
		pl[0]="";
		pl[1]="";
Home.main(pl);
	}
	}
}
public Admin(){}
public class BIRLAA extends KeyAdapter {
	public void keyReleased(KeyEvent ke) {
		int dont = 0;
		int keyCode = ke.getKeyCode();
		switch (keyCode) {
			case KeyEvent.VK_UP:
				dont = 1;
				break;
			case KeyEvent.VK_DOWN:
				dont = 1;
				break;
			case KeyEvent.VK_LEFT:
				dont = 1;
				break;
			case KeyEvent.VK_RIGHT:
				dont = 1;
				break;
		}
		if (dont == 0)
		{
			try {
				String text = editor.getText();
				System.out.println(text + " Note:");
				stmt = con.prepareStatement("select id from bits.employee where id like '" + text + "%'");
				ResultSet rstt = stmt.executeQuery();
				(jst.get(0)).removeAllItems();
				ArrayList<String> mjki = new ArrayList<String>();
				int limit = 0;
				try {
					while (rstt.next()) {
						limit++;
						mjki.add(rstt.getString(1));
					}
				} catch (Exception mk) {
// mk.printStackTrace();
				}
				TreeSet<String> s = new TreeSet<String>(mjki);
				(jst.get(0)).addItem("");
				for (int i = 0; i < limit; i++) {
					(jst.get(0)).addItem((s.toArray())[i].toString());
					//	System.out.println((jst.get(0)))
					//	(jst.get(0)).setPopupVisible(true);
				}
				(jst.get(0)).showPopup();
				editor.setText(text);
			} catch (Exception mkm) {
				mkm.printStackTrace();
			}
	}
	}
}
	public static void main(String asd[])
	{
/*
		toa=new Thread(new Runnable()
{
public void run()
{
Admin fgt=new Admin(1);
}
}); */
// if(toa!=null) toa.stop();
SwingUtilities.invokeLater(new Runnable()
{
public void run()
{
	Admin fgt=new Admin(1);
}
}); 
	}
void f178(int as)
{
          if(as==0)  
	  {
		  b[as].setMargin(new Insets(30,320,30, 320));
	  }
		  else if(as==1) 
		  {
			  b[as].setMargin(new Insets(30, 376 ,30, 376));
		  }
			  else 
			  {
				  b[as].setMargin(new Insets(27, 430,27, 430));	
			  }
}
}
class RoundedrBorder implements Border {
        int radius,asde;
        RoundedrBorder(int radius,int asd) 
	{
            this.radius = radius;
        asde=asd;
	}
        public Insets getBorderInsets(Component c) 
	{
			System.out.println(asde);
          if(asde==0)  return new Insets(30,320,30, 320);
	  else if(asde==1) return new Insets(30, 376 ,30, 376);
	  else return new Insets(27, 430,27, 430);
	}
        public boolean isBorderOpaque() {
            return false;
        }
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.setColor(Color.BLUE);
		g.drawRoundRect(x,y,width-1,height-1,radius,radius);
        }
    }
