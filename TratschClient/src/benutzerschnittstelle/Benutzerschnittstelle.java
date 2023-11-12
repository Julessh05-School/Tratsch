/**
 * 
 */
package benutzerschnittstelle;

import javax.swing.*;

/**
 * 
 */
public final class Benutzerschnittstelle extends JFrame {

	/**
	 * @param args arguments to pass when starting the Application
	 */
	public static void main(String[] args) {
		final Benutzerschnittstelle ui = new Benutzerschnittstelle();
		ui.setVisible(true);
	}

	public Benutzerschnittstelle() {
		init();
		build();
	}

	private void init() {
		setTitle("Tratsch");
		requestFocus();
	}

	private void build() {

	}

}