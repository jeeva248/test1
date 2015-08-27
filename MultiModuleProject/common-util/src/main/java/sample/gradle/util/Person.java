package sample.gradle.util;


public class Person {
    private final String name;

    private  String address;
    
    
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
      return address;
    }

    public void setAddress(String address) {
      this.address = address;
    }
    
}
