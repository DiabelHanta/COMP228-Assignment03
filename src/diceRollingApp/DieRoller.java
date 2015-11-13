package diceRollingApp;

public class DieRoller 
{
	//PUBLIC INSTANCE VARIABLES
	public float die1;
	public float die2;
	
	//PROPERTIES
	//die1
	public float getDie1()
	{
		return die1;
	}

	public void setDie1(float die1)
	{
		this.die1 = die1;
	}
	//die2
	public float getDie2()
	{
		return die2;
	}

	public void setDie2(float die2)
	{
		this.die2 = die2;
	}

	//CONSTRUCTOR(S)
	public DieRoller(float die1, float die2) //
	{
		this.die1 = die1;
		this.die2 = die2;
	}
}
