package ecommerce.entity;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "cart")
public class Cart {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	
	@ElementCollection
	private List<Product> products;
}
