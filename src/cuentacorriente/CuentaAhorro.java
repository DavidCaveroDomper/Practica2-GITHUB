package cuentacorriente;

public class CuentaAhorro extends CuentaCorriente {

    double interes;

    public CuentaAhorro(String nombre, String numCuenta, double saldo, double interes) {
        super(nombre, numCuenta, saldo, 0);
        this.interes = interes;
    }

    public CuentaAhorro(String nombre, String numCuenta, double interes) {     
        this.interes = interes;
    }

    public double getInteres() {
        return this.interes;
    }
}
