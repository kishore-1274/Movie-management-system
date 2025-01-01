package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="movietable")
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long movie_id;
	private String name;
	private String genre;
	private double review;
	private long budget;
	private long ticket_price;
	public long getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(long movie_id) {
		this.movie_id = movie_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenere() {
		return genre;
	}
	public void setGenere(String genre) {
		this.genre = genre;
	}
	public double getReview() {
		return review;
	}
	public void setReview(double review) {
		this.review = review;
	}
	public long getBudget() {
		return budget;
	}
	public void setBudget(long budget) {
		this.budget = budget;
	}
	public long getTicket_price() {
		return ticket_price;
	}
	public void setTicket_price(long ticket_price) {
		this.ticket_price = ticket_price;
	}
	@Override
	public String toString() {
		return "Movie [movie_id=" + movie_id + ", name=" + name + ", genre=" + genre + ", review=" + review
				+ ", budget=" + budget + ", ticket_price=" + ticket_price + "]";
	}
	
}
