/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.api;

import edu.moduloalumno.component.FloatFormat;
import edu.moduloalumno.entity.AlumnoProgramaTramite;
import edu.moduloalumno.entity.TipoTramite;
import edu.moduloalumno.service.IAlumnoTramiteService;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ever
 */
@RestController
@RequestMapping("/tramite")
public class AlumnoTramiteController {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
	private IAlumnoTramiteService alumnotramiteservice;
    
    @Autowired
	@Qualifier("floatformat")
	private FloatFormat floatformat;
    
    @RequestMapping(value = "/listar/{codigo}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AlumnoProgramaTramite>> getAllAlumnoTramite(@PathVariable("codigo") String codigo) {
		logger.info(">> AlumnoTramite <<");

		List<AlumnoProgramaTramite> list = null;
		try {
			list = alumnotramiteservice.getAllAlumnoTramite(codigo);

			if (list == null) {
				list = new ArrayList<AlumnoProgramaTramite>();
			}
			
			//logger.info("list "+alubeneficio);
		} catch (Exception e) {
			
			logger.error("Unexpected Exception caught." + e.getMessage());
			return new ResponseEntity<List<AlumnoProgramaTramite>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< alumnotramite");
		return new ResponseEntity<List<AlumnoProgramaTramite>>(list, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/insertar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean insertAlumnoTramite(@RequestBody AlumnoProgramaTramite aptramite) {
		logger.info("> insertAlumnoProgramaTramite[ "+aptramite+"]"+" "+aptramite.getId_programa()+"---");
		
		boolean resp = false;
		try {
			
			logger.info("respppp:  apt "+aptramite.getId_apt());
			if(!alumnotramiteservice.getIdTramite(aptramite.getId_apt()))
			{
				aptramite.setToQuery(true);
				logger.info("no existe");
			}
			else {
				aptramite.setToQuery(false);
				logger.info("existe");
			}
			
			logger.info("respppp: afte "+aptramite.getId_programa()+" "+aptramite);
			resp = alumnotramiteservice.insertAlumnoProgramaTramite(aptramite);
			logger.info(">>>>><<<<"+resp);
		}
		catch(Exception e) {
			logger.info("catch  "+e.getMessage());
			logger.info("> insertBeneficio[  APBEneficio: "+aptramite);
			return false;
		}
		
		
		return resp;
	}
        
        
        @RequestMapping(value = "/tipo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TipoTramite>> getAllTipo() {
		logger.info(">> TipoBeneficio <<");

		List<TipoTramite> tipotramite = null;
		try {
			tipotramite = alumnotramiteservice.getAllTipo();

			if (tipotramite == null) {
				tipotramite = new ArrayList<TipoTramite>();
			}
			
			logger.info("list "+tipotramite);
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<TipoTramite>>(tipotramite, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< alumnobeneficio");
		return new ResponseEntity<List<TipoTramite>>(tipotramite, HttpStatus.OK);
	}
}
