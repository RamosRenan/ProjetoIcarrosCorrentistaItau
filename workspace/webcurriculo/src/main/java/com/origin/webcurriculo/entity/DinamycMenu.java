package com.origin.webcurriculo.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.origin.webcurriculo.interfaces.DinamycMenuInterface;

@Table(name = "dinamyc_menu")
public class DinamycMenu implements DinamycMenuInterface{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	@Column(name = "name", nullable = false, length = 100)
	private String name;
	
	@Column(name = "link")
	private String link;
	
	@Column(name = "parent", nullable = false)
	private Long parent;
	
	@Column(name = "node", nullable = false)
	private boolean node;
	
	@Column(name = "active", nullable = false)
	private boolean active;
	
	@Column(name = "active", nullable = false, columnDefinition = "TEXT")
	private String description;
	
	@Column(name = "keywords", nullable = false, columnDefinition = "String[]")
	private String[] keywords;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLink() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getNode() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getActive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getdescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getKeyWords() {
		// TODO Auto-generated method stub
		return null;
	}
	
	 
}
