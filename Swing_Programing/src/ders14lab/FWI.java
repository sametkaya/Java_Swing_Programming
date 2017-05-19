/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders14lab;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author samet
 */
public class FWI implements FileVisitor{

    @Override
    public FileVisitResult preVisitDirectory(Object dir, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FileVisitResult visitFile(Object file, BasicFileAttributes attrs) throws IOException {
       Path p= (Path)file; //To change body of generated methods, choose Tools | Templates.
       
       PathMatcher pm= FileSystems.getDefault().getPathMatcher("glob:**.{log}");
       if(pm.matches(p)){
            System.out.println(p.toString());
       }
       return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Object file, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FileVisitResult postVisitDirectory(Object dir, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE; //To change body of generated methods, choose Tools | Templates.
    }
    
}
