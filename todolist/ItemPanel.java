package github.will.todolist;

import java.awt.Color;
import java.awt.GridLayout;


import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class ItemPanel extends JPanel 
{
	private static int totalNum;
	private static final Color ITEM_BACK_GROUND = new Color(150,150,150);
	
	ItemPanel(String task, String description)
	{
		
		GridLayout layout = new GridLayout(); // initializes the layout of the panel to be the grid layout 
		
		this.add(new JLabel(task)); // name of the specific task that needs to be done  
		
		
		JTextArea toDoDescription = new JTextArea(); // Text description of task 
		toDoDescription.setText(description);
		toDoDescription.setLineWrap(true);
		toDoDescription.setWrapStyleWord(true);
		this.add(toDoDescription);
		toDoDescription.setBackground(ITEM_BACK_GROUND);
		
		
		this.setBounds(0,75*totalNum,300,150); // setting up the frame itself, will eventually be updated to space tasks
		this.setBackground(ITEM_BACK_GROUND);
		this.setLayout(layout);

		
		totalNum++;
		System.out.println("there are " + totalNum + " tasks to do");//debug 
	}
	
	
}
