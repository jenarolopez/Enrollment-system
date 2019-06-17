/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnrollmentSystem;


import static EnrollmentSystem.Main.viewStudRecords;
import static EnrollmentSystem.Variables.Address;
import static EnrollmentSystem.Variables.Age;
import static EnrollmentSystem.Variables.Birthday;
import static EnrollmentSystem.Variables.Contact;
import static EnrollmentSystem.Variables.Gender;
import static EnrollmentSystem.Variables.GuardContact;
import static EnrollmentSystem.Variables.GuardFullName;
import static EnrollmentSystem.Variables.IrregReg;
import static EnrollmentSystem.Variables.Occupation;
import static EnrollmentSystem.Variables.Scholar;
import static EnrollmentSystem.Variables.Section;
import static EnrollmentSystem.Variables.Semester;
import static EnrollmentSystem.Variables.StudFirstName;
import static EnrollmentSystem.Variables.StudFullName;
import static EnrollmentSystem.Variables.StudLastName;
import static EnrollmentSystem.Variables.StudMiddle;
import static EnrollmentSystem.Variables.StudNumber;
import static EnrollmentSystem.Variables.YearLev;
import static EnrollmentSystem.Variables.groupCtr;
import static EnrollmentSystem.Variables.groupCtr2;
import static EnrollmentSystem.Variables.groupNumSec;
import static EnrollmentSystem.Variables.groupNumSec2;
import static EnrollmentSystem.Variables.icon;
import static EnrollmentSystem.Variables.letterSec;
import static EnrollmentSystem.Variables.letterSec2;
import static EnrollmentSystem.Variables.number;
import static EnrollmentSystem.Variables.rems;
import static EnrollmentSystem.Variables.secSave;
import static EnrollmentSystem.Variables.studCtr;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.JTextField;

/**
 *
 * @author Carlo Ponti
 */
public class Form extends javax.swing.JFrame {

    /**
     * Creates new form Form
     */
    
      
      
      JTextField MotLastField = new JTextField();
      JTextField MotFirstField = new JTextField();
      JTextField MotMidField = new JTextField();
      JTextField GuardCont = new JTextField();
      JTextField MotOccu = new JTextField();
      
       
       
       String firstdb="", fulldb="",lastdb="", middb="", agedb="",schodb="",semdb="",iredb="", gendb="",birthdb="",contdb="", yeardb="",adddb="",gnamedb="",gcontdb="",goccudb="";
       
