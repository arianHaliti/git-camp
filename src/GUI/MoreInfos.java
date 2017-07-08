/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BL.Emails;
import BL.Phone;
import BL.Users;
import DAL.EmailException;
import DAL.EmailRepository;
import DAL.PhoneException;
import DAL.PhoneRepository;
import DAL.StudentRepository;
import DAL.UserRepository;
import Model.EmailTableModele;
import Model.PhoneTableModel;
import Model.StudentiTableModel;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author XONI
 */
public class MoreInfos extends javax.swing.JInternalFrame {
 Users u ;
    StudentiTableModel stm = new StudentiTableModel();
  EmailTableModele etm = new EmailTableModele();
  PhoneTableModel ptm = new PhoneTableModel();
  
    UserRepository ur = new UserRepository();
    EmailRepository er = new EmailRepository();
     PhoneRepository pr = new PhoneRepository();
    /**
     * Creates new form MoreInfos1
     */
    public MoreInfos(Users u) {
        initComponents();
       this.u=u;
       emailTableLoad();
       phoneTableLoad();
       this.setLocation(250,5);
    }
     public void emptyObject() {
       emailTable.clearSelection();
        email_field.setText("");
        
        
    }
      public void emptyObject1() {
      phoneTable.clearSelection();
        phone_field.setText("");
        
        
    }
private void emailTableLoad() {
        List<Emails> lista = er.findByUserID(u);
        etm.add(lista);
        emailTable.setModel(etm);
        etm.fireTableDataChanged();
        emailTableSelectedIndexChange();

    }
private void phoneTableLoad() {
        List<Phone> lista = pr.findByUserID(u);
        ptm.add(lista);
        phoneTable.setModel(ptm);
        ptm.fireTableDataChanged();
        phoneTableSelectedIndexChange();

    }
 
