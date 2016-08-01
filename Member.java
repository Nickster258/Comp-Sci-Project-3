/* Member.java
 * This class has two values and an Array
 * Said values store the member ID and their name
 * The Array stores the member's current list of checked out items
 */

import java.util.ArrayList;

public class Member extends Library {
  
  int ID;                                             // Member's ID
  String name;                                        // Name of the Member
  ArrayList<String> items = new ArrayList<String> (); // Array of the Member's items
  
  public Member (int ID, String name) {
    this.ID = ID;
    this.name = name;
  }

  public String toString() {
    return "Member(" + name + ", ID = " + ID + ", " + items.toString() + ")";
  }
}
