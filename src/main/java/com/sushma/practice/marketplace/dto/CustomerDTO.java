package com.sushma.practice.marketplace.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CustomerDTO {

	@NotBlank(message = "Name cannot be blank")
	private String customerName;
	@Email(message = "Email is not valid")
	private String email;
	@Size(min = 10, max = 10, message = "Phone number is not valid")
	private String phone;

	public CustomerDTO() {
	}

	public CustomerDTO(@NotBlank(message = "Name cannot be blank") String customerName,
			@Email(message = "Email is not valid") String email,
			@Size(min = 10, max = 10, message = "Phone number is not valid") String phone) {
		super();
		this.customerName = customerName;
		this.email = email;
		this.phone = phone;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
