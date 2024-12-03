
public class Guess
{
	public String question;
	public Guess guessNo;
	public Guess guessYes;
	public String answerNo;
	public String answerYes;
	
	public Guess(String q, String no, String yes)
	{	
		this.question = q;
		this.answerNo = no;
		this.answerYes = yes;
	}
	public Guess(String q, Guess no, String yes)
	{
		this.question = q;
		this.guessNo = no;
		this.answerYes = yes;
	}
	public Guess(String q, Guess no, Guess yes)
	{
		this.question = q;
		this.guessNo = no;
		this.guessNo = yes;
	}
	public Guess(String q, String no, Guess yes)
	{
		this.question = q;
		this.answerNo = no;
		this.guessYes = yes;
	}
	
}
