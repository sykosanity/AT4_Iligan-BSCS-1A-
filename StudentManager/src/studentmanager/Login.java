/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentmanager;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author USER
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public static String userName,passWord,userId;
    
    public static String filepath ="C:\\Users\\USER\\Documents\\NetBeansProjects\\StudentManager\\src\\studentmanager\\Students.json" ;
    public static JSONParser jsonParser = new JSONParser();
    public static JSONObject record = new JSONObject();
    public static JSONArray accountsList = new JSONArray();
    
    
    
    public Login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JLayeredPane();
        LoginPanel = new javax.swing.JPanel();
        HeaderLabel = new javax.swing.JLabel();
        EnterIdLabel = new javax.swing.JLabel();
        EnterUsernameLabel = new javax.swing.JLabel();
        EnterPasswordLabel = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        UserName = new javax.swing.JTextField();
        Id = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        BGImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginPanel.setToolTipText("");
        LoginPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LoginPanel.setOpaque(false);

        HeaderLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        HeaderLabel.setText("Student Manager");

        EnterIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EnterIdLabel.setText("Enter ID:");

        EnterUsernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EnterUsernameLabel.setText("Enter Username:");

        EnterPasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EnterPasswordLabel.setText("Enter Password:");

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });

        Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdActionPerformed(evt);
            }
        });

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(HeaderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(EnterPasswordLabel)
                                .addGap(16, 16, 16)
                                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(LoginPanelLayout.createSequentialGroup()
                                        .addComponent(EnterIdLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(LoginPanelLayout.createSequentialGroup()
                                        .addComponent(EnterUsernameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(Login)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addComponent(HeaderLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterIdLabel))
                .addGap(18, 18, 18)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterUsernameLabel)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterPasswordLabel))
                .addGap(30, 30, 30)
                .addComponent(Login)
                .addContainerGap())
        );

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanager/img/logo.png"))); // NOI18N

        MainPanel.setLayer(LoginPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MainPanel.setLayer(Logo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(Logo))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(385, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 430));

        BGImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanager/img/background.jpg"))); // NOI18N
        getContentPane().add(BGImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
   
    }//GEN-LAST:event_UserNameActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
    try {
            userName = UserName.getText();
            passWord = Password.getText();   
            userId = Id.getText();
            
            JSONCheck();
            
            
            int checker=0;
            
            for(int a=0;a<accountsList.size();a++)
            {
                JSONObject userobject = (JSONObject) accountsList.get(a);
                String searchedUserName = (String) userobject.get("username");
                String searchedPassword = (String) userobject.get("password");
                                
                System.out.println(searchedUserName);
                System.out.println(searchedPassword);
                           
                System.out.println(Password.getText());

                if(UserName.getText().equals(searchedUserName)&& Password.getText().equals(searchedPassword))
                {
                    checker++;
                    
                    break;
                }
            }
            
            if(checker==0){
                
                System.out.println("Username or Password  does not exist");
                JOptionPane.showMessageDialog(null, "Login Failed!");

            }
            else{
                
                JOptionPane.showMessageDialog(null, "Login Successful!");
                
                System.out.println("PASSED");
                new Welcome().setVisible(true);
                setVisible(false);

            }
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdActionPerformed
  
    
    public static void TriggerDialogBox(String text) {
        JOptionPane.showMessageDialog(null, text);
    }
    public static String GetUserName() {
        return userName;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    public static void JSONCheck() throws FileNotFoundException, IOException, ParseException{
        FileReader reader = new FileReader(filepath);
        
        if(reader.ready())
        {
            
            Scanner sc = new Scanner(reader);
            String line="";
            
            while (sc.hasNext())
            {
                line = line + sc.nextLine();
            }
            
            if(!line.equals(""))
            {
            
                reader.close();
                FileReader reader2 = new FileReader(filepath);
                record = (JSONObject) jsonParser.parse(reader2);
                accountsList = (JSONArray) record.get("users");
                reader2.close();
            }
            
        }
    }
    
    public static void saveToJSON() {
        try (FileWriter writer = new FileWriter(new Login().filepath)) {
            JSONObject data = new JSONObject();
            data.put("users", accountsList);
            writer.write(data.toJSONString());
            System.out.println("new User data saved successfully.");
        } catch (Exception e) {
            System.out.println("Error saving data to file: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGImage;
    private javax.swing.JLabel EnterIdLabel;
    private javax.swing.JLabel EnterPasswordLabel;
    private javax.swing.JLabel EnterUsernameLabel;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JTextField Id;
    private javax.swing.JButton Login;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JLabel Logo;
    private javax.swing.JLayeredPane MainPanel;
    private javax.swing.JTextField Password;
    private javax.swing.JTextField UserName;
    // End of variables declaration//GEN-END:variables
}
