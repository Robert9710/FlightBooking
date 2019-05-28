package assignment;

import java.sql.*;
import java.util.*;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;

public class Select extends javax.swing.JFrame {

    static List<String> loc = new ArrayList();
    static List<String> airp = new ArrayList();
    static List<Integer> lat = new ArrayList();
    static List<Integer> log = new ArrayList();
    int time;
    public Select() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        dept = new javax.swing.JLabel();
        dest = new javax.swing.JLabel();
        Dep = new javax.swing.JLabel();
        retField = new javax.swing.JLabel();
        retD = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        retM = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        retY = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        from = new javax.swing.JComboBox<>();
        to = new javax.swing.JComboBox<>();
        one = new javax.swing.JRadioButton();
        returner = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 370));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        dept.setText("From");

        dest.setText("To");

        Dep.setText("Departure");

        retField.setText("Return");

        retD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        retM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018" }));

        retY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018" }));

        jButton1.setText("Search");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        from.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "London Luton", "London Stansted", "London Heathrow", "London Gatwick", "Paris Charles de Gaulle", "Paris Orly", "Paris Beauvais", "Paris Le Touquet", "Bruxelles International", "Milan Malpensa", "Milan Bergamo", "Milan Linate" }));

        to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "London Luton", "London Stansted", "London Heathrow", "London Gatwick", "Paris Charles de Gaulle", "Paris Orly", "Paris Beauvais", "Paris Le Touquet", "Bruxelles International", "Milan Malpensa", "Milan Bergamo", "Milan Linate" }));

        bg.add(one);
        one.setText("One way");
        one.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                oneMouseReleased(evt);
            }
        });

        bg.add(returner);
        returner.setText("Return");
        returner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                returnerMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(returner)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(one)
                        .addGap(107, 107, 107))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(retField)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(retD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Dep)
                                        .addGap(28, 28, 28)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(retM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(retY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(67, 67, 67)))
                        .addGap(0, 110, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dest)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dept)
                                .addGap(62, 62, 62)
                                .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(126, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one)
                    .addComponent(returner))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dept)
                    .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dest)
                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dep)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retField)
                    .addComponent(retD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jButton1)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnerMouseReleased

        if(returner.isEnabled()){
            retField.setVisible(true);
            retD.setVisible(true);
            retM.setVisible(true);
            retY.setVisible(true);
        }
    }//GEN-LAST:event_returnerMouseReleased

    private void oneMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneMouseReleased

        if(one.isEnabled()){
            retField.setVisible(false);
            retD.setVisible(false);
            retM.setVisible(false);
            retY.setVisible(false);
        }
    }//GEN-LAST:event_oneMouseReleased

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        int t1=0, t2=0, j=0;
        //Get the deaprture and the destination
        String f = (String) from.getSelectedItem();
        String t = (String) to.getSelectedItem();
        String s;
        //Algorithm to calculate the duration of the flight
        for(int i = 0;i < loc.size();i++){
            if((loc.get(i)+" "+airp.get(i)).equals(f)){
                t1 = lat.get(i);
            }
            if((loc.get(i)+" "+airp.get(i)).equals(t)){
                t2 = lat.get(i);
            }
            if(t1>t2){
                time = t1 -t2;
            }
            else{
                time = t2 -t1;
            }
        }
        //Get the departure city
        for(int i=0;i<f.length();i++){
            if(f.substring(i,i+1).equals(" ")){
                j=i;
                break;
            }
        }
        f = f.substring(0,j+1);
        
        //Get the destination
        for(int i=0;i<t.length();i++){
            if(t.substring(i,i+1).equals(" ")){
                j=i;
                break;
            }
        }
        t = t.substring(0,j+1);
        
        //If the departure city and the destination are the same, display a message to the user
        if(f.equals(t)){
            JOptionPane.showMessageDialog(this, "Flights to and from the same city are not allowed!");
        }
        
        //Ask user to specify wether hw wants a one way ticket or a return ticket
        else if(bg.getSelection()==null){
            JOptionPane.showMessageDialog(this, "Please check one option!");
        }
        
        //If all the details are specified, open an instance of the Opations class
        else{
        Options opt = new Options();
        opt.setVisible(true);
        opt.setTime(time);
        opt.setLocationRelativeTo(null);
        this.dispose();
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try{
            //Connect to the databse
                    conn = DriverManager.getConnection("jdbc:derby://localhost:1527/DC","Robert","turtle98");
                    pst = conn.prepareStatement("Select * from Flights");
                    rs = pst.executeQuery();
                    while(rs.next()){
                        //Get the airports, citites and their geographic coordinates
                        loc.add(rs.getString("Places"));
                        airp.add(rs.getString("Airport"));
                        lat.add(rs.getInt("Latitude"));
                        log.add(rs.getInt("Longitude")); 
                    }
                }catch(SQLException x){
                    System.out.println(x);
                }
                
    }//GEN-LAST:event_formWindowOpened

    
       static Connection conn;
       static PreparedStatement pst;
       static ResultSet rs;
       
       
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
            java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
       
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Select().setVisible(true);
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dep;
    private javax.swing.ButtonGroup bg;
    private javax.swing.JLabel dept;
    private javax.swing.JLabel dest;
    private javax.swing.JComboBox<String> from;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JRadioButton one;
    private javax.swing.JComboBox<String> retD;
    private javax.swing.JLabel retField;
    private javax.swing.JComboBox<String> retM;
    private javax.swing.JComboBox<String> retY;
    private javax.swing.JRadioButton returner;
    private javax.swing.JComboBox<String> to;
    // End of variables declaration//GEN-END:variables
}
