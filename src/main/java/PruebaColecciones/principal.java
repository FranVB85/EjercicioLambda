package PruebaColecciones;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

import PruebaColecciones.Product.Product;
import PruebaShoppingCart.Tax;

public class principal {
	
	public static BigDecimal total = new BigDecimal("0");
	public static BigDecimal precioIva = new BigDecimal("0");
	public static BigDecimal iva = new BigDecimal("0");

	public static void main(String[] args){
		
		
		List<Product> shoppingCart = List.of(
		new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
		new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
		new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
		new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
		new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
		new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));


		//BigDecimal total=new BigDecimal(0);
		
		// TOTAL COMPRA
		shoppingCart.stream().forEach((p)-> {
		iva = p.getPrecio().multiply(p.getTax().getPrecio());
		total= total.add(p.getPrecio().add(iva));
		});
		System.out.println("Tu compra tiene un total de " + total + " €");
		
		Stream <Product> producto=shoppingCart.stream().filter((pro)->pro.getNombre().startsWith("C")).sorted();
		producto.forEach((p) -> {
			System.out.println("Los productos que empiezan por C son " + p.getNombre());
		});
		}
}
