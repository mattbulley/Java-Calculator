import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class CalcDesign {

	public static void main(String[] args) {
		
		Frame window = new Frame ("Integer Calculator");
		
		Panel P1 = new Panel();
		Panel P2 = new Panel();
		
		GridLayout G = new GridLayout(4, 4);
		P2.setLayout(G);
		
		TextField screen = new TextField(10);;
		
		Button B0,B1,B2,B3,B4,B5,B6,B7,B8,B9;
		Button BPlus, BMinus, BDiv, BMul, BClear, BEquals;
		
		B0 = new Button("0");
		B1 = new Button("1");
		B2 = new Button("2");
		B3 = new Button("3");
		B4 = new Button("4");
		B5 = new Button("5");
		B6 = new Button("6");
		B7 = new Button("7");
		B8 = new Button("8");
		B9 = new Button("9");
		BPlus = new Button("+");
		BMinus = new Button("-");
		BDiv = new Button("/");
		BMul = new Button("*");
		BClear = new Button("C");
		BEquals = new Button("=");
		
		Operations O = new Operations(screen);
		EventHandler E = new EventHandler(screen);
		B0.addActionListener(E);
		B1.addActionListener(E);
		B2.addActionListener(E);
		B3.addActionListener(E);
		B4.addActionListener(E);
		B5.addActionListener(E);
		B6.addActionListener(E);
		B7.addActionListener(E);
		B8.addActionListener(E);
		B9.addActionListener(E);
		
		BPlus.addActionListener(O);
		BMinus.addActionListener(O);
		BDiv.addActionListener(O);
		BMul.addActionListener(O);
		
		BEquals.addActionListener(O);
		BClear.addActionListener(O);
		
		window.add(P1, BorderLayout.NORTH);
		window.add(P2, BorderLayout.CENTER);
		
		P1.add(screen); P2.add(B1);
		P2.add(B2); P2.add(B3);
		P2.add(BPlus); P2.add(B4);
		P2.add(B5); P2.add(B6);
		P2.add(BMinus); P2.add(B7);
		P2.add(B8); P2.add(B9);
		P2.add(BDiv); P2.add(B0);
		P2.add(BEquals); P2.add(BClear);
		P2.add(BMul);
		
		window.setSize(500,500);
		window.setVisible(true);

	}
	

}
