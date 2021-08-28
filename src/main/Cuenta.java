
class Cuenta {
	int NroCuenta;
	String Moneda;
	String TipoCuenta;
	double saldo;
	public Cuenta(int nroCuenta, String moneda, String tipoCuenta,
			double saldo) {
		NroCuenta = nroCuenta;
		Moneda = moneda;
		TipoCuenta = tipoCuenta;
		this.saldo = saldo;
	}
	public int getNroCuenta() {
		return NroCuenta;
	}
	public String getMoneda() {
		return Moneda;
	}
	public String getTipoCuenta() {
		return TipoCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	
}
