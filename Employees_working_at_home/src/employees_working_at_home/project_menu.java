package employees_working_at_home;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class project_menu extends javax.swing.JFrame {

    public project_menu() {
        initComponents();
        mostrarEmpleados();
        setLocationRelativeTo(null);
    }

    public void mostrarEmpleados() {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Name");
        modelo.addColumn("Last Name");
        modelo.addColumn("Email");
        modelo.addColumn("Salary");

        table.setModel(modelo);

        String sql = "SELECT * FROM employees";

        try {

            Connection conn = Conexion.conectar();

            PreparedStatement pst = conn.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                Object[] fila = new Object[5];

                fila[0] = rs.getInt("employee_id");
                fila[1] = rs.getString("first_name");
                fila[2] = rs.getString("last_name");
                fila[3] = rs.getString("email");
                fila[4] = rs.getDouble("salary");

                modelo.addRow(fila);
            }

            conn.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Error: " + e.getMessage()
            );
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu_tittle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        add_btn = new javax.swing.JButton();
        read_btn = new javax.swing.JButton();
        search_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        projectfrbtn = new javax.swing.JButton();
        skillsfrbtn = new javax.swing.JButton();
        employeetfrbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        menu_tittle.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        menu_tittle.setText("MENU");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Last_Name", "Email", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        add_btn.setText("ADD");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        read_btn.setText("READ");
        read_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                read_btnActionPerformed(evt);
            }
        });

        search_btn.setText("SEARCH");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        clear_btn.setText("CLEAR");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        update_button.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        update_button.setText("UPDATE");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        delete_button.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        delete_button.setText("DELETE");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        txtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryActionPerformed(evt);
            }
        });

        jLabel1.setText("INTRODUCE EMPLOYEE´S ID");

        jLabel2.setText("INTRODUCE EMPLOYEE´S NAME");

        jLabel3.setText("INTRODUCE EMPLOYEE´S EMAIL");

        jLabel4.setText("INTRODUCE EMPLOYEE´S LAST NAME");

        jLabel5.setText("INTRODUCE EMPLOYEE´S SALARY");

        projectfrbtn.setText("PROJECT_REPORT");
        projectfrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectfrbtnActionPerformed(evt);
            }
        });

        skillsfrbtn.setText("SKILLS_REPORT");
        skillsfrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skillsfrbtnActionPerformed(evt);
            }
        });

        employeetfrbtn.setText("EMPLOYEES_REPORT");
        employeetfrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeetfrbtnActionPerformed(evt);
            }
        });

        jLabel6.setText("REPORTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menu_tittle)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(search_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(read_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(txtName)
                            .addComponent(txtLastName)
                            .addComponent(txtEmail)
                            .addComponent(txtSalary))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(projectfrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(511, Short.MAX_VALUE)
                    .addComponent(skillsfrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(511, Short.MAX_VALUE)
                    .addComponent(employeetfrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menu_tittle)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(projectfrbtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_button)
                    .addComponent(delete_button)
                    .addComponent(add_btn)
                    .addComponent(read_btn)
                    .addComponent(search_btn)
                    .addComponent(clear_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(177, 177, 177)
                    .addComponent(skillsfrbtn)
                    .addContainerGap(290, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(137, 137, 137)
                    .addComponent(employeetfrbtn)
                    .addContainerGap(330, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        if (txtName.getText().isEmpty()
                || txtLastName.getText().isEmpty()
                || txtEmail.getText().isEmpty()
                || txtSalary.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Complete all fields"
            );

            return;
        }
        double salary
                = Double.parseDouble(txtSalary.getText());

        if (salary < 0) {

            JOptionPane.showMessageDialog(
                    this,
                    "Salary cannot be negative"
            );

            return;
        }

        String sql
                = "INSERT INTO employees(role_code, first_name, last_name, email, salary) VALUES(?,?,?,?,?)";

        Connection conn = null;

        try {

            conn = Conexion.conectar();

            conn.setAutoCommit(false);

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, "DEV");
            pst.setString(2, txtName.getText());
            pst.setString(3, txtLastName.getText());
            pst.setString(4, txtEmail.getText());
            pst.setDouble(5, salary);

            pst.executeUpdate();

            conn.commit();

            JOptionPane.showMessageDialog(
                    this,
                    "Employee added successfully"
            );

            mostrarEmpleados();

        } catch (Exception e) {

            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(
                    this,
                    "Error: " + e.getMessage()
            );

        } finally {

            try {
                if (conn != null) {
                    conn.setAutoCommit(true); // restaurar
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_add_btnActionPerformed

    private void read_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_read_btnActionPerformed

        mostrarEmpleados();


    }//GEN-LAST:event_read_btnActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed

        if (txtID.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Enter employee ID"
            );

            return;
        }

        String sql
                = "SELECT * FROM employees WHERE employee_id=?";

        try {

            Connection conn = Conexion.conectar();

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1,
                    Integer.parseInt(txtID.getText()));

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                txtName.setText(
                        rs.getString("first_name"));

                txtLastName.setText(
                        rs.getString("last_name"));

                txtEmail.setText(
                        rs.getString("email"));

                txtSalary.setText(
                        rs.getString("salary"));

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Employee not found"
                );
            }

            conn.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Error: " + e.getMessage()
            );
        }
    }//GEN-LAST:event_search_btnActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        txtID.setText("");

        txtName.setText("");

        txtLastName.setText("");

        txtEmail.setText("");

        txtSalary.setText("");
    }//GEN-LAST:event_clear_btnActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed

        if (txtID.getText().isEmpty()
                || txtName.getText().isEmpty()
                || txtLastName.getText().isEmpty()
                || txtEmail.getText().isEmpty()
                || txtSalary.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Complete all fields before updating"
            );

            return;
        }

        double salary
                = Double.parseDouble(txtSalary.getText());

        if (salary < 0) {

            JOptionPane.showMessageDialog(
                    this,
                    "Invalid salary"
            );

            return;
        }
        String sql
                = "UPDATE employees SET first_name=?, last_name=?, email=?, salary=? WHERE employee_id=?";
        Connection conn = null;
        try {

            conn = Conexion.conectar();

            conn.setAutoCommit(false);

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, txtName.getText());
            pst.setString(2, txtLastName.getText());
            pst.setString(3, txtEmail.getText());
            pst.setDouble(4, salary);
            pst.setInt(5,
                    Integer.parseInt(txtID.getText()));

            pst.executeUpdate();

            conn.commit();

            JOptionPane.showMessageDialog(
                    this,
                    "Employee updated"
            );

            mostrarEmpleados();

            conn.close();

        } catch (Exception e) {

            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(
                    this,
                    "Error: " + e.getMessage()
            );

        } finally {

            try {
                if (conn != null) {
                    conn.setAutoCommit(true); // restaurar
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_update_buttonActionPerformed

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete this employee?"
        );

        if (confirmacion != JOptionPane.YES_OPTION) {
            return;
        }
        String sql
                = "DELETE FROM employees WHERE employee_id=?";
        Connection conn = null;
        try {

            conn = Conexion.conectar();

            conn.setAutoCommit(false);

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1,
                    Integer.parseInt(txtID.getText()));

            pst.executeUpdate();

            conn.commit();

            JOptionPane.showMessageDialog(
                    this,
                    "Employee deleted"
            );

            mostrarEmpleados();

            conn.close();

        } catch (Exception e) {

            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            JOptionPane.showMessageDialog(
                    this,
                    "Error: " + e.getMessage()
            );

        } finally {

            try {
                if (conn != null) {
                    conn.setAutoCommit(true); // restaurar
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed

    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed

    }//GEN-LAST:event_txtSalaryActionPerformed

    private void projectfrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectfrbtnActionPerformed
        ReportProjectsFrame rp
                = new ReportProjectsFrame();

        rp.setVisible(true);


    }//GEN-LAST:event_projectfrbtnActionPerformed

    private void skillsfrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skillsfrbtnActionPerformed
        ReportSkillsFrame rs
                = new ReportSkillsFrame();

        rs.setVisible(true);
    }//GEN-LAST:event_skillsfrbtnActionPerformed

    private void employeetfrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeetfrbtnActionPerformed
        ReportEmployeesFrame re
                = new ReportEmployeesFrame();

        re.setVisible(true);
    }//GEN-LAST:event_employeetfrbtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new project_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JButton clear_btn;
    private javax.swing.JButton delete_button;
    private javax.swing.JButton employeetfrbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel menu_tittle;
    private javax.swing.JButton projectfrbtn;
    private javax.swing.JButton read_btn;
    private javax.swing.JButton search_btn;
    private javax.swing.JButton skillsfrbtn;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JButton update_button;
    // End of variables declaration//GEN-END:variables
}
