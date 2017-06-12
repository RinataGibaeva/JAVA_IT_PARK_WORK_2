package com.company;

import java.lang.reflect.Array;

public class ArrayList {
    // поле, таким образом
    // каждый экземпляр ArrayList
    // будет иметь свой count
    private int count;

    // поле хранилище элементов
    private int elements[];

    public ArrayList() {
        this.elements = new int[10];
    }

    public void addToEnd(int value) {
        addToIndex(value, count);
    }

    public void addToBegin(int value) {
        addToIndex(value, 0);
    }

    public void addToIndex(int value, int index) {
        // делаем свдиг вправо, начиная с конца (count)
        // пока не дойдем до индекса, куда ходим добавить элемент
        for (int i = count; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        // добавляем значение в нужный индекс
        elements[index] = value;
        count++;
    }

    public void removeByIndex(int index) {
        // делаем сдвиг влево, начиная от элемента, который хотим удалить
        for (int i = index; i < count -1; i++) {
            elements[i] = elements[i + 1];
        }
        // уменьшаем количество элементов
        count--;
    }

    public void removeDoub() {
        for (int i = 0; i < count; i++) {
           for (int j = 1; j < count; j++) {
               if (elements[i] == elements[j]) {
                   for (int z = i; z < count - 1; z++) {
                       elements[z] = elements[z + 1];
                   }

                   for (int f = j; f < count - 1; f++) {
                       elements[f] = elements[f + 1];
                   }
               }
           }
        }
    }

    public void removeByValue(int value) {
        // получили индекс удаляемого элемента
        int indexOfRemoved = indexOf(value);
        // удалили по индексу
        removeByIndex(indexOfRemoved);
    }

    public int indexOf(int value) {
        for (int i = 0; i < count; i++) {
            if (elements[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int get(int index) {
        return elements[index];
    }

    public int getCount() {
        return count;
    }

    public static ArrayList concat(ArrayList a, ArrayList b) {
        ArrayList result
                = new ArrayList();
        for(int i = 0; i < a.count; i++) {
            result.addToEnd(a.get(i));
        }

        for(int i = 0; i < b.count; i++) {
            result.addToEnd(b.get(i));
        }

        return result;
    }

    public static ArrayList doub(ArrayList a, ArrayList b) {
        ArrayList result = new ArrayList();
        for (int i = 0; i < a.count; i++) {
            for (int j = 0; j < b.count; j++) {
                if (a.get(i) == b.get(j)) {
                    result.addToEnd(a.get(i));
                    break;
                }
            }
        }
        return result;
    }
}