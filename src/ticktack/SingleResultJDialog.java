/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticktack;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Prashan
 */
public class SingleResultJDialog extends javax.swing.JDialog {

    /**
     * Creates new form SingleResultJDialog
     */
    private String playerName;
    private static DBConnecter dbCon = DBConnecter.getConnection();
    private Statement st;
    private ResultSet rs;
    private int count = 0;
    private int  playerwonstatus;
    private int  playerloststatus;
    private int  playerdrawstatus;

    public SingleResultJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        won1 = new javax.swing.JLabel();
        Lost1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Draw1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        p1Lable = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        P1P = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setText("Result History");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Winnings");

        won1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        won1.setForeground(new java.awt.Color(0, 0, 102));
        won1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        won1.setText("20");

        Lost1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Lost1.setForeground(new java.awt.Color(0, 0, 102));
        Lost1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lost1.setText("20");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Draw");

        Draw1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Draw1.setForeground(new java.awt.Color(0, 0, 102));
        Draw1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Draw1.setText("20");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 16)); // NOI18N
        jLabel3.setText("Player Name");

        p1Lable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p1Lable.setForeground(new java.awt.Color(102, 0, 102));
        p1Lable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1Lable.setText("Prahsan");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Won");

        P1P.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        P1P.setForeground(new java.awt.Color(255, 0, 0));
        P1P.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        P1P.setText("12%");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Lost");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Draw1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Lost1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(p1Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(won1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P1P, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p1Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Lost1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Draw1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(won1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1P)
                    .addComponent(jLabel11))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public void display(){
    
        p1Lable.setText(playerName);
        getResults();
        won1.setText(Integer.toString(playerwonstatus));
        Lost1.setText(Integer.toString(playerloststatus));
        Draw1.setText(Integer.toString(playerdrawstatus));
        double percentage1 = ( ((double)playerwonstatus /(double)(playerwonstatus+ (double)playerloststatus+ (double)playerdrawstatus))*100);
        P1P.setText(String.format( "%.1f %%",percentage1  ));
    }
    public void setPlayerName(String playerName){
    
        this.playerName = playerName;
    }

    public void getResults() {
        try {
            st = dbCon.getCon().createStatement();
            String query1 = "SELECT * FROM `users` WHERE Name = '" + playerName + "' AND Status = 'Won'";
            rs = st.executeQuery(query1);
            //System.out.println("Records from the database");
            count=0;
            while (rs.next()) {
                count++;
            }
            playerwonstatus = count;
            
            String query2 = "SELECT * FROM `users` WHERE Name = '" + playerName + "' AND Status = 'Lost'";
            rs = st.executeQuery(query2);
            count=0;
            while (rs.next()) {
                count++;
            }
            playerloststatus = count;
            
            String query5 = "SELECT * FROM `users` WHERE Name = '" + playerName + "' AND Status = 'Draw'";
            rs = st.executeQuery(query5);
            count=0;
            while (rs.next()) {
                count++;
            }
            playerdrawstatus = count;
            
        } catch (Exception ex) {
            System.out.println("Error " + ex);
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
            java.util.logging.Logger.getLogger(SingleResultJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SingleResultJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SingleResultJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingleResultJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SingleResultJDialog dialog = new SingleResultJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Draw1;
    private javax.swing.JLabel Lost1;
    private javax.swing.JLabel P1P;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel p1Lable;
    private javax.swing.JLabel won1;
    // End of variables declaration//GEN-END:variables
}
