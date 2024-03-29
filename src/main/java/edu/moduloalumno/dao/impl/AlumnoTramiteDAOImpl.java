/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.dao.impl;

import edu.moduloalumno.dao.IAlumnoTramiteDAO;
import edu.moduloalumno.entity.AlumnoProgramaTramite;
import edu.moduloalumno.entity.TipoTramite;
import edu.moduloalumno.rowmapper.AlumnoTramiteRowMapper;
import edu.moduloalumno.rowmapper.TipoTramiteRowMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ever
 */
@Transactional
@Repository
public class AlumnoTramiteDAOImpl implements IAlumnoTramiteDAO{

    @Autowired
	private JdbcTemplate jdbcTemplate;
    
    @Override
    public List<AlumnoProgramaTramite> getAllAlumnoTramite(String codigo) {
        String sql = "select apt.id_apt,apt.cod_alumno,apt.id_tipotramite,tt.desc_tipotramite,apb.id_apb,apt.n_expediente,apt.fecha_expediente,apb.beneficio_otorgado,apt.n_tramite,apt.anio_tramite,apt.fecha_emision,apt.usuario_emision,apt.n_oficio,apt.anio_oficio,apt.fecha_oficio,apt.importe_oficio,apt.importe_matricula_epg,apt.importe_otros,apt.importe_total from alumno_programa_tramite apt,alumno_programa_beneficio apb,tipo_tramite tt where apt.cod_alumno = (?) and (apt.id_tipotramite = tt.id_tipotramite) and (apt.id_apb = apb.id_apb)   order by apt.id_apt";
        RowMapper<AlumnoProgramaTramite> rowMapper = new AlumnoTramiteRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, codigo);
    }

    @Override
    public boolean insertAlumnoProgramaTramite(AlumnoProgramaTramite aptramite) {
         String sql="";
		Integer ret = 0;
		
		if(aptramite.getToQuery()) {System.out.println("insert");
			sql = "INSERT INTO alumno_programa_tramite(cod_alumno,id_tipotramite,id_apb,n_expediente,fecha_expediente,n_tramite,anio_tramite,fecha_emision,usuario_emision,n_oficio,anio_oficio,fecha_oficio,importe_oficio,importe_matricula_epg,importe_otros,importe_total) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		 	ret = jdbcTemplate.update(sql, aptramite.getCod_alumno(),aptramite.getId_tipotramite(),aptramite.getId_apb(),aptramite.getN_expediente(),aptramite.getFecha_expediente(),aptramite.getN_tramite(),aptramite.getAnio_tramite(),aptramite.getFecha_emision(),aptramite.getUsuario_emision(),aptramite.getN_oficio(),aptramite.getAnio_oficio(),aptramite.getFecha_oficio(),aptramite.getImporte_oficio(),aptramite.getImporte_matricula_epg(),aptramite.getImporte_otros(),aptramite.getImporte_total());
		}
		else {System.out.println("update");
			sql = "UPDATE alumno_programa_tramite SET id_tipotramite = ?,id_apb = ?,n_expediente = ?,fecha_expediente = ?, n_tramite =?, anio_tramite = ?, fecha_emision =?,usuario_emision=?,n_oficio=?,anio_oficio=?,fecha_oficio=?,importe_oficio=?,importe_matricula_epg=?,importe_otros=?,importe_total=? where id_apt = ?";
			ret = jdbcTemplate.update(sql,aptramite.getId_tipotramite(),aptramite.getId_apb(),aptramite.getN_expediente(),aptramite.getFecha_expediente(),aptramite.getN_tramite(),aptramite.getAnio_tramite(),aptramite.getFecha_emision(),aptramite.getUsuario_emision(),aptramite.getN_oficio(),aptramite.getAnio_oficio(),aptramite.getFecha_oficio(),aptramite.getImporte_oficio(),aptramite.getImporte_matricula_epg(),aptramite.getImporte_otros(),aptramite.getImporte_total(),aptramite.getId_apt());
		}
		System.out.println("respuesta sql "+ret);	
		
		if(ret.equals(1)) {
			return true;
		}
		else 
		{
			return false;
		}
    }

    @Override
    public boolean getIdTramite(Integer id_apt) {
        try {
			String sql = "select id_apb from alumno_programa_tramite where id_apt= ?";
			String id_atp = jdbcTemplate.queryForObject(sql, new Object[] { id_apt }, String.class);
			System.out.println("cod_alumno "+id_atp);
			if(Integer.parseInt(id_atp) > 0)
			{	System.out.println("return true");
				return true;
			}
			else 
			{	
				System.out.println("return false");
				return false;
			}
			
		}
		catch(EmptyResultDataAccessException e) {
			System.out.println("cod_alumno");
			return false;
		}
    }

    @Override
    public List<TipoTramite> getAllTipo() {
        String sql = "select * from tipo_tramite order by id_tipotramite";
		RowMapper<TipoTramite> rowMapper = new TipoTramiteRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper); 
    }
    
}
