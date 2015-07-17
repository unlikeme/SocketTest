package com.nemustech.toastaudio.libsock;

public class MsgParser {

	
	/*
	 * send, recv command string type
	 * type='command type'&param1='xxx'&param2='xxx' ...
	 * 
	 * client -> server
	 * 
	 * REQ_PREPARE : param ( URL="xxx" ) 
	 * REQ_PLAY    : no param 
	 * REQ_PAUSE   : no param
	 * REQ_SEEK    : param ( SEEKPOS="xxx" )
	 *
	 * REQ_LOGIN   : param ( ID="xxx"&PASS="xxx" )
	 * REQ_CASTING : no param
	 * 
	 * 
	 * 
	 * server -> client 
	 * 
	 * 
	 *  
	 */
	
	public void getCommand(String msg){
		String arr[] = msg.split("[&]");
		String type = arr[0].substring(arr[0].indexOf("=")+1);
		//if()
	}
	private void msgParser(String msg){
		
	}
	
}
