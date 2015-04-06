package org.mghilardi.business;

import java.util.ArrayList;
import java.util.List;

import org.mghilardi.model.Product;

public class ProductServiceImpl {

	final List<String> books = new ArrayList<String>();
	final List<String> musics = new ArrayList<String>();
	final List<String> movies = new ArrayList<String>();

	final List<Product> prdBooks = new ArrayList<Product>();
	final List<Product> prdMusics = new ArrayList<Product>();
	final List<Product> prdMovies = new ArrayList<Product>();

	public ProductServiceImpl() {
		books.add("Inferno");
		books.add("Joyland");
		books.add("The Game of Thrones");

		musics.add("Clean Bandit - Rather Be (Ft. JESS GLYNN)");
		musics.add("Christine and the Queens - Christine");
		musics.add("Louane - Avenir");

		movies.add("Oz the Great and Powerful");
		movies.add("Despicable Me");
		movies.add("Star Trek Into Darkness");

		prdBooks.add(new Product("Java Book", "1234", 999999.99));
		prdBooks.add(new Product("Maven Book", "ABC", 999999.99));
		prdBooks.add(new Product("Design Patterns", "a43", 999999.99));

		prdMusics.add(new Product("Clean Bandit - Rather Be (Ft. JESS GLYNN)", "1234", 999999.99));
		prdMusics.add(new Product("Christine and the Queens - Christine", "ABC", 999999.99));
		prdMusics.add(new Product("Louane - Avenir", "a43", 999999.99));

		prdMovies.add(new Product("Oz the Great and Powerful", "1234", 999999.99));
		prdMovies.add(new Product("Despicable Me", "ABC", 999999.99));
		prdMovies.add(new Product("Star Trek Into Darkness", "a43", 999999.99));
	}

	public boolean addProduct(String category, String product){

		switch (category.toLowerCase()) {
		case "books":
			books.add(product);
			break;
		case "music" :
			musics.add(product);
			break;
		case "movies" :
			movies.add(product);
			break;
		default:
			return false;
		}

		return true;
	}

	public List<String> getProductCategories() {
		final List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}

	public List<String> getProducts(String category){
		if (category != null) {
			switch (category.toLowerCase()) {
			case "books":
				return books;
			case "music" :
				return musics;
			case "movies" :
				return movies;
			default:
				break;
			}
		}

		return null;
	}

	public List<Product> getProductsV2(String category) {
		if (category != null) {
			switch (category.toLowerCase()) {
			case "books":
				return prdBooks;
			case "music":
				return prdMusics;
			case "movies":
				return prdMovies;
			default:
				break;
			}
		}
		return null;
	}
}
