/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanager;

import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

/**
 *
 * @author USER
 */
public class AddStudent {
    
    public static void main(String args[]) {

    }
    
    public static void AddStudent(String NewId, String NewUsername, String NewPassword) {
        System.out.println("Id: " + NewId);
        System.out.println("User: " + NewUsername);
        System.out.println("Pass: " + NewPassword);

        try {
            Login loginInstance = new Login();
            loginInstance.JSONCheck();

            boolean userExists = false;
            for (Object obj : loginInstance.accountsList) {
                JSONObject accounts = (JSONObject) obj;
                if (accounts.get("id").equals(NewId) || accounts.get("username").equals(NewUsername)) {
                    loginInstance.TriggerDialogBox("User Already Exists!");
                    userExists = true;
                    break;
                }
            }

            if (!userExists) {
                JSONObject newStudent = new JSONObject();
                newStudent.put("id", NewId);
                newStudent.put("username", NewUsername);
                newStudent.put("password", NewPassword);

                loginInstance.accountsList.add(newStudent);
                loginInstance.saveToJSON();
                System.out.println("Student Added Successfully!");
                loginInstance.TriggerDialogBox("Student Added Successfully!");

            }

        } catch (IOException | ParseException ex) {
            ex.printStackTrace();
        }
    }
    
}
