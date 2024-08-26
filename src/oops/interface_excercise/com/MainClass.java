package oops.interface_excercise.com;

import java.util.HashMap;
import java.util.Map;

interface StaticBlockesAllowedAfterJava8 {
    static final Map<String, String> map = new HashMap<>();

    //facing error in static block
//    static {
//        map.put("URL", "https://example.com");
//        map.put("PORT", "8080");
//        map.put("ENV", "production");
//        System.out.println("Config settings initialized.");
//    }

    static String getSetting(String key) {
        return map.get(key);
    }
}
