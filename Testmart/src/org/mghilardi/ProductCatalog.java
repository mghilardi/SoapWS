package org.mghilardi;

import java.util.List;

import javax.jws.WebService;

import org.mghilardi.business.ProductServiceImpl;
import org.mghilardi.model.Product;

/**
 * To test:
 * On glassfish console http://localhost:4848/common/index.jsf
 * Applications > Testmart
 * On table click View Endpoint in ProductCatalog
 * Tester: /Testmart/ProductCatalogService?Tester
 * WSDL: /Testmart/ProductCatalogService?wsdl
 * OR use TestMartPublisher
 * OR use SOAP UI pespective
 *
 * @return
 */

@WebService(endpointInterface = "org.mghilardi.IProductCatalog", portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService")
public class ProductCatalog implements IProductCatalog {

	private final ProductServiceImpl productService = new ProductServiceImpl();

	/* (non-Javadoc)
	 * @see org.mghilardi.IProductCatalog#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}

	// @WebMethod(exclude = true)
	/* (non-Javadoc)
	 * @see org.mghilardi.IProductCatalog#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories() {
		return productService.getProductCategories();
	}

	/* (non-Javadoc)
	 * @see org.mghilardi.IProductCatalog#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}

	/* (non-Javadoc)
	 * @see org.mghilardi.IProductCatalog#getProductsV2(java.lang.String)
	 */
	@Override
	public List<Product> getProductsV2(String category) {
		return productService.getProductsV2(category);
	}
}
