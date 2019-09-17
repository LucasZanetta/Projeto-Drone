/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import connection.DatabaseService;

/**
 *
 * @author Lucas
 */
public class SelectDAO {
    
    public String selectCity() throws SQLException {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String result = "";
        try {
            conn = DatabaseService.getConnPostgres();
            DatabaseService data = new DatabaseService();

            ps = conn.prepareStatement("SELECT operador.cidade_estado, count(operador.cidade_estado) as total from cadastro_drone.operador"
                    + " as operador inner join cadastro_drone.aeronave as aeronave on operador.idoperador = aeronave.idoperador group by "
                    + "operador.cidade_estado order by total desc limit 1");

            rs = ps.executeQuery();

            int numberColumns = rs.getMetaData().getColumnCount();
            NumberFormat integer = NumberFormat.getInstance(); 
             
            while (rs.next()) {

                for (int i = 1; i <= numberColumns; i++) {

                    if (i == 1) {
                        result += rs.getString(i) + " apareceu ";
                    } else {
                        result += integer.format(rs.getDouble(i));
                    }
                }
            }

            result += " vezes!";

        } catch (SQLException e) {

            System.err.println(e);

        } finally {

            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }

        }

        return result;
    }

    public String selectModel() throws SQLException {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String result = "";
        try {
            conn = DatabaseService.getConnPostgres();
            DatabaseService data = new DatabaseService();

            ps = conn.prepareStatement("SELECT aeronave.modelo, count(aeronave.modelo) as total from cadastro_drone.operador as operador"
                    + " inner join cadastro_drone.aeronave as aeronave on operador.idoperador = aeronave.idoperador group by aeronave.modelo "
                    + "order by total desc limit 1");

            rs = ps.executeQuery();
            NumberFormat integer = NumberFormat.getInstance(); 

            int numberColumns = rs.getMetaData().getColumnCount();
                
            while (rs.next()) {

                for (int i = 1; i <= numberColumns; i++) {

                    if (i == 1) {
                        result += rs.getString(i) + " apareceu ";
                    } else {
                        result += integer.format(rs.getDouble(i));
                    }
                }
            }

            result += " vezes!";

        } catch (SQLException e) {

            System.err.println(e);

        } finally {

            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }

            if (rs != null) {
                rs.close();
            }
        }

        return result;
    }

    public String selectCategory() throws SQLException {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String result = "";
        try {
            conn = DatabaseService.getConnPostgres();
            DatabaseService data = new DatabaseService();

            ps = conn.prepareStatement("SELECT (SELECT count(*) as peso_medio from cadastro_drone.aeronave where peso_max"
                    + " between 8 and 13) as peso_medio, (SELECT count(*) as peso_medio from cadastro_drone.aeronave where peso_max"
                    + " between 0 and 7) as peso_leve, (SELECT count(*) as peso_medio from cadastro_drone.aeronave where peso_max >= 14) as peso_pesado;");

            rs = ps.executeQuery();

            int numberColumns = rs.getMetaData().getColumnCount();
             NumberFormat integer = NumberFormat.getInstance(); 
            
            while (rs.next()) {

                for (int i = 1; i <= numberColumns; i++) {
                    
                    if (i == 1) {
                        result += "Leve: " + integer.format(rs.getDouble(i));

                    } else if (i == 2) {
                        result += " - Médio: " + integer.format(rs.getDouble(i));

                    } else {
                        result += " - Pesado: " + integer.format(rs.getDouble(i));
                    }
                }
            }

        } catch (SQLException e) {

            System.err.println(e);

        } finally {

            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }

        return result;
    }

    public String selectBranchActivity() throws SQLException {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String result = "";
        try {
            conn = DatabaseService.getConnPostgres();
            DatabaseService data = new DatabaseService();

            ps = conn.prepareStatement("select ramo_atividade, count(idoperador) as total from cadastro_drone.operador group by ramo_atividade order"
                    + " by total desc limit 1;");

            rs = ps.executeQuery();

            int numberColumns = rs.getMetaData().getColumnCount();
            NumberFormat integer = NumberFormat.getInstance(); 

            while (rs.next()) {

                for (int i = 1; i <= numberColumns; i++) {

                    if (i == 1) {
                        result += rs.getString(i) + " apareceu ";
                    } else {
                        result += integer.format(rs.getDouble(i));
                    }
                }
            }

            result += " vezes!";

        } catch (SQLException e) {

            System.err.println(e);

        } finally {

            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }

        return result;
    }
    
    public int checkDatabase() throws SQLException {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int result=0;
        try {
            conn = DatabaseService.getConnPostgres();
            DatabaseService data = new DatabaseService();

            ps = conn.prepareStatement("select max(idaeronave) from cadastro_drone.aeronave");

            rs = ps.executeQuery();

          if(rs.next()){
                result = rs.getInt(1);
            }

        } catch (SQLException e) {

            System.err.println(e);

        } finally {
            
            if (conn != null) {
                conn.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return result;
    }  
    
}