       //DATABASE
//        public void getData(){
//        try{
//            String query = "select * from studdb.studinfo";
//            rs = st.executeQuery(query);
//            StudFullName.clear();
//            StudNumber.clear();
//            Scholar.clear();
//            Semester.clear();
//            Contact.clear();
//            Birthday.clear();
//            Address.clear();
//            Gender.clear();
//            IrregReg.clear();
//            YearLev.clear();
//            Age.clear();
//            StudFirstName.clear();
//            StudLastName.clear();
//            StudMiddle.clear();
//            Section.clear();
//            GuardFullName.clear();
//            GuardContact.clear();
//            Occupation.clear();
//            icon.clear();
//            rems.clear();
//            while(rs.next())
//            {
//                StudFullName.add(rs.getString("Full Name"));
//                StudNumber.add(rs.getString("Student No."));
//                Scholar.add(rs.getString("Scholar"));
//                Semester.add(rs.getString("Semester"));
//                Contact.add(rs.getString("Contact No."));
//                Birthday.add(rs.getString("Birthday"));
//                Address.add(rs.getString("Address"));
//                Gender.add(rs.getString("Gender"));
//                IrregReg.add(rs.getString("Status"));
//                YearLev.add(rs.getString("Year Level"));
//                Age.add(rs.getString("Age"));
//                StudFirstName.add(rs.getString("First Name"));
//                StudLastName.add(rs.getString("Last Name"));
//                StudMiddle.add(rs.getString("Middle Name"));
//                Section.add(rs.getString("Section"));
//                GuardFullName.add(rs.getString("Guard Full Name"));
//                GuardContact.add(rs.getString("Guard Contact"));
//                Occupation.add(rs.getString("Guard Occupation"));
//                icon.add(rs.getString("Picture"));
//                rems.add(rs.getString("Remarks"));
//            }
//            
//            
//        }catch(Exception e)
//        {
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }
       //DATABASE
       
       
       
       
    public Form() {
        initComponents();
        setTitle("Form");
        setResizable(false);
        setLocationRelativeTo(null);

        //getData();
         try{
           Image image = new ImageIcon("bsulogo.png").getImage();
           this.setIconImage(image);
          }catch(Exception e){
              System.out.println("Appilcation icon not found");
          }
         //((DefaultEditor) MonthSpin.getEditor()).getTextField().setText(secSave);
         //((DefaultEditor) DaySpin.getEditor()).getTextField().setEditable(false);
         //((DefaultEditor) YearSpin.getEditor()).getTextField().setEditable(false);
        
      studNumTxtField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
      studNumTxtField.setOpaque(false);
      studNumTxtField.setEditable(false);
      
      secTxtField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
      secTxtField.setOpaque(false);
      secTxtField.setEditable(false);
     
      MotLastField.setText(".");
      MotFirstField.setText(".");
      MotMidField.setText(".");
      GuardCont.setText(".");
      MotOccu.setText(".");
      
      studNumTxtField.setText(number+"");
    }
      
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        G = new javax.swing.ButtonGroup();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        studPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        StudLastField = new javax.swing.JTextField();
        StudFirstField = new javax.swing.JTextField();
        StudMidField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IrregRegCBox = new javax.swing.JComboBox<>();
        YearLevelCBox = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ScholarCBox = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        SemCBox = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        sectionLabel = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        secTxtField = new javax.swing.JTextField();
        studNumTxtField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        StudCont = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        MaleRadio = new javax.swing.JRadioButton();
        FemaleRadio = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        AgeField = new javax.swing.JTextField();
        RegField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        MonthSpin = new javax.swing.JSpinner();
        DaySpin = new javax.swing.JSpinner();
        YearSpin = new javax.swing.JSpinner();
        ProcessBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        backLogoLabel = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(930, 750));
        jPanel5.setLayout(null);

        studPanel.setBackground(new java.awt.Color(245, 248, 190));
        studPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Student Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 11))); // NOI18N
        studPanel.setToolTipText("Regular or Irregular");
        studPanel.setOpaque(false);
        studPanel.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Name:");
        studPanel.add(jLabel3);
        jLabel3.setBounds(10, 110, 46, 39);

        StudLastField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        StudLastField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        StudLastField.setToolTipText("Your Last Name.");
        studPanel.add(StudLastField);
        StudLastField.setBounds(70, 110, 174, 30);

        StudFirstField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        StudFirstField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        StudFirstField.setToolTipText("Your First Name.");
        studPanel.add(StudFirstField);
        StudFirstField.setBounds(250, 110, 243, 30);

        StudMidField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        StudMidField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        StudMidField.setToolTipText("Your Middle Name.");
        StudMidField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudMidFieldActionPerformed(evt);
            }
        });
        studPanel.add(StudMidField);
        StudMidField.setBounds(500, 110, 190, 30);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setLabelFor(StudLastField);
        jLabel4.setText("Last Name");
        studPanel.add(jLabel4);
        jLabel4.setBounds(110, 140, 72, 19);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("First Name");
        studPanel.add(jLabel5);
        jLabel5.setBounds(330, 140, 70, 19);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Middle Name");
        studPanel.add(jLabel6);
        jLabel6.setBounds(540, 140, 94, 19);

        IrregRegCBox.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        IrregRegCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select>", "Regular", "Irregular" }));
        IrregRegCBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studPanel.add(IrregRegCBox);
        IrregRegCBox.setBounds(70, 210, 130, 30);

        YearLevelCBox.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        YearLevelCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Year>", "1st Year", "2nd Year" }));
        YearLevelCBox.setToolTipText("1st Year or 2nd Year");
        YearLevelCBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        YearLevelCBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                YearLevelCBoxItemStateChanged(evt);
            }
        });
        studPanel.add(YearLevelCBox);
        YearLevelCBox.setBounds(90, 170, 130, 30);

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setText("Status: ");
        studPanel.add(jLabel15);
        jLabel15.setBounds(10, 210, 60, 30);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setText("Year Level: ");
        studPanel.add(jLabel16);
        jLabel16.setBounds(10, 170, 100, 30);

        ScholarCBox.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ScholarCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select>", "Governor's Shcolar", "Vice-Governor's Scholar", "Scholar ng Bayan", "Scholar ng BSU" }));
        ScholarCBox.setToolTipText("1st Year or 2nd Year");
        ScholarCBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ScholarCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScholarCBoxActionPerformed(evt);
            }
        });
        studPanel.add(ScholarCBox);
        ScholarCBox.setBounds(330, 210, 240, 30);

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setText("Scholarship: ");
        studPanel.add(jLabel21);
        jLabel21.setBounds(240, 210, 90, 30);

        SemCBox.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        SemCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Semester>", "1st Semester", "2nd Semester" }));
        SemCBox.setToolTipText("Select Semester.");
        SemCBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studPanel.add(SemCBox);
        SemCBox.setBounds(320, 170, 180, 30);

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel22.setText("Semester: ");
        studPanel.add(jLabel22);
        jLabel22.setBounds(240, 170, 110, 30);

        sectionLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sectionLabel.setText("Section: ");
        studPanel.add(sectionLabel);
        sectionLabel.setBounds(10, 70, 260, 30);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Student Number:");
        studPanel.add(jLabel17);
        jLabel17.setBounds(10, 30, 120, 30);

        secTxtField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        secTxtField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        secTxtField.setOpaque(false);
        studPanel.add(secTxtField);
        secTxtField.setBounds(70, 70, 170, 30);

        studNumTxtField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        studNumTxtField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        studNumTxtField.setOpaque(false);
        studPanel.add(studNumTxtField);
        studNumTxtField.setBounds(130, 30, 160, 30);

        jPanel5.add(studPanel);
        studPanel.setBounds(10, 80, 720, 250);

        jPanel2.setBackground(new java.awt.Color(245, 248, 190));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 11))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setText("Contact Number:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 60, 130, 30);

        StudCont.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        StudCont.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        StudCont.setToolTipText(" Contact of yours.");
        StudCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudContActionPerformed(evt);
            }
        });
        StudCont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StudContKeyTyped(evt);
            }
        });
        jPanel2.add(StudCont);
        StudCont.setBounds(130, 60, 210, 30);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Gender:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 90, 70, 43);

        MaleRadio.setBackground(new java.awt.Color(255, 255, 255));
        G.add(MaleRadio);
        MaleRadio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        MaleRadio.setText("Male");
        MaleRadio.setToolTipText("Male?");
        MaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRadioActionPerformed(evt);
            }
        });
        jPanel2.add(MaleRadio);
        MaleRadio.setBounds(80, 100, 61, 27);

        FemaleRadio.setBackground(new java.awt.Color(255, 255, 255));
        G.add(FemaleRadio);
        FemaleRadio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        FemaleRadio.setText("Female");
        FemaleRadio.setToolTipText("Female?");
        jPanel2.add(FemaleRadio);
        FemaleRadio.setBounds(150, 100, 77, 27);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setText("Age:");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(10, 130, 40, 30);

        AgeField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        AgeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AgeField.setToolTipText("Your Middle Name.");
        AgeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeFieldActionPerformed(evt);
            }
        });
        AgeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AgeFieldKeyTyped(evt);
            }
        });
        jPanel2.add(AgeField);
        AgeField.setBounds(60, 130, 90, 30);

        RegField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        RegField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RegField.setToolTipText("Address");
        jPanel2.add(RegField);
        RegField.setBounds(70, 170, 640, 30);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("Address:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 170, 57, 30);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Birthday:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 20, 57, 30);

        MonthSpin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        MonthSpin.setModel(new javax.swing.SpinnerListModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
        MonthSpin.setToolTipText("Month of your Birthday.");
        MonthSpin.setDoubleBuffered(true);
        MonthSpin.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                MonthSpinAncestorRemoved(evt);
            }
        });
        jPanel2.add(MonthSpin);
        MonthSpin.setBounds(80, 20, 110, 30);

        DaySpin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        DaySpin.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        DaySpin.setToolTipText("Day of your Birthday.");
        jPanel2.add(DaySpin);
        DaySpin.setBounds(200, 20, 70, 30);

        YearSpin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        YearSpin.setModel(new javax.swing.SpinnerListModel(new String[] {"1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017"}));
        YearSpin.setToolTipText("Year of Birthday.");
        jPanel2.add(YearSpin);
        YearSpin.setBounds(280, 20, 71, 30);

        jPanel5.add(jPanel2);
        jPanel2.setBounds(10, 340, 720, 210);

        ProcessBtn.setBackground(new java.awt.Color(255, 255, 255));
        ProcessBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ProcessBtn.setText("Proceed");
        ProcessBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProcessBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessBtnActionPerformed(evt);
            }
        });
        jPanel5.add(ProcessBtn);
        ProcessBtn.setBounds(580, 570, 121, 27);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setText("Enrollment Form");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(10, 20, 192, 31);
        jPanel5.add(jLabel30);
        jLabel30.setBounds(807, 11, 0, 0);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel3);
        jPanel3.setBounds(0, 50, 530, 10);

        jPanel4.setBackground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel4);
        jPanel4.setBounds(390, 60, 410, 10);

        backLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnrollmentSystem/studDetBackBsuRedLogo.png"))); // NOI18N
        jPanel5.add(backLogoLabel);
        backLogoLabel.setBounds(190, 40, 500, 510);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 741, 615));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProcessBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessBtnActionPerformed
        int mark=0;

        String StudLast = StudLastField.getText();
        String StudFirst = StudFirstField.getText();
        String StudMid = StudMidField.getText();

        String MotLast = MotLastField.getText();
        String MotFirst = MotFirstField.getText();
        String MotMid = MotMidField.getText();

        String Region = RegField.getText();
        
        String SCont = StudCont.getText();
        String GCont = GuardCont.getText();
        
        for(int q=0; q<100; q++)
        {
        if(StudLast.equals("") || StudFirst.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill up all the Fields");
            System.out.println("SN");
            mark=0;
            break;
        }

        if(MotLast.equals("") || MotFirst.equals("") || MotMid.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill up all the Fields");
            System.out.println("NN");
            mark=0;
            break;
        }

        if(Region.equals("") || SCont.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill up all the Fields");
            System.out.println("S");
            mark=0;
            break;
        }
        if(GCont.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill up all the Fields");
            System.out.println("G");
            mark=0;
            break;
        }
        
        if(AgeField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill up all the Fields");
            mark=0;
        }
        
        if(IrregRegCBox.getSelectedItem().equals("<Select>"))
        {
            JOptionPane.showMessageDialog(null, "Fill up all the Fields");
            mark=0;
            break;
        }
        
        if(YearLevelCBox.getSelectedItem().equals("<Select Year>"))
        {
            JOptionPane.showMessageDialog(null, "Fill up all the Fields");
            mark=0;
            break;
        }
        
        if(SemCBox.getSelectedItem().equals("<Select Semester>"))
        {
            JOptionPane.showMessageDialog(null, "Fill up all the Fields");         
            mark=0;
            break;
      }

        else
            mark=1;
        
        String GenMark="";
        
        if(MaleRadio.isSelected())
        {
        GenMark="Male";   
        gendb="Male";
        Gender.add(GenMark);
        }
        else if(FemaleRadio.isSelected())
        {
        GenMark="Female"; 
        gendb=GenMark;
        Gender.add(GenMark);
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "Fill up all the Fields"); 
            break;
        }
       
        if(IrregRegCBox.getSelectedItem().equals("Regular"))
        {
            String reg = IrregRegCBox.getSelectedItem()+"";
            iredb=reg;
            IrregReg.add(reg);
            //System.out.println("Status : "+IrregReg);
        }
        else if(IrregRegCBox.getSelectedItem().equals("Irregular"))
        {
            String Irreg = IrregRegCBox.getSelectedItem()+"";
            iredb=Irreg;
            IrregReg.add(Irreg);
            //System.out.println("Status : "+IrregReg);
        }
        
       
        if(YearLevelCBox.getSelectedItem().equals("1st Year"))
        {
            String first = YearLevelCBox.getSelectedItem()+"";
            yeardb=first;
            YearLev.add(first);
            //System.out.println("Year Level : "+YearLev);
        }
        else if(YearLevelCBox.getSelectedItem().equals("2nd Year"))
        {
            String second = YearLevelCBox.getSelectedItem()+"";
            yeardb=second;
            YearLev.add(second);
            //System.out.println("Year Level : "+YearLev);
        }
        
        if(ScholarCBox.getSelectedItem().equals("Governor's Shcolar"))
        {
            String gov = ScholarCBox.getSelectedItem()+"";
            schodb=gov;
            Scholar.add(gov);
            //System.out.println("Scholarship : "+Scholar);
        }
        else if(ScholarCBox.getSelectedItem().equals("Vice-Governor's Scholar"))
        {
            String vice = ScholarCBox.getSelectedItem()+"";
            schodb=vice;
            Scholar.add(vice);
            //System.out.println("YScholarship : "+Scholar);
        }
        else if(ScholarCBox.getSelectedItem().equals("Scholar ng Bayan"))
        {
            String bayan = ScholarCBox.getSelectedItem()+"";
            schodb=bayan;
            Scholar.add(bayan);
            //System.out.println("Scholarship : "+Scholar);
        }
        else if(ScholarCBox.getSelectedItem().equals("Scholar ng BSU"))
        {
            String bsu = ScholarCBox.getSelectedItem()+"";
            schodb=bsu;
            Scholar.add(bsu);
            //System.out.println("Scholarship : "+Scholar);
        }
        else if(ScholarCBox.getSelectedItem().equals("<Select>"))
        {
            String mama = "NONE";
            schodb=mama;
            Scholar.add(mama);
            //System.out.println("Scholarship : "+Scholar);
        }
        
        
        if(SemCBox.getSelectedItem().equals("1st Semester"))
        {
            String first = SemCBox.getSelectedItem()+"";
            semdb=first;
            Semester.add(first);
            //System.out.println("Semester  : "+Semester);
        }
        else if(SemCBox.getSelectedItem().equals("2nd Semester"))
        {
            String second = SemCBox.getSelectedItem()+"";
            semdb=second;
            Semester.add(second);
            //System.out.println("Semester : "+Semester);
        }

        
        
        if(AgeField.getText()!=null)
        {
            String age = AgeField.getText();
            agedb=age;
            Age.add(age);
            //System.out.println("Age : "+Age);
        }

        if(mark==1)
        {
        if(StudLast!=null || StudFirst!=null)
        {
            
        String l= StudLastField.getText().trim();
        String f= StudFirstField.getText().trim();
        String m= StudMidField.getText().trim();
        
        String lastName = ""; 
        String firstName = ""; 
        String middleName = "";
        if(m.equals(""))
        {
            middleName="*";
        }
        else
        {
        if(m.contains("."))
        {
          String toUp =m.toUpperCase();
          int len = toUp.length();
          String midName = toUp.charAt(0)+"";
           for(int x=0; x<len; x++)
           {
               try
               {
               if(toUp.charAt(x)=='.')
               {
                   midName += toUp.charAt(x+1);
               }
               }
               catch(Exception e)
               {
                   
               }
           }
           midName.replaceAll(" ", "");
           midName+=".";
           middleName = midName;
        }
        else if(m.contains(" "))
        {
            
            String toUp = m.toUpperCase();
            int len = toUp.length();
            String mid = toUp.charAt(0)+"";
            for(int x=0; x<len; x++)
            {
                if(toUp.charAt(x)==' ')
                {
                    mid+=toUp.charAt(x+1);
                }
            }
            mid+=".";
            mid.replaceAll(" ", "");
            middleName = mid;
        }
        
        else
        {
             char startM;
             int lenM=0;
             String upM = m.toUpperCase();
             startM = upM.charAt(0);
             lenM = m.length();
             String lastM = m.substring(1, lenM);
             middleName = startM+". "; 
        }
        }
        char startL;
        char startF;
        //char startM;
        
        int lenL=0;
        int lenF=0;
        //int lenM=0;
        
        String upL = l.toUpperCase();
        startL = upL.charAt(0);
        
        String upF = f.toUpperCase();
        startF = upF.charAt(0);
        
        //String upM = m.toUpperCase();
        //startM = upM.charAt(0);
      
        String lowL = l.toLowerCase();
        String lowF = f.toLowerCase();
        String lowM = m.toLowerCase();
        
        lenL = l.length();
        lenF = f.length();
        //lenM = m.length();
        
        String lastL = lowL.substring(1, lenL);
        String lastF = lowF.substring(1, lenF);
        //String lastM = m.substring(1, lenM);
        
        lastName = startL+lastL; 
        firstName = startF+lastF; 
        //middleName = startM+". "; 
        
        if(lastName.contains(" "))
        {
            int len = lastName.length();
            for(int x=0; x<len; x++)
            {
                if(lastName.charAt(x)==' ')
                {
                   String rep = " "+lastName.charAt(x+1);
                   String repp = rep.toUpperCase();
                   String temp = lastName.replace(rep,repp);
                   lastName = temp;
                }
            }
        }
            if(firstName.contains(" "))
        {
            int len = firstName.length();
            for(int x=0; x<len; x++)
            {
                if(firstName.charAt(x)==' ')
                {
                   String rep = " "+firstName.charAt(x+1);
                   String repp = rep.toUpperCase();
                   String temp = firstName.replace(rep,repp);
                   firstName = temp;
                }
            }
        }
        String Month = ((DefaultEditor) MonthSpin.getEditor()).getTextField().getText();
        String Day = ((DefaultEditor) DaySpin.getEditor()).getTextField().getText();
        String Year = ((DefaultEditor) YearSpin.getEditor()).getTextField().getText();
        
        String MDY = Month+" "+Day+", "+Year; 
        String add = RegField.getText();
        String name = lastName+", "+firstName+", "+middleName; 
        firstdb=firstName;
        lastdb=lastName;
        middb=middleName;
        StudFirstName.add(firstName);
        StudLastName.add(lastName);
        StudMiddle.add(middleName);
        String cont = StudCont.getText(); 
        StudFullName.add(name);
        fulldb=name;
        birthdb=MDY;
        Birthday.add(MDY);
        adddb=add;
        Address.add(add);
        contdb=cont;
        Contact.add(cont);
        
        //System.out.println("Full Name : "+StudFullName);
        //System.out.println("Birthday : "+Birthday);
        //System.out.println("Address : "+Address);
        //System.out.println("Contact : "+Contact);
        }

        if(MotLast!=null || MotFirst!=null || MotMid!=null)
        {
        String l= MotLastField.getText().trim();
        String f= MotFirstField.getText().trim();
        String m= MotMidField.getText().trim();
        
        String lastName = ""; 
        String firstName = ""; 
        String middleName = "";
        
        if(m.contains("."))
        {
          String toUp =m.toUpperCase();
          int len = toUp.length();
          String midName = toUp.charAt(0)+"";
           for(int x=0; x<len; x++)
           {
               try
               {
               if(toUp.charAt(x)=='.')
               {
                   midName += toUp.charAt(x+1);
               }
               }
               catch(Exception e)
               {
                   
               }
           }
           midName.replaceAll(" ", "");
           midName+=".";
           middleName = midName;
        }
        else if(m.contains(" "))
        {
            
            String toUp = m.toUpperCase();
            int len = toUp.length();
            String mid = toUp.charAt(0)+"";
            for(int x=0; x<len; x++)
            {
                if(toUp.charAt(x)==' ')
                {
                    mid+=toUp.charAt(x+1);
                }
            }
            mid+=".";
            mid.replaceAll(" ", "");
            middleName = mid;
        }
        else
        {
             char startM;
             int lenM=0;
             String upM = m.toUpperCase();
             startM = upM.charAt(0);
             lenM = m.length();
             String lastM = m.substring(1, lenM);
             middleName = startM+". "; 
        }
        char startL;
        char startF;
        //char startM;
        
        int lenL=0;
        int lenF=0;
        //int lenM=0;
        
        String upL = l.toUpperCase();
        startL = upL.charAt(0);
        
        String upF = f.toUpperCase();
        startF = upF.charAt(0);
        
        //String upM = m.toUpperCase();
        //startM = upM.charAt(0);
      
        String lowL = l.toLowerCase();
        String lowF = f.toLowerCase();
        String lowM = m.toLowerCase();
        
        lenL = l.length();
        lenF = f.length();
        //lenM = m.length();
        
        String lastL = lowL.substring(1, lenL);
        String lastF = lowF.substring(1, lenF);
        //String lastM = m.substring(1, lenM);
        
        lastName = startL+lastL; 
        firstName = startF+lastF; 
        //middleName = startM+". "; 
        
        if(lastName.contains(" "))
        {
            int len = lastName.length();
            for(int x=0; x<len; x++)
            {
                if(lastName.charAt(x)==' ')
                {
                   String rep = " "+lastName.charAt(x+1);
                   String repp = rep.toUpperCase();
                   String temp = lastName.replace(rep,repp);
                   lastName = temp;
                }
            }
        }
            if(firstName.contains(" "))
        {
            int len = firstName.length();
            for(int x=0; x<len; x++)
            {
                if(firstName.charAt(x)==' ')
                {
                   String rep = " "+firstName.charAt(x+1);
                   String repp = rep.toUpperCase();
                   String temp = firstName.replace(rep,repp);
                   firstName = temp;
                }
            }
        }
            
        //String number = studNumTxtField.getText().trim();
        String cont = GuardCont.getText();
        String Occ = MotOccu.getText();
        String name = lastName+", "+firstName+", "+middleName; 
        gnamedb=name;
        gcontdb=cont;
        goccudb=Occ;
        GuardFullName.add(name);
        GuardContact.add(cont);
        Occupation.add(Occ);
        
        //System.out.println("Guardian Name : "+GuardFullName);
        //System.out.println("Gurdian Contact : "+GuardContact);
        //System.out.println("Gurdian Occupation : "+Occupation);
        Section.add(secSave);
        break;
        }
    }
    }
        if(mark==1)
        {
            String path="def.jpg";
            rems.add(" ");
            icon.add(path);
         
            JOptionPane.showMessageDialog(null, "Successfully Saved","SAVED",JOptionPane.INFORMATION_MESSAGE);
            StudNumber.add(number+"");
            
            number++;
            studCtr++;
            viewStudRecords();
            if(secTxtField.getText().charAt(4)=='1')
            {
            if(groupCtr==1)
            {
                groupNumSec=2;
            }
            if(groupCtr==2)
            {
                letterSec++;
                groupCtr=0;
                groupNumSec=1;
            }
            else
            {
                groupCtr++;
            }
            }
            if(secTxtField.getText().charAt(4)=='2')
            {
            if(groupCtr2==1)
            {
                groupNumSec2=2;
            }
            if(groupCtr2==2)
            {
                letterSec2++;
                groupCtr2=0;
                groupNumSec2=1;
            }
            else
            {
                groupCtr2++;
            }
            }
           revalidate();
            dispose();
        }
    }//GEN-LAST:event_ProcessBtnActionPerformed

    private void StudContKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StudContKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c>'9' && c!= '\b' )
        {
            evt.consume();
        }
    }//GEN-LAST:event_StudContKeyTyped

    private void MaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleRadioActionPerformed

    private void StudMidFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudMidFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudMidFieldActionPerformed

    private void MonthSpinAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_MonthSpinAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_MonthSpinAncestorRemoved

    private void AgeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeFieldActionPerformed

    private void AgeFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeFieldKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c>'9' && c!= '\b' )
        {
            evt.consume();
        }
    }//GEN-LAST:event_AgeFieldKeyTyped

    private void ScholarCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScholarCBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ScholarCBoxActionPerformed

    private void YearLevelCBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_YearLevelCBoxItemStateChanged
        if(YearLevelCBox.getSelectedItem().equals("<Select Year>"))
        {
            secTxtField.setText("");
            this.revalidate();
        }
        if(YearLevelCBox.getSelectedItem().equals("1st Year"))
        {
            secTxtField.setText("");
            secTxtField.setText("ACT "+"1"+letterSec+"-G"+groupNumSec);
            Variables.secSave = secTxtField.getText();
            this.revalidate();
        }
        if(YearLevelCBox.getSelectedItem().equals("2nd Year"))
        {
           secTxtField.setText("");
           secTxtField.setText("ACT "+"2"+letterSec2+"-G"+groupNumSec2);
           Variables.secSave = secTxtField.getText();
           this.revalidate();
        }
    }//GEN-LAST:event_YearLevelCBoxItemStateChanged

    private void StudContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudContActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudContActionPerformed

    
           
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeField;
    private javax.swing.JSpinner DaySpin;
    private javax.swing.JRadioButton FemaleRadio;
    private javax.swing.ButtonGroup G;
    private javax.swing.JComboBox<String> IrregRegCBox;
    private javax.swing.JRadioButton MaleRadio;
    private javax.swing.JSpinner MonthSpin;
    private javax.swing.JButton ProcessBtn;
    private javax.swing.JTextField RegField;
    private javax.swing.JComboBox<String> ScholarCBox;
    private javax.swing.JComboBox<String> SemCBox;
    private javax.swing.JTextField StudCont;
    private javax.swing.JTextField StudFirstField;
    private javax.swing.JTextField StudLastField;
    private javax.swing.JTextField StudMidField;
    private javax.swing.JComboBox<String> YearLevelCBox;
    private javax.swing.JSpinner YearSpin;
    private javax.swing.JLabel backLogoLabel;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField secTxtField;
    private javax.swing.JLabel sectionLabel;
    private javax.swing.JTextField studNumTxtField;
    private javax.swing.JPanel studPanel;
    // End of variables declaration//GEN-END:variables
}
