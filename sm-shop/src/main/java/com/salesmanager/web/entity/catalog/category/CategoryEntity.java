package com.salesmanager.web.entity.catalog.category;

import java.io.Serializable;

public class CategoryEntity extends Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	

	private int sortOrder;
	private boolean visible;
	private String lineage;
	private int depth;
	private Category parent;
	private boolean hideProducts;
	

	public int getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public String getLineage() {
		return lineage;
	}
	public void setLineage(String lineage) {
		this.lineage = lineage;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public Category getParent() {
		return parent;
	}
	public void setParent(Category parent) {
		this.parent = parent;
	}
	public boolean isHideProducts() {
		return hideProducts;
	}
	public void setHideProducts(boolean hideProducts) {
		this.hideProducts = hideProducts;
	}

}