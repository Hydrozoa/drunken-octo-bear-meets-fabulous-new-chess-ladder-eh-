import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChessLadderOfFabulousness extends JFrame implements ActionListener{
	
	public JButton viewButton = new JButton();
	public JButton addButton = new JButton();
	public JButton moveButton = new JButton();
	public JButton sumbitButton = new JButton();
	public JButton doneButton = new JButton();
	public JButton removeButton = new JButton();
	public JTextField victorField = new JTextField();
	public JTextField loserField = new JTextField();
	public JTextField nameField = new JTextField();
	public JPanel welcomePanel = new JPanel();
	public JPanel ladderPanel = new JPanel();
	public JPanel gamePanel = new JPanel();
	public JPanel newPanel = new JPanel();
	
	public ArrayList <String> nameArray = new ArrayList <String>();
	
	Font regularFont = new Font("Helvetica", Font.BOLD, 16);
	Font titleFont = new Font("Times New Roman", Font.BOLD, 20);
	Font largeFont = new Font("Times New Roman", Font.BOLD, 80);	
	
	public ChessLadderOfFabulousness()
	{
		this.setLayout(null);
		this.setBounds(0, 0, 750, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Contact Book");
		this.setVisible(true);
		this.setResizable(false);
		
		welcomePanel = new JPanel();
		welcomePanel.setLayout(null);
		welcomePanel.setBounds(0, 0, 750, 400);
		welcomePanel.setBackground(Color.CYAN);
		welcomePanel.setVisible(true);
		this.add(welcomePanel);
		
		ladderPanel = new JPanel();
		ladderPanel.setLayout(null);
		ladderPanel.setBounds(0, 0, 750, 400);
		ladderPanel.setBackground(Color.ORANGE);
		ladderPanel.setVisible(false);
		this.add(ladderPanel);
		
		gamePanel = new JPanel();
		gamePanel.setLayout(null);
		gamePanel.setBounds(0, 0, 750, 400);
		gamePanel.setBackground(Color.GREEN);
		gamePanel.setVisible(false);
		this.add(gamePanel);
		
		newPanel = new JPanel();
		newPanel.setLayout(null);
		newPanel.setBounds(0, 0, 750, 400);
		newPanel.setBackground(Color.RED);
		newPanel.setVisible(false);
		this.add(newPanel);
		
		System.out.println("fsdfs");
	}
	
	public void releaseTheKraken()
	{
		welcomePanel.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		
	}
}
