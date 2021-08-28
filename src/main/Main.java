import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		ArrayList <Cuenta> cliente1cuenta = new ArrayList <Cuenta> ();
		cliente1cuenta.add(new Cuenta(111122,"Bolivianos","Caja de Ahorros",12000));
		cliente1cuenta.add(new Cuenta(112211,"USD","Cuenta Corriente",100));
		Cliente cliente1= new Cliente("Juan Perez","jperez","3333",cliente1cuenta);
		
		ArrayList <Cuenta> cliente2cuenta = new ArrayList <Cuenta> ();
		cliente2cuenta.add(new Cuenta(221122,"Bolivianos","Caja de Ahorros",0));
		Cliente cliente2= new Cliente("Maria Gomez","mgomez","4444",cliente2cuenta);
		
		ArrayList <Cuenta> cliente3cuenta = new ArrayList <Cuenta> ();
		cliente3cuenta.add(new Cuenta(331122,"Bolivianos","Caja de Ahorros",100));
		cliente3cuenta.add(new Cuenta(332211,"USD","Cuenta Corriente",1000));
		cliente3cuenta.add(new Cuenta(332233,"Bolivianos","Caja de Ahorros",100000));
		Cliente cliente3= new Cliente("Carlos Gomez","cgomez","3333",cliente3cuenta);
		
		ArrayList <Cliente> clientes = new ArrayList <Cliente> ();
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		
		
		for(;true;) {
			Cliente cliente = Login.comprobar(clientes);
			boolean flag=true;
			do {
				if(cliente != null) {
					String[] menu = {"Ver saldo", "Retirar dinero", "Depositar dinero", "Salir"};
					String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion", "Opciones", JOptionPane.DEFAULT_OPTION,
							null, menu, menu[0]);
					switch(opcion) {
						case "Ver saldo":
							cliente.mostrar();
							break;
						case "Retirar dinero":
							cliente.retiro();;
							break;
						case "Depositar dinero":
							cliente.deposito();;
							break;
						case "Salir":
							flag=false;
							break;
					}
				}
			}while(flag);
		}
		
	}
}