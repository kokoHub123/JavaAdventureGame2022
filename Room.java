/*
Room (14 tasks)
 dibs SW - private instance vars for name, description, character, roomItem, Room north, Room south, Room east, Room west
 dibs SW + NoArgsConstructor
 dibs SW + Room(String _name)
 dibs SW + Npc getCharacter()
 dibs AB + Item getItem()
 dibs AB + Room getLocationTo(String direction)
 dibs AB + String getName()
 dibs AB + String getPossibleDirections()
 + void linkRoom(Room r, String direction)
 + void setCharacter(Npc character)
 + void setDescription(String d)
 + void setItem(Item i)
 + void setName(String _name)
 + toString() // returns the description
*/
public class Room{
 private String name;
 private String description;
 private Npc character;
 private Item roomItem;
 private Room north;
 private Room south;
 private Room east;
 private Room west;
 public Room(){
  name = "";
  description = "";
  character = null;
  roomItem = null;
  north = null;
  south = null;
  east = null;
  west = null;
  
 }
 public Room(String _name){
  name = _name;
  description = "";
  character = null;
  roomItem = null;
  north = null;
  south = null;
  east = null;
  west = null;
 }
 public Npc getCharacter(){
  return character;
 }
}
