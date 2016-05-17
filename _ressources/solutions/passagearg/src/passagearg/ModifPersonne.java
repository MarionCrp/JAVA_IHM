/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passagearg;

/**
 *
 * @author mooneswar.ramburrun
 */
public class ModifPersonne extends javax.swing.JDialog {

   /**
    * 
    * @param parent  frame d'accueil
    * @param modal   il faut valider entièrement la fenêtre avant de passer sur une autre fenêtre
    * @param p       une personne en E/S
    * @param listeSports une liste de sports passée en entrée
    */
    public ModifPersonne(java.awt.Frame parent,
            boolean modal,
            Personne p,  // en E/S
            String [] listeSports
    ) {
        super(parent, modal);
        initComponents();
        ModifPersonne.p = p;
        textNom.setText(p.getNom());
        for( String sport : listeSports){
            comboSports.addItem(sport);
        }
        comboSports.setSelectedIndex(0);
        textNom.selectAll();
        textNom.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textNom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboSports = new javax.swing.JComboBox();
        valider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        textNom.setBackground(new java.awt.Color(153, 204, 255));
        textNom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Nom :");

        comboSports.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        valider.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valider.setText("valider");
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valider(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboSports, 0, 128, Short.MAX_VALUE)
                    .addComponent(textNom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(valider)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(valider))
                .addGap(34, 34, 34)
                .addComponent(comboSports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valider(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valider
       p.setNom(textNom.getText());
       p.setSport(comboSports.getSelectedItem().toString());
       setVisible(false);  // ou dispose() pour une seule apparition de la boîte
                           //  de dialogue
    }//GEN-LAST:event_valider

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboSports;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField textNom;
    private javax.swing.JButton valider;
    // End of variables declaration//GEN-END:variables
    static Personne p;
}
