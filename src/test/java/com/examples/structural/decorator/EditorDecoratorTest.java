package com.examples.structural.decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.examples.structural.decorator.texteditor.AutoSaveDecorator;
import com.examples.structural.decorator.texteditor.Editor;
import com.examples.structural.decorator.texteditor.FormattingDecorator;
import com.examples.structural.decorator.texteditor.PictureEditor;
import com.examples.structural.decorator.texteditor.SpellCheckDecorator;
import com.examples.structural.decorator.texteditor.TextEditor;
import org.junit.jupiter.api.Test;

class EditorDecoratorTest {

  @Test
  void testTextEditorWithSpellCheck() {
    Editor editor = new SpellCheckDecorator(new TextEditor());
    final var result = editor.edits();
    assertEquals("edits text with spell check", result);
  }

  @Test
  void testTextEditorWithSpellCheckAndFormatting() {
    Editor editor = new SpellCheckDecorator(new FormattingDecorator(new TextEditor()));
    final var result = editor.edits();
    assertEquals("edits text with formatting with spell check", result);
  }

  @Test
  void testPictureEditorWithAutoSave() {
    Editor editor = new AutoSaveDecorator(new PictureEditor());
    final var result = editor.edits();
    assertEquals("edits picture with auto save", result);
  }

}
