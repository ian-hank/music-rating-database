package com.ichprograms.rating.music.api.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Song")
public class Song {
	
	@Id
	private String id;				//Songs UID
	
	private String title;			//Name of the Song
	private String album;			//Name of the Album
	private List<String> authors;	//Names of the Authors
	private Genre genre;			//Name of the Genre
	
	private int month;				//Month Released
	private int year;				//Year Released
	
	@DBRef
	private List<Rating> ratings;
	private long totalRatingsCount;
	private double avgRating;
	private double avgGenreRating;
	private double avgCriticRating;
	
	public Song() {
		super();
		this.authors = new ArrayList<>();
		this.ratings = new ArrayList<>();
		this.totalRatingsCount = 0;
		this.avgRating = 0;
		this.avgGenreRating = 0;
		this.avgCriticRating = 0;
		
	}
	
	public Song(String title, String album, List<String> authors, Genre genre, int month, int year, List<Rating> ratings) {
		super();
		this.title = title;
		this.album = album;
		this.authors = authors;
		this.genre = genre;
		this.month = month;
		this.year = year;
		this.ratings = new ArrayList<Rating>();	
	}
	
	//Gets the song's ID
	public String getId() {
		return this.id;
	}
	
	//Gets the song's name
	public String getTitle() {
		return this.title;
	}
	
	//Gets the song's Album name
	public String getAlbum() {
		return this.album;
	}
	
	//Gets the song's Authors names
	public List<String> getAuthors() {
		return this.authors;
	}
	
	//Gets the song's Genre
	public Genre getGenre() {
		return this.genre;
	}
	
	//Gets the song's Month released
	public int getMonth() {
		return this.month;
	}
	
	//Gets the song's Year released
	public int getYear() {
		return this.year;
	}
	
	//Gets the # of times song was rated
	public long getRatingCount() {
		return this.totalRatingsCount;
	}
	
	//Gets the song's overall rating
	public double getOverallRating() {
		return this.avgRating;
	}
	
	//Sets the song's name
	public boolean setTitle(String title) {
		this.title = title;
		return this.title == title;
	}
	
	//Sets the song's Album name
	public boolean setAlbum(String name) {
		this.album = name;
		return this.album == name;
	}
	
	//Sets the song's Authors name
	public boolean setAuthors(List<String> names) {
		this.authors = names;
		return this.authors == names;
	}
	
	//Sets the song's Genre
	public boolean setGenre(Genre name) {
		this.genre = name;
		return this.genre == name;
	}
	
	//Sets the song's Month released
	public boolean setMonth(int name) {
		this.month = name;
		return this.month == name;
	}
	
	//Sets the song's Year released
	public boolean setYear(int name) {
		this.year = name;
		return this.year == name;
	}
	
	//Sets the rating count
	@SuppressWarnings("unused") //need privileges before this can be added
	private boolean setRatingCount(long ratingCount) {
			this.totalRatingsCount = ratingCount;
			return this.totalRatingsCount == ratingCount;
		}
	
	//Sets the overall Rating
	@SuppressWarnings("unused") //need privileges before this can be added
	private boolean setOverallRating(double overallRating) {
		this.avgRating = overallRating;
		return this.avgRating == overallRating;
	}
	
	//TODO Auto Generated Eclipse Methods need placed and updated
	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public double getTopGenreRating() {
		return avgGenreRating;
	}

	public void setTopGenreRating(double topGenreRating) {
		this.avgGenreRating = topGenreRating;
	}

	public double getTopCriticRating() {
		return avgCriticRating;
	}

	public void setTopCriticRating(double topCriticRating) {
		this.avgCriticRating = topCriticRating;
	}

		
}