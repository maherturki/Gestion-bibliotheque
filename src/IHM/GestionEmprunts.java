package IHM;


import Modele.Usager;
import Utility.BibalExceptions;
import Utility.DBConnection;
import control.EmpruntControl;
import control.UsagerControl;
import interfaces.UsagerInterface;

import javax.swing.*;
import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static Utility.Utility.*;
import static java.lang.Integer.parseInt;



public class GestionEmprunts extends JFrame {


    public GestionEmprunts(java.awt.Frame parent, boolean modal) {
        initComponents();
        setIdentifiant();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bibliotheque_icone.png")));
    }
      public GestionEmprunts(java.awt.Frame parent, boolean modal, String titre) {
        this(parent, modal);
        this.titre = titre;
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new JButton();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jPanel2 = new JPanel();
        identifiantLabel = new JLabel();
        nomUsagerLabel = new JLabel();
        identifiantUsagerCombo = new JComboBox<>();
        annulerBouton = new JButton();
        validerBouton = new JButton();
        nomLabel = new JLabel();
        jLabel2 = new JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("Choisir Usager");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        identifiantLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        identifiantLabel.setForeground(new java.awt.Color(108, 92, 92));
        identifiantLabel.setText("Identifiant");

        nomUsagerLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nomUsagerLabel.setText("-");

        identifiantUsagerCombo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        identifiantUsagerCombo.setModel(new DefaultComboBoxModel<>(new String[] { "Choisir Identifiant" }));
        identifiantUsagerCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identifiantUsagerComboActionPerformed(evt);
            }
        });

        annulerBouton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        annulerBouton.setIcon(new ImageIcon(getClass().getResource("/images/Apps-Dialog-Close-icon.png"))); // NOI18N
        annulerBouton.setText("Annuler");
        annulerBouton.setHorizontalTextPosition(SwingConstants.LEFT);
        annulerBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerBoutonActionPerformed(evt);
            }
        });

        validerBouton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        validerBouton.setIcon(new ImageIcon(getClass().getResource("/images/Accept-icon.png"))); // NOI18N
        validerBouton.setText("Valider ");
        validerBouton.setHorizontalTextPosition(SwingConstants.LEFT);
        validerBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprunter(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(108, 92, 92));
        jLabel2.setText("Nom usager ");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(identifiantLabel)
                    .addComponent(jLabel2))
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nomUsagerLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomLabel, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
                    .addComponent(identifiantUsagerCombo, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(annulerBouton)
                .addGap(44, 44, 44)
                .addComponent(validerBouton)
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(identifiantLabel)
                    .addComponent(identifiantUsagerCombo, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(nomUsagerLabel)
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(nomLabel, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(validerBouton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addComponent(annulerBouton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void identifiantUsagerComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identifiantUsagerComboActionPerformed
        // TODO add your handling code here:

        UsagerInterface usagerInterface = new Usager();
        try {
            int usagerId = getUsagerID();
            if (usagerId != -1) {
                Usager usager = UsagerControl.findById(usagerInterface ,usagerId);
                if (null != usager) {
                    String nom = usager.getNom() + " " + usager.getPrenom();
                    nomUsagerLabel.setText(nom);
                }
            }
        } catch (BibalExceptions e) {
            System.out.println("IHM.Emprunter.identifiantUsagerComboActionPerformed()");
        }
    }//GEN-LAST:event_identifiantUsagerComboActionPerformed

    private void annulerBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerBoutonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_annulerBoutonActionPerformed

    private void emprunter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprunter
        // TODO add your handling code here:
         try {
            int usagerId = getUsagerID();
            if (usagerId != -1) {
                EmpruntControl.emprunter(usagerId, titre);
                showMessageSucces("Emprunt enregistré");
            } else {
                showMessageSucces("Veuillez choisir un identifiant");
            }
        } catch (BibalExceptions e) {
            System.out.println("IHM.Emprunter.validerBoutonActionPerformed()");
        }
    }//GEN-LAST:event_emprunter
private int getUsagerID() {
        String id = identifiantUsagerCombo.getSelectedItem().toString();
        if (!id.equals("Choisir identifiant")) {
            return parseInt(id);
        }
        return -1;
    }

    private void setIdentifiant() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            final String SQL_SELECT_ID = "SELECT id FROM usager ";
            preparedStatement = initialiseRequetePreparee(DBConnection.getConnection(),
                    SQL_SELECT_ID, new Object[0]);
            resultSet = preparedStatement.executeQuery();
            int identifiant;
            while (resultSet.next()) {
                identifiant = resultSet.getInt("id");
                identifiantUsagerCombo.addItem(Integer.toString(identifiant));
            }
        } catch (SQLException | BibalExceptions e) {
            JOptionPane.showMessageDialog(null, "Erreurs d'accées a  la base de données",
                    "Erreurs", JOptionPane.ERROR_MESSAGE);
        } finally {
            closeStatementResultSet(preparedStatement, resultSet);
        }
    }

    private String titre;                 

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton annulerBouton;
    private JLabel identifiantLabel;
    private JComboBox<String> identifiantUsagerCombo;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JLabel nomLabel;
    private JLabel nomUsagerLabel;
    private JButton validerBouton;
    // End of variables declaration//GEN-END:variables
}
