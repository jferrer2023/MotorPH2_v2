
package motorph2_v2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CsvReader {
    private Map<String, String> users;

    public CsvReader(String filePath) {
        users = new HashMap<>();
        loadUsers(filePath);
    }

    private void loadUsers(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 2) {
                    users.put(values[0], values[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean validateLogin(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}

