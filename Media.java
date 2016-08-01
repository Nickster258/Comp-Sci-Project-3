/* Media.java
 * This class simple houses the item ID, title, status, and counter.
 * The counter is to keep track of how many times an item has been checked in and out
 */

public class Media extends Library {

  int ID;                      // ID used to identify the Media item
  String title;                // Title of the Media item
  String status = "available"; // Status of the Media item
  int count;                   // Counter to count the times the item has been checked out

  public Media (int ID, String title) {
    this.ID = ID;
    this.title = title;
  }
}
