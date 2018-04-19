package com.yulece.stack;

public interface Stack<E> {

    /*获取栈的大小*/
    int getSize();
    /*栈内是否为空*/
    boolean isEmpty();
    /*添加一个数据*/
    void push(E e);
    /*刪除一条数据*/
    E pop();
    /*查看栈顶数据*/
    E peek();
}
