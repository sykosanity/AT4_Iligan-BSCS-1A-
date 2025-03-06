package studentmanager;

import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

/**
 *
 * @author USER
 */
public class DeleteStudent {
    
    public static void main(String args[]) {
        DeleteStudent("12");
    }
        
    public static void DeleteStudent(String Id) {
        System.out.println("Id: " + Id);

        try {
            Login loginInstance = new Login();
            loginInstance.JSONCheck();

            boolean userExists = false;
            Iterator<Object> iterator = loginInstance.accountsList.iterator();
            
            while (iterator.hasNext()) {
                JSONObject accounts = (JSONObject) iterator.next();
                
                System.out.println(accounts);
                
                if (accounts.get("id").equals(Id)) {
                    iterator.remove(); // Safe removal using iterator
                    loginInstance.saveToJSON();
                    
                    System.out.println("Student Deleted Successfully!");
                    loginInstance.TriggerDialogBox("Student Deleted Successfully!");
                    
                    userExists = true;
                    break;
                }
            }

            if (!userExists) {
                loginInstance.TriggerDialogBox("This user does not exist!");
            }

        } catch (IOException | ParseException ex) {
            ex.printStackTrace();
        }
    }
}
