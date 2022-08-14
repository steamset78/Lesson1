package ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	
	private String tradeCode;
	private String name;
	private String category;
	private String style;
	private String color;
	private int quantity;
	private double price;
	private Double rating;
	private String details;
	boolean hasDiscount;
	private int discountPercentage;
	
	@OneToOne
	private Collection collection;
	
	@OneToOne
	private Brand brand;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Enumerated(EnumType.STRING)
	private Size size;

}
