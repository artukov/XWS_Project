package xml.team.rentacar.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String carRegistration;
	
	//@Column(nullable = false)
	//private String carMark;
	
	@OneToOne
	@JoinColumn
	private CarMark carMark;
	
	@OneToOne
	@JoinColumn
	private CarModel carModel;
	
	@OneToOne
	@JoinColumn
	private CarClass carClass;
	
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "carfuel_id")
	private CarFuel carFuel;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "transmission_id")
	private Transmission transmission;
	
	
	
	@Column(nullable = false)
	private Integer carMileage;//kilometraza do sada
	
    @Column
    @ElementCollection(targetClass = String.class)
	private List<String> carComment = new ArrayList<String>();
	
	@Column(nullable = false)
	private Integer carGrade;
	
	private double longitude;
	
	private double latitude;
	
	//Cjenovnik
	
	@Column(nullable = false)
	private Integer kidsSeats;
	
	//Slika automobila
	
	
	
	
	public Car() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public CarFuel getCarFuel() {
		return carFuel;
	}

	public void setCarFuel(CarFuel carFuel) {
		this.carFuel = carFuel;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	public List<String> getCarComment() {
		return carComment;
	}

	public void setCarComment(List<String> carComment) {
		this.carComment = carComment;
	}

	

	public Integer getCarMileage() {
		return carMileage;
	}

	public void setCarMileage(Integer carMileage) {
		this.carMileage = carMileage;
	}

	public Integer getKidsSeats() {
		return kidsSeats;
	}

	public void setKidsSeats(Integer kidsSeats) {
		this.kidsSeats = kidsSeats;
	}

	public String getCarRegistration() {
		return carRegistration;
	}

	public void setCarRegistration(String carRegistration) {
		this.carRegistration = carRegistration;
	}


	public Integer getCarGrade() {
		return carGrade;
	}

	public void setCarGrade(Integer carGrade) {
		this.carGrade = carGrade;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
}
