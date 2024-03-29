package datastructures.stack;


public class ArrayStack implements Stack{
    private int size;
    private Object[] array;

    public  ArrayStack(){
        array = new Object[16];
    }

    public  ArrayStack(int size){
        array = new ArrayStack[size];
    }

    @Override
    public void push(Object value){
        array[size] = value;
        size++;
    }

    @Override
    public Object pop(){
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        Object result = array[size-1];
        size--;
        return result;
    }

    @Override
    public Object peek(){
        return array[size-1];
    }

    @Override
    public boolean contains(Object value){
        for (Object valueInStack : array) {
            if(value.equals(valueInStack)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public void clear(){
        size = 0;
    }


}
