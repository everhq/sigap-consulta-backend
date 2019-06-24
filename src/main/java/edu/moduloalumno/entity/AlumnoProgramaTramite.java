/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.entity;

import java.util.Date;

/**
 *
 * @author ever
 */
public class AlumnoProgramaTramite {
    private Integer id_apt;
    private String cod_alumno;
    private Integer id_programa;
    private Integer id_tipotramite;
    private Integer id_apb;
    private String n_expediente;
    private String anio_expediente;
    private Date fecha_expediente;
    private String n_tramite;
    private String anio_tramite;
    private Date fecha_emision;
    private String usuario_emision;
    private String n_oficio;
    private String anio_oficio;
    private Date fecha_oficio;
    private Float importe_oficio;
    private Float importe_matricula;
    private Float importe_matricula_ad;
    private Float importe_matricula_epg;
    private Float importe_ensenianza;
    private Float importe_repitencia;
    private Float importe_otros;
    private Float importe_total;
    
    private boolean toQuery;
    private String desc_tipotramite;

    public String getDesc_tipotramite() {
        return desc_tipotramite;
    }

    public void setDesc_tipotramite(String desc_tipotramite) {
        this.desc_tipotramite = desc_tipotramite;
    }
	
	
    public boolean getToQuery() {
	return toQuery;
    }
    public void setToQuery(boolean toQuery) {
	this.toQuery = toQuery;
    }

    public Integer getId_apt() {
        return id_apt;
    }

    public void setId_apt(Integer id_apt) {
        this.id_apt = id_apt;
    }

    public String getCod_alumno() {
        return cod_alumno;
    }

    public void setCod_alumno(String cod_alumno) {
        this.cod_alumno = cod_alumno;
    }

    public Integer getId_programa() {
        return id_programa;
    }

    public void setId_programa(Integer id_programa) {
        this.id_programa = id_programa;
    }

    public Integer getId_tipotramite() {
        return id_tipotramite;
    }

    public void setId_tipotramite(Integer id_tipotramite) {
        this.id_tipotramite = id_tipotramite;
    }

    public Integer getId_apb() {
        return id_apb;
    }

    public void setId_apb(Integer id_apb) {
        this.id_apb = id_apb;
    }

    public String getN_expediente() {
        return n_expediente;
    }

    public void setN_expediente(String n_expediente) {
        this.n_expediente = n_expediente;
    }

    public String getAnio_expediente() {
        return anio_expediente;
    }

    public void setAnio_expediente(String anio_expediente) {
        this.anio_expediente = anio_expediente;
    }

    public Date getFecha_expediente() {
        return fecha_expediente;
    }

    public void setFecha_expediente(Date fecha_expediente) {
        this.fecha_expediente = fecha_expediente;
    }

    public String getN_tramite() {
        return n_tramite;
    }

    public void setN_tramite(String n_tramite) {
        this.n_tramite = n_tramite;
    }

    public String getAnio_tramite() {
        return anio_tramite;
    }

    public void setAnio_tramite(String anio_tramite) {
        this.anio_tramite = anio_tramite;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public String getUsuario_emision() {
        return usuario_emision;
    }

    public void setUsuario_emision(String usuario_emision) {
        this.usuario_emision = usuario_emision;
    }

    public String getN_oficio() {
        return n_oficio;
    }

    public void setN_oficio(String n_oficio) {
        this.n_oficio = n_oficio;
    }

    public String getAnio_oficio() {
        return anio_oficio;
    }

    public void setAnio_oficio(String anio_oficio) {
        this.anio_oficio = anio_oficio;
    }

    public Date getFecha_oficio() {
        return fecha_oficio;
    }

    public void setFecha_oficio(Date fecha_oficio) {
        this.fecha_oficio = fecha_oficio;
    }

    public Float getImporte_oficio() {
        return importe_oficio;
    }

    public void setImporte_oficio(Float importe_oficio) {
        this.importe_oficio = importe_oficio;
    }

    public Float getImporte_matricula() {
        return importe_matricula;
    }

    public void setImporte_matricula(Float importe_matricula) {
        this.importe_matricula = importe_matricula;
    }

    public Float getImporte_matricula_ad() {
        return importe_matricula_ad;
    }

    public void setImporte_matricula_ad(Float importe_matricula_ad) {
        this.importe_matricula_ad = importe_matricula_ad;
    }

    public Float getImporte_matricula_epg() {
        return importe_matricula_epg;
    }

    public void setImporte_matricula_epg(Float importe_matricula_epg) {
        this.importe_matricula_epg = importe_matricula_epg;
    }

    public Float getImporte_ensenianza() {
        return importe_ensenianza;
    }

    public void setImporte_ensenianza(Float importe_ensenianza) {
        this.importe_ensenianza = importe_ensenianza;
    }

    public Float getImporte_repitencia() {
        return importe_repitencia;
    }

    public void setImporte_repitencia(Float importe_repitencia) {
        this.importe_repitencia = importe_repitencia;
    }

    public Float getImporte_otros() {
        return importe_otros;
    }

    public void setImporte_otros(Float importe_otros) {
        this.importe_otros = importe_otros;
    }

    public Float getImporte_total() {
        return importe_total;
    }

    public void setImporte_total(Float importe_total) {
        this.importe_total = importe_total;
    }
  
        @Override
    
    public String toString() {
        return "alumno_programa_tramite{" + "id_apt=" + id_apt + ", cod_alumno=" + cod_alumno + ", id_programa=" + id_programa + ", id_tipotramite=" + id_tipotramite + ", id_apb=" + id_apb + ", n_expediente=" + n_expediente + ", anio_expediente=" + anio_expediente + ", fecha_expediente=" + fecha_expediente + ", n_tramite=" + n_tramite + ", anio_tramite=" + anio_tramite + ", fecha_emision=" + fecha_emision + ", usuario_emision=" + usuario_emision + ", n_oficio=" + n_oficio + ", anio_oficio=" + anio_oficio + ", fecha_oficio=" + fecha_oficio + ", importe_oficio=" + importe_oficio + ", importe_matricula=" + importe_matricula + ", importe_matricula_ad=" + importe_matricula_ad + ", importe_matricula_epg=" + importe_matricula_epg + ", importe_ensenianza=" + importe_ensenianza + ", importe_repitencia=" + importe_repitencia + ", importe_otros=" + importe_otros + ", importe_total=" + importe_total + '}';
    }
}
