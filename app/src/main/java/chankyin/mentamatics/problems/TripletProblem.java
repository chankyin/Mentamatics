package chankyin.mentamatics.problems;

import android.widget.LinearLayout;
import chankyin.mentamatics.Main;
import chankyin.mentamatics.config.ConfigConstants;
import chankyin.mentamatics.math.RealNumber;

public class TripletProblem implements ConfigConstants, Question{
	private final RealNumber a;
	private final Operator op;
	private final RealNumber b;

	public TripletProblem(RealNumber a, Operator op, RealNumber b){
		this.a = a;
		this.op = op;
		this.b = b;
	}

	@Override
	public void populate(LinearLayout layout){
		if(Main.getInstance().getConfig().getBoolean(KEY_GUI_VERTICAL_ALIGN)){

		}
	}
}
