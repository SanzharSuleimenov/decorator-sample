package io.rundev.refactoring_guru.decorator;

import io.rundev.refactoring_guru.DataSource;

public class EncryptionDecorator extends DataSourceDecorator {

  public EncryptionDecorator(DataSource wrappee) {
    super(wrappee);
  }

  @Override
  public void writeData(String data) {
    super.writeData(data);
  }

  @Override
  public String readData() {
    return super.readData();
  }
}
