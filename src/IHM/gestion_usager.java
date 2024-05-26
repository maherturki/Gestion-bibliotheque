/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Modele.Usager;
import Utility.BibalExceptions;
import Utility.DBConnection;
import Utility.ModelTableau;
import control.UsagerControl;
import interfaces.UsagerInterface;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import static Utility.Utility.*;
import static java.lang.Integer.parseInt;

public class gestion_usager extends JFrame {


    public gestion_usager() {
        initComponents();
    setResizable(false);
        setIdentifiant();
      
        tableListeUsager.setModel(new ModelTableau(new Object[0][0],
                new String[]{"Identifiant", "Nom","Prénom", "Date de naissance", "Sexe", "Téléphone", "Adresse"}));
        tableListeUsager.setRowHeight(30);
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        civiliteCombo = new JComboBox<>();
        identifiantField = new JTextField();
        nomField = new JTextField();
        prenomField = new JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        adresseField = new JTextField();
        telField = new JTextField();
        jLabel1 = new JLabel();
        jButton1 = new JButton();
        jPanel3 = new JPanel();
        jLabel9 = new JLabel();
        RecherchField = new JTextField();
        RecherchBouton = new JButton();
        RecherchCombo = new JComboBox<>();
        supprimerButton = new JButton();
        jPanel4 = new JPanel();
        jScrollPane1 = new JScrollPane();
        tableListeUsager = new JTable();
        modifierBouton = new JButton();
        ajouterBouton = new JButton();
        annulerBouton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ajouter Usager", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(108, 92, 92));
        jLabel2.setText("Civilité :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(108, 92, 92));
        jLabel3.setText("Identifiant :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(108, 92, 92));
        jLabel4.setText("Nom :  ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(108, 92, 92));
        jLabel5.setText("Prénom : ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(108, 92, 92));
        jLabel6.setText("Date de naissance :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(108, 92, 92));
        jLabel7.setText("Adresse :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(108, 92, 92));
        jLabel8.setText("Télèphone :  ");

        civiliteCombo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        civiliteCombo.setModel(new DefaultComboBoxModel<>(new String[] { "M", "F", " " }));

        identifiantField.setEnabled(false);

        jDateChooser1.setDateFormatString("dd/MM/yyyy");

        telField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telFieldActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(adresseField))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(nomField)
                            .addComponent(prenomField)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(civiliteCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(identifiantField)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(48, 48, 48)
                        .addComponent(telField)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(civiliteCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(identifiantField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nomField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(prenomField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6))
                    .addComponent(jDateChooser1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(adresseField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(telField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("Gestion Des Usagers");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new ImageIcon(getClass().getResource("/images/Go-back-icon.png"))); // NOI18N
        jButton1.setText("retour");
        jButton1.setHorizontalTextPosition(SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Rechercher", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(108, 92, 92));
        jLabel9.setText("Rechercher par  ");

        RecherchBouton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        RecherchBouton.setIcon(new ImageIcon(getClass().getResource("/images/viewmag--icone-5948-32.png"))); // NOI18N
        RecherchBouton.setText("Rechercher ");
        RecherchBouton.setHorizontalTextPosition(SwingConstants.LEFT);
        RecherchBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecherchBoutonActionPerformed(evt);
            }
        });

        RecherchCombo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        RecherchCombo.setModel(new DefaultComboBoxModel<>(new String[] { "Identifiant", "Nom", "Tout afficher" }));
        RecherchCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecherchComboActionPerformed(evt);
            }
        });

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel9)
                        .addGap(32, 32, 32)
                        .addComponent(RecherchCombo, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(RecherchField, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RecherchBouton)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(RecherchCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(RecherchField, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecherchBouton, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        supprimerButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        supprimerButton.setIcon(new ImageIcon(getClass().getResource("/images/supprimer.png"))); // NOI18N
        supprimerButton.setText("Supprimer");
        supprimerButton.setEnabled(false);
        supprimerButton.setHorizontalTextPosition(SwingConstants.LEFT);
        supprimerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "liste usager", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        tableListeUsager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identifiant", "Nom", "prénom", "sexe", "telephone", "adresse"
            }
        ));
        tableListeUsager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableListeUsagerMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableListeUsager);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 552, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
        );

        modifierBouton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        modifierBouton.setIcon(new ImageIcon(getClass().getResource("/images/modifier.png"))); // NOI18N
        modifierBouton.setText("modifier");
        modifierBouton.setEnabled(false);
        modifierBouton.setHorizontalTextPosition(SwingConstants.LEFT);
        modifierBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifier(evt);
            }
        });

        ajouterBouton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ajouterBouton.setIcon(new ImageIcon(getClass().getResource("/images/nouveau.png"))); // NOI18N
        ajouterBouton.setText("Ajouter");
        ajouterBouton.setHorizontalTextPosition(SwingConstants.LEFT);
        ajouterBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter(evt);
            }
        });

        annulerBouton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        annulerBouton.setIcon(new ImageIcon(getClass().getResource("/images/Apps-Dialog-Close-icon.png"))); // NOI18N
        annulerBouton.setText("Annuler");
        annulerBouton.setHorizontalTextPosition(SwingConstants.LEFT);
        annulerBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerBoutonActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(267, 267, 267)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(annulerBouton, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(supprimerButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modifierBouton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ajouterBouton, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(supprimerButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(modifierBouton)
                        .addComponent(ajouterBouton)
                        .addComponent(annulerBouton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
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
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       menu m = new menu();
        this.dispose();
        m.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RecherchComboActionPerformed(java.awt.event.ActionEvent evt) {
        //GEN-FIRST:event_RecherchComboActionPerformed
        UsagerInterface usagerInterface = new Usager();
 if (RecherchCombo.getSelectedItem().equals("Tout afficher")) {
            try {
                ArrayList<Usager> listUsagers = UsagerControl.getListUsagers(usagerInterface );
                fillUsagerJtable(listUsagers);
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

    private void RecherchBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecherchBoutonActionPerformed
   String rechPar = RecherchCombo.getSelectedItem().toString();
        UsagerInterface usagerInterface = new Usager();
        String textARechercher = RecherchField.getText().trim();
        if (textARechercher.length() > 0) {
            ArrayList<Usager> listUsagers;
            try {
                switch (rechPar) {
                    case "Identifiant":
                        int identifiant = parseInt(textARechercher);
                        Usager usager = UsagerControl.findById(usagerInterface ,identifiant);
                        fillUsagerJtable(new ArrayList<Usager>() {
                            {
                                 add(usager);
                                
                            }
                        });
                        break;
                    case "Nom":
                        listUsagers = UsagerControl.findByNom(usagerInterface ,textARechercher);
                        fillUsagerJtable(listUsagers);
                        break;
                    case "Tout afficher":
                        listUsagers = UsagerControl.getListUsagers( usagerInterface );
                        fillUsagerJtable(listUsagers);
                        break;
                }
            } catch (BibalExceptions e) {
                System.out.println("IHM.GestionUsager.RecherchBoutonActionPerformed() : Erreurs");
            } catch (NumberFormatException e) {
                showMessageSucces("Identifiant non valide");
            }
        }
    }//GEN-LAST:event_RecherchBoutonActionPerformed

      
  
    private void annulerBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerBoutonActionPerformed
        // TODO add your handling code here:
          clearField();
        modifierBouton.setEnabled(false);
        supprimerButton.setEnabled(false);
        ajouterBouton.setEnabled(true);
        setIdentifiant();
    }//GEN-LAST:event_annulerBoutonActionPerformed

    private void modifier(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifier
        // TODO add your handling code here:
        UsagerInterface usagerInterface = new Usager();
          try {
            Usager usager = getUsagerInfos();
            UsagerControl.modifier(usagerInterface ,usager);
            setIdentifiant();
            clearField();
            ((ModelTableau) tableListeUsager.getModel()).updateRow(
                    new Object[]{usager.getId(), usager.getNom(), usager.getPrenom(),
                        dateToStr(usager.getDateNais()), usager.getSexe(),
                        usager.getTel(), usager.getAdresse()},
                    tableListeUsager.getSelectedRow());
            modifierBouton.setEnabled(false);
            supprimerButton.setEnabled(false);
            ajouterBouton.setEnabled(true);
            showMessageSucces("Les modifications ont été enregistrées");
        } catch (BibalExceptions e) {
            System.out.println("IHM.GestionUsager.modifierBoutonActionPerformed()");
        }
    }//GEN-LAST:event_modifier

    private void supprimer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer
        // TODO add your handling code here:
        UsagerInterface usagerInterface = new Usager();
        try {
            Usager usager = getUsagerInfos();
            UsagerControl.supprimer(usagerInterface,usager);
            showMessageSucces("L'enregistrement a bien été supprimé");
            setIdentifiant();
            clearField();
            ((ModelTableau) tableListeUsager.getModel()).removeRow(tableListeUsager.getSelectedRow());
            modifierBouton.setEnabled(false);
            supprimerButton.setEnabled(false);
            ajouterBouton.setEnabled(true);
        } catch (BibalExceptions e) {
            showMessageSucces("Impossible de supprimer cet usager");
        }
    }//GEN-LAST:event_supprimer

    private void ajouter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter
        // TODO add your handling code here:
        UsagerInterface usagerInterface = new Usager(); // Ou une autre classe implémentant UsagerInterface

        try {
            Usager usager = getUsagerInfos();
            UsagerControl.ajouter(usagerInterface, usager); // Passer l'interface en premier argument
            setIdentifiant();
            clearField();
            ((ModelTableau) tableListeUsager.getModel()).addRow(
                    new Object[]{usager.getId(), usager.getNom(), usager.getPrenom(),
                            dateToStr(usager.getDateNais()), usager.getSexe(),
                            usager.getTel(), usager.getAdresse()});
            showMessageSucces("Usager ajouté avec succès");
        } catch (BibalExceptions e) {
            System.out.println("IHM.GestionUsager.ajouterBoutonActionPerformed()");
        }
    }//GEN-LAST:event_ajouter

    private void tableListeUsagerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListeUsagerMouseReleased
        // TODO add your handling code here:
              int row = tableListeUsager.getSelectedRow();
        int nbreCol = tableListeUsager.getColumnCount();

        Object dataLigneSelected[] = new Object[nbreCol];
        if (row >= 0) {
            for (int i = 0; i < nbreCol; i++) {
                dataLigneSelected[i] = tableListeUsager.getModel().getValueAt(row, i);
            }
            identifiantField.setText(dataLigneSelected[0].toString());
            nomField.setText(dataLigneSelected[1].toString());
            prenomField.setText(dataLigneSelected[2].toString());
            try {
                jDateChooser1.setDate(formatDate(YMDtoDMY(dataLigneSelected[3].toString(), "/")));
            } catch (BibalExceptions ex) {
                System.out.println("IHM.GestionUsager.mouseReleased()");
            }
            String sexe = dataLigneSelected[4].toString();
            String civilite = sexe.equalsIgnoreCase("Masculin") ? "M" : "Mme";
            civiliteCombo.setSelectedItem(civilite);
            telField.setText(dataLigneSelected[5].toString().replace(" ", ""));
            adresseField.setText(dataLigneSelected[6].toString());
            modifierBouton.setEnabled(true);
            supprimerButton.setEnabled(true);
            ajouterBouton.setEnabled(false);
        }
    }//GEN-LAST:event_tableListeUsagerMouseReleased
  
    private Usager getUsagerInfos() {
        int identifiant = parseInt(identifiantField.getText());
        String nom = nomField.getText();
        String prenom = prenomField.getText();
        Date dateNais = jDateChooser1.getDate();
        String sexe = civiliteCombo.getSelectedItem().toString().equals("M") ? "Masculin" : "Féminin";
        String adresse = adresseField.getText();
        String tel = telField.getText().replace("-", "").trim();
        return new Usager(identifiant, nom, prenom, dateNais, sexe, adresse, tel);
    }

    private void fillUsagerJtable(ArrayList<Usager> listUsagers) {
        String titre[] = new String[]{"Identifiant", "Nom",
            "Prénom", "Date de naissance", "Sexe", "Téléphone", "Adresse"};
        if (listUsagers.size() > 0) {
            int nbLigne = (null == listUsagers.get(0)) ? 0 : listUsagers.size();
            Object data[][] = new Object[nbLigne][titre.length];
            for (int i = 0; i < nbLigne; i++) {
                Usager usager = listUsagers.get(i);
                data[i][0] = usager.getId();
                data[i][1] = usager.getNom();
                data[i][2] = usager.getPrenom();
                data[i][3] = usager.getDateNais();
                data[i][4] = usager.getSexe();
                data[i][5] = usager.getTel();
                data[i][6] = usager.getAdresse();
            }
            ModelTableau model = new ModelTableau(data, titre);
            tableListeUsager.setModel(model);
            tableListeUsager.setRowHeight(30);
        } else {
            //afficher tableau vide
            Object data[][] = new Object[1][titre.length];
            ModelTableau model = new ModelTableau(data, titre);
            tableListeUsager.setModel(model);
            tableListeUsager.setRowHeight(1);
        }
    }

    private void clearField() {
        nomField.setText("");
        prenomField.setText("");
        adresseField.setText("");
        telField.setText("");
    }

    private void setIdentifiant() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            final String SQL_SELECT_ID = "SELECT id FROM usager ORDER BY id DESC LIMIT 1";
            preparedStatement = initialiseRequetePreparee(DBConnection.getConnection(),
                    SQL_SELECT_ID, new Object[0]);
            resultSet = preparedStatement.executeQuery();
            int identifiant = 1;
            if (resultSet.first()) {
                identifiant = resultSet.getInt("id");
            }
            identifiantField.setText((identifiant + 1) + "");
        } catch (SQLException | BibalExceptions e) {
            JOptionPane.showMessageDialog(null, "Erreurs d'accès à la base de données" +e.getMessage(),
                    "Erreurs", JOptionPane.ERROR_MESSAGE);
        } finally {
            closeStatementResultSet(preparedStatement, resultSet);
        }
    }

  	


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
            java.util.logging.Logger.getLogger(gestion_usager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestion_usager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestion_usager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestion_usager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestion_usager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton RecherchBouton;
    private JComboBox<String> RecherchCombo;
    private JTextField RecherchField;
    private JTextField adresseField;
    private JButton ajouterBouton;
    private JButton annulerBouton;
    private JComboBox<String> civiliteCombo;
    private JTextField identifiantField;
    private JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JScrollPane jScrollPane1;
    private JButton modifierBouton;
    private JTextField nomField;
    private JTextField prenomField;
    private JButton supprimerButton;
    private JTable tableListeUsager;
    private JTextField telField;
    // End of variables declaration//GEN-END:variables
}
