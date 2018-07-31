package test2;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Vector;

class Gen<T extends java.util.List> {
    T ob1;

    Gen(T o1) {
        ob1 = o1;
    }

    void ShowType() {
        System.out.println("Type T: " + ob1.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    public void showCollectionElements(T ob1) {
        for (Object v : ob1) {
            System.out.println("Element is: " + v);
        }
    }

    public <R> R addCollectionElement(T ob1, R element) {
        getOb1().add(element);
        return element;
    }
}

public class MyClass {
    public static void main(String[] args) {
        Gen<Vector> vectorGen = new Gen(new Vector());
        vectorGen.ShowType();
        vectorGen.addCollectionElement(vectorGen.getOb1(), "Vector");
        vectorGen.addCollectionElement(vectorGen.getOb1(), 111);
        vectorGen.addCollectionElement(vectorGen.getOb1(), new Date());
        vectorGen.showCollectionElements(vectorGen.getOb1());
        System.out.println();

        Gen<ArrayList> arrayListGen = new Gen(new ArrayList());
        arrayListGen.ShowType();
        arrayListGen.getOb1().add(0, "ArrayList");
        arrayListGen.getOb1().add(1, 222);
        arrayListGen.getOb1().add(2, new Date());
        arrayListGen.showCollectionElements(arrayListGen.getOb1());
        System.out.println();

        Gen<LinkedList> linkedListGen = new Gen(new LinkedList());
        linkedListGen.ShowType();
        linkedListGen.getOb1().add(0, "LinkedList");
        linkedListGen.getOb1().add(1, 222);
        linkedListGen.getOb1().add(2, new Date());
        linkedListGen.showCollectionElements(linkedListGen.getOb1());
    }
}
