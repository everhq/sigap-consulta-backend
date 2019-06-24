/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.dao;

import edu.moduloalumno.entity.AlumnoProgramaTramite;
import edu.moduloalumno.entity.TipoTramite;
import java.util.List;

/**
 *
 * @author ever
 */
public interface IAlumnoTramiteDAO {
    public List<AlumnoProgramaTramite> getAllAlumnoTramite(String codigo);
    
    public boolean insertAlumnoProgramaTramite(AlumnoProgramaTramite aptramite);
	
    public boolean getIdTramite(Integer id_apt);
    
    public List<TipoTramite> getAllTipo();
}
