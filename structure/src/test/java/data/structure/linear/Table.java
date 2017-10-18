package data.structure.linear;

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

    public int length() {
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
        for(int i = 0 ;i<len;i++){
            str =i+"="+object[i]+",";
        }
        return str;
    }

    public void insertElem(int i, T x) {
        //数组长度不够
        Object[] temp = new Object[this.len == object.length ? ININT_LENGTH * 2 : object.length];
        for (int j = 0; j < this.len; i++) {
            temp[j] = object[j];
        }
        //插入数据 进行移动
        temp[i] = x;

        for (int j = len; j > i; j--) {
            temp[j + 1] = temp[j];
        }
        object = temp;
        this.len=this.len++;
    }

    public void append(T x) {

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
