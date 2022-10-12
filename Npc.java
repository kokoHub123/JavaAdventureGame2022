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
 private String name;
 private String speech;
 private String description
  
  // instance variable go here
  // private instance vars for name, speech, description

  public Npc()
  {
    name = "James Charles Bartholemule II";
    speech = "Why hello there, traveler... I've been searching for a main character such as yourself."
    description = "James Charles Bartholemule II, his first real name was James Charles, but after commiting several questionable acts, was thrown into a steel chamber and sent floating on a raft down the river of infinity to be banished for eternity..." 
  }

  public Npc(String newName, String newDescription)
  {
    name = newName;
    descriptio = newDescription;
  }

  public String getName()
  {
    return name
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
