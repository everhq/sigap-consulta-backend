/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.rowmapper;

import edu.moduloalumno.entity.TipoTramite;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author ever
 */
public class TipoTramiteRowMapper implements RowMapper<TipoTramite> {

	@Override
	public TipoTramite mapRow(ResultSet rs, int rowNum) throws SQLException {
		TipoTramite tipotramite = new TipoTramite();
		tipotramite.setId_tipotramite(rs.getInt("id_tipotramite"));
		tipotramite.setDesc_tipotramite(rs.getString("desc_tipotramite"));
		tipotramite.setSigla_tipotramite(rs.getString("sigla_tipotramite"));
		return tipotramite;
	}
}
