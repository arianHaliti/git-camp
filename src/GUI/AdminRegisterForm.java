package GUI;




import BL.Users;
import DAL.UserException;
import DAL.UserRepository;
import Model.UserTableModel;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arian Halit
 */
public class AdminRegisterForm extends javax.swing.JInternalFrame {
    UserTableModel utm = new UserTableModel();
    UserRepository ur = new UserRepository();
    Users user;
    
    /**
     * Creates new form StudentGUI
     */
    public AdminRegisterForm() {
        initComponents();
        tableLoad();
        
        this.setLocation(200,5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
        private void tableLoad(){    
        List<Users> lista = ur.findAdmins(0);
        utm.add(lista);
        usersTable.setModel(utm);
        utm.fireTableDataChanged();
        tabelaSelectedIndexChange();
        
        
    }
        
    private void tabelaSelectedIndexChange() {
        final ListSelectionModel rowSM = usersTable.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent Ise) {
                if (Ise.getValueIsAdjusting()) {
                    return;
                }
                ListSelectionModel rowSM = (ListSelectionModel) Ise.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if (selectedIndex > -1) {
                    
                    Users u = utm.getUsers(selectedIndex);
                    first_name_field.setText(u.getFirstName());
                    last_name_field.setText(u.getSurName());
                    username_field.setText(u.getLoginName());
                    password_field.setText(u.getHashCode());
                    moreInfo_btn.setVisible(true);
                    
                    delete_btn.setVisible(false);
                    user = u;
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cancel_btn = new javax.swing.JButton();
        first_name_field = new javax.swing.JTextField();
        last_name_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        save_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username_field = new javax.swing.JTextField();
        delete_btn = new javax.swing.JButton();
        password_field = new javax.swing.JTextField();
        moreInfo_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("STUDENT'S REGISTRATION FORM");
        setMinimumSize(new java.awt.Dimension(1023, 668));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CREATE STUDENTS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 15), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.setToolTipText("CREATE STUDENTS");
        jPanel2.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Password :");

        cancel_btn.setForeground(new java.awt.Color(51, 51, 51));
        cancel_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel-button.png"))); // NOI18N
        cancel_btn.setText("CANCEL");
        cancel_btn.setIconTextGap(10);
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        first_name_field.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        first_name_field.setForeground(new java.awt.Color(51, 51, 51));
        first_name_field.setMargin(new java.awt.Insets(2, 5, 2, 5));
        first_name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_name_fieldActionPerformed(evt);
            }
        });

        last_name_field.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        last_name_field.setForeground(new java.awt.Color(51, 51, 51));
        last_name_field.setMargin(new java.awt.Insets(2, 5, 2, 5));
        last_name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                last_name_fieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("First name :");

