package assignment;

import assignment.Select;
import java.awt.Button;
import java.awt.Label;
import java.util.*;
import javax.swing.JLabel;

public class Options extends javax.swing.JFrame {

    static int hrs;
    static int min;
    static int initPrice;
    static int time;
    public void setTime(int t){
        time = t;
    }
    static Random rand = new Random();
    
    public Options() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        C1 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        D1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        D3 = new javax.swing.JLabel();
        D4 = new javax.swing.JLabel();
        D5 = new javax.swing.JLabel();
        D6 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        C5 = new javax.swing.JLabel();
        C6 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        d4 = new javax.swing.JLabel();
        d6 = new javax.swing.JLabel();
        d5 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 470));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        C1.setText("Blue Air");

        d1.setText("3:30");

        a1.setText("4:50");

        b1.setText("Select");
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });

        D1.setText("1:20");
        D1.setToolTipText("");

        jLabel5.setText("Company");

        jLabel6.setText("Duration");

        jLabel7.setText("Departure");

        jLabel8.setText("Arrival");

        D2.setText("1:20");
        D2.setToolTipText("");

        D3.setText("1:20");
        D3.setToolTipText("");

        D4.setText("1:20");
        D4.setToolTipText("");

        D5.setText("1:20");
        D5.setToolTipText("");

        D6.setText("1:20");
        D6.setToolTipText("");

        C2.setText("Wizz Air");

        C3.setText("Lufthansa");

        C4.setText("Ryanair");

        C5.setText("Ryanair");

        C6.setText("Ryanair");

        d2.setText("3:30");

        d3.setText("3:30");

        d4.setText("3:30");

        d6.setText("3:30");

        d5.setText("3:30");

        a2.setText("4:50");

        a3.setText("4:50");

        a4.setText("4:50");

        a5.setText("4:50");

        a6.setText("4:50");

        b2.setText("Select");
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });

        b3.setText("Select");
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
        });

        b4.setText("Select");
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b4MouseClicked(evt);
            }
        });

        b5.setText("Select");
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b5MouseClicked(evt);
            }
        });

        b6.setText("Select");
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b6MouseClicked(evt);
            }
        });

        jLabel1.setText("Price");

        p1.setText("jLabel2");

        p2.setText("jLabel3");

        p4.setText("jLabel3");

        p3.setText("jLabel3");

        p5.setText("jLabel3");

        p6.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(C3)
                    .addComponent(C4)
                    .addComponent(C5)
                    .addComponent(C6)
                    .addComponent(C2)
                    .addComponent(C1))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(D2)
                            .addComponent(D1)
                            .addComponent(D3)
                            .addComponent(D4)
                            .addComponent(D5)
                            .addComponent(D6))))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(d2)
                            .addComponent(d1)
                            .addComponent(d3)
                            .addComponent(d4)
                            .addComponent(d6)
                            .addComponent(d5))
                        .addGap(15, 15, 15)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(a1)
                    .addComponent(a2)
                    .addComponent(a3)
                    .addComponent(a4)
                    .addComponent(a5)
                    .addComponent(a6))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(p4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(b4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p1)
                            .addComponent(jLabel1)
                            .addComponent(p2)
                            .addComponent(p3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(p6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(p5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b5)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(C3)
                                    .addComponent(D3)
                                    .addComponent(d3)
                                    .addComponent(a3)
                                    .addComponent(p3)
                                    .addComponent(b3))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(C4)
                                    .addComponent(D4)
                                    .addComponent(d4)
                                    .addComponent(a4)
                                    .addComponent(p4)
                                    .addComponent(b4))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(C5)
                                    .addComponent(D5)
                                    .addComponent(d5)
                                    .addComponent(a5)
                                    .addComponent(p5)
                                    .addComponent(b5))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(C6)
                                    .addComponent(D6)
                                    .addComponent(d6)
                                    .addComponent(a6)
                                    .addComponent(p6)
                                    .addComponent(b6)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(C2)
                                .addComponent(D2)
                                .addComponent(d2)
                                .addComponent(a2)
                                .addComponent(p2)
                                .addComponent(b2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C1)
                            .addComponent(D1)
                            .addComponent(d1)
                            .addComponent(a1)
                            .addComponent(p1)
                            .addComponent(b1))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        hrs = time;
        min = time % 60;
        System.out.println(time);
        System.out.println(hrs);
        //Set the duration of the flight
        setLabel(D1,hrs);
        setLabel(D2,hrs);
        setLabel(D3,hrs);
        setLabel(D4,hrs);
        setLabel(D5,hrs);
        setLabel(D6,hrs);
        
        String[] company = {"Ryanair", "Wizz Air", "Blue Air", "Lufthansa"};
        int c; 
        c = rand.nextInt(4);
        C1.setText(company[c]);
        c = rand.nextInt(4);
        C2.setText(company[c]);
        c = rand.nextInt(4);
        C3.setText(company[c]);
        c = rand.nextInt(4);
        C4.setText(company[c]);
        c = rand.nextInt(4);
        C5.setText(company[c]);
        c = rand.nextInt(4);
        C6.setText(company[c]);
        
        setDepartureArrival(D1,d1,a1);
        setDepartureArrival(D2,d2,a2);
        setDepartureArrival(D3,d3,a3);
        setDepartureArrival(D4,d4,a4);
        setDepartureArrival(D5,d5,a5);
        setDepartureArrival(D6,d6,a6);
        
        initPrice = rand.nextInt(100);
        //Set the price of the flight
        setPrice(p1);
        setPrice(p2);
        setPrice(p3);
        setPrice(p4);
        setPrice(p5);
        setPrice(p6);
    }//GEN-LAST:event_formWindowOpened

    //Method for setting the flight price
    private void setPrice(JLabel p){
        int var = rand.nextInt(50);
        int price = initPrice + var;
        p.setText("£"+price);
    }
    //When the user select an option, open an instance of the Details class
    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
      Details det = new Details();
      det.setVisible(true);
      det.setLocationRelativeTo(null);
      this.dispose();
    }//GEN-LAST:event_b1MouseClicked

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
      Details det = new Details();
      det.setVisible(true);
      det.setLocationRelativeTo(null);
      this.dispose();
    }//GEN-LAST:event_b2MouseClicked

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
      Details det = new Details();
      det.setVisible(true);
      det.setLocationRelativeTo(null);
      this.dispose();
    }//GEN-LAST:event_b3MouseClicked

    private void b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseClicked
      Details det = new Details();
      det.setVisible(true);
      det.setLocationRelativeTo(null);
      this.dispose();
    }//GEN-LAST:event_b4MouseClicked

    private void b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseClicked
      Details det = new Details();
      det.setVisible(true);
      det.setLocationRelativeTo(null);
      this.dispose();
    }//GEN-LAST:event_b5MouseClicked

    private void b6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseClicked
      Details det = new Details();
      det.setVisible(true);
      det.setLocationRelativeTo(null);
      this.dispose();
    }//GEN-LAST:event_b6MouseClicked

    public void setLabel(JLabel l, int i){
        int r;
        r = rand.nextInt(60);
        if(r<10){
            l.setText(i + ":0" + r);
        }
        else{
        l.setText(i + ":" + r);
        }
    }
    //Calculate and set the departure and arrival for the flight
    public void setDepartureArrival(JLabel D, JLabel d, JLabel a){
        int h = rand.nextInt(25);
        int m = rand.nextInt(60);
        
        String s = D.getText();
        int k = Integer.parseInt(s.substring(0,1));
        int l = Integer.parseInt(s.substring(2,4));
        
        
        if(h<10&&m<10){
            d.setText("0"+h+":0"+m);
        }
        else if(h<10){
            d.setText("0"+h+":"+m);
        }
        else if(m<10){
           d.setText(h+":0"+m); 
        }
        else{
            d.setText(h+":"+m);
        }
        h+=k;
        m+=l;
        if(m>=60){
            h++;
            m-=60;
        }
        if(h<10&&m<10){
            a.setText("0"+h+":0"+m);
        }
        else if(h<10){
            a.setText("0"+h+":"+m);
        }
        else if(m<10){
            a.setText(h+":0"+m); 
        }
        else{
            a.setText(h+":"+m);
        }
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel C4;
    private javax.swing.JLabel C5;
    private javax.swing.JLabel C6;
    private javax.swing.JLabel D1;
    private javax.swing.JLabel D2;
    private javax.swing.JLabel D3;
    private javax.swing.JLabel D4;
    private javax.swing.JLabel D5;
    private javax.swing.JLabel D6;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel d3;
    private javax.swing.JLabel d4;
    private javax.swing.JLabel d5;
    private javax.swing.JLabel d6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    // End of variables declaration//GEN-END:variables
}
