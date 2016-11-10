package hipster.view;

import javax.swing.*;
import hipster.controller.HipsterController;
import java.awt.Dimension;

public class HipsterFrame extends JFrame
{
	private HipsterController baseController;
	private HipsterPanel appPanel;
	
	public HipsterFrame(HipsterController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Hipster Day 2016");
		this.setSize(new Dimension(600, 400));
		this.setResizable(false);
		this.setVisible(true);
	}

}
