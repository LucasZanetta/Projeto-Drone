/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.DatabaseService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Operator;

/**
 *
 * @author Lucas
 */
public class OperatorDAO {
    
    public void insertOperatorDatabase(Operator operator, Connection conn) throws SQLException {

        PreparedStatement ps = null;
        boolean result = false;

        try {

            DatabaseService data = new DatabaseService();

            ps = conn.prepareStatement("insert into cadastro_drone.operador (nome, cpf_cnpj, cidade_estado, ramo_atividade) values (?,?,?,?)");

            ps.setString(1, operator.getName());
            ps.setString(2, operator.getCpfCnpj());
            ps.setString(3, operator.getCityState());
            ps.setString(4, operator.getBranchActivity());
            ps.execute();

            result = true;

        } catch (SQLException e) {

            System.err.println(e);

        } finally {

            if (ps != null) {

                ps.close();
            }

        }

    }
    
}
