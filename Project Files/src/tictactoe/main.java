package tictactoe;
import java.awt.Frame;

import javax.swing.SwingUtilities;

public class main {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new GameGUI();
			}
		});
	}
}

