import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

class Cliente {
	public String nombre;
	public String codigo;
	public String pin;
	ArrayList <Cuenta> cuentas = new ArrayList <Cuenta>();
	public Cliente(String nombre, String codigo, String pin, ArrayList<Cuenta> cuentas) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.pin = pin;
		this.cuentas = cuentas;
	}
	public void mostrar() {
		String cad="";
		for(Cuenta cuenta : this.cuentas) {
			cad += ("Número de cuenta: " + cuenta.NroCuenta);
			cad += ("\nTipo de moneda: " + cuenta.Moneda);
			cad += ("\nSaldo: " + cuenta.saldo);
			cad += ("\nTipo de cuenta: " + cuenta.TipoCuenta);
		}
		JTextArea jt = new JTextArea();
		jt.setText(cad);
		JOptionPane.showMessageDialog(null, jt);
	}
	public int cuent() {
		int cont=0;
		for(Cuenta cuenta : cuentas) {
			cont++;
		}
		int op=Integer.parseInt(JOptionPane.showInputDialog("Cuentas: "+cont+"\nElija una"));
		return op;
	}
	public void retiro() {
		Cuenta cta = cuentas.get(cuent()-1);
		int i=0;
		double ret;
		do{
			ret = Double.parseDouble(JOptionPane.showInputDialog("El saldo actual es: "+cta.saldo+"¿Cuánto desea retirar?"));
			if(ret==0) {
				JOptionPane.showMessageDialog(null, "El monto no puede ser cero","Banco Patito", JOptionPane.ERROR_MESSAGE, null);
			}
			else if(ret<0) {
				JOptionPane.showMessageDialog(null, "El monto no puede ser negativo","Banco Patito", JOptionPane.ERROR_MESSAGE, null);
			}
			else if(ret>cta.saldo) {
				JOptionPane.showMessageDialog(null, "El monto no puede ser mayor al saldo","Banco Patito", JOptionPane.ERROR_MESSAGE, null);
			}
			else {
				i=-1;
			}
		}while(i!=-1);
		cta.saldo-=ret;
		JOptionPane.showMessageDialog(null,"Saldo actualizado");
	}
	public void deposito() {
		Cuenta cta = cuentas.get(cuent()-1);
		int i=0;
		double dep;
		do{
			dep = Double.parseDouble(JOptionPane.showInputDialog("El saldo actual es: "+cta.saldo+"¿Cuánto desea depositar?"));
			if(dep==0) {
				JOptionPane.showMessageDialog(null, "El monto no puede ser cero","Banco Patito", JOptionPane.ERROR_MESSAGE, null);
			}
			else if(dep<0) {
				JOptionPane.showMessageDialog(null, "El monto no puede ser negativo","Banco Patito", JOptionPane.ERROR_MESSAGE, null);
			}
			else {
				i=-1;
			}
		}while(i!=-1);
		cta.saldo+=dep;
		JOptionPane.showMessageDialog(null,"Saldo actualizado");
		
	}
}
