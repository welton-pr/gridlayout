package br.com.welton.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class Formulario extends JFrame{

	static int numero = 0;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Formulario() {
		this.setLayout(new GridLayout(3,2,10,10));
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.add(newLabel());
		this.add(newLabel());
		this.add(newLabel());
		this.add(newLabel());
		this.add(newLabel());

	}
	
	public JLabel newLabel() {
		JLabel l = new JLabel(String.valueOf(++numero));
		l.setBorder(new LineBorder(Color.BLACK));
		l.setHorizontalAlignment(JLabel.CENTER);
		return l;
	}
	
	
}