        save_btn.setForeground(new java.awt.Color(51, 51, 51));
        save_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        save_btn.setText("SAVE");
        save_btn.setIconTextGap(10);
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Last name :");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Username :");

        username_field.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        username_field.setForeground(new java.awt.Color(51, 51, 51));
        username_field.setMargin(new java.awt.Insets(2, 5, 2, 5));
        username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fieldActionPerformed(evt);
            }
        });

        delete_btn.setForeground(new java.awt.Color(51, 51, 51));
        delete_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rubbish-bin.png"))); // NOI18N
        delete_btn.setText("DELETE");
        delete_btn.setIconTextGap(10);
        delete_btn.setVisible(false);
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        password_field.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        password_field.setForeground(new java.awt.Color(51, 51, 51));
        password_field.setMargin(new java.awt.Insets(2, 5, 2, 5));
        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });

        moreInfo_btn.setForeground(new java.awt.Color(51, 51, 51));
        moreInfo_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open-book.png"))); // NOI18N
        moreInfo_btn.setText("ADD MORE INFO");
        moreInfo_btn.setIconTextGap(10);
        moreInfo_btn.setVisible(false);
        moreInfo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreInfo_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(first_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(last_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(moreInfo_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(last_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(first_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moreInfo_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TABLE OF STUDENTS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 15), new java.awt.Color(102, 102, 102))); // NOI18N

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(usersTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_fieldActionPerformed

    private void last_name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_last_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_last_name_fieldActionPerformed

    private void first_name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_first_name_fieldActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        emptyFields();
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        try{
            int row = usersTable.getSelectedRow();
            if(row > -1){
                Object [] ob = {"Po","Jo"};
                int i = javax.swing.JOptionPane.showOptionDialog(this, "A dëshironi ta fshini ?", "Fshirja", JOptionPane.OK_OPTION,JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
                if(i==0){
                    Users u = this.utm.getUsers(row);
                    
                    ur.remove(u);
                    tableLoad();
                    emptyFields();
                    JOptionPane.showMessageDialog(this, "E dhëna është fshir me sukses !");
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Nuk keni selektuar asgjë për të fshir !");
            }
        }catch( UserException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_delete_btnActionPerformed

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
       try {
        int row =usersTable.getSelectedRow();
        if(!errorCheck()) {
            if (row == -1) {
                Users u = new Users();
                u.setLoginName(username_field.getText());
                u.setFirstName(first_name_field.getText());
                u.setSurName(last_name_field.getText());
                u.setHashCode(password_field.getText());
                u.setPrivilege(0);
                ur.create(u);
                
                
                   int res =JOptionPane.showConfirmDialog(null,
"Administratori u ruajt me sukses ,Deshironi te mbushni Informacione shtes?",null, JOptionPane.YES_NO_OPTION);
                    if(res == JOptionPane.YES_OPTION){
                        this.user = u;
                        moreInfo_btnActionPerformed(evt);
                    }
            } else {
                Users u = this.utm.getUsers(row);
                
                u.setLoginName(username_field.getText());
                u.setHashCode(password_field.getText());
                u.setFirstName(first_name_field.getText());
                u.setSurName(last_name_field.getText());
                
                ur.edit(u);
                JOptionPane.showMessageDialog(this, "E dhëna u ruajt me sukses !");
            }
            emptyFields();
            tableLoad();
        };

        } catch (UserException  e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }  

    }//GEN-LAST:event_save_btnActionPerformed
    
    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_fieldActionPerformed

    private void moreInfo_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreInfo_btnActionPerformed
        
            MoreInfos ea = new MoreInfos(user);
            this.getParent().add(ea);
            ea.show();
        
    }//GEN-LAST:event_moreInfo_btnActionPerformed

    
    
        public void emptyFields(){
        usersTable.clearSelection();
        username_field.setText("");
        first_name_field.setText("");
        last_name_field.setText("");
        password_field.setText("");
        moreInfo_btn.setVisible(false);
        
        delete_btn.setVisible(false);
    }
     public boolean errorCheck(){
        
        String pattern ="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";// Strong password
        
        String letters = "[a-zA-Z-Ç-ç]+?"; // a osht fjal

          if (first_name_field.getText().equals("") || !first_name_field.getText().matches(letters)) {
            JOptionPane.showMessageDialog(this, first_name_field.getText().equals("")
                    ?"Mbush emrin ":"Emri duhet te jet vetem me shkronja",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
                 else if(last_name_field.getText().equals("") || !last_name_field.getText().matches(letters) ){
            JOptionPane.showMessageDialog(this, last_name_field.getText().equals("")
                    ?"Mbush mbiemrin":"Mbiemri duhet te jet vetem me shkronja",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
         else if (username_field.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mbush Username:", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }else if(password_field.getText().matches(pattern)){
            JOptionPane.showMessageDialog(this,
                    "Passwordi duhet te ket 8 karaktere 1 uppercase"
                            + "1 numer, 1 lowercase ,1 special karakter dhe pa hapesire"
                    , "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
          
    
        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextField first_name_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField last_name_field;
    private javax.swing.JButton moreInfo_btn;
    private javax.swing.JTextField password_field;
    private javax.swing.JButton save_btn;
    private javax.swing.JTextField username_field;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
