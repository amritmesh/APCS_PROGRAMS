public class Morse 
{
	char letter;
	int index;
	
	public Morse(char myLetter, int myIndex)
	{
		letter = myLetter;
		index = myIndex;
	}

	public char getLetter() 
	{
		return letter;
	}

	public void setLetter(char letter) 
	{
		this.letter = letter;
	}

	public int getIndex() 
	{
		return index;
	}

	public void setIndex(int index) 
	{
		this.index = index;
	}
}
