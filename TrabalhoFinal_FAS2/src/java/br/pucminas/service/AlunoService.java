/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucminas.service;

import br.pucminas.entidade.Aluno;
import br.pucminas.entidade.Endereco;
import com.sun.jmx.remote.internal.Unmarshal;
import com.sun.org.apache.xalan.internal.xsltc.dom.BitArray;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author ramon.pereira
 */
public class AlunoService {

    private String cep;
    private DocumentBuilder db = null;

    public AlunoService(String cep) {
        this.cep = cep;
    }

   
    public Endereco obterLogradouro() {
        
        String result = null; 
        Endereco endereco = null; 

        try {
            java.lang.String userkey = "WYQA6y5udY7u9UgYnUnuWanA";
            java.lang.String cep3 = "";
            defaultPackage.Bases4YouWSDL _service = new defaultPackage.Bases4YouWSDL_Impl();
            defaultPackage.Bases4YouWSDLPortType bases4YouWSDLPort = _service.getBases4YouWSDLPort();
            result = bases4YouWSDLPort.consultarCEP(userkey, cep);
            endereco = retornaEndereco(result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return endereco;

    }
    public Endereco retornaEndereco(String objetoXML) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Endereco end = null;
        try {
            db = dbf.newDocumentBuilder();
            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(objetoXML));  
            Document strXML = db.parse(is);
            NodeList list = strXML.getElementsByTagName("dado"); 
            
             for(int i=0; i < list.getLength(); i++){
                 end = new Endereco(); 
                 Element elemento = (Element) list.item(i);
                 
                 NodeList id = elemento.getElementsByTagName("id");
                 Element line = (Element) id.item(0);
                 end.setId(recuperaElemento(line));
                 
                 NodeList endereco = elemento.getElementsByTagName("endereco");
                 line = (Element) endereco.item(0);
                 end.setEndereco(recuperaElemento(line));
                 
                 NodeList bairro = elemento.getElementsByTagName("bairro");
                 line = (Element) bairro.item(0);
                 end.setBairro(recuperaElemento(line));
                 
                 NodeList cidade = elemento.getElementsByTagName("cidade");
                 line = (Element) cidade.item(0);
                 end.setCidade(recuperaElemento(line));
                 
                 NodeList uf = elemento.getElementsByTagName("uf");
                 line = (Element) uf.item(0);
                 end.setUF(recuperaElemento(line));
                 
                
        }
 return end;
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(AlunoService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (SAXException ex) {
            Logger.getLogger(AlunoService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (IOException ex) {
            Logger.getLogger(AlunoService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     *
     * @param e
     * @return
     */
    public String recuperaElemento(Element e) {
    Node child = e.getFirstChild();
    if (child instanceof CharacterData) {
       CharacterData cd = (CharacterData) child;
       return cd.getData();
    }
    return "?";
  }
    
}
