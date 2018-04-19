package com.yulece.stack;

import com.yulece.array.ArrayList;

public class ArrayStack<E> implements Stack<E> {
    private ArrayList<E> arrayList;

    public ArrayStack(int capacity){
        arrayList = new ArrayList<>(capacity);
    }

    public ArrayStack(){
        arrayList = new ArrayList<>();
    }



    @Override
    public int getSize() {
        return arrayList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    public int getCacity(){
        return arrayList.getCapacity();
    }

    @Override
    public void push(E e) {
        arrayList.addLast(e);
    }

    @Override
    public E pop() {
        return arrayList.getFirst();
    }

    @Override
    public E peek() {
        return arrayList.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("ArrayStack is size = %d \n",arrayList.getSize()));
        stringBuilder.append("[");
        for (int i = 0 ;i<arrayList.getSize() ;i++){
            stringBuilder.append(arrayList.get(i));
            if (i!=arrayList.getSize() - 1 ){
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("] TOP \n");
        return stringBuilder.toString();
    }
}
