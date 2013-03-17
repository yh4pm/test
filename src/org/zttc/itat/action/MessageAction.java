package org.zttc.itat.action;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.zttc.itat.dao.MessageDao;
import org.zttc.itat.model.Message;
import org.zttc.itat.model.Point;

import com.opensymphony.xwork2.ModelDriven;

public class MessageAction implements ModelDriven<Message>{
	
	private Message msg;
	private Point point;
	
	
	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public Message getMsg() {
		return msg;
	}

	public void setMsg(Message msg) {
		this.msg = msg;
	}

	public String addInput(){
		return "success";
	}
	
	public String add(){
		return "success";
	}
	
	public String updateInput(){
		MessageDao md = new MessageDao();
		Message tmsg = md.load();
//		msg.setId(tmsg.getId());
//		msg.setTitle(tmsg.getTitle());
//		msg.setContent(tmsg.getContent());
		try {
			BeanUtils.copyProperties(msg, tmsg);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	@Override
	public Message getModel() {
		if (msg == null){
			msg = new Message();
		}
		return msg;
	}
}
