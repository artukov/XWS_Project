package xws.microservis.rentservice.model;

import org.hibernate.annotations.GenericGenerator;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.*;


@Entity
public class PriceList {

	@Id
	@GenericGenerator(name = "pricelist_seq",strategy = "sequence", parameters ={
			@org.hibernate.annotations.Parameter(name = "pricelist_seq_name", value = "sequence"),
			@org.hibernate.annotations.Parameter(name = "allocationSize", value = "1"),
			@org.hibernate.annotations.Parameter(name = "initial_value", value = "500"),
			@org.hibernate.annotations.Parameter(name = "increment_size", value = "100")
	})
	@GeneratedValue(generator = "pricelist_seq", strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private Double pricePerDay;
	
	@Column
	private Double pricePerKilometer;
	
	@Column
	private Double priceCDW;
	
	//Intervali za popust

	/*
	@Column
	@ElementCollection
	private Map<Integer , Integer> saleIntervals = new HashMap<Integer,Integer>() ;
	*/


	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name= "firm_id", nullable = true)
	private Firm firm;

	@ManyToOne(fetch   = FetchType.EAGER)
	@JoinColumn(name = "user_id", nullable = true)
	private User user;

	@Column
	private Long monolitId;

	public PriceList() {
		
	}

	public Long getMonolitId() {
		return monolitId;
	}

	public void setMonolitId(Long monolitId) {
		this.monolitId = monolitId;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Double getPricePerDay() {
		return pricePerDay;
	}


	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}


	public Double getPricePerKilometer() {
		return pricePerKilometer;
	}


	public void setPricePerKilometer(Double pricePerKilometer) {
		this.pricePerKilometer = pricePerKilometer;
	}


	public Double getPriceCDW() {
		return priceCDW;
	}


	public void setPriceCDW(Double priceCDW) {
		this.priceCDW = priceCDW;
	}


	/*public HashMap<Integer, Integer> getSaleIntervals() {
		return (HashMap<Integer, Integer>) saleIntervals;
	}


	public void setSaleIntervals(HashMap<Integer, Integer> saleIntervals) {
		this.saleIntervals = saleIntervals;
	}*/



	/*public void setSaleIntervals(Map<Integer, Integer> saleIntervals) {
		this.saleIntervals = saleIntervals;
	}*/

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Firm getFirm() {
		return firm;
	}

	public void setFirm(Firm firm) {
		this.firm = firm;
	}
}
