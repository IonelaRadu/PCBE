import java.util.concurrent.atomic.AtomicInteger;

public class MessageQueues extends Message{
	
	final String msg,type;
    final AtomicInteger id, time;
    // A message to a client.
    
	public MessageQueues(String msg,int id, int time) {
		 this.msg = msg;
		 this.id = new AtomicInteger(id);
		 this.time =new AtomicInteger(time);
		 this.type = "Queues";
	    }
	    
	 public String getMessage() {
    	return msg;
    }
    
	    
	    public AtomicInteger getID() {
	    	return id;
	    }
	    
	    public AtomicInteger getTime()
		  {
			  return this.time;
		  }
	    
	    public String getType()
		  {
			  return this.type;
		  }
	    
	    public String toString() {
	      return id + ": " + msg;
	    }
	    
	    
	

}
