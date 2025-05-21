package Prototype;

import java.util.HashMap;

public class StudentRegistry {

  static  private HashMap<String, Student> studentRegistry = new HashMap<String, Student>();

  public static void registerStudent(String key, Student student) {
      studentRegistry.put(key, student);
  }

  public static Student getStudent(String key) {
      return studentRegistry.get(key);
  }
}
