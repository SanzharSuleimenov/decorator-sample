package io.rundev.refactoring_guru;

import io.rundev.refactoring_guru.decorator.CompressionDecorator;
import io.rundev.refactoring_guru.decorator.DataSourceDecorator;
import io.rundev.refactoring_guru.decorator.EncryptionDecorator;
import io.rundev.refactoring_guru.model.DataSource;
import io.rundev.refactoring_guru.model.FileDataSource;

public class Client {

  public static void main(String[] args) {
    String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
    DataSourceDecorator encoded = new CompressionDecorator(
      new EncryptionDecorator(
        new FileDataSource("out/OutputDemo.txt")));
    encoded.writeData(salaryRecords);
    DataSource plain = new FileDataSource("out/OutputDemo.txt");
    
    System.out.println("- Input ----------------");
    System.out.println(salaryRecords);
    System.out.println("- Encoded --------------");
    System.out.println(plain.readData());
    System.out.println("- Decoded --------------");
    System.out.println(encoded.readData());
  }


}
