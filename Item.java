/*
Item (11 tasks)
 dibs AJ - private instance vars for name, strength, description, int magicType, Random rng
 dibs AJ + NoArgsConstructor
 dibs AJ + Item(String _name, String _description)
 dibs AJ + int getMagicType()
 dibs EW + String getName()
 dibs EW + int getStrength()
 dibs EW + void setDescription(String d)
 dibs EW + void setName(String _name)
 dibs WB + isBroken()
 dibs WB + toString() // returns the description
 dibs WB + void weaken()
 */
import java.util.Random;

public class Item
{
  // instance variables go here
  // private instance vars for name, strength, description, int magicType, Random rng

  public Item()
  {

  }

  public Item(String _name, String _description)
  {

  }
  public String toString(){
    return "x";
  }


  public int getMagicType()
  {
    return 0;
  }

  public String getName()
  {
    return "x";
  }

  public void setName(String _name)
  {

  }

  public int getStrength()
  {
    return 0;
  }

  public void setDescription(String _string)
  {

  }

  // sets strength to be strength divided by two
  public void weaken()
  {

  }

  // returns true if the strength is zero or less, otherwise returns true
  public boolean isBroken()
  {
    return true;
  }

}

