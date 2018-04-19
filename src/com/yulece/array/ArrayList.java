package com.yulece.array;
public class ArrayList<E> {
    private E[] data;

    private int size;

    public ArrayList(int capacity){
        data = (E[])new Object[capacity];
        this.size = 0;
    }

    public ArrayList(){
        this(10);
    }
    //获取数组现在的实际长度
    public int getSize(){
        return size;
    }
    //获取数组开辟的空间大小
    public int getCapacity(){
        return data.length;
    }
    //判断数据是否为空
    public boolean isEmpty(){
        return size == 0;
    }
    //向数组中添加元素
    public void addLast(E e){
        add(size,e);
    }
    /*向數組第一个位置添加元素*/
    public void addFirst(E e){
        add(0,e);
    }
    /*获取指定位置元素*/
    public E get(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("get error, index is illegal");
        }
        return data[index];
    }
    public E getFirst(){
        return data[0];
    }
    public E getLast(){
        return data[size-1];
    }
    /*
     * 更新數組中需要的位置
     * */
    public void set(Integer index, E e){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("set error, index is illegal");
        }
        data[index] = e;
    }


    //将规定的数据插入规定的位置
    public void add(int index, E i){
        if(data.length == size) {
            //进行数组扩容
            dilatation(data.length * 2);
        }
        if(index < 0 || index > size){
            throw new IllegalArgumentException("add error,data is full,require index < 0 || index > size");
        }
        for(int e = size-1 ; e >= index; e--){
            data[e + 1] = data[e];
        }
        data[index] = i;
        size++;
    }
    /*动态数组*/
    private void dilatation(Integer capacity) {
        E[] temp = (E[])new Object[capacity];
        for (int i = 0; i < size;i++){
            temp[i] = data[i];
        }
        data = temp;
    }


    //查询数组中是否包含该元素
    public boolean contains(E e){
        for (int i = 0;i < size ; i++){
            if (data[i].equals(e)){
                return true;
            }
        }
        return false;
    }

    /*查詢元素所在位置的,如果查询不到返回-1*/
    public int find(E e){
        for (int i = 0;i < size ; i++){
            if (data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    //删除一个元素 返回该元素
    public E remove(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Remove error,index is illegal");
        }
        E result = data[index];
        for (int i = index + 1 ;i < size ;i++){
            data[i-1] = data[i];
        }
        size --;
        if(size == data.length/2 && data.length/2!=0){
            dilatation(data.length/2);
        }
        return result;
    }
    //删除最后一个元素
    public E removeLast(){
        return remove(size-1);
    }
    //删除第一个元素
    public E removeFirst(){
        return remove(0);
    }
    //根据元素删除
    public void deleteOne(E e){
        int index = find(e);
        if(index!=-1){
            remove(index);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Array is size = %d,capacity = %d \n",size,data.length));
        stringBuilder.append("[");
        for (int i = 0 ;i<size ;i++){
            stringBuilder.append(data[i]);
            if (i!=size - 1 ){
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("] \n");
        return stringBuilder.toString();
    }
}
