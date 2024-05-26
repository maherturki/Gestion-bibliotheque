package IHM;

import Modele.Livre;
import Modele.Magazine;
import Modele.Oeuvre;
import Utility.BibalExceptions;
import Utility.ModelTableau;
import control.OeuvreControl;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import static Utility.Utility.showMessageSucces;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showConfirmDialog;

public class GestionOeuvresExemplaires extends JFrame {


    public GestionOeuvresExemplaires() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setResizable(false);
      
        tableListeOeuvre.setModel(new ModelTableau(new Object[0][0],
                new String[]{"ID", "Titre", "Auteur", "Catégorie", "Type", "Exemplaires", "Réservations"}));
        tableListeOeuvre.setRowHeight(30);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bibliotheque_icone.png")));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new JOptionPane();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jPanel2 = new JPanel();
        ajouterBouton = new JButton();
        afficherButton = new JButton();
        modifierBouton = new JButton();
        supprimerButton = new JButton();
        exemplaireButton = new JButton();
        retourButton = new JButton();
        jPanel3 = new JPanel();
        jLabel2 = new JLabel();
        RecherchCombo = new JComboBox<>();
        RecherchField = new JTextField();
        RecherchBouton = new JButton();
        panListeOeuvre = new JPanel();
        jScrollPane1 = new JScrollPane();
        tableListeOeuvre = new JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(255, 255, 255));

        jLabel1.setBackground(new Color(255, 255, 255));
        jLabel1.setFont(new Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new Color(153, 51, 0));
        jLabel1.setText("Gestion des Oeuvres et Exemplaires ");

        jPanel2.setBackground(new Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 255)));

        ajouterBouton.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        ajouterBouton.setIcon(new ImageIcon(getClass().getResource("/images/ajouter.png"))); // NOI18N
        ajouterBouton.setText("Ajouter");
        ajouterBouton.setHorizontalTextPosition(SwingConstants.LEFT);
        ajouterBouton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ajouterBoutonActionPerformed(evt);
            }
        });

        afficherButton.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        afficherButton.setIcon(new ImageIcon(getClass().getResource("/images/Programming-Show-Property-icon.png"))); // NOI18N
        afficherButton.setText("Afficher");
        afficherButton.setHorizontalTextPosition(SwingConstants.LEFT);
        afficherButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                afficherButtonActionPerformed(evt);
            }
        });

        modifierBouton.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        modifierBouton.setIcon(new ImageIcon(getClass().getResource("/images/modifier.png"))); // NOI18N
        modifierBouton.setText("Modifier ");
        modifierBouton.setEnabled(false);
        modifierBouton.setHorizontalTextPosition(SwingConstants.LEFT);
        modifierBouton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                modifierBoutonActionPerformed(evt);
            }
        });

        supprimerButton.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        supprimerButton.setIcon(new ImageIcon(getClass().getResource("/images/supprimer.png"))); // NOI18N
        supprimerButton.setText("Supprimer");
        supprimerButton.setEnabled(false);
        supprimerButton.setHorizontalTextPosition(SwingConstants.LEFT);
        supprimerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                supprimerButtonActionPerformed(evt);
            }
        });

        exemplaireButton.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        exemplaireButton.setIcon(new ImageIcon(getClass().getResource("/images/Book-icon.png"))); // NOI18N
        exemplaireButton.setText("Exemplaire");
        exemplaireButton.setEnabled(false);
        exemplaireButton.setHorizontalTextPosition(SwingConstants.LEFT);
        exemplaireButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exemplaireButtonActionPerformed(evt);
            }
        });

        retourButton.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        retourButton.setIcon(new ImageIcon(getClass().getResource("/images/Go-back-icon.png"))); // NOI18N
        retourButton.setText("Retour");
        retourButton.setHorizontalTextPosition(SwingConstants.LEFT);
        retourButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                retourButtonActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(exemplaireButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supprimerButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ajouterBouton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(afficherButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifierBouton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(retourButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(ajouterBouton)
                .addGap(39, 39, 39)
                .addComponent(afficherButton)
                .addGap(40, 40, 40)
                .addComponent(modifierBouton)
                .addGap(39, 39, 39)
                .addComponent(supprimerButton)
                .addGap(31, 31, 31)
                .addComponent(exemplaireButton)
                .addGap(30, 30, 30)
                .addComponent(retourButton)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new Color(255, 255, 255));
        jPanel3.setBorder(BorderFactory.createTitledBorder(null, "Recherche", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 1, 12), new Color(0, 0, 102))); // NOI18N
        jPanel3.setForeground(new Color(204, 204, 255));

        jLabel2.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new Color(108, 92, 92));
        jLabel2.setText("Rechercher par");

        RecherchCombo.setModel(new DefaultComboBoxModel<>(new String[] { "Identifiant", "Titre", "Tout afficher" }));
        RecherchCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecherchComboActionPerformed(evt);
            }
        });

        RecherchBouton.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        RecherchBouton.setText("Recherche");
        RecherchBouton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RecherchBoutonActionPerformed(evt);
            }
        });

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(RecherchField, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RecherchBouton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(RecherchCombo, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(RecherchCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(RecherchField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecherchBouton))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panListeOeuvre.setBorder(BorderFactory.createTitledBorder(null, "Liste des Oeuvres", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 1, 12), new Color(0, 0, 102))); // NOI18N

        jScrollPane1.setBackground(new Color(255, 255, 255));

        tableListeOeuvre.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titre", "Auteur", "Catégorie", "Type", "Exemplaires ", "Réservations"
            }
        ));
        tableListeOeuvre.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent evt) {
                tableListeOeuvreMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableListeOeuvre);

        GroupLayout panListeOeuvreLayout = new GroupLayout(panListeOeuvre);
        panListeOeuvre.setLayout(panListeOeuvreLayout);
        panListeOeuvreLayout.setHorizontalGroup(
            panListeOeuvreLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panListeOeuvreLayout.createSequentialGroup()
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 617, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panListeOeuvreLayout.setVerticalGroup(
            panListeOeuvreLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panListeOeuvre, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel1)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panListeOeuvre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifierBoutonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_modifierBoutonActionPerformed
        // TODO add your handling code here:
        Oeuvre oeuvre = getOeuvreInfos();
        if (null != oeuvre) {
            ModificationOeuvre modificationOeuvre = new ModificationOeuvre(this, true, oeuvre);
            modificationOeuvre.setLocationRelativeTo(null);
            modificationOeuvre.setVisible(true);
        }
    }//GEN-LAST:event_modifierBoutonActionPerformed

    private void RecherchComboActionPerformed(ActionEvent evt) {//GEN-FIRST:event_RecherchComboActionPerformed
        // TODO add your handling code here:
         if (RecherchCombo.getSelectedItem().equals("Tout afficher")) {
            try {
                ArrayList<Oeuvre> listOeuvres = OeuvreControl.getListOeuvres();
                fillOeuvreJtable(listOeuvres);
                RecherchBouton.setEnabled(false);
                RecherchField.setEnabled(false);
            } catch (BibalExceptions e) {
                System.out.println("IHM.GestionUsager.RecherchComboActionPerformed() : Erreurs");
            }
        } else {
            RecherchBouton.setEnabled(true);
            RecherchField.setEnabled(true);
        }
    }//GEN-LAST:event_RecherchComboActionPerformed

    private void retourButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_retourButtonActionPerformed
