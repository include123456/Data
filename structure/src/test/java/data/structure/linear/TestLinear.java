package data.structure.linear;

import java.util.ArrayList;
import java.util.List;

public class TestLinear {
    public static void main(String[] args) throws Exception {
        //初始化table 大小为3个长度的顺序链表
        Table table = new Table<Integer>(1);
        System.out.println(" kaishi " + table.toString());
        table.insertElem(0, 0);
        table.insertElem(1, 1);
/*        table.insertElem(2, 2);
        table.insertElem(3, 3);*/
        System.out.println("end " + table.toString());
    }
}
