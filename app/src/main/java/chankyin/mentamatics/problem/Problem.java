package chankyin.mentamatics.problem;

import android.view.View;
import android.widget.LinearLayout;
import chankyin.mentamatics.R;
import chankyin.mentamatics.problem.answer.Answer;
import chankyin.mentamatics.problem.question.Question;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
public class Problem{
	private final Question question;
	private final Answer answer;
	@Getter @Setter private long startTime;

	@Setter private OnAnswerCorrectListener onAnswerCorrectListener;

	public void express(View container){
		setStartTime(System.nanoTime());

		LinearLayout questionLayout = container.findViewById(R.id.main_question);
		questionLayout.removeAllViews();
		question.populateQuestionLayout(questionLayout);

		LinearLayout answerLayout = container.findViewById(R.id.main_answer);
		answerLayout.removeAllViews();
		answer.populateAnswerField(answerLayout, this);
	}

	public void onCorrect(){
		if(onAnswerCorrectListener != null){
			onAnswerCorrectListener.onAnswerCorrect();
		}
	}

	public interface OnAnswerCorrectListener{
		void onAnswerCorrect();
	}

	@Override
	public String toString(){
		return "Question = {" + question.toString() + "} Answer = {" + answer.toString() + "}";
	}
}
