package io.rundev.refactoring_guru.model;

import java.io.*;

public class FileDataSource implements DataSource {

  private final String fileName;

  public FileDataSource(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void writeData(String data) {
    System.out.printf("Writing data: '%s' to %s\n", data, fileName);
    File file = new File(fileName);
    try (OutputStream out = new FileOutputStream(file)) {
      out.write(data.getBytes(), 0, data.length());
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }

  @Override
  public String readData() {
    System.out.printf("Reading data from '%s'\n", fileName);
    char[] buffer = null;
    File file = new File(fileName);
    try (FileReader reader = new FileReader(file)) {
      buffer = new char[(int) file.length()];
      reader.read(buffer);
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
    return new String(buffer);
  }
}
