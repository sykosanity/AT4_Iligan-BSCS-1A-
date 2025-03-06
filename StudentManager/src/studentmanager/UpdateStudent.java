package studentmanager;

import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

/**
 *
 * @author USER
 */
public class UpdateStudent {

    public static void main(String args[]) {
        UpdateStudent("12", "UpdatedUser", "NewPass123");
    }
        
    public static void UpdateStudent(String currentId, String newUsername, String newPassword) {
        System.out.println("Updating student with ID: " + currentId);

        try {
            Login loginInstance = new Login();
            loginInstance.JSONCheck();

            boolean userExists = false;
            JSONArray updatedList = new JSONArray(); // Store modified list

            for (Object obj : loginInstance.accountsList) {
                JSONObject accounts = (JSONObject) obj;

                if (accounts.get("id").equals(currentId)) {
                    System.out.println("Student Found! Updating details...");
                    
                    // Update the student's details
                    accounts.put("username", newUsername);
                    accounts.put("password", newPassword);
                    
                    userExists = true;
                }
                updatedList.add(accounts); // Add to the updated list
            }

            if (!userExists) {
                loginInstance.TriggerDialogBox("Student not found!");
            } else {
                loginInstance.accountsList = updatedList; // Replace old list
                loginInstance.saveToJSON(); // Save changes
                System.out.println("Student Updated Successfully!");
                loginInstance.TriggerDialogBox("Student Updated Successfully!");
            }

        } catch (IOException | ParseException ex) {
            ex.printStackTrace();
        }
    }
}
