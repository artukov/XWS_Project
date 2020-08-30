package xws.microservice.soapservice.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class RentAdvert {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	@JoinColumn
	private Car car;
	
	@Column(nullable = false)
	private Date advertStartDate;
	
	@Column(nullable = false)
	private Date advertEndDate;
	
	
	@OneToOne
	@JoinColumn(name = "priceList_id")
	private PriceList priceList;
	
	@ManyToOne
	@JoinColumn(name = "firm")
	private Firm firm;
	
	
	
	
	public RentAdvert() {
		
	}






	public Long getId() {
		return id;
	}






	public void setId(Long id) {
		this.id = id;
	}






	public Car getCar() {
		return car;
	}






	public void setCar(Car car) {
		this.car = car;
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






	public PriceList getPriceList() {
		return priceList;
	}






	public void setPriceList(PriceList priceList) {
		this.priceList = priceList;
	}
	
}