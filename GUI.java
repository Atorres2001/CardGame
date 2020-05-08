/*
 * author chris Lara-Betancourt
 * 
 */
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener {
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JButton pick;
	private JTextArea outputText;
	private int x = 0;
	private int y = 0;
	
	/*
	 * constructor
	 */
	
	public GUI() {
		frame = new JFrame("Game of cards");
		panel = new JPanel();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(1370, 720);
		frame.add(panel);
		
		panel.setLayout(null);
		
		outputText = new JTextArea();
		outputText.setBounds(1100, 500, 300, 200);
		panel.add(outputText);
		outputText.setEditable(false);
		
		
		/*
		 * 
		 */
		JButton sort = new JButton("Sort");
		sort.setBounds(700,600,80,30);
		panel.add(sort);
		
		/*
		 * supposer to store the number of cards the computer has in order 
		 * for the user to select 
		 */
		JSpinner select = new JSpinner();
		select.setBounds(600,600,80,30);
		panel.add(select);
		
		//allow user to choose a card from the computer 
		JButton pick = new JButton(new AbstractAction("Pick") {
			
			public void actionPerformed(ActionEvent e) {
				game.playerturn();
				
			}
			
		});
		pick.setBounds(500,600,80,30);
		panel.add(pick);
		
		
		
		
		
		
		
		
	
		
		frame.setVisible(true);

		
		
		
		
		
		
	}
	
	public static void main (String[] args) {
		new GUI();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}


