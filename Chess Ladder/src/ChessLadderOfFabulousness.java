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
	public JButton submitButton = new JButton();
	public JButton enter = new JButton();
	public JButton doneButton = new JButton();
	public JButton removeButton = new JButton();
	public JTextField victorField = new JTextField();
	public JTextField loserField = new JTextField();
	public JTextField removeField = new JTextField();
	public JTextField nameField = new JTextField();
	public JPanel welcomePanel = new JPanel();
	public JPanel ladderPanel = new JPanel();
	public JPanel gamePanel = new JPanel();
	public JPanel newPanel = new JPanel();
	public JPanel removePanel = new JPanel();
	public JTextArea ladder = new JTextArea();
	public JScrollPane scrollPane = new JScrollPane(ladder, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	
  
    
	public String[] nameArray = new String[100];
	
	Font regularFont = new Font("Helvetica", Font.BOLD, 16);
	Font titleFont = new Font("Times New Roman", Font.BOLD, 20);
	Font largeFont = new Font("Times New Roman", Font.BOLD, 80);	
	
	public ChessLadderOfFabulousness()
	{	
		this.setLayout(null);
		this.setBounds(0, 0, 750, 800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Chess Ladder");
		this.setVisible(true);
		this.setResizable(false);
		
		welcomePanel.setLayout(null);
		welcomePanel.setBounds(0, 0, 750, 800);
		welcomePanel.setBackground(Color.CYAN);
		welcomePanel.setVisible(true);
		this.add(welcomePanel);
		
		ladderPanel.setLayout(null);
		ladderPanel.setBounds(0, 0, 750, 800);
		ladderPanel.setBackground(Color.ORANGE);
		ladderPanel.setVisible(false);
		this.add(ladderPanel);
		
		gamePanel.setLayout(null);
		gamePanel.setBounds(0, 0, 750, 800);
		gamePanel.setBackground(Color.GREEN);
		gamePanel.setVisible(false);
		this.add(gamePanel);
		
		newPanel.setLayout(null);
		newPanel.setBounds(0, 0, 750, 800);
		newPanel.setBackground(Color.RED);
		newPanel.setVisible(false);
		this.add(newPanel);
		
		removePanel.setLayout(null);
		removePanel.setBounds(0, 0, 750, 800);
		removePanel.setBackground(Color.pink);
		removePanel.setVisible(false);
		this.add(removePanel);
		
		enter.setText("Enter");
		enter.setFont(largeFont);
		enter.setBounds(155, 600, 400, 100);
		enter.addActionListener(this);
		welcomePanel.add(enter);
		
		ladder.setFont(regularFont);
		ladder.setBounds(50, 50, 300, 650);
		ladder.setEditable(false);
		ladder.setLineWrap(true);
		ladderPanel.add(ladder);
		ladderPanel.add(scrollPane);
		
		addButton.setFont(regularFont);
		addButton.setText("Add");
		addButton.setBounds(450, 300, 100, 50);
		addButton.addActionListener(this);
		ladderPanel.add(addButton);
		
		moveButton.setFont(regularFont);
		moveButton.setText("Move");
		moveButton.setBounds(450, 400, 100, 50);
		moveButton.addActionListener(this);
		ladderPanel.add(moveButton);
		
		removeButton.setFont(regularFont);
		removeButton.setText("Remove");
		removeButton.setBounds(450, 500, 100, 50);
		removeButton.addActionListener(this);
		ladderPanel.add(removeButton);
		
		JLabel nameLabel= new JLabel();
		nameLabel.setFont(regularFont);
		nameLabel.setText("Name:");
		nameLabel.setBounds(50, 50, 100, 50);
		newPanel.add(nameLabel);
		
		nameField.setFont(regularFont);
		nameField.setBounds(400, 50, 300, 50);
		newPanel.add(nameField);
		
		submitButton.setFont(regularFont);
		submitButton.setText("SUBMIT!");
		submitButton.setBounds(325, 700, 100, 50);
		submitButton.addActionListener(this);
		newPanel.add(submitButton);
		//new thingy
		JLabel removeLabel= new JLabel();
		removeLabel.setFont(regularFont);
		removeLabel.setText("Name:");
		removeLabel.setBounds(50, 50, 100, 50);
		removePanel.add(removeLabel);
		
		removeField.setFont(regularFont);
		removeField.setBounds(400, 50, 300, 50);
		removePanel.add(removeField);
		
		viewButton.setFont(regularFont);
		viewButton.setText("REMOVE!!!");
		viewButton.setBounds(325, 700, 300, 50);
		viewButton.addActionListener(this);
		removePanel.add(viewButton);
		//mew mew cat time
		
		JLabel victorLabel= new JLabel();
		victorLabel.setFont(regularFont);
		victorLabel.setText("Victor:");
		victorLabel.setBounds(50, 50, 100, 50);
		gamePanel.add(victorLabel);
		
		victorField.setFont(regularFont);
		victorField.setBounds(400, 50, 300, 50);
		gamePanel.add(victorField);
		
		doneButton.setFont(regularFont);
		doneButton.setText("DONE!!!");
		doneButton.setBounds(325, 700, 100, 50);
		doneButton.addActionListener(this);
		gamePanel.add(doneButton);
		
		JLabel loserLabel= new JLabel();
		loserLabel.setFont(regularFont);
		loserLabel.setText("Loser:");
		loserLabel.setBounds(50, 250, 100, 50);
		gamePanel.add(loserLabel);
		
		loserField.setFont(regularFont);
		loserField.setBounds(400, 250, 300, 50);
		gamePanel.add(loserField);
		//null
		for(int i = 0; i < nameArray.length; i++)
		{
			nameArray[i] = "";
		}
	}
	
	public void releaseTheKraken()
	{
		welcomePanel.setVisible(true);
		
		JLabel welcomeTitle =new JLabel();
		welcomeTitle.setText("Chess Ladder");
		welcomeTitle.setFont(largeFont);
		welcomeTitle.setBounds(150, 50, 500, 100);
		welcomeTitle.setBackground(Color.CYAN);
		welcomePanel.add(welcomeTitle);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== enter)
		{
			welcomePanel.setVisible(false);
			ladderPanel.setVisible(true);
			
			for(int i=0; i < nameArray.length ; i++)
			{
				if(nameArray[i].isEmpty() == false)
				{	
				String tempText = ladder.getText();
				ladder.setText(tempText+ "\n" + (i+1) + "." + nameArray[i]);
				}
			}//null
			
			repaint();
		}
		else if(e.getSource() == addButton)
		{
			ladderPanel.setVisible(false);
			nameField.setText("");
			newPanel.setVisible(true);
		}
		else if(e.getSource() == moveButton)
		{
			ladderPanel.setVisible(false);
			victorField.setText("");
			loserField.setText("");
			gamePanel.setVisible(true);
		}
		else if(e.getSource() == removeButton)
		{
			ladderPanel.setVisible(false);
			removePanel.setVisible(true);
			removeField.setText("");
		}
		else if(e.getSource() == submitButton)
		{
			String tempName = nameField.getText();				
			int firstBlank = 0;		
			for(int i = 0; i < nameArray.length; i++)
			{
				if(nameArray[i].isEmpty() == true)//null
				{
					firstBlank = i;	
					i = nameArray.length;
				}
			}		
			nameArray[firstBlank] = tempName;
			ladder.setText("");
			
			for(int i=0; i < 31 ; i++)
			{
				if(nameArray[i].isEmpty() == false)//null
				{	
				String tempText = ladder.getText();
				ladder.setText("");
				ladder.setText(tempText+ "\n" + (i+1) + "." + nameArray[i]);
				System.out.println(tempText);
				tempText="";
				}
			}
			
			newPanel.setVisible(false);
			ladderPanel.setVisible(true);	
			
			tempName = "";
			
		}
		else if(e.getSource() == viewButton)
		{
			String delete = removeField.getText();
			int addressOfTheDeceased = 95;
			for(int i = 0; i < 100; i ++)
			{
				if(nameArray[i].equals(delete))
				{
					addressOfTheDeceased = i;
					 i=100;
				}
			}
			nameArray[addressOfTheDeceased] = "";
			
			for(int i = addressOfTheDeceased; i <= 31; i--)
			{
				System.out.println(i);
				if(i != 0)
				{	
					nameArray[i] = nameArray[i-1]; 
				}
				else if(i == 0)
				{
					nameArray[i] = "";//null
					i = 300;
				}
			}
			
			removePanel.setVisible(false);
			ladderPanel.setVisible(true);
			
			System.out.println(nameArray[0]);
			
			for(int i=0; i < 100 ; i++)
			{	
				if(nameArray[i].isEmpty() == false)
				{	
					System.out.println("Shouldn't appear");
				String tempText = ladder.getText();
				ladder.setText(tempText+ "\n" + (i+1) + "." + nameArray[i]);
				}
				else if(nameArray[i].isEmpty() == true)
				{
					i = 300;
					ladder.setText("");
				}
			}
		}
		else if(e.getSource() == doneButton)
		{
			ladderPanel.setVisible(true);
			gamePanel.setVisible(false);
			
			String winner = victorField.getText();
			String loser = loserField.getText();
			
			int winnerPosition = 67;
			int loserPosition = 68;
			
			for(int i = 0; i < 35; i++)
			{
				if(nameArray[i].equals(winner))
				{
					winnerPosition = i;
				}
				else if(nameArray[i].equals(loser))
				{
					loserPosition = i;
				}
			}
			
			if(winnerPosition < loserPosition)
			{
				nameArray[loserPosition] = winner;
				nameArray[winnerPosition] = loser;
			}
			
			for(int i=0; i < 100 ; i++)
			{	
				if(nameArray[i].isEmpty() == false)
				{	
					System.out.println("Shouldn't appear");
				String tempText = ladder.getText();
				ladder.setText(tempText+ "\n" + (i+1) + "." + nameArray[i]);
				}
				else if(nameArray[i].isEmpty() == true)
				{
					i = 300;
					ladder.setText("");
				}
			}
		}
		

	}
}