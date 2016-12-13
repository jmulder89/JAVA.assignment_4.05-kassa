package Oefening_405_Kassa;
import javax.swing.*;

public class Start extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[])
	{
		JFrame start = new JFrame();
		start.setTitle("KASSA");
		start.setSize(500, 200);
		start.setLocation(500, 200);
		start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.setContentPane(new Panel());
		start.setVisible(true);
	}

}
