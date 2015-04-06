package org.mghilardi.soap;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

/*
 * http://www.webservicex.net/ws/WSDetails.aspx?CATID=12&WSID=64
 * http://www.webservicex.net/geoipservice.asmx?WSDL tag wsdl:service and wsdl:port to discover which classes generated to use.
 */

public class IPLocationFinder {

	// dw.de 95.100.97.41
	// google 74.125.239.142
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("You need to insert one IP address");
		} else {
			final String ipAddress = args[0];
			// create a new instance of the service
			final GeoIPService ipService = new GeoIPService();
			// create a a soap object of the service
			final GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
			// call the address of the service
			final GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
			System.out.println(geoIP.getCountryName());
		}
	}
}
