package Q2;

import java.util.Collection;
import java.util.Map;

public class Question {
	int Questionid;
	String Question;
	Collection<String> answers;
	Map<Integer,String> answers1;

	public Question(int questionid, String question, Collection<String> answers) {
		Questionid = questionid;
		Question = question;
		this.answers = answers;
	}
	
	Question(int questionid, String question, Map<Integer,String> answers1) {
		Questionid = questionid;
		Question = question;
		this.answers1 = answers1;
	}
	
	public void Displayanswer(){
	System.out.println(answers);
	}
	void DisplayanswerM(){
		System.out.println(answers1);
		}
	@Override
	public String toString() {
		return "Question [Questionid=" + Questionid + ", Question=" + Question + ", answers=" + answers + "]";
	}
	public String toStringMap() {
		return "Question [Questionid=" + Questionid + ", Question=" + Question + ", answers=" + answers1 + "]";
	}

}
