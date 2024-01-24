package com.examples.structural.decorator.texteditor;

public class SpellCheckDecorator implements FeatureDecorator {

  private final Editor editor;

  public SpellCheckDecorator(Editor editor) {
    this.editor = editor;
  }

  @Override
  public String edits() {
    return this.editor.edits() + " with spell check";
  }
}
