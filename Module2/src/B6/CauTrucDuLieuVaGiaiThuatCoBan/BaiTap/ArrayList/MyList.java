package B6.CauTrucDuLieuVaGiaiThuatCoBan.BaiTap.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object element[];

    public MyList(int capacity) {
        if (capacity > 0) {
            this.element = new Object[capacity];
        } else {
            this.element = new Object[]{};
        }
    }

    public MyList() {
        this.element = new Object[DEFAULT_CAPACITY];
    }

    public void add(int index, E element) {
        Object[] arr = new Object[this.element.length];
        if (index <= size) {
            for (int i = 0; i < size + 1; i++) {
                if (i < index) {
                    arr[i] = this.element[i];
                }
                if (i == index) {
                    arr[i] = element;
                }
                if (i > index) {
                    arr[i] = this.element[i - 1];
                }
            }
            size++;
        } else if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < arr.length; i++) {
            this.element[i] = arr[i];
        }
    }

    public void displayArray() {
        System.out.print("Arr = [");
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                System.out.print(this.element[i]);
            } else {
                System.out.print(this.element[i] + ",");
            }
        }
        System.out.println("]");
    }

    public E remove(int index) {
        Object[] arr = new Object[this.element.length];
        if (index <= size) {
            for (int i = 0; i < size - 1; i++) {
                if (i < index) {
                    arr[i] = this.element[i];
                }
                if (i >= index) {
                    arr[i] = this.element[i + 1];
                }
            }
            size--;
        } else {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < arr.length; i++) {
            this.element[i] = arr[i];
        }
        return (E) arr;
    }

    public E get(int i) {
        return (E) this.element[i];
    }

    public void clear() {
        this.element = null;
        size = 0;
    }

    //    private E clone() {
//
//    }
//
//    public boolean contains(E o) {
//    }
//
//    public int indexOf() {
//    }
//
    public boolean add(E e) {
        this.element[size] = e;
        size++;
        return true;
    }

    public static void main(String[] args) {
        MyList<Integer> arr = new MyList<Integer>();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.displayArray();
        arr.add(4,9);
        arr.displayArray();
        arr.clear();
        arr.remove(5);
        arr.displayArray();



    }
}

