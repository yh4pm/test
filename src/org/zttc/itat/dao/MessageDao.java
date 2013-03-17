package org.zttc.itat.dao;

import org.zttc.itat.model.Message;

public class MessageDao {
	
	public Message load(){
		Message msg = new Message();
		msg.setId(12);
		msg.setTitle("²âÊÔ");
		msg.setContent("²âÊÔÄÚÈİ");
		
		return msg;
	}
}
