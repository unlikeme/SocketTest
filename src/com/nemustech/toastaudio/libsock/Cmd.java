package com.nemustech.toastaudio.libsock;

public class Cmd {

	
	/*
	 * REQ_PREPARE : param ( URL="xxx" ) 
	 * REQ_PLAY    : no param 
	 * REQ_PAUSE   : no param
	 * REQ_SEEK    : param ( SEEKPOS="xxx" )
	 *
	 * REQ_LOGIN   : param ( ID="xxx"&PASS="xxx" )
	 * REQ_CASTING : no param
	*/
	
	public static final String PREFIX = "toastaudio.cmd";
	
	public static final String REQ_PREPARE = PREFIX + ".REQ_PREPARE"; 
}
