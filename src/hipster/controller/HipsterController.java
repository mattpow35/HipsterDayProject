package hipster.controller;

import hipster.model.Hipster;
import hipster.view.HipsterFrame;

public class HipsterController
{
	private String [] words = {"this","is","the","next", "level", "of", "hipster","the", "initialization", "sequence"};
	private Hipster [] hipsters;
	private int [] numbers;
	private HipsterFrame appFrame;
	
	public HipsterController()
	{
		showHipsterLevelThree();
		hipsters = new Hipster [5];
		appFrame = new HipsterFrame(this);
	}
	
	public void start()

	{
		for (int index = 0; index < hipsters.length; index++)
		{
			hipsters[index] = new Hipster("Hipster #" + index);
		}
		
		hipsters[0].setName("matt");
		
		for (Hipster current : hipsters)
		{
			System.out.println(current);
		}
	}

	private void showHipsterLevelThree()
	{
		numbers = new int [] {1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1};
	}
	
	public Hipster[] getHipsters()
	{
		return hipsters;
	}
	
	public String[] getWords()
	{
		return words;
	}
	
	public int[] getNumbers()
	{
		return numbers;
	}
}
