package hipster.controller;

import hipster.model.Hipster;

public class HipsterController
{
	private String [] words;
	private Hipster [] hipsters;
	private int [] numbers;
	
	public HipsterController()
	{
		numbers = new int [20];
		words = new String [5];
		hipsters = new Hipster [5];
	}
	
	public void start()
	{
		for (int currentInt : numbers)
		{
			System.out.println(currentInt);
		}
	}

}
