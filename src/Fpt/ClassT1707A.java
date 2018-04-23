/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fpt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diep.Tran
 */
public class ClassT1707A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
//        Student student = new Student(0, "A", "Nam Dinh");
//        
        File file = new File("/Users/Diep.Tran/Desktop/vidu.obj");
//        FileOutputStream out = new FileOutputStream(file);
//        ObjectOutputStream outObj = new ObjectOutputStream(out);
//        outObj.writeObject(student);
//        outObj.close();
//        out.close();
        FileInputStream in = new FileInputStream(file);
        ObjectInputStream inObj = new ObjectInputStream(in);
        Student std = (Student) inObj.readObject();
        inObj.close();
        in.close();
        System.out.println(std.toString());
        
//        File file = new File("/Users/Diep.Tran/Desktop/vidu.txt");
//        try {
////            FileOutputStream out = new FileOutputStream(file);
////            String data = "Sinh Vien Aptech";
////            out.write(data.getBytes());
////            out.close();
//            FileInputStream in = new FileInputStream(file);
//            byte[] b = new byte[10240];
//            in.read(b);
//            System.out.println(String.valueOf(b));
//            in.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ClassT1707A.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }
    
}
