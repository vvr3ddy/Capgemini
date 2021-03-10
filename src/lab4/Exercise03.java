package lab4;

import java.util.*;

abstract class Item {
	private long uniqueId;
	private String title;
	private int noOfCopies;

	public long getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(long uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

}

abstract class WrittenItem extends Item {
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public long getUniqueId() {
		// TODO Auto-generated method stub
		return super.getUniqueId();
	}

	@Override
	public void setUniqueId(long uniqueId) {
		// TODO Auto-generated method stub
		super.setUniqueId(uniqueId);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return super.getTitle();
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		super.setTitle(title);
	}

	@Override
	public int getNoOfCopies() {
		// TODO Auto-generated method stub
		return super.getNoOfCopies();
	}

	@Override
	public void setNoOfCopies(int noOfCopies) {
		// TODO Auto-generated method stub
		super.setNoOfCopies(noOfCopies);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}

class Book extends WrittenItem {

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return super.getAuthor();
	}

	@Override
	public void setAuthor(String author) {
		// TODO Auto-generated method stub
		super.setAuthor(author);
	}

	@Override
	public long getUniqueId() {
		// TODO Auto-generated method stub
		return super.getUniqueId();
	}

	@Override
	public void setUniqueId(long uniqueId) {
		// TODO Auto-generated method stub
		super.setUniqueId(uniqueId);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return super.getTitle();
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		super.setTitle(title);
	}

	@Override
	public int getNoOfCopies() {
		// TODO Auto-generated method stub
		return super.getNoOfCopies();
	}

	@Override
	public void setNoOfCopies(int noOfCopies) {
		// TODO Auto-generated method stub
		super.setNoOfCopies(noOfCopies);
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
}

class JournalPaper extends WrittenItem {
	private int yearPub;

	public int getYearPub() {
		return yearPub;
	}

	public void setYearPub(int yearPub) {
		this.yearPub = yearPub;
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return super.getAuthor();
	}

	@Override
	public void setAuthor(String author) {
		// TODO Auto-generated method stub
		super.setAuthor(author);
	}

	@Override
	public long getUniqueId() {
		// TODO Auto-generated method stub
		return super.getUniqueId();
	}

	@Override
	public void setUniqueId(long uniqueId) {
		// TODO Auto-generated method stub
		super.setUniqueId(uniqueId);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return super.getTitle();
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		super.setTitle(title);
	}

	@Override
	public int getNoOfCopies() {
		// TODO Auto-generated method stub
		return super.getNoOfCopies();
	}

	@Override
	public void setNoOfCopies(int noOfCopies) {
		// TODO Auto-generated method stub
		super.setNoOfCopies(noOfCopies);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}


abstract class MediaItem extends Item {
	private int runtime;

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	@Override
	public long getUniqueId() {
		// TODO Auto-generated method stub
		return super.getUniqueId();
	}

	@Override
	public void setUniqueId(long uniqueId) {
		// TODO Auto-generated method stub
		super.setUniqueId(uniqueId);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return super.getTitle();
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		super.setTitle(title);
	}

	@Override
	public int getNoOfCopies() {
		// TODO Auto-generated method stub
		return super.getNoOfCopies();
	}

	@Override
	public void setNoOfCopies(int noOfCopies) {
		// TODO Auto-generated method stub
		super.setNoOfCopies(noOfCopies);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}

class Video extends MediaItem {
	private String director;
	private String genre;
	int releaseYear;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	@Override
	public int getRuntime() {
		// TODO Auto-generated method stub
		return super.getRuntime();
	}
	@Override
	public void setRuntime(int runtime) {
		// TODO Auto-generated method stub
		super.setRuntime(runtime);
	}
	@Override
	public long getUniqueId() {
		// TODO Auto-generated method stub
		return super.getUniqueId();
	}
	@Override
	public void setUniqueId(long uniqueId) {
		// TODO Auto-generated method stub
		super.setUniqueId(uniqueId);
	}
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return super.getTitle();
	}
	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		super.setTitle(title);
	}
	@Override
	public int getNoOfCopies() {
		// TODO Auto-generated method stub
		return super.getNoOfCopies();
	}
	@Override
	public void setNoOfCopies(int noOfCopies) {
		// TODO Auto-generated method stub
		super.setNoOfCopies(noOfCopies);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}

class CD extends MediaItem {
	private String artist;
	private String genre;
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public int getRuntime() {
		// TODO Auto-generated method stub
		return super.getRuntime();
	}
	@Override
	public void setRuntime(int runtime) {
		// TODO Auto-generated method stub
		super.setRuntime(runtime);
	}
	@Override
	public long getUniqueId() {
		// TODO Auto-generated method stub
		return super.getUniqueId();
	}
	@Override
	public void setUniqueId(long uniqueId) {
		// TODO Auto-generated method stub
		super.setUniqueId(uniqueId);
	}
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return super.getTitle();
	}
	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		super.setTitle(title);
	}
	@Override
	public int getNoOfCopies() {
		// TODO Auto-generated method stub
		return super.getNoOfCopies();
	}
	@Override
	public void setNoOfCopies(int noOfCopies) {
		// TODO Auto-generated method stub
		super.setNoOfCopies(noOfCopies);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}

public class Exercise03 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
	}
}
