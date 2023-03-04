package ejerciciosInterfaces;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ej08 extends JFrame implements ChangeListener {
	Container panel;
	JLabel jl_texto1;
	
	public ej08() {
		super("Idiomas");
		
	}

	public static void main(String[] args) {
		ej08 ventana = new ej08();

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		
		
	}

}
