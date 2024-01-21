package com.github.mikybars.tdd;

class Display {

  private String text;

  public String lastTextDisplayed() {
    return text;
  }

  public void displayText(String text) {
    this.text = text;
  }
}
