package chankyin.mentamatics.problem.question;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.nantaphop.fluentview.Fluent;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import static chankyin.mentamatics.Main.*;

@RequiredArgsConstructor
public class LiteralQuestion implements Question{
	@Getter private final String literal;
	@Getter private final int type;
	@Getter private final int flags;

	@Override
	public void populateQuestionLayout(LinearLayout layout){
		layout.addView(defluent(Fluent.with(
				new TextView(layout.getContext()))
				.setText(literal)
				.setLayoutParams(MP_MP)
		));
	}
}
