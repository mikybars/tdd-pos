package com.github.mikybars.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import org.junit.jupiter.api.Test;

class SellOneSingleItemTest {

  Display display = new Display();
  ProductCatalog productCatalog = new ProductCatalogMock(Map.of(
      "12345\n", "$11.45",
      "12346\n", "$8.95"
  ));
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
