/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucminas.entidade;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ramon.pereira
 */
@XmlRootElement
public class Endereco {
    
    private String endereco; 
    private String bairro; 
    private String complemento; 
    private String cidade; 
    private String CEP; 
    private String UF; 
    private String numero; 
    private String id; 
    private String meso; 
    private String micro; 
    private String latitude; 
    private String longitude; 

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the CEP
     */
    public String getCEP() {
        return CEP;
    }

    /**
     * @param CEP the CEP to set
     */
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    /**
     * @return the UF
     */
    public String getUF() {
        return UF;
    }

    /**
     * @param UF the UF to set
     */
    public void setUF(String UF) {
        this.UF = UF;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the meso
     */
    public String getMeso() {
        return meso;
    }

    /**
     * @param meso the meso to set
     */
    public void setMeso(String meso) {
        this.meso = meso;
    }

    /**
     * @return the micro
     */
    public String getMicro() {
        return micro;
    }

    /**
     * @param micro the micro to set
     */
    public void setMicro(String micro) {
        this.micro = micro;
    }

    /**
     * @return the latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    
    
    

    
}
