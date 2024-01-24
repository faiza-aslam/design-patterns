package com.examples.structural.decorator.texteditor;

public class FormattingDecorator implements Editor {

  private final Editor editor;

  public FormattingDecorator(Editor editor) {
    this.editor = editor;
  }

  @Override
  public String edits() {
    return this.editor.edits() + " with formatting";
  }
}
