package github.will.todolist;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;
import javax.swing.JButton;


@SuppressWarnings("serial")
public class ItemPanel extends JPanel  implements ActionListener 
{
	public static int staticOffset;
	private static int totalNum, offset;
	private static final Color ITEM_BACK_GROUND = new Color(150,150,150);
	JButton delete;

	ItemPanel(String task, String description)
	{
		delete = new JButton();
		GridLayout layout = new GridLayout(); // initializes the layout of the panel to be the grid layout 
		
		this.add(new JLabel(task)); // name of the specific task that needs to be done  
		delete.addActionListener(this);
		this.add(delete);
		
		
		JTextArea toDoDescription = new JTextArea(); // Text description of task 
		toDoDescription.setText(description);
		toDoDescription.setLineWrap(true);
		toDoDescription.setWrapStyleWord(true);
		this.add(toDoDescription);
		toDoDescription.setBackground(ITEM_BACK_GROUND);
		
		
		
		this.setBackground(ITEM_BACK_GROUND);
		this.setLayout(layout);

		
		
		System.out.println("there are " + totalNum + " tasks to do \n" + 75*totalNum);//debug
		
		this.setBounds(0,75*totalNum, 300, 150);
		totalNum++;
		System.out.println("Item created. this is item number" + totalNum);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == delete)
		{
			this.setVisible(false);
			this.setLocation(10000, 10000);
			totalNum--;
		}
	}
	

	
}
