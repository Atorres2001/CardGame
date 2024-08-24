/*
 * author chris Lara-Betancourt
 * 
 */
package CardGame;

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
import javax.swing.event.AncestorListener;

public class GUI extends JFrame {
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
		
		
		//Starts Game
		Game game = new Game();
		outputText.append("Welcome, to the Joker Game. \n "
				+ "the objective of the game is to get\n rid of all your cards \n"
				+ "by forming pairs. but there is one\n Joker card that cannot \n"
				+ "form a pair. \n");
		
		//set up game
		game.gameSetup();
		
		//remove pairs
		outputText.append("Cards are dealt and pairs are \nbeing removed. pick a number");
		game.checkingForPairs();
		
		//allow user to choose a card from the computer 
		JButton pick = new JButton("Pick");
		
		pick.setBounds(500,600,80,30);
		panel.add(pick);
		
		//
		select.addAncestorListener( (AncestorListener) new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int tempInt = (int) select.getValue();
				game.setPlayerChoosenIndex(tempInt);
				
			}
		});
		
		
		pick.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				outputText.setText("");
				game.playerTurn();
				
			}
		});
		
		
		
	
		
		frame.setVisible(true);
	}
	
	public static void main (String[] args) {
		GUI g  = new GUI();
		
	}


}
