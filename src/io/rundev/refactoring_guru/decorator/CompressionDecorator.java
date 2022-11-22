package io.rundev.refactoring_guru.decorator;

import io.rundev.refactoring_guru.DataSource;

public class CompressionDecorator extends DataSourceDecorator {

  public CompressionDecorator(DataSource source) {
    super(source);
  }

  @Override
  public void writeData(String data) {
    source.writeData(data);
  }

  @Override
  public String readData() {
    return source.readData();
  }
}
