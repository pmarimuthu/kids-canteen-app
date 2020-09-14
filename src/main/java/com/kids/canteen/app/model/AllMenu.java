package com.kids.canteen.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.kids.canteen.app.bean.AllMenuBean;

@Entity
@Table(schema = "kids_canteen", name = "all_menu")
public class AllMenu {

	@Id
	@Column(name = "dish_name")
	private String dishName;
	
	@Column(name = "short_description")
	private String shortDescription;
	
	@Column(name = "veg_or_nonveg")
	private Boolean isVegOrNonveg;
	
	@Column(name = "dish_course")
	private String dishCourse;
	
	@Column(name = "dish_main_category")
	private String dishMainCateogry;
	
	@Column(name = "dish_sub_category")
	private String dishSubCategory;
	
	@Column(name = "unit_price")
	private Double unitPrice;
	
	@Column(name ="image_url")
	private String imageUrl;

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
	
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public AllMenu toEntity(AllMenuBean bean) {
		this.dishName = bean.getDishName();
		this.shortDescription = bean.getShortDescription();
		this.isVegOrNonveg = bean.getIsVegOrNonveg();
		this.dishCourse = bean.getDishCourse();
		this.dishMainCateogry = bean.getDishMainCateogry();
		this.dishSubCategory = bean.getDishSubCategory();
		this.unitPrice = bean.getUnitPrice();
		this.imageUrl = bean.getImageUrl();
		
		return this;
	}
	
	public AllMenuBean toBean() {
		AllMenuBean bean = new AllMenuBean();
		bean.setDishName(dishName);
		bean.setShortDescription(shortDescription);
		bean.setIsVegOrNonveg(isVegOrNonveg);
		bean.setDishCourse(dishCourse);
		bean.setDishMainCateogry(dishMainCateogry);
		bean.setDishSubCategory(dishSubCategory);
		bean.setDishMainCateogry(dishMainCateogry);
		bean.setImageUrl(imageUrl);
		
		return bean;
	}

	@Override
	public String toString() {
		return "AllMenu [dishName=" + dishName + ", shortDescription=" + shortDescription + ", isVegOrNonveg="
				+ isVegOrNonveg + ", dishCourse=" + dishCourse + ", dishMainCateogry=" + dishMainCateogry
				+ ", dishSubCategory=" + dishSubCategory + ", unitPrice=" + unitPrice + ", imageUrl=" + imageUrl + "]";
	}
		
}
