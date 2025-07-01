package JAVA;

import java.util.HashMap;

// Hashmap is a data structure that stores key-value pairs
// Keys are unique but values can be duplicated
// Does not maintain any order but is memory efficient
// Hashmap<Key, Value>

class HashMaps {
    public void hash() {
        // Inventory and price in an E-Commerce
        HashMap<String, Double> map = new HashMap<>();
        map.put("Iphone 16", 89999.0);
        map.put("T-shirt", 1299.99);
        map.put("Travel Bag", 5999.0);
        map.put("Toy for Kids", 649.0);
        System.out.println(map);
    }

}
