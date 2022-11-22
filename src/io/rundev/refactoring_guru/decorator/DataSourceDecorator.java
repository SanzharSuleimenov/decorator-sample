package io.rundev.refactoring_guru.decorator;

import io.rundev.refactoring_guru.DataSource;

public class DataSourceDecorator implements DataSource {

  protected final DataSource source;

  public DataSourceDecorator(DataSource source) {
    this.source = source;
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
