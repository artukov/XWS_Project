package xws.microservis.advertservice.dto;

import java.util.Date;

import xws.microservis.advertservice.model.Car;
import xws.microservis.advertservice.model.PriceList;

public class AdvertDto {
	
	private Long id;
	
	private Long carId;
	
	private Date advertStartDate;
	
	private Date advertEndDate;
	
	private Long priceListId;
	
	public AdvertDto(Long id , Long carId, Date advertStartDate , Date advertEndDate , Long priceListId) {
		this.id = id;
		this.advertEndDate = advertEndDate;
		this.advertStartDate = advertStartDate;
		this.carId = carId;
		this.priceListId = priceListId;
	}
	
	

	public Long getCarId() {
		return carId;
	}



	public void setCarId(Long carId) {
		this.carId = carId;
	}



	public Long getPriceListId() {
		return priceListId;
	}



	public void setPriceListId(Long priceListId) {
		this.priceListId = priceListId;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Date getAdvertStartDate() {
		return advertStartDate;
	}

	public void setAdvertStartDate(Date advertStartDate) {
		this.advertStartDate = advertStartDate;
	}

	public Date getAdvertEndDate() {
		return advertEndDate;
	}

	public void setAdvertEndDate(Date advertEndDate) {
		this.advertEndDate = advertEndDate;
	}

	
	

}
