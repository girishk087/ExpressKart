package com.ekart.TO;

public class ProductTO {
	private int productId;
	private String productName;
	private double productPrice;
	private String productGuid;
	private int productQuantity;
	private int hits;
	private String tags;
	private CategoryTO category;
	private SubCategoryTO subCategory;
	private double offerPrize;
	private String productDescription;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductGuid() {
		return productGuid;
	}
	public void setProductGuid(String productGuid) {
		this.productGuid = productGuid;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public CategoryTO getCategory() {
		return category;
	}
	public void setCategory(CategoryTO category) {
		this.category = category;
	}
	public SubCategoryTO getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(SubCategoryTO subCategory) {
		this.subCategory = subCategory;
	}
	public double getOfferPrize() {
		return offerPrize;
	}
	public void setOfferPrize(double offerPrize) {
		this.offerPrize = offerPrize;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
}
