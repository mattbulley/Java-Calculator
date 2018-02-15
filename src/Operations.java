import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operations implements ActionListener {
	TextField T1;
	int firstNo;
	String opt;
	
	public Operations(TextField A) {
		T1 = A;
	}

	public void actionPerformed(ActionEvent AE) {
		Button btn = (Button) AE.getSource();
		String L = btn.getLabel();
		if(L.equals("C")) T1.setText("");
		else if(L.equals("=")) {
			int A,B;
			float C = 0.0f;
			B = 0;
			A = Integer.parseInt(T1.getText());
			
			switch (opt) {
			case "+":
				B = firstNo + A;
				break;
			case "-":
				B = firstNo - A;
				break;
			case "/":
				C = (float)firstNo / (float)A;
				break;
			case "*":
				B = firstNo * A;
				break;
			}
			if(C!=0.0f)
				T1.setText(Float.toString(C));
			else
				T1.setText(Integer.toString(B));
		}
		else {
			firstNo = Integer.parseInt(T1.getText());
			opt = L;
			T1.setText("");
		}
	}
}
