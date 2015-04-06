package org.mghilardi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(name = "TestMartInfo", targetNamespace = "http://www.testmart.info.com")
@SOAPBinding(style = Style.DOCUMENT)
public interface IShopInfo {

	@WebMethod
	@WebResult(name = "lookupOutput", partName = "lookupOutput")
	public abstract String getShopInfo(@WebParam(name = "lookupInput") String property) throws InvalidInputException;

}