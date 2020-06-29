package Model;

import Interface.IStreamable;

public class StreamProgressInfo {
	 private IStreamable file;
	 
	   public StreamProgressInfo(IStreamable file){
	        
		   this.file = file;
	    }

	    public double CalculateCurrentPercent(){
	        
	    	return (double)file.getByteSent()*100 /(double)file.getLength() ;
	    }
}
