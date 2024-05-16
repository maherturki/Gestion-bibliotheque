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


// Sous-classe ExemplairePapier
public class ExemplairePapier extends Exemplaire {
    private String format;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void ajouter() {
        // Implémentation pour ajouter un exemplaire papier
    }

    @Override
    public void modifier() {
        // Implémentation pour modifier un exemplaire papier
    }

    @Override
    public void supprimer() {
        // Implémentation pour supprimer un exemplaire papier
    }
}