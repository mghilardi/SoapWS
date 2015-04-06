package org.mghilardi;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.mghilardi.model.Product;

@WebService(name = "TestMartCatalog", targetNamespace = "http://www.testmart.com")
public interface IProductCatalog {

	@WebMethod
	public abstract boolean addProduct(@WebParam(name = "category") String category, String product);

	@WebMethod(action = "fetch_categories", operationName = "fetchCategories")
	@WebResult(name = "category")
	public abstract List<String> getProductCategories();

	@WebMethod
	@WebResult(name = "product")
	// output parameter tag name will be product
	public abstract List<String> getProducts(@WebParam(name = "category") String category); // intput parameter tag name will be category

	@WebMethod
	@WebResult(name = "product2")
	public abstract List<Product> getProductsV2(@WebParam(name = "category") String category);

}