import java.awt.Frame;
import java.awt.TextArea;

public class TextAreaExample {

	TextAreaExample() {

		Frame f = new Frame();
		TextArea area = new TextArea("Welcome to satara");
		area.setBounds(30, 30, 300, 300);
		f.add(area);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	

	}

	public static void main(String[] args) {

		new TextAreaExample();
	}

}
