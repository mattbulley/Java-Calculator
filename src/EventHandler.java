import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener{
	TextField T;
	
	public EventHandler(TextField A) {
		T = A;
	}
	
	public void actionPerformed(ActionEvent AE) {
		Button btn = (Button)AE.getSource();
		T.setText(T.getText() + btn.getLabel());
	}
}
