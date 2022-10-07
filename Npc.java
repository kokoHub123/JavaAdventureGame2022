/*
Npc (9 tasks)
 dib KB - private instance vars for name, speech, description
 dib KB + NoArgsConstructor
 dib KB + Npc(String _name, String _description)
 dib KB + String getName
 dib TC + String getSpeech
 dib TC + void setDescription(String d)
 dib TC + void setName(String _name)
 dib TC + void setSpeech
 dibs WB + toString() // returns the description
 */
public class Npc
{
  // instance variable go here
  // private instance vars for name, speech, description

  public Npc()
  {

  }

  public Npc(String newName, String newDescription)
  {

  }

  public String getName()
  {
    return "x";
  }

  public String getSpeech()
  {
    return speech;
  }

  public void setDescription(String _description)
  {
   description = _description;

  }

  public void setName(String _name)
  {
   name = _name;

  }

  public void setSpeech(String _speech)
  {
   speech = _speech

  }

  public String toString()
  {
    return "x";
  }


}
