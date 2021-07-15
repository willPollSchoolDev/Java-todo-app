package github.will.todolist;

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
	
	JPanel CreateATask;
	JTextField description;
	JTextField title ;
	ToDoFrame(String task, String discription)
	{
		button = new JButton("Create a task");
		title  = new JTextField(30);
		description = new JTextField(40);
		
		 this.setSize(600,600);
		 
		 
		
		this.setVisible(true);
		this.setLayout(null);
		this.add(new ItemPanel(task,discription));
		this.add(new ItemPanel("testing", "this is an example of placement logic"));

		this.setBackground(Color.green);
		this.getContentPane().setBackground(Color.white);
		
		CreateATask = new JPanel();
		CreateATask.add(button);
		CreateATask.add(title );
		button.addActionListener(this);
		CreateATask.setBounds(600, 600, 230, 230);
		CreateATask.setVisible(true);
		this.add(CreateATask);
		
		
		
		

		
		
		
	}
	public void add()
	{
		this.add(new ItemPanel("lorem ipsum","lorem ipsum"));
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
		
	}
