package com.github.mikybars.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SellOneSingleItemTest {

  Display display = new Display();
  ProductCatalog productCatalog = new ProductCatalog();
  PointOfSale pos = new PointOfSale(display, productCatalog);

  @Test
  void displayPriceTagForBarcodeReceived() {
    pos.onBarcodeReceived("12345\n");

    assertEquals("$11.45", display.lastTextDisplayed());
  }

  @Test
  void displayPriceTagForAnotherBarcodeReceived() {
    pos.onBarcodeReceived("12346\n");

    assertEquals("$8.95", display.lastTextDisplayed());
  }
}
