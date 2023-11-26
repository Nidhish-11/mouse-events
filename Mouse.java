import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Mouse implements MouseListener
{
	JFrame f;
	Mouse()
	{
		f=new JFrame("Mouse Listeners");
		f.setSize(400,400);
		f.setLayout(null);
		f.addMouseListener(this);
		f.setVisible(true);
	}
	public void mouseClicked(MouseEvent e)
	{
		System.out.print("Mouse Clicked");
	}
	public void mouseEntered(MouseEvent e)
	{
		System.out.print("Mouse Entered");
	}
	public void mouseExited(MouseEvent e)
	{
		System.out.print("Mouse Exited");
	}
	public void mousePressed(MouseEvent e)
	{
		System.out.print("Mouse Pressed");
	}
	public void mouseReleased(MouseEvent e)
	{
		System.out.print("Mouse Released");
	}
	public static void main(String z[])
	{
		new Mouse();
	}
}
