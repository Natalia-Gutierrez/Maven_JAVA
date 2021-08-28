import java.util.ArrayList;

import javax.swing.JOptionPane;

class Login {
	public static Cliente comprobar(ArrayList<Cliente> clientes) {
		for(int i=1;i<=3;i++) {
			String cod = JOptionPane.showInputDialog("Introduzca su código de usuario");
			String pp = JOptionPane.showInputDialog("Introduzca su pin");
			for(Cliente cliente : clientes) {
				if(cliente.codigo.equals(cod) && cliente.pin.equals(pp)) {
					JOptionPane.showMessageDialog(null, "Acceso correcto");
					return cliente;
				}
			}
			if(i==3) {
				JOptionPane.showMessageDialog(null, "Número de intentos excedido","Banco Patito", JOptionPane.ERROR_MESSAGE, null);
			}
		}
		return null;
	}
}