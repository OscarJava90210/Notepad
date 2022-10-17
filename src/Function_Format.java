import java.awt.Font;

public class Function_Format {
	GUI gui;
	Font arial, CSMS, tnr;
	String selectedFont;

	public Function_Format(GUI gui) {
		this.gui = gui;
	}

	public void wordWrap() {
		if (gui.wordWrapOn == false) {
			gui.wordWrapOn = true;
			gui.textArea.setLineWrap(true);
			gui.textArea.setWrapStyleWord(true);
			gui.iWrap.setText("Word Wrap: On");
		} else if (gui.wordWrapOn == false) {
			gui.wordWrapOn = false;
			gui.textArea.setLineWrap(false);
			gui.textArea.setWrapStyleWord(false);
			gui.iWrap.setText("Word Wrap: Off");
		}
	}

	public void createFont(int fontSize) {
		arial = new Font("Arial", Font.PLAIN, fontSize);
		CSMS = new Font("CSMS", Font.PLAIN, fontSize);
		tnr = new Font("TNR", Font.PLAIN, fontSize);
		setFont(selectedFont);
	}

	public void setFont(String font) {
		selectedFont = font;
		switch (selectedFont) {
		case "Arial":
			gui.textArea.setFont(arial);
			break;
		case "CSMS":
			gui.textArea.setFont(CSMS);
			break;
		case "TNR":
			gui.textArea.setFont(tnr);
			break;

		}
	}
}
