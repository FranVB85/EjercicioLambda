package PruebaShoppingCart;

import java.math.BigDecimal;

public enum Tax {

	NORMAL(new BigDecimal("1.21")), SUPERREDUCED(new BigDecimal("0.4")), REDUCED(new BigDecimal("1.10"));
	
	private BigDecimal precio;
	
	Tax(){}
	
	Tax(BigDecimal precio) {
		this.precio=precio;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	
	
}
