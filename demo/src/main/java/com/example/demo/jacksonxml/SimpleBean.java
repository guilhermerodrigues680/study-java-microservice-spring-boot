package com.example.demo.jacksonxml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class SimpleBean {
	private int x = 1;
	private int y = 2;
	
	public String whenJavaSerializedToXmlStr_thenCorrect() throws JsonProcessingException {
		XmlMapper xmlMapper = new XmlMapper();
	    String xml = xmlMapper.writeValueAsString(new SimpleBean());
	    
	    return xml;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
}
