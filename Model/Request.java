package Model;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Request {
    String id ;
    Member requester ; 
    Member target ; 
    String newrole ; 
    String status ; 
    Map<Member, String> votes;
    public Request  (String id , Member requester2 , Member target2 , String newrole)  { 
        this.id = id ;
        this.requester = requester2 ; 
        this.target = target2 ; 
        this.newrole = newrole ; 
        this.status = "PENDING" ; 
        this.votes = new HashMap<>();
    }
    public String getId() {  
        return this.id ; 
    }
    public String getStatus ()  { 
        return this.status ; 
    }
    public void addvote (Member voter , String isApprove) { 
        this.votes.put(voter, isApprove);
    }
    public Member getTarget() { 
        return this.target; 
    }
    public void setStatus (String status) { 
        this.status = status ; 
    }
    public Member getRequester() { 
        return this.requester ; 
    }
    public String getNewrole() { 
       return this.newrole ; 
    }
}