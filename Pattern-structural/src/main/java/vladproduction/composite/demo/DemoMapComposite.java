package vladproduction.composite.demo;

import java.util.HashMap;
import java.util.Map;

public class DemoMapComposite {
    public static void main(String[] args) {
        Map<String, String> personalAttribute = new HashMap<>();
        personalAttribute.put("site", "personal");
        personalAttribute.put("access", "limited");

        Map<String, String> groupAttribute = new HashMap<>();
        groupAttribute.put("group_role","claims");

        Map<String, String> securityAttribute = new HashMap<>();
        securityAttribute.putAll(personalAttribute);
        securityAttribute.putAll(groupAttribute);

        System.out.println(securityAttribute);

        //{site=personal, group_role=claims, access=limited}
    }
}
