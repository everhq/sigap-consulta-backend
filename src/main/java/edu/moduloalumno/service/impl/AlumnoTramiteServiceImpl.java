/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.service.impl;

import edu.moduloalumno.dao.IAlumnoTramiteDAO;
import edu.moduloalumno.entity.AlumnoProgramaTramite;
import edu.moduloalumno.entity.TipoTramite;
import edu.moduloalumno.service.IAlumnoTramiteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ever
 */
@Service
public class AlumnoTramiteServiceImpl implements IAlumnoTramiteService {
    
    @Autowired
    IAlumnoTramiteDAO alumnotramitedao;

    @Override
    public List<AlumnoProgramaTramite> getAllAlumnoTramite(String codigo) {
        return alumnotramitedao.getAllAlumnoTramite(codigo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insertAlumnoProgramaTramite(AlumnoProgramaTramite aptramite) {
        return alumnotramitedao.insertAlumnoProgramaTramite(aptramite); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getIdTramite(Integer id_apt) {
        return alumnotramitedao.getIdTramite(id_apt); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoTramite> getAllTipo() {
        return alumnotramitedao.getAllTipo(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
