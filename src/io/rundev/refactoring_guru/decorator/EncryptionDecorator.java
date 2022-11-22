package io.rundev.refactoring_guru.decorator;

import io.rundev.refactoring_guru.DataSource;

import java.util.Base64;

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

  private String encode(String data) {
    byte[] result = data.getBytes();
    for (int i = 0; i < result.length; i++) {
      result[i] += (byte) 1;
    }
    return Base64.getEncoder().encodeToString(result);
  }

  private String decode(String data) {
    byte[] result = data.getBytes();
    for (int i = 0; i < result.length; i++) {
      result[i] -= (byte) 1;
    }
    return new String(result);
  }
}
