package hrsm.hrsm.entities.Concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="positions")

public class Position {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="user_id")
	private int userId;
	
	public Position () {
		
	}
	
	public Position(int id, String name, int userId){
		super ();
		this.id = id;
		this.name = name;
		this.userId = userId;
	}
}