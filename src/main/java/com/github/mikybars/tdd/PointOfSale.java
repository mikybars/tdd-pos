package com.github.mikybars.tdd;

class PointOfSale {

  private final Display display;
  private final ProductCatalog productCatalog;

  PointOfSale(Display display, ProductCatalog productCatalog) {
    this.display = display;
    this.productCatalog = productCatalog;
  }

  public void onBarcodeReceived(String barcode) {
    try {
      String price = productCatalog.getPrice(new ProductId(barcode));
      display.displayText(price);
    } catch (InvalidProductId e) {
      display.displayText("Invalid product id");
    }
  }
}
