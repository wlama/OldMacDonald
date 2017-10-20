class NamedCow implements Animal {     
     private String myType;     
     private String mySound;  
     private String myName;    
     public NamedCow(String type, String name, String sound)    {         
         myType = type;         
         mySound = sound;  
         myName = name;
     }     
     public NamedCow()     {         
         myType = "cow";         
         mySound = "moo";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
     public String getName(){return myName;}
}
