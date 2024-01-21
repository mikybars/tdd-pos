package com.github.mikybars.tdd;

class PointOfSale {

  private final Display display;
  private final ProductCatalog productCatalog;

  PointOfSale(Display display, ProductCatalog productCatalog) {
    this.display = display;
    this.productCatalog = productCatalog;
  }

  public void onBarcodeReceived(String barcode) {
    if ("12345\n".equals(barcode)) {
      String price = productCatalog.getPrice(barcode);
      display.displayText(price);
    } else if ("12346\n".equals(barcode)) {
      String price = productCatalog.getPrice(barcode);
      display.displayText(price);
    }
  }

}
