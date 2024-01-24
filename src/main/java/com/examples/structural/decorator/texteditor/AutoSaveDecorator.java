package com.examples.structural.decorator.texteditor;

public class AutoSaveDecorator implements FeatureDecorator {

  private final Editor editor;

  public AutoSaveDecorator(Editor editor) {
    this.editor = editor;
  }

  @Override
  public String edits() {
    return this.editor.edits() + " with auto save";
  }
}
