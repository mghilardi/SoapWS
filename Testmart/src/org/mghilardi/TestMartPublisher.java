package org.mghilardi;

import javax.xml.ws.Endpoint;

/**
 * Class to test the SOAP WS.
 * Just call Endpoint.publish, define address and pass a @WebService annotated object.
 * Run As > Java application
 * Access the address on browser.
 * @author Mauricio
 *
 */
public class TestMartPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1234/productcatalog", new ProductCatalog());
	}

}
