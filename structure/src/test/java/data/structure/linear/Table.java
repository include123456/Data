package data.structure.linear;

import org.omg.CORBA.OBJ_ADAPTER;

public class Table<T> implements LinearTable<T> {
    private Object[] object = {};
    private static int ININT_LENGTH = 2;
    private int len;

    public Table() {
        this.object = new Object[ININT_LENGTH];
    }

    /**
     * 初始化大小
     *
     * @param size
     */
    public Table(int size) throws MyException {
        if (size > 0) {
            this.object = new Object[size];
        } else if (size == 0) {
            this.object = new Object[ININT_LENGTH];
        } else {
            throw new MyException("error");
        }
    }

    public boolean destroyList(T[] t) {
        return false;
    }

    public T clearLis(T[] t) {
        return null;
    }

    public boolean listIsEmpty() {
        return this.len == 0;
    }

    public int getLength() {
        return this.len;
    }

    public int search(T key) {
        if (key == null) {
            for (int i = 0; i < this.len; i++) {
                if (object[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < this.len; i++) {
                if (key.equals(object[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public T priorElem(T key) {
        return null;
    }

    public T nextElem(T key) {
        return null;
    }

    public T getElem(int i) {
        return null;
    }

    public void setElem(int i, T x) {

    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < this.len; i++) {
            System.out.println(i + "=" + object[i] + ",");
        }
        return str;
    }

    public void insertElem(int i, T x) throws MyException {
        //插入位置判断 是否合法
        if(i>this.len) {
            throw new MyException("this.len=" + this.len + "and i =" + i);
        }
        Object[] temp= object;
        //数组长度检验
        if(this.len+1 > object.length) {
            object = new Object[object.length*2];
            for(int j=0;j<=temp.length;j++){
                object[j] = temp[j];
            }
        }
        //数组移动
        for(int j =this.len - 1;j>=i;j--){
            object[j+1] = object[j];
        }
        object[i] = x;
        //增加链表数量
        this.len++;
    }

    public void append(T x) {
        Object[] temp= new Object[object.length];
        if(this.len+1 >object.length) {
             temp = new Object[object.length*2];
        for (int i=0;i<this.len;i++) {
            temp[i] = object[i];
        }
            temp[this.len++] = x;
          object= temp;
        } else {
            object[this.len++] = x;
        }
    }

    public T remove(int i) {
        return null;
    }

    public void removeAll() {

    }

    public T[] addList(T[] first, T[] second) {
        return null;
    }
}
