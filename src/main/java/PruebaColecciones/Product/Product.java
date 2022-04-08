package PruebaColecciones.Product;

import java.math.BigDecimal;

import PruebaShoppingCart.Tax;

public class Product implements Comparable<Product> {

	String nombre;
	BigDecimal precio;
	Tax tax;
	
	public Product() {
		super();
	}
	
	

	public Product(String nombre, BigDecimal precio, Tax tax) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.tax = tax;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Product [nombre=" + nombre + ", precio=" + precio + "]";
	}



	public Tax getTax() {
		return tax;
	}



	public void setTax(Tax tax) {
		this.tax = tax;
	}



	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
