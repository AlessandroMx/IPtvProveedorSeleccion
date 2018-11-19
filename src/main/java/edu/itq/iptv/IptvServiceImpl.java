/**
 * IptvServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package edu.itq.iptv;

import edu.itq.iptv.business.BusinessLogic;
import iptv.itq.edu.RequestIptvProvSelDocument;
import iptv.itq.edu.ResponseIptvProvSelDocument;
import iptv.itq.edu.ResponseIptvProvSelDocument.ResponseIptvProvSel;

/**
 * IptvServiceSkeleton java skeleton for the axisService
 */
public class IptvServiceImpl extends IptvProveedorSeleccionServiceSkeleton {

    private BusinessLogic businessLogic;

    public ResponseIptvProvSelDocument iptvOperation(RequestIptvProvSelDocument requestIptv) {
        ResponseIptvProvSelDocument doc = ResponseIptvProvSelDocument.Factory.newInstance();
        ResponseIptvProvSel resp = doc.addNewResponseIptvProvSel();
        
        // Obtain parameters from request...
        int idSolicitud = requestIptv.getRequestIptvProvSel().getIdSolicitud();

        // Call business logic...
        String response = businessLogic.selectService(idSolicitud);

        resp.setRespuesta(response);
        return doc;
    }

    /**
     * @param businessLogic the businessLogic to set
     */
    public void setBusinessLogic(BusinessLogic businessLogic) {
        this.businessLogic = businessLogic;
    }

}
