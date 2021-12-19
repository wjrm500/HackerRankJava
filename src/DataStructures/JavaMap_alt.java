package DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class JavaMap_alt {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> phonebook = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String name = br.readLine();
                Integer phoneNum = Integer.valueOf(br.readLine());
                phonebook.put(name, phoneNum);
            }
            String nameQueried;
            while ((nameQueried = br.readLine()) != null) {
                Integer phoneNum = phonebook.get(nameQueried);
                if (phoneNum == null) {
                    System.out.println("Not found");
                    continue;
                }
                System.out.printf("%s=%s\n", nameQueried, phoneNum);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

// N.B. This solution is correct but times out on larger cases. Apparently using BufferedReader instead of Scanner prevents timeouts