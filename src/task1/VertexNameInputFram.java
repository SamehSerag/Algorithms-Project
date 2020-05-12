/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class VertexNameInputFram extends javax.swing.JFrame {

    /**
     * Creates new form GtaphInput
     */
    public VertexNameInputFram() {
        initComponents();
        vn = MainFram.verticesNumber;
        setLocationRelativeTo(null);

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
        vertexNametx = new javax.swing.JTextField();
        addVertex = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Enter name of vertex 1");

        vertexNametx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vertexNametxActionPerformed(evt);
            }
        });

        addVertex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addVertex.setText("Add");
        addVertex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVertexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(vertexNametx, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addVertex, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vertexNametx)
                        .addGap(2, 2, 2))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(42, 42, 42)
                .addComponent(addVertex)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vertexNametxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vertexNametxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vertexNametxActionPerformed

    private void addVertexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVertexActionPerformed
        // TODO add your handling code here:
       if(!graph.vertices.contains(vertexNametx.getText())){
            if(vn != 0){
                    graph.addVertex(vertexNametx.getText());
                    vertexNametx.setText("");
                }

                vn--;
                if(vn == 0){
                    EdgeInputFram EIF = new EdgeInputFram();
                    EIF.setVisible(true);
                    super.setVisible(false);

                }
                counter++;
                jLabel1.setText("Enter name of vertex "+ counter);
                System.out.println( graph.getVertices());
                System.out.println(vn);
       }else{
                JOptionPane.showMessageDialog(this, "You must enter name not exist here\n "+ graph.vertices,  
           "ERROR", JOptionPane.ERROR_MESSAGE); 

        }
       
        
    }//GEN-LAST:event_addVertexActionPerformed

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
            java.util.logging.Logger.getLogger(VertexNameInputFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VertexNameInputFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VertexNameInputFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VertexNameInputFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VertexNameInputFram().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVertex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField vertexNametx;
    // End of variables declaration//GEN-END:variables
    public String vertixName;
    public static graph graph = new graph();
    public int vn;
    public int counter = 1;
}