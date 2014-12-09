/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticktack;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Suchira
 */
public class SinglePlayerJFrame extends javax.swing.JFrame {

    /**
     * Creates new form testJFrame
     */
    private Game game;
    private Person player1;
    private Computer player2;
    private boolean finished;
    private String thePlayer;
    History hs;
    private Table tabl;

    @SuppressWarnings("empty-statement")
    public SinglePlayerJFrame(Person player1, Computer player2,Table tabl) {
        initComponents();
        hs= new History();
        this.tabl = tabl;
        this.setLocationRelativeTo(null);
        this.player1 = player1;
        this.player2 = player2;
        game = new Game(player1, player2);
        player1.setOpponent(player2);
        player2.setOpponent(player1);
        buttons[0][0] = Button1;
        buttons[0][1] = Button2;
        buttons[0][2] = Button3;
        buttons[1][0] = Button4;
        buttons[1][1] = Button5;
        buttons[1][2] = Button6;
        buttons[2][0] = Button7;
        buttons[2][1] = Button8;
        buttons[2][2] = Button9;
        finished = false;
    }

    SinglePlayerJFrame(Person player1, Person player2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton9 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton9.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Single Player");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        getContentPane().add(Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 87, 71));

        Button2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });
        getContentPane().add(Button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 87, 71));

        Button3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });
        getContentPane().add(Button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 87, 71));

        Button4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });
        getContentPane().add(Button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 87, 71));

        Button5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });
        getContentPane().add(Button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 87, 71));

        Button6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });
        getContentPane().add(Button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 87, 71));

        Button7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });
        getContentPane().add(Button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 87, 71));

        Button8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });
        getContentPane().add(Button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 87, 71));

        Button9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });
        getContentPane().add(Button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 87, 71));

        jButton12.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jButton12.setText("Results");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 121, 36));

        resetButton.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 121, 30));

        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 121, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/main.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        // TODO add your handling code here:
        if (!tabl.isTheCellClicked(0, 0) && !finished)
        {
            play(0, 0);
            tabl.setTheCellClicked(0, 0);
        }

    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        // TODO add your handling code here:
        if (!tabl.isTheCellClicked(0, 1) && !finished)
        {
            play(0, 1);
            tabl.setTheCellClicked(0, 1);
        }
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        // TODO add your handling code here:
        if (!tabl.isTheCellClicked(0, 2) && !finished)
        {
            play(0, 2);
            tabl.setTheCellClicked(0, 2);
        }
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        // TODO add your handling code here:
        if (!tabl.isTheCellClicked(1, 0) && !finished)
        {
            play(1, 0);
            tabl.setTheCellClicked(1, 0);
        }
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        // TODO add your handling code here:
        if (!tabl.isTheCellClicked(1, 1) && !finished)
        {
            play(1, 1);
            tabl.setTheCellClicked(1, 1);
        }
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        if (!tabl.isTheCellClicked(1, 2) && !finished)
        {
            play(1, 2);
            tabl.setTheCellClicked(1, 2);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        // TODO add your handling code here:
        if (!tabl.isTheCellClicked(2, 0) && !finished)
        {
            play(2, 0);
            tabl.setTheCellClicked(2, 0);
        }
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        // TODO add your handling code here:
         if (!tabl.isTheCellClicked(2, 1) && !finished)
        {
            play(2, 1);
            tabl.setTheCellClicked(2, 1);
        }
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        // TODO add your handling code here:
        if (!tabl.isTheCellClicked(2, 2) && !finished)
        {
            play(2, 2);
            tabl.setTheCellClicked(2, 2);
        }
    }//GEN-LAST:event_Button9ActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed

        this.removeAll();
        SinglePlayerJFrame newOne = new SinglePlayerJFrame(this.player1, this.player2,new Table());
        newOne.setThePlayer(thePlayer);
        newOne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ThemainJFrame ba = new ThemainJFrame(this, true);
        ba.setLocationRelativeTo(null);
        ba.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        SingleResultJDialog n = new SingleResultJDialog(this, true);
        n.setLocation(200, 200);
        n.setPlayerName(thePlayer);
        n.display();
        n.setVisible(true);
        
    }//GEN-LAST:event_jButton12ActionPerformed

    public int play(int x, int y) {
        ImageIcon icon = new ImageIcon("C:\\Users\\Prashan\\Desktop\\TikTacToe\\src\\image\\tiktak.jpeg");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\Prashan\\Desktop\\TikTacToe\\src\\image\\2.jpeg");
        player1.setX(x);
        player1.setY(y);
        player1.play(game.getGameTable());
        buttons[x][y].setIcon(icon);
        
        if (game.isGameOver() == player1.getUserSymbol()) {
            
            JOptionPane.showMessageDialog(new JDialog(), "Game WIN by " + player1.getName());
                    hs.setPlayer1St("Won");
                    hs.setPlayer2St("Lost");
                    hs.setPlayer1(thePlayer);
                    hs.setPlayer2("Computer");
                    hs.setType(1);
                    hs.saveData(thePlayer);
            
            finished = true;
            return 0;
        }
        int[] choosed = player2.chose(game.getGameTable());
        buttons[choosed[0]][choosed[1]].setIcon(icon2);
        if (game.isGameOver() == player2.getUserSymbol()) {
            
            JOptionPane.showMessageDialog(new JDialog(), "Game WIN by " + player2.getName());
                    hs.setPlayer1St("Lost");
                    hs.setPlayer2St("Won");
                    hs.setPlayer1(thePlayer);
                    hs.setPlayer2("Computer");
                    hs.setType(1);
                    hs.saveData(thePlayer);
            finished = true;
            return 0;
        }
        if (game.isGameOver() == -1) {
           
            JOptionPane.showMessageDialog(new JDialog(), "Game is DRAW");
                    hs.setPlayer1St("Draw");
                    hs.setPlayer2St("Draw");
                    hs.setPlayer1(thePlayer);
                    hs.setPlayer2("Computer");
                    hs.setType(1);
                    hs.saveData(thePlayer);
            finished = true;
            return 0;
        }

        return -1;
    }

    public String getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(String thePlayer) {
        this.thePlayer = thePlayer;
    }

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
            java.util.logging.Logger.getLogger(SinglePlayerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SinglePlayerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SinglePlayerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SinglePlayerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new MultiPlayerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables
    JButton[][] buttons = new JButton[3][3];

}
