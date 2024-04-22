package File;

import java.io.File;
public class FileInfo {
public static void main(String[] args) throws java.io.IOException {
File f = new File("C:\\Users\\vince\\OneDrive\\Desktop");
System.out.println(f.exists());
System.out.println(f.isFile());
System.out.println(f.isDirectory());
System.out.println(f.canRead());
System.out.println(f.canWrite());
System.out.println(f.length());
System.out.println(f.getAbsolutePath());
System.out.println(f.getPath());
System.out.println(f.getName());
System.out.println(f.getParent());
File p = new File(f.getAbsolutePath());
System.out.println(p.getParent());
}
}
