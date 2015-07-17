package com.nemustech.toastaudio.libsock;



public class LibSockException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5471110424267051533L;
	
	public static final int ERR_UNKNOWN      = -1;
	public static final int ERR_INVALID_TYPE = 1;

	
	private int mErrCode;
    
    public LibSockException(String msg, int errCode) {
        super(msg);
        this.mErrCode = errCode;
    }
     
    public LibSockException(String msg){
        this(msg, ERR_UNKNOWN);
    }
     
    public int getErrCode(){
        return mErrCode;
    }
	
/*    
    @Override
    public String toString() {
    	String errMsg = "";
    	switch(mErrCode){
    	case ERR_UNKNOWN :
    		errMsg = "unknown error.";
    		break;
    	case ERR_INVALID_TYPE :
    		errMsg = "Invalid type.(support only Server or Client)";
    		break;
    	}
    	return get errMsg + "errCode : "+mErrCode;
    }
*/    
}
