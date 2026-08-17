package dev.mamkd.clases_guia_1_1_4.caso3;

public class CuentaBancaria {
    private String id_cuenta;
    private String rut_titular;
    private String categoria;
    private long saldo;

    public CuentaBancaria(String id_cuenta, String rut_titular, String categoria) {
        this.id_cuenta = id_cuenta;
        this.rut_titular = rut_titular;
        this.categoria = categoria;
        this.saldo = 0;
    }

    public void depositar(long cantidad) {
        saldo += cantidad;
    }

    public void retirar(long cantidad) {
        saldo -= cantidad;
    }

    public String get_rut_titular() {
        return rut_titular;
    }
}