//         TODO add your handling code here:
         menu m=new menu();
        this.hide();
        m.show();
    }//GEN-LAST:event_retourButtonActionPerformed

    private void RecherchBoutonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_RecherchBoutonActionPerformed
        // TODO add your handling code here:
        String rechPar = RecherchCombo.getSelectedItem().toString();
        String textARechercher = RecherchField.getText().trim();
        if (textARechercher.length() > 0) {
            ArrayList<Oeuvre> listOeuvres;
            try {
                switch (rechPar) {
                    case "Identifiant":
                        int identifiant = parseInt(textARechercher);
                        Oeuvre oeuvre = OeuvreControl.findById(identifiant);
                        fillOeuvreJtable(new ArrayList<Oeuvre>() {
                            {
                                add(oeuvre);
                            }
                        });
                        break;
                    case "Titre":
                        listOeuvres = OeuvreControl.findByTitre(textARechercher);
                        fillOeuvreJtable(listOeuvres);
                        break;
                    case "Tout afficher":
                        listOeuvres = OeuvreControl.getListOeuvres();
                        fillOeuvreJtable(listOeuvres);
                        break;
                }
            } catch (BibalExceptions e) {
                System.out.println("IHM.GestionUsager.RecherchBoutonActionPerformed() : Erreurs");
            } catch (NumberFormatException e) {
                showMessageSucces("Identifiant non valide");
            }
        }
    }//GEN-LAST:event_RecherchBoutonActionPerformed

    private void ajouterBoutonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_ajouterBoutonActionPerformed
        // TODO add your handling code here:
        AjoutOeuvre ajoutOeuvre = new AjoutOeuvre(this, true);
        ajoutOeuvre.setLocationRelativeTo(null);
        ajoutOeuvre.setVisible(true);
    }//GEN-LAST:event_ajouterBoutonActionPerformed

    private void afficherButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_afficherButtonActionPerformed
        // TODO add your handling code here:
         try {
            ArrayList<Oeuvre> listOeuvres = OeuvreControl.getListOeuvres();
            fillOeuvreJtable(listOeuvres);
        } catch (BibalExceptions ex) {
            System.out.println("IHM.GestionOeuvre.afficherButtonActionPerformed()");
        }
    }//GEN-LAST:event_afficherButtonActionPerformed

    private void supprimerButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_supprimerButtonActionPerformed
        // TODO add your handling code here:
        try {
            Oeuvre oeuvre = getOeuvreInfos();
            String message;
            if (null != oeuvre) {
                if (oeuvre.getExamplairesOeuvre().size() > 0) {
                    message = "Vous ne pouvez pas supprimer cette oeuvre\n"
                            + " Elle a " + oeuvre.getExamplairesOeuvre().size() + " exemplaire"
                            + (oeuvre.getExamplairesOeuvre().size() > 1 ? "s" : "");
                    showMessageSucces(message);
                } else {
                    message = "Cette oeuvre a " + oeuvre.getExamplairesOeuvre().size() + " exemplaire\n"
                            + "\n Voulez-vous la supprimer ?";
                    int reponse = showConfirmDialog(null, message,
                            "Avertissement", JOptionPane.OK_CANCEL_OPTION);
                    if (reponse == JOptionPane.OK_OPTION) {
                        OeuvreControl.supprimer(oeuvre);
                        ((ModelTableau) tableListeOeuvre.getModel()).removeRow(tableListeOeuvre.getSelectedRow());
                        showMessageSucces("L'Oeuvre a bien été supprimée");

                    }
                }
            }

        } catch (BibalExceptions ex) {
            System.out.println("IHM.GestionOeuvresExemplaires.supprimerButtonActionPerformed()");
        }
    }//GEN-LAST:event_supprimerButtonActionPerformed

    private void exemplaireButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_exemplaireButtonActionPerformed
        // TODO add your handling code here:
         Oeuvre oeuvre = getOeuvreInfos();
        if (null != oeuvre) {
            GestionExemplaires exemplaires = new GestionExemplaires(this, true, getOeuvreInfos());
            exemplaires.setLocationRelativeTo(null);
            exemplaires.setVisible(true);
        }
    }//GEN-LAST:event_exemplaireButtonActionPerformed

    private void tableListeOeuvreMouseReleased(MouseEvent evt) {//GEN-FIRST:event_tableListeOeuvreMouseReleased
        // TODO add your handling code here:
        int row = tableListeOeuvre.getSelectedRow();
        int nbreCol = tableListeOeuvre.getColumnCount();

        dataLigneSelected = new Object[nbreCol];
        if (row >= 0) {
            for (int i = 0; i < nbreCol; i++) {
                dataLigneSelected[i] = tableListeOeuvre.getModel().getValueAt(row, i);
            }
            modifierBouton.setEnabled(true);
            supprimerButton.setEnabled(true);
            exemplaireButton.setEnabled(true);
        } else {
            modifierBouton.setEnabled(false);
            supprimerButton.setEnabled(false);
            exemplaireButton.setEnabled(true);
        }
    }//GEN-LAST:event_tableListeOeuvreMouseReleased
