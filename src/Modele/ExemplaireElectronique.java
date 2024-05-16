package Modele;

import Utility.BibalExceptions;
import Utility.DBConnection;
import static Utility.Utility.closeStatement;
import static Utility.Utility.closeStatementResultSet;
import static Utility.Utility.initialiseRequetePreparee;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

//appliquer OCP
// Sous-classe ExemplaireElectronique
public class ExemplaireElectronique extends Exemplaire {
    private String format;
    private String support;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    @Override
    public void ajouter() {
        // Implémentation pour ajouter un exemplaire électronique
    }

    @Override
    public void modifier() {
        // Implémentation pour modifier un exemplaire électronique
    }

    @Override
    public void supprimer() {
        // Implémentation pour supprimer un exemplaire électronique
    }
}