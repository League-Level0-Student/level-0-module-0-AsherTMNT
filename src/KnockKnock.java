import javax.swing.JOptionPane;

public class KnockKnock {
	public static void main(String[] args) {
		boolean wrongAnswer = true;
		for (int i = 0; wrongAnswer; i++) {
			String knock = JOptionPane.showInputDialog("Knock Knock!");
			if (knock.equalsIgnoreCase("Who's there?")) {
				wrongAnswer = false;
			}
		}
		wrongAnswer = true;
		for (int i = 0; wrongAnswer; i++) {
			String cow = JOptionPane.showInputDialog("Cows go.");
			if (cow.equalsIgnoreCase("Cows go who?")) {
				wrongAnswer = false;

			}
		}
		JOptionPane.showMessageDialog(null, "No, cows go moo!");
	}
}
