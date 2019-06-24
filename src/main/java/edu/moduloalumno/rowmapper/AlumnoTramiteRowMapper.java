/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.rowmapper;

import edu.moduloalumno.entity.AlumnoProgramaTramite;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author ever
 */
public class AlumnoTramiteRowMapper implements RowMapper<AlumnoProgramaTramite>{

   
        @Override //beneficio
	public AlumnoProgramaTramite mapRow(ResultSet rs, int rowNum) throws SQLException {
		AlumnoProgramaTramite ab = new AlumnoProgramaTramite();
                ab.setId_apt(rs.getInt("id_apt"));
		ab.setCod_alumno(rs.getString("cod_alumno"));
		ab.setId_programa(rs.getInt("id_programa"));
                ab.setId_tipotramite(rs.getInt("id_tipotramite"));
                ab.setId_apb(rs.getInt("id_apb"));
                ab.setN_expediente(rs.getString("n_expediente"));
		ab.setFecha_expediente(rs.getDate("fecha_expediente"));
                ab.setDesc_tipotramite(rs.getString("desc_tipotramite"));
		
		return ab;
		
		
	} //To change body of generated methods, choose Tools | Templates.
}
