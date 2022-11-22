package io.rundev.refactoring_guru.model;

public interface DataSource {

  void writeData(String data);

  String readData();
}
