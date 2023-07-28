package com.airline.ticketbooking.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Flight {
	@Id
	@Column(nullable = false,unique = true)
	private long flightNumber;
	private String flightName;
	private String flightType;// international or domestic
	private String source;
	private String destination;
	private Date depatureDate;
	private Date arrivalDate;
	private LocalDateTime depatureTime;
	private LocalDateTime arrivalTime;
	private int duration;
	private int availableSeats;

	public Flight(long flightNumber, String flightName, String flightType, String source, String destination,
			Date depatureDate, Date arrivalDate, int duration, LocalDateTime depatureTime, LocalDateTime arrivalTime,
			int availableSeats) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.flightType = flightType;
		this.source = source;
		this.destination = destination;
		this.depatureDate = depatureDate;
		this.arrivalDate = arrivalDate;
		this.duration = duration;
		this.depatureTime = depatureTime;
		this.arrivalTime = arrivalTime;
		this.availableSeats = availableSeats;
	}

	public Flight() {
		super();
	}

	public long getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDepatureDate() {
		return depatureDate;
	}

	public void setDepatureDate(Date depatureDate) {
		this.depatureDate = depatureDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public LocalDateTime getDepatureTime() {
		return depatureTime;
	}

	public void setDepatureTime(LocalDateTime depatureTime) {
		this.depatureTime = depatureTime;
	}

	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

}
