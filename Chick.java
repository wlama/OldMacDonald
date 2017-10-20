class Chick implements Animal {     
     private String myType;     
     private String mySound;
     private String mySound2;        
     public Chick(String type, String sound, String sound2)     {         
         myType = type;         
         if(Math.random() < .5) {
            mySound = "cheep";
         } else {
            mySound = "cluck";
         }     
     }     
     public Chick()     {         
         myType = "chick";         
         mySound = "cluck";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}
