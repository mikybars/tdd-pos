package com.github.mikybars.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SellOneSingleItemTest {

  Display display = new Display();
  ProductCatalog productCatalog = new ProductCatalogMock(Map.of(
      "12345\n", "$11.45",
      "12346\n", "$8.95"
  ));
  PointOfSale pos = new PointOfSale(display, productCatalog);

  @ParameterizedTest
  @CsvSource(value = {
      "'12345\n', $11.45",
      "'12346\n', $8.95",
  })
  void displayPriceTagForBarcodeReceived(String barcode, String expectedPrice) {
    pos.onBarcodeReceived(barcode);

    assertEquals(expectedPrice, display.lastTextDisplayed());
  }

  @Test
  void displayProductNotFound() {
    pos.onBarcodeReceived("99999\n");

    assertEquals("Product not found", display.lastTextDisplayed());
  }
}
