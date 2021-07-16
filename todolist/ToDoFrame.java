package todolist;

import java.awt.Color;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ToDoFrame extends JFrame implements ActionListener
{
	boolean createToggle = false;
	JButton button;
	static ItemPanel arrayPanels[];
	JPanel CreateATask;
	JTextField description;
	JTextField title ;
	ToDoFrame(String task, String discription)
	{
		arrayPanels = new ItemPanel[100];
		button = new JButton("Create a task");
		title  = new JTextField(30);
		description = new JTextField(30);
		title.setText("title");
		description.setText("description");
		
		 this.setSize(600,600);
		 
		 
		
		this.setVisible(true);
		this.setLayout(null);
		

		this.setBackground(Color.green);
		this.getContentPane().setBackground(Color.white);
		
		CreateATask = new JPanel();
		CreateATask.add(button);
		CreateATask.add(title );
		CreateATask.add(description);
		button.addActionListener(this);
		CreateATask.setBounds(600, 600, 400, 230);
		CreateATask.setVisible(true);
		this.add(CreateATask);
		
		
		
		
		 
		
		
		
	}
	public void add()
	{
		for(int i = 0; i < arrayPanels.length; i++)
		{
			if(arrayPanels[i] == null)
			{
				arrayPanels[i] = new ItemPanel(title.getText(),description.getText());
				System.out.println("PRIORITY NEW ITEM CREATED");
				break;
			}
		}
		update();
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== button)
		{
			add();
			System.out.println("testing");
				 
			 
		}
			
		}
	public void update()
	{
		for(int i = 0; i < arrayPanels.length; i++)
		{
			if(arrayPanels[i] != null)
			{
				this.add(arrayPanels[i]);
			}
		}
	}
		
	}
