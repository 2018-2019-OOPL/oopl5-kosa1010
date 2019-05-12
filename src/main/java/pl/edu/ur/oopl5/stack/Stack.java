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
            int tab2[] = new int[tab.length * 2];
            for (int j = 0; j < tab.length; j++) {
                tab2[j] = tab[j];
            }
            tab = tab2;
            tab[size + 1] = i;
            size++;
            index++;
        } else {
            tab[size + 1] = i;
            size++;
            index++;
        }
    }

    @Override
    public int pop() {
        return tab[size];
    }

    @Override
    public boolean isEmpty() {
        return index == -1 ? true : false;

    }

}
