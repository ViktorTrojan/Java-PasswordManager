
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Password_GUI extends javax.swing.JFrame {

    public Password_GUI() {
        FlatLightLaf.setup();
        UIManager.put("TextComponent.arc", 10);
        UIManager.put("PasswordField.showRevealButton", true);
        initComponents();

        jTextField1.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Display Name");
        jTextField2.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Username");
        jTextField3.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Web URL");
        jTextField4.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Support Email");
        jPasswordField1.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Password");

        jMenuItem1.setText("Delete");
        jPopupMenu1.add(jMenuItem1);
        jTable1.setComponentPopupMenu(jPopupMenu1);

        refreshTableInfo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        panel1 = new components.panel.Panel();
        panel2 = new components.panel.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        button1 = new components.button.Button();
        info = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PasswordManager");

        panel1.setBackground(new java.awt.Color(243, 243, 251));
        panel1.setRounded(0);

        panel2.setBackground(new java.awt.Color(230, 230, 244));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Display Name", "Username", "Password", "Web URL", "Support Email"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jPasswordField1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        button1.setText("Add Entry");
        button1.setColorVariants(true);
        button1.setEffectColor(new java.awt.Color(255, 102, 102));
        button1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        info.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        info.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void insertServiceData() {
        boolean res = Main.i.db.insertQuery("INSERT INTO SERVICE (weburl) VALUES (?)", new String[]{jTextField3.getText()});
        if (!res) {
            return;
        }
        res = Main.i.db.insertQuery("INSERT INTO INFO (email, service_id) SELECT ?, id FROM service WHERE weburl = ?", new String[]{jTextField4.getText(), jTextField3.getText()});
    }

    private void clearTableData() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // delete old rows     
    }

    private void addTableData(String displayName, String username, String pass, String weburl, String email) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{displayName, username, pass, weburl, email});
    }

    public void refreshTableInfo() {
        try {
            clearTableData();
            ResultSet rs = Main.i.db.query("SELECT p.display_name, p.username, p.pass, s.weburl, i.email FROM password p JOIN service s ON p.service_id = s.id JOIN info i ON p.service_id = i.service_id JOIN user u ON p.user_id = u.id WHERE u.username = ?", new String[]{Main.i.login.username});
            while (rs.next()) {
                String displayName = rs.getString("display_name");
                String username = rs.getString("username");
                String pass = rs.getString("pass");
                String weburl = rs.getString("weburl");
                String email = rs.getString("email");
                addTableData(displayName, username, pass, weburl, email);
            }
        } catch (SQLException ex) {
            System.out.println("[-] Couldn't display any Entries in the Table");
        }
    }

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        if (jTextField1.getText().length() < 1) {
            info.setText("Display Name too short < 1");
            return;
        }

        // first insert weburl and email
        insertServiceData();

        // TODO: passHash of User should be required
        boolean res = Main.i.db.insertQuery("INSERT INTO PASSWORD (display_name, username, pass, service_id, user_id) SELECT ?, ?, ?, service.id, user.id FROM service JOIN user ON user.username = ? WHERE service.weburl = ?", new String[]{jTextField1.getText(), jTextField2.getText(), jPasswordField1.getText(), Main.i.login.username, jTextField3.getText()});
        if (!res) {
            info.setText("Failed to Add Entry");
            return;
        }
        info.setText("Successfully added Entry!");
        refreshTableInfo();
    }//GEN-LAST:event_button1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int[] rows = jTable1.getSelectedRows();

        ArrayList<String> displayNameList = new ArrayList<>();
        for (int row : rows) {
            String displayName = (String) model.getValueAt(row, 0);
            displayNameList.add(displayName);
        }

        for (String displayName : displayNameList) {
            Main.i.db.insertQuery("DELETE FROM PASSWORD WHERE display_name = ?", new String[]{displayName});
        }
        
        refreshTableInfo();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.button.Button button1;
    public static javax.swing.JLabel info;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private components.panel.Panel panel1;
    private components.panel.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
