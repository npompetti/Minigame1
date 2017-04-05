package Board;

import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class SalinityBar extends JPanel{
	
	public SalinityBar(int Min, int Max){
		
		JProgressBar salinityBar = new JProgressBar();
		salinityBar.setMinimum(Min);
		salinityBar.setMaximum(Max);
		salinityBar.setOrientation(SwingConstants.VERTICAL);
		salinityBar.setValue(Max);
		add(salinityBar);
		
		
		
		
	}

}
