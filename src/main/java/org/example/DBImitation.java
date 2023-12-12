package org.example;

import java.util.HashMap;

public class DBImitation {
  public static HashMap<String,String> db = new HashMap<>();


  public DBImitation(){
    db.put("1111",Courses.C_SHARP.name());
    db.put("1112",Courses.SWIFT.name());
    db.put("1121",Courses.SWIFT.name());
    db.put("1122",Courses.KOTLIN.name());
    db.put("1131",Courses.JAVA.name());
    db.put("1132",Courses.JS.name());
    db.put("1141",Courses.C_SHARP.name());
    db.put("1142",Courses.C_PLUSPLUS.name());
    db.put("121",Courses.PYTHON.name());
    db.put("1221",Courses.JS.name());
    db.put("1222",Courses.POSTMAN.name());
    db.put("21",Courses.AGILE.name());
    db.put("22",Courses.SQL.name());
    db.put("231",Courses.SEO.name());
    db.put("232",Courses.ADVERTISING.name());
  }

}
