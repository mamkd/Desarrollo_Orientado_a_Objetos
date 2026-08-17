package dev.mamkd.clases_guia_1_1_4.caso2;

public class Producto {
    private String sku;
    private String nombre;
    private String categoria;
    private int stock_actual;

    public Producto(String sku, String nombre, String categoria, int stock_actual) {
        this.sku = sku;
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock_actual = stock_actual;
    }

    public String get_sku() {
        return sku;
    }

    public void cambiar_categoria(String nueva_categoria) {
        categoria = nueva_categoria;
    }

    public void reducir_stock(int cantidad) {
        stock_actual = stock_actual + cantidad;
    }
}
