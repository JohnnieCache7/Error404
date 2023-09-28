package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Jonathan Argueta-Herrera - jiarguetaherrera CIS175 Fall 2023 Sep, 12
 */
@Entity
@Table(name="items")
public class ListItem {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="STORE")
	private String store;
	@Column(name="ITEM")
	private String item;

	// Default No-Arg Constructor
	public ListItem() {
		super();
	}
	
	//Helper Constructor 
	public ListItem(String store, String item) {
		this.store = store;
		this.item = item;
	}
	
	//Print Method
	public String returnItemDetails() {
		return this.store + ": " + this.item;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
	

}