 private void emailTableSelectedIndexChange() {
        final ListSelectionModel rowSM = emailTable.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent Ise) {
                if (Ise.getValueIsAdjusting()) {
                    return;
                }
                ListSelectionModel rowSM = (ListSelectionModel) Ise.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if (selectedIndex > -1) {
                    Emails email = etm.getEmails(selectedIndex);

                    email_field.setText(email.getEmailAdress());
                    
                   
                }
            }
        });
    }
 private void phoneTableSelectedIndexChange() {
        final ListSelectionModel rowSM = phoneTable.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent Ise) {
                if (Ise.getValueIsAdjusting()) {
                    return;
                }
                ListSelectionModel rowSM = (ListSelectionModel) Ise.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if (selectedIndex > -1) {
                    Phone phone = ptm.getPhone(selectedIndex);

                    phone_field.setText(phone.getPhoneNumber());
                    
                   
                }
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        email_field = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        emailTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        delete_btn1 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        phone_field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        phoneTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("EMAIL AND PHONE NUMBERS");
        setMinimumSize(new java.awt.Dimension(533, 496));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMAIL ADDRESS AND PHONE NUMBER REGISTRATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        email_field.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        email_field.setForeground(new java.awt.Color(51, 51, 51));
        email_field.setMargin(new java.awt.Insets(2, 5, 2, 5));
        email_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_fieldActionPerformed(evt);
            }
        });

        emailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane8.setViewportView(emailTable);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Email address :");

        delete_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rubbish-bin.png"))); // NOI18N
        delete_btn1.setText("DELETE");
        delete_btn1.setVisible(true);
        delete_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btn1ActionPerformed(evt);
            }
        });

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButton21.setText("SAVE");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel-button.png"))); // NOI18N
        jButton22.setText("CANCEL");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        phone_field.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        phone_field.setForeground(new java.awt.Color(51, 51, 51));
        phone_field.setMargin(new java.awt.Insets(2, 5, 2, 5));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Phone number :");

        phoneTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane7.setViewportView(phoneTable);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 100, Short.MAX_VALUE))
                            .addComponent(phone_field))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phone_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void email_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_fieldActionPerformed

    private void delete_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btn1ActionPerformed
        // TODO add your handling code here:
        try{
            int row = emailTable.getSelectedRow();
            int row1 = phoneTable.getSelectedRow();
            if(row1 > -1 && row > -1 ){
                Object [] ob = {"Po","Jo"};
                int i = javax.swing.JOptionPane.showOptionDialog(this, "A dëshironi ta fshini ?", "Fshirja", JOptionPane.OK_OPTION,JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
                if(i==0){
                    Emails email = this.etm.getEmails(row);
                    Phone phon = this.ptm.getPhone(row1);
                    
                    pr.remove(phon);
                    er.remove(email);
                    emailTableLoad();
                    phoneTableLoad();
                    emptyObject();
                    emptyObject1();
                    JOptionPane.showMessageDialog(this, "E dhëna është fshir me sukses !");
                }
            }
            else if(row > -1){
                Object [] ob = {"Po","Jo"};
                int i = javax.swing.JOptionPane.showOptionDialog(this, "A dëshironi ta fshini ?", "Fshirja", JOptionPane.OK_OPTION,JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
                if(i==0){
                    Emails email = this.etm.getEmails(row);
                    er.remove(email);
                    emailTableLoad();
                    emptyObject();
                    JOptionPane.showMessageDialog(this, "E dhëna është fshir me sukses !");
                }
            }
            else if(row1 > -1){
            Object [] ob = {"Po","Jo"};
                int i = javax.swing.JOptionPane.showOptionDialog(this, "A dëshironi ta fshini ?", "Fshirja", JOptionPane.OK_OPTION,JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
                if(i==0){
                    Phone phone = this.ptm.getPhone(row1);
                    pr.remove(phone);
                    phoneTableLoad();
                    emptyObject1();
                    JOptionPane.showMessageDialog(this, "E dhëna është fshir me sukses !");
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Nuk keni selektuar asgjë për të fshir !");
            }
        }catch(EmailException  | PhoneException pe){
            JOptionPane.showMessageDialog(this, pe.getMessage());
        }        // TOD
    }//GEN-LAST:event_delete_btn1ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        try {
      
        String s ="[a-zA-Z]+?";   //DATABASE , COUNTRY TE BEHET UNIQUE 
        String nr = "[0-9]+?";
        String emaili = "^[_A-Za-z0-9-\\\\.+]+[-|_+]*+[@]?+[a-z]+\\.com";
        
        
            int row = emailTable.getSelectedRow();
            int row1 = phoneTable.getSelectedRow();
            if (email_field.getText().equals("") &&   phone_field.getText().equals("")) {
              
  JOptionPane.showMessageDialog(this, "Nuk lejohen te dy fushat te jene te zbrazta :", "Error", JOptionPane.ERROR_MESSAGE);
                
//            } else if(!email_field.getText().matches(s)){
//               JOptionPane.showMessageDialog(this,"Country name cannot be a symbol or number","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if((!email_field.getText().matches(emaili) && !email_field.getText().matches("")) || (!phone_field.getText().matches(nr) && !phone_field.getText().matches("") )){
                 JOptionPane.showMessageDialog(this, "Mos shtyp numra tek emaili ose shkronja tek numri i tel (karaktere speciale) :", "Error", JOptionPane.ERROR_MESSAGE);
               }
            
            else {
               
                 if(row == -1 && phone_field.getText().equals("") )//phone_Field smunet me ndodh 
                 {
                   
                
                    Emails email = new Emails();
                    email.setEmailAdress(email_field.getText());
                    email.setUserID(u);
                    
                    er.create(email);
                    JOptionPane.showMessageDialog(this, "E dhëna u ruajt me sukses !");
                    emptyObject();
                  
                }
            else if(row1 ==-1 && email_field.getText().equals("")){
            Phone phone = new Phone();
                    phone.setPhoneNumber(phone_field.getText());
                     phone.setUserID(u);
                     
                    pr.create(phone);
                     JOptionPane.showMessageDialog(this, "E dhëna u ruajt me sukses !");
                     emptyObject1();
            }
            else if(row == -1 && row1 == -1){
                
                     Emails email = new Emails();
                    email.setEmailAdress(email_field.getText());
                    email.setUserID(u);
                    
                    er.create(email);
                Phone phone = new Phone();
                    phone.setPhoneNumber(phone_field.getText());
                     phone.setUserID(u);
                     
                    pr.create(phone);
                     JOptionPane.showMessageDialog(this, "E dhëna u ruajt me sukses !");
                     emptyObject();
                     emptyObject1();
            }
                      
   else {
                if(row!=-1 && phone_field.getText().equals("")){
                    Emails email = this.etm.getEmails(row);
               
                    email.setEmailAdress(email_field.getText());
                    er.edit(email);
                    JOptionPane.showMessageDialog(this, "E dhëna u editua me sukses");
                }
                else if(row1 != -1 && email_field.getText().equals("")){
                     Phone phone = this.ptm.getPhone(row1);
                    phone.setPhoneNumber(phone_field.getText());
                    pr.edit(phone);
                    
                    JOptionPane.showMessageDialog(this, "E dhëna u editua me sukses");
                }
                 else if(row != -1 && row1 != -1){
                      Emails email = this.etm.getEmails(row);
               
                    email.setEmailAdress(email_field.getText());
               
                    er.edit(email);
                      Phone phone = this.ptm.getPhone(row1);
                    phone.setPhoneNumber(phone_field.getText());
                    pr.edit(phone);
                    JOptionPane.showMessageDialog(this, "E dhëna u editua me sukses");
                    }
                else if(row1 != -1 && !email_field.getText().equals("")){
                    Phone phone = this.ptm.getPhone(row1);
                    phone.setPhoneNumber(phone_field.getText());
                    pr.edit(phone);
                    Emails email =  new Emails();
                    email.setEmailAdress(email_field.getText());
                    email.setUserID(u);
                    er.create(email);
                    JOptionPane.showMessageDialog(this, "E dhëna u ruajt dhe u editua me sukses");
                }else if(row != -1 && !phone_field.getText().equals("")){
                    Emails email = this.etm.getEmails(row);
                    email.setEmailAdress(email_field.getText());
                    er.edit(email);
                    Phone p =  new Phone();
                    p.setPhoneNumber(phone_field.getText());
                    p.setUserID(u);
                    pr.create(p);
                    JOptionPane.showMessageDialog(this, "E dhëna u ruajt dhe u editua me sukses");
                }
                   
            }
                 emptyObject();
                emptyObject1();
                phoneTableLoad();
                emailTableLoad();
              
            
               
                
            }

        } catch (EmailException | PhoneException pe) {
            JOptionPane.showMessageDialog(this, pe.getMessage());
        }
        
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
 
        emptyObject(); 
        emptyObject1(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete_btn1;
    private javax.swing.JTable emailTable;
    private javax.swing.JTextField email_field;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable phoneTable;
    private javax.swing.JTextField phone_field;
    // End of variables declaration//GEN-END:variables
}
