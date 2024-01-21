package com.github.mikybars.tdd;

class ProductCatalog {

  public String getPrice(String barcode) {
    if ("12345\n".equals(barcode)) {
      return "$11.45";
    } else if ("12346\n".equals(barcode)) {
      return "$8.95";
    }
    return null;
  }
}
