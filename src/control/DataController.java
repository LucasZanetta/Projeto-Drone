/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.AircraftDAO;
import dao.OperatorDAO;
import dao.SelectDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Operator;
import model.Aircraft;
import connection.DatabaseService;
import view.MainScreen;

/**
 *
 * @author Lucas
 */
public class DataController {
    
    public void operatorDatabase(Set<Operator> operator) {

        CsvFileReader fileReader = new CsvFileReader();
        OperatorDAO OperatorDAO = new OperatorDAO();
        Connection conn = DatabaseService.getConnPostgres();

        for (Operator o : operator) {

            try {
                OperatorDAO.insertOperatorDatabase(o, conn);

            } catch (SQLException ex) {
                Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);

            }

        }

        closeDatabase(conn);

    }

    public void aircraftDatabase(List<Aircraft> aircraft) {

        CsvFileReader fileReader = new CsvFileReader();
        AircraftDAO aircraftDAO = new AircraftDAO();
        Connection conn = DatabaseService.getConnPostgres();

        for (Aircraft a : aircraft) {

            try {
                aircraftDAO.insertAircraftDatabase(a, conn);

            } catch (SQLException ex) {
                Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);

            }

        }
        closeDatabase(conn);

    }

    public String selectChoice(int key) throws SQLException {

        SelectDAO selectDAO = new SelectDAO();

        if (key == 1) {

            if (check() == 1) {

                return selectDAO.selectCity();

            } else {

                return "Selecione Inserir ou aguarde a inserção até o final!";

            }

        } else if (key == 2) {

            if (check() == 1) {

                return selectDAO.selectModel();

            } else {

                return "Selecione Inserir ou aguarde a inserção até o final!";

            }

        } else if (key == 3) {

            if (check() == 1) {

                return selectDAO.selectCategory();

            } else {

                return "Selecione Inserir ou aguarde a inserção até o final!";

            }
        } else if (key == 4) {

            if (check() == 1) {

                return selectDAO.selectBranchActivity();

            } else {

                return "Selecione Inserir ou aguarde a inserção até o final!";

            }
        } else {

            return "";
        }

    }

    public int check() throws SQLException {

        SelectDAO selectDAO = new SelectDAO();

        if (selectDAO.checkDatabase() == 69420) {
            return 1;
        }

        return 2;

    }

    private void closeDatabase(Connection conn) {

        if (conn != null) {

            try {
                conn.close();

            } catch (SQLException e) {

            }
        }
    }
    
}
