/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema_booking_system;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Affan
 */
public class Page6 extends javax.swing.JFrame {
private Customers c1;
    /**
     * Creates new form Page6
     */
    public Page6() {
        initComponents();
    }
    public Page6(Customers c1) {
        initComponents();
        this.c1 = c1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CUSTOMER_NAME = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        MOBILE_NUMBER = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TELEPHONE_NUMBER = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel1KeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Customer Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        CUSTOMER_NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CUSTOMER_NAMEActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Mobile No.");

        MOBILE_NUMBER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOBILE_NUMBERActionPerformed(evt);
            }
        });
        MOBILE_NUMBER.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MOBILE_NUMBERKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MOBILE_NUMBERKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Telephone No.");

        TELEPHONE_NUMBER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TELEPHONE_NUMBERActionPerformed(evt);
            }
        });
        TELEPHONE_NUMBER.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TELEPHONE_NUMBERKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TELEPHONE_NUMBERKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Address");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("BOOK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Address.setColumns(20);
        Address.setRows(5);
        jScrollPane1.setViewportView(Address);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 76, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CUSTOMER_NAME, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(MOBILE_NUMBER)
                    .addComponent(TELEPHONE_NUMBER)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CUSTOMER_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MOBILE_NUMBER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TELEPHONE_NUMBER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CUSTOMER_NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CUSTOMER_NAMEActionPerformed
       
    }//GEN-LAST:event_CUSTOMER_NAMEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if (CUSTOMER_NAME.getText().equals("") || MOBILE_NUMBER.getText().equals("") || TELEPHONE_NUMBER.getText().equals("") || Address.getText().equals("")     ){
        JOptionPane.showMessageDialog(null, "All text fields must be filled", "Error",JOptionPane.ERROR_MESSAGE);
  
  }
        else{
           c1.setCustomerName(CUSTOMER_NAME.getText());
           String m =  MOBILE_NUMBER.getText();
                   long MobileNo = Long.parseLong(m);
                   c1.setMobileNo(MobileNo);
                   

          String T = TELEPHONE_NUMBER.getText();
          long TelephoneNo = Long.parseLong(T);
          c1.setTelephoneNo(TelephoneNo);
          c1.setH_address(Address.getText());

        
        this.dispose();
         Page7 p7 = new Page7(c1);
        
       
        p7.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MOBILE_NUMBERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOBILE_NUMBERActionPerformed
       
        
    }//GEN-LAST:event_MOBILE_NUMBERActionPerformed

    private void TELEPHONE_NUMBERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TELEPHONE_NUMBERActionPerformed
        
    }//GEN-LAST:event_TELEPHONE_NUMBERActionPerformed

    private void jPanel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyTyped

    private void MOBILE_NUMBERKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MOBILE_NUMBERKeyTyped
          char c = evt.getKeyChar();
        if (!(Character.isDigit(c)|| c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
        evt.consume();
        }
    }//GEN-LAST:event_MOBILE_NUMBERKeyTyped

    private void TELEPHONE_NUMBERKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TELEPHONE_NUMBERKeyTyped
         char c = evt.getKeyChar();
        if (!(Character.isDigit(c)|| c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
        evt.consume();
        }
    }//GEN-LAST:event_TELEPHONE_NUMBERKeyTyped

    private void MOBILE_NUMBERKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MOBILE_NUMBERKeyPressed
         String MobileNumber = MOBILE_NUMBER.getText();
    int length = MobileNumber.length();
    char c = evt.getKeyChar();
    
    if(evt.getKeyChar()>= '0' && evt.getKeyChar() <= '9'){
        
        if(length< 11){
            MOBILE_NUMBER.setEditable(true);
        
        }else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE ||evt.getExtendedKeyCode() == KeyEvent.VK_DELETE ){
             MOBILE_NUMBER.setEditable(true);
        }
    
    else{
        MOBILE_NUMBER.setEditable(false);
    
    
        }
        
    
    } 
    }//GEN-LAST:event_MOBILE_NUMBERKeyPressed

    private void TELEPHONE_NUMBERKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TELEPHONE_NUMBERKeyPressed
         String TelephoneNumber = TELEPHONE_NUMBER.getText();
    int length = TelephoneNumber.length();
    char c = evt.getKeyChar();
    
    if(evt.getKeyChar()>= '0' && evt.getKeyChar() <= '9'){
        
        if(length< 11){
            TELEPHONE_NUMBER.setEditable(true);
        
        }else if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE ||evt.getExtendedKeyCode() == KeyEvent.VK_DELETE ){
             TELEPHONE_NUMBER.setEditable(true);
        }
    
    else{
        TELEPHONE_NUMBER.setEditable(false);
    
    
        }
        
    
    } 
        
    }//GEN-LAST:event_TELEPHONE_NUMBERKeyPressed
 
           
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
            java.util.logging.Logger.getLogger(Page6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Address;
    private javax.swing.JTextField CUSTOMER_NAME;
    private javax.swing.JTextField MOBILE_NUMBER;
    private javax.swing.JTextField TELEPHONE_NUMBER;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
