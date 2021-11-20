import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class UniformeGirafales {

  private String name;
  private String uniformSize;
  private String uniformColor;

  public String getUniformColor() {
    return this.uniformColor;
  }

  public void setUniformColor(String uniformColor) {
    this.uniformColor = uniformColor;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUniformSize() {
    return this.uniformSize;
  }

  public void setUniformSize(String uniformSize) {
    this.uniformSize = uniformSize;
  }

  public UniformeGirafales(String name, String uniformColor, String uniformSize) {
    this.name = name;
    this.uniformColor = uniformColor;
    this.uniformSize = uniformSize;
  }

  public void printStudentInfos() {
    System.out.println(this.uniformColor + " " + uniformSize + " " + name);
  }

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.nextLine();
    ArrayList<UniformeGirafales> arrayUniforms = new ArrayList<>(N);
    String name, uniformDetails, uniformColor, uniformSize;

    for (int i = 0; i < N; i++) {
      name = scanner.nextLine();
      uniformDetails = scanner.nextLine();
      uniformColor = uniformDetails.split(" ")[0];
      uniformSize = uniformDetails.split(" ")[1];
      arrayUniforms.add(new UniformeGirafales(name, uniformColor, uniformSize));
    }

    scanner.close();
    Collections.sort(arrayUniforms, new UniformComparator());

    for (var item : arrayUniforms) {
      item.printStudentInfos();
    }
  }

  static class UniformComparator implements Comparator<UniformeGirafales> {
    @Override
    public int compare(UniformeGirafales student0, UniformeGirafales student1) {
      int res = student0.uniformColor.compareTo(student1.uniformColor);

      if (res == 0) {
        res = student0.uniformSize.compareTo(student1.uniformSize);

        if (res == 0) {
          res = student0.name.compareTo(student1.name);
        } else {
          res = -res;
        }
      }
      return res;
    }
  }
}