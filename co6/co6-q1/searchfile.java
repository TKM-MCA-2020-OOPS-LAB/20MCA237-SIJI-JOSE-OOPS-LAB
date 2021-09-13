import java.io.File;
import java.io.FilenameFilter;
class MyFilenameFilter implements FilenameFilter {
    
    String init;
    
    public MyFilenameFilter(String initials)
    {
        this.init = init;
    }
    
    public boolean accept(File dir, String name)
    {
        return name.startsWith(init);
    }
}

class searchfile {
  public static void main(String[] args) {
    File file = new File("C:\\Users\\Siji Jose\\Desktop\\java");
    String[] fileList = file.list();

    for(String str : fileList) {
      System.out.println(str);
    }
    File directory = new File("/home/user/");
    
    MyFilenameFilter filter= new MyFilenameFilter("mark.java");

    String[] fli = directory.list(filter);
    if (fli == null) {
        System.out.println(
            "Empty directory or directory does not exists.");
    }
    else {

        for (int i = 0; i < fli.length; i++) {
            System.out.println(fli[i]+" FOUND");
        }
    }
  }
}


