package entities;

public class conta {
    @Override
    public String toString() {
        return "conta{" +
                "id=" + id +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    private int id ;
    private String titular;
    private double saldo;

    public conta(int id, String titular, double saldo) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
    }

    public conta(int id ){
        this.id = id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double sacar(double valorSaque) {
        this.saldo = saldo - valorSaque;
        return  this.saldo;
    }
    public double depositar(double valorDeposito) {
        this.saldo = saldo + valorDeposito;
        return  this.saldo;
    }



}
