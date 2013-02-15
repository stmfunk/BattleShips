import java.awt.MouseInfo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mouseinput extends MouseAdapter
{
	@Override
	public void mousePressed(MouseEvent e)
	{
		int x = e.getX();
		int y = e.getY();
		System.out.println(x + "," +  y);

	}
	@Override
	public void mouseReleased(MouseEvent e)
	{
		
	}
}

// mouse listener mouse event mouse info
// mouseinfo.getpointer event