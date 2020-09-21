package com.obsm.book.model;

import java.util.List;

public class Category {
	private long categoryId;
	private String categoryName;
	private List<String> listOfBooks;
	
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public List<String> getListOfBooks() {
		return listOfBooks;
	}
	public void setListOfBooks(List<String> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}
	public Category() {

	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", listOfBooks=" + listOfBooks
				+ "]";
	}
	
}
