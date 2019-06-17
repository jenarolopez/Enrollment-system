/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnrollmentSystem;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Variables {
    public static int studCtr=0;
    public static String subjectArray[][][];
    public static Double studBalance[]  = new Double[10000];
    public static String remarks[][];
    public static boolean ss=true;
    public static int number=1700010;
    
    public static ArrayList Subjects = new ArrayList();
      public static ArrayList StudFullName = new ArrayList();
      public static ArrayList StudNumber = new ArrayList();
      public static ArrayList Scholar = new ArrayList();
      public static ArrayList Semester = new ArrayList();
      public static ArrayList Contact = new ArrayList();
      public static ArrayList Birthday = new ArrayList();
      public static ArrayList Address = new ArrayList();
      public static ArrayList Gender = new ArrayList();
      public static ArrayList GuardFullName = new ArrayList();
      public static ArrayList GuardContact = new ArrayList();
      public static ArrayList Occupation = new ArrayList();
      public static ArrayList IrregReg = new ArrayList();
      public static ArrayList YearLev = new ArrayList();
      public static ArrayList Age = new ArrayList();
      public static ArrayList StudFirstName = new ArrayList();
      public static ArrayList StudLastName = new ArrayList();
      public static ArrayList StudMiddle = new ArrayList();
      public static ArrayList Section = new ArrayList();
      public static ArrayList <String>icon = new ArrayList();
      public static ArrayList rems = new ArrayList();
      
      public static int groupNumSec = 1;
      public static char letterSec = 'A';
      public static int groupCtr = 0;
      public static int groupNumSec2 = 1;
      public static char letterSec2 = 'A';
      public static int groupCtr2 = 0;
      public static String secSave = "";
      public static int counter = 0;
    
    public static ArrayList password = new ArrayList();
 public static ArrayList ID = new ArrayList();
 public static ArrayList name = new ArrayList();
 public static ArrayList Fname = new ArrayList();
 public static ArrayList Lname = new ArrayList();
 public static ArrayList Mname = new ArrayList();
 
 public static String crepass = "";
 public static String creid = "";
 public static String crefull = "";
 public static String crefirst = "";
 public static String crelast = "";
 public static String cremid = "";
 public static String facpass="";
 
 public static int logmark=0;
 public static int facMarker =0;
 public static int terCtr=0;
 public static int howmany=0;
 public static int datamark=0;
    
    public static void main(String[] args) {
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
        java.awt.EventQueue.invokeLater(new Runnable() {
         
            public void run() {
                try
                {
                    Thread.sleep(2700);
                }
                catch(Exception e)
                {
                }
               new Login().setVisible(true);
                
            }
        });      
        
    }
    
    
    
    
    
    
    
    
    
}
