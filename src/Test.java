import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Test extends JFrame

{ JFrame f;
int mousex;
int mousey;
	public static void main(String[] args)
	{

		new Test();
	}

	public Test()
	{

		f = new JFrame("mouse input test");
		f.setSize(400, 400);
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void paint(Graphics g)
	{
	//	g.drawString(e.getX, 200, 200);
		g.drawOval(mousex, mousey, 100, 100);
//		repaint();
	}

	public class Mouseinput extends MouseAdapter
	{
		@Override
		public void mousePressed(MouseEvent e)
		{
			
			mousex = e.getX();
			mousey = e.getY();
			f.invalidate();

		}

		@Override
		public void mouseReleased(MouseEvent e)
		{

		}

	}

}
