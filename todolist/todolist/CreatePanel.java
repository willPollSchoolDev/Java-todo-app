package github.will.todolist;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.JButton;
@SuppressWarnings("serial")
public class CreatePanel extends JPanel implements ActionListener
{
	JTextField title;
	JTextField description;
	JButton button;
	 String titleData;
	 String descriptionData;
	CreatePanel()
	{
		this.setVisible(true);
		title = new JTextField("title of task",30);
		description = new JTextField("enter description",40);
		title.setVisible(true);
		this.add(title);
		this.add(description);
		description.addActionListener(this);
		title.setEnabled(true);

		this.setBounds(600,600,600,600);
		
		
		
	}
	public void setData()
	{
		titleData = title.getText();
		descriptionData = description.getText();
		
	}
	public void passTheTorch(String pass, String pass2)
	{
		pass = titleData;
		pass2 = descriptionData;
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		if(e.getSource() == description)
		{
			setData();
			System.out.println(titleData);
			System.out.println(descriptionData);
			
		}
		
	}

}
