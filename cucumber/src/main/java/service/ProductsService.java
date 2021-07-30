package service;

import pages.ProductsPage;

import java.util.Random;

public class ProductsService {


    private final ProductsPage productsPage = new ProductsPage();

    public int buyRandomProducts(){
        Random random = new Random();
        final int size = productsPage.getCardList().size();

        final int randomValue = random.nextInt(size);
        productsPage.getCardList().getModel(randomValue).buy();

        return randomValue;
    }
}
