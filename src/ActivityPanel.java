import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.*;



public class ActivityPanel extends JPanel {
    JLabel activityIndex;
	JTextArea activityDetails = new JTextArea();
	JButton finished;
	
	private boolean isFinished;
    ActivityPanel(){
        this.setBorder(BorderFactory.createLineBorder(Color.white));
        this.setLayout(new BorderLayout());
        isFinished = false;

        activityIndex = new JLabel();
		activityIndex.setHorizontalAlignment(JLabel.CENTER);
		activityIndex.setBorder(BorderFactory.createEmptyBorder(2, 7, 2, 7));
		this.add(activityIndex,BorderLayout.WEST);

		activityDetails.setBorder(BorderFactory.createEmptyBorder());
		activityDetails.setBackground(new Color(0,0,128,100));
		activityDetails.setEditable(false);

        this.add(activityDetails,BorderLayout.CENTER);

		JPanel eastPanel = new JPanel();
		eastPanel.setLayout(new GridLayout(2,1));

        finished = new JButton("Finished");
		finished.setBorder(BorderFactory.createEmptyBorder(2, 7, 2, 7));
		finished.setFocusPainted(false);

		JButton edit = new JButton("Edit");
		finished.setBorder(BorderFactory.createEmptyBorder(2, 7, 2, 7));
		finished.setFocusPainted(false);

		eastPanel.add(finished);

		eastPanel.add(edit);


		this.add(eastPanel,BorderLayout.EAST);

    }

    public void changeIndex(int num)
	{
		this.activityIndex.setText(String.valueOf(num));
		this.revalidate();
	}
	// String activityName, String dueDate, String dueHour
	public void setActivityDetails(String activityName, String dueDate, String dueHour){
		activityDetails.setText("  Activity name: " + activityName+"\n"+"        Due Date: "+dueDate+"\n"+"        Due Hour: "+dueHour);
		// activityDetails.setText("alskdfjlksajdfkljaskldfjslkafjdsklafjkl");
	}
	
	
	public JButton getFinished()
	{
		return finished;
	}
	
	public boolean getState()
	{
		return isFinished;
	}
	
	public void changeState()
	{
		this.setBorder(BorderFactory.createLineBorder(Color.green));
		activityDetails.setBackground(Color.green);
		isFinished = true;
		revalidate();
	}
}
