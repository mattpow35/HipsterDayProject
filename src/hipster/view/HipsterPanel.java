package hipster.view;

import javax.swing.*;
import hipster.controller.HipsterController;
import java.awt.Color;

public class HipsterPanel extends JPanel
{
	private SpringLayout baseLayout;
	private JComboBox dropDown;
	private JLabel infoLabel;
	private JButton myButton;
	private HipsterController baseController;
	
	public HipsterPanel(HipsterController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.myButton = new JButton("click the button");
		this.infoLabel = new JLabel("wow words");
		this.dropDown = new JComboBox(baseController.getWords());
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.ORANGE);
		this.setLayout(baseLayout);
		this.add(dropDown);
		this.add(infoLabel);
		this.add(myButton);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, myButton, 131, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, myButton, -107, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, infoLabel, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, infoLabel, 163, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, dropDown, 42, SpringLayout.SOUTH, infoLabel);
		baseLayout.putConstraint(SpringLayout.WEST, dropDown, 177, SpringLayout.WEST, this);
		
	}
	
	private void setupListeners()
	{
		
	}

}
