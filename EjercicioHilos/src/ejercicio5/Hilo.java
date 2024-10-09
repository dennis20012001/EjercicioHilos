package ejercicio5;

import javax.swing.JLabel;

public class Hilo extends Thread {

	private boolean flag = false;
	private int i = 0;
	private JLabel jLabel ;

	public Hilo(String nom, JLabel jLabel) {
		super(nom);
		this.jLabel = jLabel;
		this.flag = true;
	}

	public void run() {

		while (flag) {
			jLabel.setText(getName() + ": "+ i++);
			try {
				sleep(1000);
			} catch (InterruptedException ignore) {
			}
		}
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
