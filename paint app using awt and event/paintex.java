import java.awt.*;  
import java.awt.event.*;    
public class paintex extends Frame implements MouseMotionListener 
{
	paintex()
	{
			addMouseMotionListener(this);
			setSize(300,300);
			setLayout(null);
			setVisible(true);
			Image icon = Toolkit.getDefaultToolkit().getImage(".\\icon.png");
			setIconImage(icon);
			addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
	 			{
	 	 		dispose();
	 			}
	
			});
			addMouseListener(new MouseAdapter()
			{
				public void mouseClicked(MouseEvent e)
				{
					Graphics g=getGraphics();
					g.setColor(Color.BLACK);
					g.fillOval(e.getX(),e.getY(),5,5);
				}
			}
			);
	}	
			
	public void mouseDragged(MouseEvent e)
		{
			Graphics g=getGraphics();
			g.setColor(Color.BLACK);
			g.fillOval(e.getX(),e.getY(),5,5);
		}

	public void mouseMoved(MouseEvent e){}

	
	public static void main(String[] args)
	 {
		new paintex();
	 }
}