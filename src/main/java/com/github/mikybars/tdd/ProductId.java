package com.github.mikybars.tdd;

record ProductId(String barcode) {

  ProductId {
    if (barcode.equals("should not be here")) {
      throw new InvalidProductId();
    }
  }
}
