package com.assignment;
import java.util.HashMap;
public class HashMapExample  {
    public static void main(String args[])    {
    HashMap<String, Integer>map = new HashMap < >();   
    map.put ("Apple", 100);  
    map.put ("Banana", 130);
    map.put("Mango", 260);
    map.put ("Orange", 200);
System.out.println("Size of map is:" + map.size());
System.out.println(map);
if (map.containsKey("Apple"))  {
    Integer a = map.get("Apple");
    System.out.println("value for key" + "\"Apple\" is:" + a);
   }
 }
}   
