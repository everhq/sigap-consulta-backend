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
		ab.setId_tipotramite(rs.getInt("id_tipotramite"));
                ab.setId_apb(rs.getInt("id_apb"));
                ab.setN_expediente(rs.getString("n_expediente"));
		ab.setFecha_expediente(rs.getDate("fecha_expediente"));
                ab.setBeneficio_otorgado(rs.getInt("beneficio_otorgado"));
                ab.setDesc_tipotramite(rs.getString("desc_tipotramite"));
                ab.setN_tramite(rs.getString("n_tramite"));
		ab.setAnio_tramite(rs.getString("anio_tramite"));
		ab.setFecha_emision(rs.getDate("fecha_emision"));
                ab.setUsuario_emision(rs.getString("usuario_emision"));
                ab.setN_oficio(rs.getString("n_oficio"));
		ab.setAnio_oficio(rs.getString("anio_oficio"));
                ab.setFecha_oficio(rs.getDate("fecha_oficio"));
		ab.setImporte_oficio(rs.getFloat("importe_oficio"));
                ab.setImporte_matricula_epg(rs.getFloat("importe_matricula_epg"));
                ab.setImporte_otros(rs.getFloat("importe_otros"));
		ab.setImporte_total(rs.getFloat("importe_total"));
                
		return ab;
		
		
	} //To change body of generated methods, choose Tools | Templates.
}
