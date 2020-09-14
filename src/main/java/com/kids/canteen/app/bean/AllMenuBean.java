package com.kids.canteen.app.bean;

import java.io.Serializable;

public class AllMenuBean implements Serializable {

	private static final long serialVersionUID = 2498701406832349359L;

	private String dishName;
	
	private String shortDescription;
	
	private Boolean isVegOrNonveg;
	
	private String dishCourse;
	
	private String dishMainCateogry;
	
	private String dishSubCategory;
	
	private Double unitPrice;
	
	private String imageUrl;
	
	public AllMenuBean() {
		
	}
	
	public AllMenuBean(String dishName, String shortDescription) {
		this.dishName = dishName;
		this.shortDescription = shortDescription;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public Boolean getIsVegOrNonveg() {
		return isVegOrNonveg;
	}

	public void setIsVegOrNonveg(Boolean isVegOrNonveg) {
		this.isVegOrNonveg = isVegOrNonveg;
	}

	public String getDishCourse() {
		return dishCourse;
	}

	public void setDishCourse(String dishCourse) {
		this.dishCourse = dishCourse;
	}

	public String getDishMainCateogry() {
		return dishMainCateogry;
	}

	public void setDishMainCateogry(String dishMainCateogry) {
		this.dishMainCateogry = dishMainCateogry;
	}

	public String getDishSubCategory() {
		return dishSubCategory;
	}

	public void setDishSubCategory(String dishSubCategory) {
		this.dishSubCategory = dishSubCategory;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return "AllMenuBean [dishName=" + dishName + ", shortDescription=" + shortDescription + ", isVegOrNonveg="
				+ isVegOrNonveg + ", dishCourse=" + dishCourse + ", dishMainCateogry=" + dishMainCateogry
				+ ", dishSubCategory=" + dishSubCategory + ", unitPrice=" + unitPrice
				+ ", imageUrl= " + imageUrl + "]";
	}
		
}
