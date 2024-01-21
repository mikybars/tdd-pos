package com.github.mikybars.tdd;

import java.util.Map;

class ProductCatalogMock extends ProductCatalog {

  private final Map<ProductId, String> prices;

  ProductCatalogMock(Map<ProductId, String> prices) {
    this.prices = prices;
  }

  @Override
  public String getPrice(ProductId productId) {
    return prices.getOrDefault(productId, "Product not found");
  }

  @Override
  public String getPrice(String barcode) {
    try {
      new ProductId(barcode);
      return prices.getOrDefault(barcode, "Product not found");
    } catch (InvalidProductId e) {
      return "Invalid product id";
    }
  }
}
