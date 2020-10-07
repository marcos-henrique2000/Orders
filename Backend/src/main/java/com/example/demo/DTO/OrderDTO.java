package com.example.demo.DTO;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.demo.entities.Order;

public class OrderDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String title;
	private String description;
	private String dateOrder;
	
	public OrderDTO(Order obj) {
		
		this.id = obj.getId();
		this.title = obj.getTitle();
		this.description = obj.getDescription();
		this.dateOrder = DefinirData(obj.getDateOrder());
	}
	
	public String DefinirData(Date obj) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Date dt = obj;
		return sdf.format(dt);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(String dateOrder) {
		this.dateOrder = dateOrder;
	}
}
