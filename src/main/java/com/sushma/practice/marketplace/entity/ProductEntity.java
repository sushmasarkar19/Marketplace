package com.sushma.practice.marketplace.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class ProductEntity {

	@Id
	@Column(name="PRODUCT_ID")
	private Long productId;
	
	@Column(name = "PRODUCT_NAME")
	@NotBlank(message = "Product name must not be blank.")
	private String productName;
	
	@Column(name = "PRODUCT_CATEGORY")
	@NotBlank(message = "Category name must not be blank.")
	@Size(min=5, max=20, message = "Size limit exceeds.")
	private String productCategory;
	
	@Column
	@NotNull(message = "Price must not be blank.")
	@Positive(message = "Price must be greater than 0.")
	private Double price;
	
	public ProductEntity() {}

	public ProductEntity(Long productId, @NotBlank(message = "Product name must not be blank.") String productName,
			@NotBlank(message = "Category name must not be blank.") @Size(min = 5, max = 20, message = "Size limit exceeds.") String productCategory,
			@NotEmpty(message = "Price must not be blank.") Double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.price = price;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	};
	
}
