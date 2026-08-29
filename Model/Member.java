package Model;

public class Member {
    String id ;
    String name ; 
    String role ; 
    boolean active ;    

    public Member (String id , String name , String role , boolean active)  { 
        this.id = id ; 
        this.name = name ;
        this.role = role ; 
        this.active = active ; 
    }

    public String getId () {  
        return this.id ; 
    }
    public String getName() { 
        return this.name ; 
    }
     public String role() { 
        return this.role ; 
    }
    public boolean active() { 
        return this.active; 
    }
    public String getRole() {  
        return this.role ;
    }

}