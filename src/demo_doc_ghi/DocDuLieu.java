package demo_doc_ghi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DocDuLieu {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Student> list;

        ObjectInputStream doc = new ObjectInputStream(new FileInputStream("src/data/sinhvien.abc"));
        list = (List<Student>) doc.readObject();
        doc.close();
        list.stream().forEach(stu-> System.out.println(stu));
    }
}
