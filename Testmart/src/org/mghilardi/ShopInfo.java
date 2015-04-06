package org.mghilardi;

import javax.jws.WebService;

/**
 * @SOAPBinding
 * Style.DOCUMENT creates Xsd for each type and permit validation
 * Style.RPC all type information are in the wsdl but you cannot validate.
 */
@WebService(endpointInterface = "org.mghilardi.IShopInfo", portName = "ShopInfoPort", serviceName = "ShopInfoService")
public class ShopInfo implements IShopInfo {

	/* (non-Javadoc)
	 * @see org.mghilardi.IShopInfo#getShopInfo(java.lang.String)
	 */
	@Override
	public String getShopInfo(String property) throws InvalidInputException {
		String response = null;
		if ("shopname".equals(property)) {
			response = "Test Mart";
		} else if ("since".equals(property)) {
			response = "since 2012";
		} else {
			throw new InvalidInputException("Invalid Input", property);
		}

		return response;
	}
}
