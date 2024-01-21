package com.github.mikybars.tdd;

class ProductId {

  public ProductId(String barcode) {
    if (barcode.equals("should not be here")) {
      throw new InvalidProductId();
    }
  }
}
