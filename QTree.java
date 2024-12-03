import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class QTree
{
	
	
	Scanner in;
	PrintStream out;
	Guess initial = new Guess(Strings.IS_IT_ALIVE, "Rock", "Duck");
	Guess temp;
	String answer = "";
	String addAnswer = "";
	String addQuestion = "";
	
    //initializes the game
	public QTree(InputStream in,PrintStream out)
	{
		this.out=out;
		this.in=new Scanner(in);
		
		
	}
	
    
    //plays the game, be sure to grab input from the Scanner "in", and send your output to "out".
	public void playGame()
	{
		Guess current = initial;
		while(true)
		{
			System.out.println(current.question);
			answer = in.next();
			if(answer.equals("Y") || answer.equals("y"))
			{
				if(current.guessYes == null)
				{
					System.out.println(Strings.IS_IT_A + current.answerYes);
					answer = in.next();
					if(answer.equals("Y") || answer.equals("y"))
					{
						System.out.println(Strings.I_WIN);
						System.out.println(Strings.PLAY_AGAIN);
						answer = in.next();
						if(answer.equals("N") || answer.equals("n"))
						{
							return;
						}
					}
					else
					{
						System.out.println(Strings.WHAT_IS_THE_ANSWER);
						addAnswer = in.next();
						System.out.println(
						
						
					}
				}
				else
				{
					current = current.guessYes;
				}
			}
			else
			{
				if(current.guessNo == null)
				{
					System.out.println(Strings.IS_IT_A + current.answerNo);
					answer = in.next();
					if(answer.equals("Y") || answer.equals("y"))
					{
						System.out.println(Strings.I_WIN);
						System.out.println(Strings.PLAY_AGAIN);
						answer = in.next();
						if(answer.equals("N") || answer.equals("n"))
						{
							return;
						}
					}
				}
				else
				{
					current = current.guessNo;
				}
				
			}
		}
	
        
	}
	
	
	public static void main(String[] args)
	{
		QTree t = new QTree(System.in, System.out);
		t.playGame();
	}
	
	
}
