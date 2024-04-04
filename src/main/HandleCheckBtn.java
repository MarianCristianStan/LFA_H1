package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class HandleCheckBtn implements ActionListener {

	public HandleCheckBtn(RegexApp app) {
		this.app = app;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String pattern = app.getPatternField().getText();
		String text1 = app.getText1Field().getText();
		String text2 = app.getText2Area().getText();

		if (pattern.isEmpty()) {
			app.getStatusLabel().setText("Error: Please enter a pattern.");
			app.getOutputArea().setText("");
			return;
		}

		try {
			Pattern.compile(pattern);
		} catch (PatternSyntaxException ex) {
			app.getStatusLabel().setText("Error: Invalid pattern syntax.");
			app.getOutputArea().setText("");
			return;
		}

		if (Pattern.matches(pattern, text1)) {
			app.getStatusLabel().setText("Text1 matches the pattern.");
		} else {
			app.getStatusLabel().setText("Text1 does not match the pattern.");
		}

		ArrayList<String> matches = new ArrayList<>();
		Matcher matcher = Pattern.compile(pattern).matcher(text2);
		while (matcher.find()) {
			matches.add(matcher.group());
		}

		if (!matches.isEmpty()) {
			StringBuilder result = new StringBuilder();
			for (String match : matches) {
				result.append(match).append("\n");
			}
			app.getOutputArea().setText(result.toString());
		} else {
			app.getOutputArea().setText("No matches found in text2.");
		}

	}

	private RegexApp app;

}
