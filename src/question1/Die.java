package question1;

import java.security.SecureRandom;
//HELP: UNNECESARY LIBRARIES FOR ArrayList?
//import java.util.AbstractCollection;
//import java.util.AbstractList;

public class Die 
{	
	//PRIVATE INSTANCE VARIABLES
	private SecureRandom _rand; //randomizer
	
	//Method: 
	public int getDie() 
	{
		//returning entire statement from this parameter
		return (this._rand.nextInt(6) + 1); //note: "+ 1" shifts the index of "0" to "1" '.' range is b/w 1 & 6
	}
	
	//CONSTRUCTOR(S)
	public Die() //
	{
		this._rand = new SecureRandom(); //Initialzing the randomizer
	}//END constructor
}//END DieRoller