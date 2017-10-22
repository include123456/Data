package data.structure.linear;

public interface LinearTable<T> {

    /**
     * 销毁链表
     * @param t
     * @return
     */
    boolean  destroyList(T[] t);

    /**
     * 清空链表
     * @return
     */
    T clearLis(T[] t);
    /**
     * 判断线性表是否空
     * @return
     */
    boolean listIsEmpty() throws MyException;

    /**
     * 返回线性表长度
     * @return
     */
    int getLength();

    /**
     * 查找，返回首次出现的关键字为key元素
     * @param key
     * @return
     */
    int search(T key);

    /**
     * 返回数组中 key 元素的前驱(如果不是第一个)
     * @param key
     * @return
     */
    T priorElem(T key);

    /**
     * 返回数组中 key 元素的后继(如果不是最后一个)
     * @param key
     * @return
     */
    T nextElem(T key);
    /**
     * 返回第i（i≥0）个元素
     * @param i
     * @return
     */
    T getElem(int i);

    /**
     * 设置第i个元素值为x
     * @param i
     * @param x
     */
    void setElem(int i, T x);

    /**
     * 插入x作为第i个元素
     * @param i
     * @param x
     */
    void insertElem(int i, T x) throws MyException;

    /**
     * 在线性表最后插入x元素
     * @param x
     */
    void append(T x);

    /**
     * 删除第i个元素并返回被删除对象
     * @param i
     * @return
     */
    T remove(int i);

    /**
     * 删除线性表所有元素
     */
    void removeAll();

    /**
     * 将后一个集合添加到第一个集合中
     * @param first
     * @param second
     * @return
     */
    T[] addList(T [] first, T[] second);

}
