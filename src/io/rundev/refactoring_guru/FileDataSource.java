package io.rundev.refactoring_guru;

public class FileDataSource implements DataSource {

  private final String fileName;

  public FileDataSource(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void writeData(String data) {
    System.out.printf("Writing data: '%s' to %s", data, fileName);
    // TODO: implement writing to file
  }

  @Override
  public String readData() {
    // TODO implement reading from file
    return null;
  }
}
