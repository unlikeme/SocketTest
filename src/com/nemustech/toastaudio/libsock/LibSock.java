package com.nemustech.toastaudio.libsock;

public class LibSock {

	public static final int NONE   = 0x00;
	public static final int SERVER = 0x10;
	public static final int CLIENT = 0x11;
	
	private int mType;
	
	public LibSock(int type) throws LibSockException{
		init(type);
	}
	
	public void init(int type) throws LibSockException{
		if( !isValidType(type) ){
			throw new LibSockException("LibSock : invalid type", LibSockException.ERR_INVALID_TYPE);
		}
		mType = type;
	}

	
	private boolean checkInit(){
		return isValidType(mType);
	}
	
	private boolean isValidType(int type){
		if(mType == SERVER || mType == CLIENT){
			return true;
		}else{
			return false;
		}
	}
	
	
}




