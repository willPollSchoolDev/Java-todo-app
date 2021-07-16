package todolist;

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
	
	public int snapShot;
	
	JButton delete;

	public int Y;
	
	public boolean update;
	
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
		
		totalNum++;
		System.out.println("Item created. this is item number" + totalNum);
		snapShot = totalNum;
		System.out.println("THE Y COORDINATE IS " + Y);
		update();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == delete)
		{
			System.out.println("delete");
			this.setVisible(false);
			this.setLocation(10000, 10000);
			totalNum--;
			
			updateY();
		}
	}
	public int calculateY()
	{
		Y = 75*snapShot;
		
		
		return Y;
	}
	public void update()
	{
		this.setBounds(0,calculateY(), 300, 150);

	}
	
	// TODO update function to properly change Y coords of *every* task
	public void updateY()
	{
		int nullcount = 0;
		for(int i = 0; i < ToDoFrame.arrayPanels.length; i++)
		{
			System.out.println("start");
			if(ToDoFrame.arrayPanels[i] == null)
			{
				nullcount++;
				System.out.println("null");
				System.out.println(nullcount);
				continue;
			}
			if(ToDoFrame.arrayPanels[i+1] == null)
			{
				continue;
			}
			if(ToDoFrame.arrayPanels[i].isVisible() == false)
			{
				for(int j = 0; j < ToDoFrame.arrayPanels.length; j++)
				{
					if(ToDoFrame.arrayPanels[i]== null || ToDoFrame.arrayPanels[i + 1] == null )
					{
						continue; 
					}
						if(ToDoFrame.arrayPanels[i + 1].snapShot == (ToDoFrame.arrayPanels[i].snapShot + 1))
						{
							System.out.println("changeover");
							ToDoFrame.arrayPanels[i + 1].snapShot = ToDoFrame.arrayPanels[i].snapShot;

							ToDoFrame.arrayPanels[i+1].update();
							System.out.println(ToDoFrame.arrayPanels[i+1].getLocation());
						}
					}
				}
				
			}
			System.out.println("checked for loop ");
		}
	}
	

