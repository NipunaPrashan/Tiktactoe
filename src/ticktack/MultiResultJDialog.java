
package ticktack;

import java.sql.ResultSet;
import java.sql.Statement;

public class MultiResultJDialog extends javax.swing.JDialog {

    /**
     * Creates new form MultiResult
     */
    private String player1Name;
    private String player2Name;
    private static DBConnecter dbCon = DBConnecter.getConnection();
    private Statement st;
    private ResultSet rs;
    private int count = 0;
    private int  player1wonstatus;
    private int  player1loststatus;
    private int  player1drawstatus;
    private int  player2wonstatus;
    private int  player2loststatus;
    private int  player2drawstatus;
    
    public MultiResultJDialog(java.awt.Frame parent, boolean modal) {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        p2Lable = new javax.swing.JLabel();
        p1Lable = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        won1 = new javax.swing.JLabel();
        Lost1 = new javax.swing.JLabel();
        Lost2 = new javax.swing.JLabel();
        won2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Draw1 = new javax.swing.JLabel();
        Draw2 = new javax.swing.JLabel();
        P1P = new javax.swing.JLabel();
        P2P = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(485, 304));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setText("Result History");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 16)); // NOI18N
        jLabel2.setText("Player 2");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 16)); // NOI18N
        jLabel3.setText("Player 1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        p2Lable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p2Lable.setForeground(new java.awt.Color(102, 0, 102));
        p2Lable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2Lable.setText("Siri");

        p1Lable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p1Lable.setForeground(new java.awt.Color(102, 0, 102));
        p1Lable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1Lable.setText("Prahsan");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Lost");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Won");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Lost");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Won");

        won1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        won1.setForeground(new java.awt.Color(0, 0, 102));
        won1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        won1.setText("20");

        Lost1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Lost1.setForeground(new java.awt.Color(0, 0, 102));
        Lost1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lost1.setText("20");

        Lost2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Lost2.setForeground(new java.awt.Color(0, 0, 102));
        Lost2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lost2.setText("20");

        won2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        won2.setForeground(new java.awt.Color(0, 0, 102));
        won2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        won2.setText("20");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Draw");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Draw");

        Draw1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Draw1.setForeground(new java.awt.Color(0, 0, 102));
        Draw1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Draw1.setText("20");

        Draw2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Draw2.setForeground(new java.awt.Color(0, 0, 102));
        Draw2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Draw2.setText("20");

        P1P.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        P1P.setForeground(new java.awt.Color(255, 0, 0));
        P1P.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        P1P.setText("12%");

        P2P.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        P2P.setForeground(new java.awt.Color(255, 0, 0));
        P2P.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        P2P.setText("12%");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Winnings");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Winnings");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(152, 152, 152))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P1P)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(198, 198, 198)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Draw1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Lost1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(won1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(153, 153, 153)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lost2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(won2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Draw2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(P2P)
                                .addGap(0, 9, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(p1Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p2Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(364, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p2Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(won1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(won2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lost2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Draw2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Lost1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Draw1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(P1P)
                    .addComponent(jLabel12)
                    .addComponent(P2P))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(203, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void display(){
    
        p1Lable.setText(player1Name);
        p2Lable.setText(player2Name);
        getResults();
        won1.setText(Integer.toString(player1wonstatus));
        Lost1.setText(Integer.toString(player1loststatus));
        Draw1.setText(Integer.toString(player1drawstatus));
        won2.setText(Integer.toString(player2wonstatus));
        Lost2.setText(Integer.toString(player2loststatus));
        Draw2.setText(Integer.toString(player2drawstatus));
        double percentage1 = ( ((double)player1wonstatus /(double)(player1wonstatus+ (double)player1loststatus+ (double)player1drawstatus))*100);
        P1P.setText(String.format( "%.1f %%",percentage1  ));
        double percentage2 = (( (double)player2wonstatus /(double)(player2wonstatus+ (double)player2loststatus+ (double)player2drawstatus))*100);
        //P2P.setText(percentage2+ "%");
        P2P.setText(String.format( "%.1f %%",percentage2  ));
        //String.format( "%.2f", dub )
    }
    
    public void getResults(){
    
        try {
            st = dbCon.getCon().createStatement();
            String query1 = "SELECT * FROM `users` WHERE Name = '" + player1Name + "' AND Status = 'Won'";
            rs = st.executeQuery(query1);
            //System.out.println("Records from the database");
            count=0;
            while (rs.next()) {
                count++;
            }
            player1wonstatus = count;
            
            String query2 = "SELECT * FROM `users` WHERE Name = '" + player1Name + "' AND Status = 'Lost'";
            rs = st.executeQuery(query2);
            count=0;
            while (rs.next()) {
                count++;
            }
            player1loststatus = count;
            
            String query5 = "SELECT * FROM `users` WHERE Name = '" + player1Name + "' AND Status = 'Draw'";
            rs = st.executeQuery(query5);
            count=0;
            while (rs.next()) {
                count++;
            }
            player1drawstatus = count;
            
            st = dbCon.getCon().createStatement();
            String query3 = "SELECT * FROM `users` WHERE Name = '" + player2Name + "' AND Status = 'Won'";
            rs = st.executeQuery(query3);
            //System.out.println("Records from the database");
            count=0;
            while (rs.next()) {
                count++;
            }
            player2wonstatus = count;
            
            String query4 = "SELECT * FROM `users` WHERE Name = '" + player2Name + "' AND Status = 'Lost'";
            rs = st.executeQuery(query4);
            count=0;
            while (rs.next()) {
                count++;
            }
            player2loststatus = count;
            
            String query6 = "SELECT * FROM `users` WHERE Name = '" + player2Name + "' AND Status = 'Draw'";
            rs = st.executeQuery(query6);
            count=0;
            while (rs.next()) {
                count++;
            }
            player2drawstatus = count;
            
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
    }
    
    
    
    public String getPlayer1Name() {
        return player1Name;
    }

    public void setPlayer1Name(String player1Name) {
        this.player1Name = player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    /**
     * @param args the command line arguments
     */
    public void setPlayer2Name(String player2Name) {    
        this.player2Name = player2Name;
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
            java.util.logging.Logger.getLogger(MultiResultJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultiResultJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultiResultJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultiResultJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MultiResultJDialog dialog = new MultiResultJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel Draw2;
    private javax.swing.JLabel Lost1;
    private javax.swing.JLabel Lost2;
    private javax.swing.JLabel P1P;
    private javax.swing.JLabel P2P;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel p1Lable;
    private javax.swing.JLabel p2Lable;
    private javax.swing.JLabel won1;
    private javax.swing.JLabel won2;
    // End of variables declaration//GEN-END:variables
}
