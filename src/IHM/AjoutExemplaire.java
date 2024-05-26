package IHM;

import Modele.Exemplaire;
import Modele.Oeuvre;
import Utility.BibalExceptions;
import Utility.DBConnection;
import Utility.ModelTableau;
import control.ExemplaireControl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static IHM.GestionExemplaires.getNbExemplaireLabelValue;
import static IHM.GestionExemplaires.setNbExemplaireLabelValue;
import static Utility.Utility.*;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showMessageDialog;


public class AjoutExemplaire extends JFrame {


      public AjoutExemplaire(Frame parent, boolean modal) {
     
        initComponents();
        setIdentifiant();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bibliotheque_icone.png")));
    }

    public AjoutExemplaire(Frame parent, boolean modal, Oeuvre oeuvre) {
        this(parent, modal);
        this.oeuvre = oeuvre;
    }

    private AjoutExemplaire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jPanel2 = new JPanel();
        identifiantLabel = new JLabel();
        etatExemplaireLabel = new JLabel();
        identifiantField = new JTextField();
        etatExemplaireCombo = new JComboBox<>();
        annulerBouton = new JButton();
        ajouterBouton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new Color(255, 255, 255));

        jLabel1.setFont(new Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new Color(153, 51, 0));
        jLabel1.setText("Ajout Exemplaire");

        jPanel2.setBackground(new Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        identifiantLabel.setBackground(new Color(108, 92, 92));
        identifiantLabel.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        identifiantLabel.setForeground(new Color(108, 92, 92));
        identifiantLabel.setText("Identifiant");

        etatExemplaireLabel.setBackground(new Color(108, 92, 92));
        etatExemplaireLabel.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        etatExemplaireLabel.setForeground(new Color(108, 92, 92));
        etatExemplaireLabel.setText("Etat");

        etatExemplaireCombo.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        etatExemplaireCombo.setModel(new DefaultComboBoxModel<>(new String[] { "Neuf", "Bon", "Vieux" }));

        annulerBouton.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        annulerBouton.setIcon(new ImageIcon(getClass().getResource("/images/Apps-Dialog-Close-icon.png"))); // NOI18N
        annulerBouton.setText("Annuler");
        annulerBouton.setHorizontalTextPosition(SwingConstants.LEFT);
        annulerBouton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                annulerBoutonActionPerformed(evt);
            }
        });

        ajouterBouton.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        ajouterBouton.setIcon(new ImageIcon(getClass().getResource("/images/ajouter.png"))); // NOI18N
        ajouterBouton.setText("Ajouter");
        ajouterBouton.setHorizontalTextPosition(SwingConstants.LEFT);
        ajouterBouton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ajouterBoutonActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(annulerBouton)
                .addGap(35, 35, 35)
                .addComponent(ajouterBouton)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(identifiantLabel)
                    .addComponent(etatExemplaireLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(identifiantField)
                    .addComponent(etatExemplaireCombo, 0, 113, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(identifiantLabel)
                    .addComponent(identifiantField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(etatExemplaireLabel)
                    .addComponent(etatExemplaireCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(annulerBouton)
                    .addComponent(ajouterBouton))
                .addGap(19, 19, 19))
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajouterBoutonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_ajouterBoutonActionPerformed
        // TODO add your handling code here:
          try {
            Exemplaire exemplaire = getExempalireInfos();
            if (null != exemplaire) {
                ExemplaireControl.ajouter(oeuvre, exemplaire.getEtat());
                ((ModelTableau) GestionExemplaires.tableExemplaires.getModel())
                        .addRow(new Object[]{exemplaire.getId(), exemplaire.getEtat()});
                setNbExemplaireLabelValue((parseInt(getNbExemplaireLabelValue()) + 1) + "");
                showMessageSucces("Exemplaire ajouté avec succès");
                setIdentifiant();
            }
        } catch (BibalExceptions e) {
            System.out.println("IHM.AjoutExemplaire.ajouterBoutonActionPerformed()" + e.getMessage());
        }
    }//GEN-LAST:event_ajouterBoutonActionPerformed

    private void annulerBoutonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_annulerBoutonActionPerformed
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_annulerBoutonActionPerformed
 public Oeuvre getOeuvre() {
        return oeuvre;
    }

  


    private Exemplaire getExempalireInfos() {
        int id = parseInt(identifiantField.getText());
        String etatExemplaire = etatExemplaireCombo.getSelectedItem().toString();

        return new Exemplaire(id, etatExemplaire);
    }


    private void setIdentifiant() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            final String SQL_SELECT_ID = "SELECT id FROM exemplaire ORDER BY id DESC LIMIT 1";
            preparedStatement = initialiseRequetePreparee(DBConnection.getConnection(),
                    SQL_SELECT_ID, new Object[0]);
            resultSet = preparedStatement.executeQuery();
            int identifiant = 1;
            if (resultSet.first()) {
                identifiant = resultSet.getInt("id");
            }
            identifiantField.setText((identifiant + 1) + "");
        } catch (SQLException | BibalExceptions e) {
            showMessageDialog(null, "Erreurs d'accès à la base de données",
                    "Erreurs", JOptionPane.ERROR_MESSAGE);
        } finally {
            closeStatementResultSet(preparedStatement, resultSet);
        }
    }

    public void setOeuvre(Oeuvre oeuvre) {
        this.oeuvre = oeuvre;
    }

    private Oeuvre oeuvre = new Oeuvre();


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AjoutExemplaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutExemplaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutExemplaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutExemplaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutExemplaire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton ajouterBouton;
    private JButton annulerBouton;
    private JComboBox<String> etatExemplaireCombo;
    private JLabel etatExemplaireLabel;
    private JTextField identifiantField;
    private JLabel identifiantLabel;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
