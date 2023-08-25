package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class VentaDetalle {
    
    private @Id @GeneratedValue Integer id;

    @ManyToOne()
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @ManyToOne()
    @JoinColumn(name = "id_venta")
    private Venta venta;

	private Integer cantidad;

    /*@ManyToOne()
    @JoinColumn(name = "id_instrumento")
    private Instrumento instrumento;*/

    public VentaDetalle() {}

	

	public VentaDetalle(Producto producto, Venta venta, Integer cantidad) {
        this.producto = producto;
        this.venta = venta;
        this.cantidad = cantidad;
    }



    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }



    public Producto getProducto() {
        return producto;
    }



    public void setProducto(Producto producto) {
        this.producto = producto;
    }



    public Venta getVenta() {
        return venta;
    }



    public void setVenta(Venta venta) {
        this.venta = venta;
    }



    public Integer getCantidad() {
        return cantidad;
    }



    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }


	
    

    

}
