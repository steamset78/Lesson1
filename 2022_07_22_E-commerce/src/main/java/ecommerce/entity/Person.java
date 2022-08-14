package ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	
	@NotNull
	@NotBlank
	private String firstName;
	@NotNull
	@NotBlank
	private String secondName;
	@NotNull
	@NotBlank
	@Email
	private String email;
	@NotNull
	@NotBlank
	private String password;
	@NotNull
	@NotBlank
	private String phoneNumber;
	@Column(columnDefinition = "TEXT")
	private String icon;
	
	@OneToOne
	private Address address;
}
