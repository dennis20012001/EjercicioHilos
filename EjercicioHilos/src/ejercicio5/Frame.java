package ejercicio5;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Frame extends JFrame {
	private JPanel contentPanel;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1192448738087252005L;

	public void run() {
		try {
			Frame frame = new Frame();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Frame() {

		setBackground(new Color(64, 128, 128));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 515);

		contentPanel = new JPanel();
		contentPanel.setBackground(new Color(64, 128, 128));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPanel);
		contentPanel.setLayout(null);

		JLabel progresoHilo1 = new JLabel(" Hilo 1: ");
		progresoHilo1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		progresoHilo1.setBounds(53, 295, 119, 23);
		contentPanel.add(progresoHilo1);

		JLabel ProgresoHilo2 = new JLabel(" Hilo 2: ");
		ProgresoHilo2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ProgresoHilo2.setBounds(53, 358, 119, 23);
		contentPanel.add(ProgresoHilo2);

		JLabel ProgresoHilo3 = new JLabel(" Hilo 3: ");
		ProgresoHilo3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		ProgresoHilo3.setBounds(53, 416, 119, 23);
		contentPanel.add(ProgresoHilo3);

		JLabel prioridadHilo1 = new JLabel("Prio:");
		prioridadHilo1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		prioridadHilo1.setBounds(255, 295, 119, 23);
		contentPanel.add(prioridadHilo1);

		JLabel prioridadHilo2 = new JLabel("Prio:");
		prioridadHilo2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		prioridadHilo2.setBounds(255, 358, 119, 23);
		contentPanel.add(prioridadHilo2);

		JLabel prioridadHilo3 = new JLabel("Prio:");
		prioridadHilo3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		prioridadHilo3.setBounds(255, 416, 119, 23);
		contentPanel.add(prioridadHilo3);

		Hilo h1 = new Hilo("Hilo1", progresoHilo1);
		Hilo h2 = new Hilo("Hilo2", ProgresoHilo2);
		Hilo h3 = new Hilo("Hilo3", ProgresoHilo3);

		h1.start();
		h2.start();
		h3.start();

		JButton restarHilo1 = new JButton("--");
		restarHilo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h1.setPriority(Thread.MIN_PRIORITY);
				prioridadHilo1.setText(String.valueOf("Prio: " + h1.getPriority()));
			}
		});
		restarHilo1.setBounds(54, 48, 46, 23);
		contentPanel.add(restarHilo1);

		JButton finHilo1 = new JButton("Finalizar Hilo 1");
		finHilo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h1.setFlag(false);
			}
		});
		finHilo1.setBounds(162, 48, 101, 23);
		contentPanel.add(finHilo1);

		prioridadHilo1.setText(String.valueOf("Prio: " + h1.getPriority()));
		prioridadHilo2.setText(String.valueOf("Prio: " + h2.getPriority()));
		prioridadHilo3.setText(String.valueOf("Prio: " + h3.getPriority()));
		JButton sumarHilo1 = new JButton("++");
		sumarHilo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			h1.setPriority(Thread.MAX_PRIORITY);
			prioridadHilo1.setText(String.valueOf("Prio: " + h1.getPriority()));
			}
		});
		sumarHilo1.setBounds(307, 48, 52, 23);
		contentPanel.add(sumarHilo1);

		JButton buttonFinalizarTodos = new JButton("Finalizar Todos");
		buttonFinalizarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h1.setFlag(false);
				h2.setFlag(false);
				h3.setFlag(false);
			}
		});
		buttonFinalizarTodos.setBounds(154, 235, 119, 23);
		contentPanel.add(buttonFinalizarTodos);

		JButton restarHilo3 = new JButton("--");
		restarHilo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h3.setPriority(Thread.MIN_PRIORITY);
				prioridadHilo3.setText(String.valueOf("Prio: " + h3.getPriority()));
			}
		});
		restarHilo3.setBounds(53, 180, 52, 23);
		contentPanel.add(restarHilo3);

		JButton restarHilo2 = new JButton("--");
		restarHilo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h2.setPriority(Thread.MIN_PRIORITY);
				prioridadHilo2.setText(String.valueOf("Prio: " + h2.getPriority()));
			}
		});
		restarHilo2.setBounds(54, 113, 46, 23);
		contentPanel.add(restarHilo2);

		JButton sumarHilo3 = new JButton("++");
		sumarHilo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h3.setPriority(Thread.MAX_PRIORITY);
				prioridadHilo3.setText(String.valueOf("Prio: " + h3.getPriority()));
			}
		});
		sumarHilo3.setBounds(307, 180, 51, 23);
		contentPanel.add(sumarHilo3);

		JButton sumarHilo2 = new JButton("++");
		sumarHilo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h2.setPriority(Thread.MAX_PRIORITY);
				prioridadHilo2.setText(String.valueOf("Prio: " + h2.getPriority()));
			}
		});
		sumarHilo2.setBounds(307, 113, 51, 23);
		contentPanel.add(sumarHilo2);

		JButton finHilo3 = new JButton("Finalizar Hilo 3");
		finHilo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h3.setFlag(false);
			}
		});
		finHilo3.setBounds(162, 180, 101, 23);
		contentPanel.add(finHilo3);

		JButton finHilo2 = new JButton("Finalizar Hilo 2");
		finHilo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h2.setFlag(false);
			}
		});
		finHilo2.setBounds(162, 113, 101, 23);
		contentPanel.add(finHilo2);

	}
}