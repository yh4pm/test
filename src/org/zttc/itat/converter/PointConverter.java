package org.zttc.itat.converter;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;
import org.zttc.itat.model.Point;

public class PointConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		Point p = null ;
		if(arg1.length<=1){
			String str = arg1[0];
			p = new Point();
			String[] cods = str.split(",");
			p.setX(Integer.parseInt(cods[0]));
			p.setY(Integer.parseInt(cods[1]));
		}
		return p;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		
		return ((Point)arg1).getX()+","+((Point)arg1).getY();
	}

}
