
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {



    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // hand cursor

// Add mouse listener for click and hover effects
    jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        // Open Signup frame
        Signup signupFrame = new Signup();
        signupFrame.setVisible(true);

        // Close Login frame if desired
        ((javax.swing.JFrame) jLabel6.getTopLevelAncestor()).dispose();
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        jLabel6.setForeground(new java.awt.Color(0, 51, 153)); // darker blue on hover
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent evt) {
        jLabel6.setForeground(new java.awt.Color(0, 102, 204)); // back to normal
    }
});
        setResizable(false);
        setLocationRelativeTo(null); 
        setVisible(true);

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Don't have an account? ");

        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("Create an account");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Password");

        jButton1.setBackground(new java.awt.Color(0, 51, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("SIGN IN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel3.setText("Sign in to STOXLY");

        jFormattedTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField3ActionPerformed(evt);
            }
        });

        jFormattedTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel6))
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jFormattedTextField4)
                        .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 410, 480));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test 2.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 570));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 1000, 560));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 1000, 560));

        jPanel4.setBackground(new java.awt.Color(40, 40, 40));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 1000, 560));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     jButton1.addActionListener(e -> {
    String username = jFormattedTextField3.getText().trim();
    String password = jFormattedTextField4.getText().trim();

    if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "Please enter both username and password.",
                "Login Error",
                JOptionPane.ERROR_MESSAGE);
        return;
    }

    boolean valid = DatabaseConnection.checkLogin(username, password);

   if (valid) {
    Stock mainFrame = new Stock();
    mainFrame.setLoggedInUser(username);   // now this works
    mainFrame.setVisible(true);
    this.dispose();


    JOptionPane.showMessageDialog(mainFrame, "✅ Welcome " + username + "!");

    } else {
        JOptionPane.showMessageDialog(this,
                "❌ Invalid username or password!",
                "Login Failed",
                JOptionPane.ERROR_MESSAGE);
    }
});





    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFormattedTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField3ActionPerformed

    private void jFormattedTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField4ActionPerformed


    public static void main(String args[]) {

 

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}

