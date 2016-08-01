/* Movie.java extends Media.java
 * This class uniquely has to it the director and length (Minutes) variable
 * This also houses a simple toString method so as to make the forEach loop work
 */ 

public class Movie extends Media {

  String director;  // Unique to Movie.java
  int length;       // Unique to Movie.java
  
  public Movie (int ID, String title, String director, int length) {
    super (ID, title);        // Uses Media.java to set the ID and title
    this.director = director; // sets this.director
    this.length = length;     // sets this.director
  }
  
  public String toString () {
    return "Movie(" + title + ", " + director + ", " + length + " minutes, " + status + ")";
  }
}
