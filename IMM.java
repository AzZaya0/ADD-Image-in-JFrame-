package Week3;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IMM {
	public IMM() {
		JFrame frame = new JFrame("hello");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);

		JLabel label = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("azay.jpg")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(15, 15, 400, 400);
		frame.add(label);

		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new IMM();

	}

}
