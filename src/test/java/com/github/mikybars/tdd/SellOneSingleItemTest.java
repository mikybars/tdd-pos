package com.github.mikybars.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SellOneSingleItemTest {

  Display display = new Display();
  PointOfSale pos = new PointOfSale();

  @Test
  void displayPriceTagForBarcodeReceived() {
    pos.onBarcodeReceived("12345\n");

    assertEquals("$11.45", display.lastTextDisplayed());
  }
}
