import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;
import javax.imageio.*;
import java.awt.image.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicButtonUI;
public class Home
{
int work=0;
	Thread t1,t2;
	static Thread toa;
	JPanel fs1;
	static JFrame fs; 
	JPanel p1;
	JPanel p0[];
	JLabel nh;
	JLabel l1;
	static JButton b[];
	static Signup uh;
	Home(int tv)
	{
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
		l1=new JLabel("Railway Employee Management System");
		b[0]=new JButton("Sign_Up");
//		b[0].setBackground(Color.WHITE);
		b[0].setBorder(new RoundedBorder(20,0));
//		b[0].setFont(b[0].getFont().deriveFont(14.0f));
		p0[0]=new JPanel();
		p0[0].setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		p0[0].setBackground(Color.WHITE);					
		p0[0].add(b[0]);
		b[1]=new JButton("Employee_Login");
//		b[1].setBackground(Color.WHITE);
//		b[1].setFont(b[1].getFont().deriveFont(14.0f));
		b[1].setBorder(new RoundedBorder(20,1));
		p0[1]=new JPanel();
		p0[1].setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		p0[1].setBackground(Color.WHITE);
		p0[1].add(b[1]);
		b[2]=new JButton("Admin_Portal");
//		b[2].setBackground(Color.WHITE);
		b[2].setBorder(new RoundedBorder(20,2));
//	        b[2].setFont(b[2].getFont().deriveFont(14.0f));
		p0[2]=new JPanel();
		p0[2].setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		p0[2].setBackground(Color.WHITE);
		p0[2].add(b[2]);
		b[3]=new JButton("Exit");
//		b[3].setFont(b[3].getFont().deriveFont(14.0f));
		b[3].setBorder(new RoundedBorder(20,3));
//		b[3].setBackground(Color.WHITE);		
		p0[3]=new JPanel();
		p0[3].setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		p0[3].setBackground(Color.WHITE);
		p0[3].add(b[3]);
		b[4]=new JButton("Events");
//		b[4].setFont(b[4].getFont().deriveFont(14.0f));
		b[4].setBorder(new RoundedBorder(20,4));
//		b[4].setBackground(Color.WHITE);		
for(int as=0;as<=4;as++)
{
//		b[as].setBackground(Color.WHITE);		
 b[as].setFont(b[as].getFont().deriveFont(14.0f));
/*if(as==0)  b[as].setMargin(new Insets(27, 55 ,27, 55));
	  else if(as==1) b[as].setMargin(new Insets(30, 29 ,30, 29));
	  else if(as==2)  b[as].setMargin(new Insets(30, 41 ,30, 41));
	  else if(as==3)  b[as].setMargin( new Insets(27, 75 ,27, 75));
	  else  b[as].setMargin(new Insets(27, 63 ,27, 63)); */
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
}
		p0[4]=new JPanel();
		p0[4].setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		p0[4].setBackground(Color.WHITE);
		p0[4].add(b[4]);
		p1=new JPanel();
		p1.setLayout(new GridLayout(5,1,0,0));
		fs=new JFrame("REMS");
		p1.add(p0[0]);
		p1.add(p0[1]);
	        p1.add(p0[2]);
                p1.add(p0[4]);
	        p1.add(p0[3]);
		fs.setLayout(new BorderLayout());
		fs.setBackground(Color.white);
if(tv==1)	fs.setVisible(true);
else            fs.setVisible(false);
fs.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fs.setResizable(false);
	fs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	p1.setBackground(Color.white);
	nh.setBackground(Color.white);
	fs.add(p1,"Center");
                 fs.add(nh,"North");
	b[0].addMouseListener(new BH(0));
	b[3].addMouseListener(new BH(3));
	b[1].addMouseListener(new BH(1));
	b[2].addMouseListener(new BH(2));
	b[4].addMouseListener(new BH(4));
	b[0].setCursor(new Cursor(Cursor.HAND_CURSOR));
	b[1].setCursor(new Cursor(Cursor.HAND_CURSOR));
	b[2].setCursor(new Cursor(Cursor.HAND_CURSOR));
	b[3].setCursor(new Cursor(Cursor.HAND_CURSOR));	
        b[4].setCursor(new Cursor(Cursor.HAND_CURSOR));	
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
	        b[as].setFont(b[as].getFont().deriveFont(20.0f-i));
		
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
            	 b[as].setFont(b[as].getFont().deriveFont(14.0f+i));
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
	b[as].setFont(b[as].getFont().deriveFont(14.0f));
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
	b[as].setFont(b[as].getFont().deriveFont(18.0f));
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
{
b[as].setFont(b[as].getFont().deriveFont(14.0f));
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
	if(as==0) 
	{
fs.dispose();
// new Signup();
Signup.main(null);	
}
	else if(as==3)
	{
System.exit(0);
	}
	else if(as==1)
	{
		String pl[]=new String[2];
		pl[0]="";
		pl[1]="";
EmpLogin.main(pl); // new EmpLogin();
	}
	else if(as==2)
	{
// fs.dispose();
// new LoginP();
//		fs.dispose();
		String ars[]=new String[3];
ars[2]="Admin";
 EmpLogin.main(ars);
	}
	}
}
public Home(){}
	public static void main(String asd[])
	{
try
{
	 UIManager.setLookAndFeel(
UIManager.getSystemLookAndFeelClassName());
	}
	catch(Exception mk){}
SwingUtilities.invokeLater(new Runnable()
{
public void run()
{
if(asd.length==0) new Home(1);
else fs.setVisible(true);
}
}); 
	}

void f178(int as)
{
          if(as==0)  b[as].setMargin(new Insets(27, 55 ,27, 55));
	  else if(as==1) b[as].setMargin(new Insets(30, 29,30, 29));
	  else if(as==2)  b[as].setMargin(new Insets(30, 41 ,30, 41));
	  else if(as==3) b[as].setMargin(new Insets(27, 75 ,27, 75));
	  else b[as].setMargin(new Insets(27, 63 ,27, 63));	
}
}
class RoundedBorder implements Border {
        int radius,asde;
        RoundedBorder(int radius,int asd) 
	{
            this.radius = radius;
        asde=asd;
	}
        public Insets getBorderInsets(Component c) 
	{
          if(asde==0)  return new Insets(27, 55 ,27, 55);
	  else if(asde==1) return new Insets(30, 29,30, 29);
	  else if(asde==2) return new Insets(30, 41 ,30, 41);
	  else if(asde==3) return new Insets(27, 75 ,27, 75);
	  else return new Insets(27, 63 ,27, 63);
	}
        public boolean isBorderOpaque() {
            return false;
        }
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.setColor(Color.BLUE);
		g.drawRoundRect(x,y,width-1,height-1,radius,radius);
        }
    }
