package com.huawei.devcloud;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
  private static Properties config = null;

  static {
    InputStream is = ReadProperties.class.getClassLoader().getResourceAsStream("config.properties");
    config = new Properties();
    try {
      config.load(is);
      is.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static String readValue(String key) {
    try {
      String value = config.getProperty(key);
      return value;
    } catch (Exception e) {
      return null;
    }
  }
}
