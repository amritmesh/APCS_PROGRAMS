package edu.wwp.apcs.pkg11;

public class BaseballPlayer extends Athlete
{ 
	//There are only 2 instance variables in this class
	private double gamesPlayed;
	private String position;
	
	//Constructor. Set gamesPlayed to 0 Include Signature line.
	public BaseballPlayer(String fname, String lname, String position)
	{
		super(fname, lname, position);
		gamesPlayed = 0;
	}
	
	//This method changes gamesPlayed based on parameter inningsPerWeek(9 innings = 1 game)
	//and calculates training time.
	//adds 2 hour of training time if you are a pitcher for every game and 4 hours of training
	//time for all other positions for every game
	public void countGames(int inningsPerWeek)
	{
		gamesPlayed = (double) inningsPerWeek / 9;
		
		if (position.equals("pitcher"))
		{
			//train method adds to hours of training
			super.train(gamesPlayed * 2);
		}
		
		else
		{
			//train method adds to hours of training
			super.train(gamesPlayed * 4);
		}
	}
	
	//This method returns gamesPlayed
	public double getGamesPlayed()
	{
		return gamesPlayed;
	}
	
	//This method returns position
	public String getPosition()
	{
		return position;
	}
	
	//toString method
	public String toString ()
	{
		return super.toString() + "\n" + gamesPlayed + " games played in the " + position + " position.";
	}
}
