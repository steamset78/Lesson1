package ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	
	private String firstName;
	private String secondName;
	private String email;
	private String password;
	private String phoneNumber;
	
	@OneToOne
	private Address address;
	
	
}
