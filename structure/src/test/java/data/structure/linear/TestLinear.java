package data.structure.linear;

import java.util.ArrayList;
import java.util.List;

public class TestLinear {
    public static void main(String[] args) throws Exception {
        //初始化table 大小为3个长度的顺序链表
        List<String> list = new ArrayList<String>();
        Table<Integer> table = new Table<Integer>(1);
        System.out.println(" kaishi ");
        table.append(44);
        table.append(88);
        table.append(22);
        table.insertElem(2,44);
        System.out.println("end " + table.toString());
    }
}