private Oeuvre getOeuvreInfos() {
        Oeuvre oeuvre = null;
        if (tableListeOeuvre.getSelectedRow() != -1) {
            int id = parseInt(dataLigneSelected[0].toString());
            String titre = dataLigneSelected[1].toString();
            String auteur = dataLigneSelected[2].toString();
            String categorie = dataLigneSelected[3].toString();
            String typeOeuvre = dataLigneSelected[4].toString();
            int nbExemplaire = parseInt(dataLigneSelected[5].toString());
            int nbResa = parseInt(dataLigneSelected[6].toString());

            if (typeOeuvre.equals(Magazine.class.getSimpleName())) {
                oeuvre = new Magazine(id, titre, auteur, categorie, nbResa);
            } else {
                oeuvre = new Livre(id, titre, auteur, categorie, nbResa);
            }
            oeuvre.getExamplairesOeuvre().setSize(nbExemplaire);
        }
        return oeuvre;

    }
 private void fillOeuvreJtable(ArrayList<Oeuvre> listOeuvres) {
        String titre[] = new String[]{"ID", "Titre",
            "Auteur", "Catégorie", "Type", "Exemplaires", "Réservations"};
        if (listOeuvres.size() > 0) {
//            pour le findByID si l'objet ajouté est null
            int nbLigne = (null == listOeuvres.get(0)) ? 0 : listOeuvres.size();
            Object data[][] = new Object[nbLigne][titre.length];
            for (int i = 0; i < nbLigne; i++) {
                Oeuvre oeuvre = listOeuvres.get(i);
                data[i][0] = oeuvre.getId();
                data[i][1] = oeuvre.getTitre();
                data[i][2] = oeuvre.getAuteur();
                data[i][3] = oeuvre.getCategorie();
                data[i][4] = oeuvre.getClass().getSimpleName();
                data[i][5] = oeuvre.getExamplairesOeuvre().size();
                data[i][6] = oeuvre.getNbResa();
            }
            ModelTableau model = new ModelTableau(data, titre);
            tableListeOeuvre.setModel(model);
            tableListeOeuvre.setRowHeight(30);
        } else {
            //afficher tableau vide
            Object data[][] = new Object[1][titre.length];
            ModelTableau model = new ModelTableau(data, titre);
            tableListeOeuvre.setModel(model);
            tableListeOeuvre.setRowHeight(1);
        }
        modifierBouton.setEnabled(false);
        supprimerButton.setEnabled(false);
        exemplaireButton.setEnabled(false);
    }
     private Object dataLigneSelected[];

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionOeuvresExemplaires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionOeuvresExemplaires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionOeuvresExemplaires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionOeuvresExemplaires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionOeuvresExemplaires().setVisible(true);
            }
        });
    }
       //public static JTable tableListeOeuvre;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton RecherchBouton;
    private JComboBox<String> RecherchCombo;
    private JTextField RecherchField;
    private JButton afficherButton;
    private JButton ajouterBouton;
    private JButton exemplaireButton;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JOptionPane jOptionPane1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JScrollPane jScrollPane1;
    private JButton modifierBouton;
    private JPanel panListeOeuvre;
    private JButton retourButton;
    private JButton supprimerButton;
    public static JTable tableListeOeuvre;
    // End of variables declaration//GEN-END:variables
}
