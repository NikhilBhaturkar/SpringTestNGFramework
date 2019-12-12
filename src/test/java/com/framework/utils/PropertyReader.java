package com.framework.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertyReader {
	Properties prop=null;
	
	public PropertyReader() {
		try(InputStream in = new FileInputStream(Paths.get(".")+"/config.properties")){
			prop = new Properties();
			prop.load(in);
			setProps(prop);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Properties getProps() {
		return prop;
	}

	private void setProps(Properties prop) {
		this.prop=prop;
	}
}
