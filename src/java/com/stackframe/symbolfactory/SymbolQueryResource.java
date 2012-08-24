/*
 *   Copyright (c) 2011 All Rights Reserved
 *       StackFrame, LLC - www.stackframe.com
 *
 *   Contract No.: N61339-05-C-0078-P00014
 *   Classification: Unclassified
 *   This work was generated under U.S. Government contract and the
 *   U.S. Government has unlimited data rights therein.
 */
package com.stackframe.symbolfactory;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * @author brent
 *
 */
public class SymbolQueryResource extends ServerResource {

    @Get("json")
    public String getSymbol() {
        String sidc = (String) getRequest().getAttributes().get("id");
        return SymbolQueryServer.getInstance().getSymbol(sidc);
    }
}