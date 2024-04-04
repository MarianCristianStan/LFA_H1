package main;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RegexApp extends JFrame {

	private static final long serialVersionUID = 1L;

	public RegexApp() {
		setTitle("Regex App");
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setResizable(false);
		initInterface();
		setVisible(true);
	}

	private void initInterface() {
		Font font = new Font("Arial", Font.PLAIN, 14);
		setLayout(new GridLayout(10, 1));
		JLabel patternLabel = new JLabel("Enter pattern:");
		patternLabel.setFont(font);
		add(patternLabel);

		setPatternField(new JTextField());
		patternField.setFont(font);
		patternField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		patternField.setPreferredSize(new Dimension(500, 30));
		add(patternField);

		JLabel text1Label = new JLabel("Enter text1:");
		text1Label.setFont(font);
		add(text1Label);

		setText1Field(new JTextField());
		text1Field.setFont(font);
		text1Field.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		text1Field.setPreferredSize(new Dimension(500, 30));
		add(text1Field);

		JLabel text2Label = new JLabel("Enter text2:");
		text2Label.setFont(font);
		add(text2Label);

		setText2Area(new JTextArea());
		text2Area.setFont(font);
		text2Area.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		text2Area.setLineWrap(true);
		text2Area.setWrapStyleWord(true);
		JScrollPane text2ScrollPane = new JScrollPane(text2Area);
		add(text2ScrollPane);

		setCheckButton(new JButton("Check Pattern"));
		checkButton.setFont(font);
		checkButton.setPreferredSize(new Dimension(150, 40));
		getCheckButton().addActionListener(new HandleCheckBtn(this));
		add(checkButton);

		JLabel outputLabel = new JLabel("Matches found in text2:");
	    outputLabel.setFont(font);
	    add(outputLabel);
	    
		setOutputArea(new JTextArea());
		outputArea.setEditable(false);
		outputArea.setFont(font);
		JScrollPane outputScrollPane = new JScrollPane(outputArea);
		outputScrollPane.setPreferredSize(new Dimension(580, 200));
		add(outputScrollPane);
		

		setStatusLabel(new JLabel("Status Label"));
		statusLabel.setFont(font);
		statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
		statusLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		add(statusLabel);
	}

	public JTextField getPatternField() {
		return patternField;
	}

	public void setPatternField(JTextField patternField) {
		this.patternField = patternField;
	}

	public JTextField getText1Field() {
		return text1Field;
	}

	public void setText1Field(JTextField text1Field) {
		this.text1Field = text1Field;
	}

	public JTextArea getText2Area() {
		return text2Area;
	}

	public void setText2Area(JTextArea text2Area) {
		this.text2Area = text2Area;
	}

	public JTextArea getOutputArea() {
		return outputArea;
	}

	public void setOutputArea(JTextArea outputArea) {
		this.outputArea = outputArea;
	}

	public JButton getCheckButton() {
		return checkButton;
	}

	public void setCheckButton(JButton checkButton) {
		this.checkButton = checkButton;
	}

	public JLabel getStatusLabel() {
		return statusLabel;
	}

	public void setStatusLabel(JLabel statusLabel) {
		this.statusLabel = statusLabel;
	}

	private JTextField patternField, text1Field;
	private JTextArea text2Area, outputArea;
	private JButton checkButton;
	private JLabel statusLabel;

}
