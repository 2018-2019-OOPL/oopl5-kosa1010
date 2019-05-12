package pl.edu.ur.oopl5.stack;

import java.util.EmptyStackException;

/**
 */
public class Stack extends AbstractStack {

    int[] tab;
    int size = 0;
    int index = -1;

    public Stack(int a) {
        tab = new int[a];
    }

    @Override
    public void push(int i) {
        if (tab.length - 1 == size) {
            throw new StackOverflowError();
        } else {
            tab[size] = i;
            size++;
            index++;
        }
    }

    @Override
    public int pop() {
        if (index < 0) {
            throw new EmptyStackException();
        }
        int tmp = tab[size-1];
        index--;
        size--;
        return tmp;
    }

    @Override
    public boolean isEmpty() {
        return index == -1 ? true : false;

    }

}
