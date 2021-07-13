package github.will.todolist;

import java.awt.Color;

import javax.swing.JFrame;

public class ToDoFrame extends JFrame
{
	ToDoFrame(String task, String discription)
	{
		this.setSize(600, 600);
		this.setVisible(true);
		this.setLayout(null);
		this.add(new ItemPanel(task,discription));
		this.setBackground(Color.green);
		this.getContentPane().setBackground(Color.white);
	}

	// panel for creating tasks 
}
