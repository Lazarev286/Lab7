
import lab6.Toys;

import java.util.*;

public class Set implements InterfaceSet<Toys> {


    private int capacity;
    private int size;
    private Toys[] array = null;

    public Set() {
        array = new Toys[15];
    }

    public Set(int capacity) {
        array = new Toys[capacity];
    }

    public Set(Toys toys) {
        array = new Toys[15];
        array[0] = toys;
        this.size++;
    }

    public Set(List<Toys> list) {
        if (list.size() > 15) {
            array = new Toys[list.size() + 2];
            array = list.toArray(array);
        } else {
            array = new Toys[15];
            array = list.toArray(array);
        }
    }


    @Override
    public boolean add(Toys toy) {
        int indexOfObject = getIndexExistObject(toy);

        if (indexOfObject > -1) {
            array[indexOfObject] = toy;
            return true;
        }
        if (this.size <= array.length - 2) {
            array[this.size++] = toy;
            return true;
        } else {
            int newCapacity = array.length + ((array.length * 30) / 100) + 1;
            Toys[] oldData = array;
            array = new Toys[newCapacity];

            System.arraycopy(oldData, 0, array, 0, size);

            array[this.size++] = toy;
            return true;
        }
    }


    private int getIndexExistObject(Toys toy) {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != null && this.array[i].equals(toy)) {
                return i;
            }
        }
        return -1;
    }


    void getSet() {
        System.out.println(Arrays.toString(this.array));
    }

    @Override
    public boolean remove(Toys toy) {
        int indexOfObject = getIndexExistObject(toy);
        if (indexOfObject == -1) {
            return false;
        } else {
            this.array[indexOfObject] = null;


            int numMoved = size - indexOfObject - 1;
            if (numMoved > 0)
                System.arraycopy(array, indexOfObject + 1, array, indexOfObject,
                        numMoved);

            this.size--;
            return true;
        }

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean contains(Toys toy) {
        return Arrays.asList(this.array).contains(toy);
    }





    @Override
    public Iterator<Toys> iterator() {

        Iterator<Toys> it = new Iterator<Toys>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size && array[currentIndex] != null;
            }

            @Override
            public Toys next() {
                return array[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
    }

