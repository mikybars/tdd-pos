package com.github.mikybars.tdd;

class PointOfSale {

  private final Display display;

  PointOfSale(Display display) {
    this.display = display;
  }

  public void onBarcodeReceived(String barcode) {
    if ("12345\n".equals(barcode)) {
      display.displayText("$11.45");
    } else if ("12346\n".equals(barcode)) {
      display.displayText("$8.95");
    }
  }
}
