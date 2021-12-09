package ru.levelup.lesson6;
//Список на основе массива (динамический масиив)
//add()-добавление в конце списка
public class DynamicArray extends AbstractList implements Structure{

    private int nextElementIndex; //индекс куда вставим следующий элемент
    private int[] elements;
    public DynamicArray(){
        this.elements=new int[3];
        this.size=0;
        this.nextElementIndex=0;

    }
    @Override
    //добавление элемента в конец списка
    public void add(int value){
        if(elements.length==size){
            //массив заполнен и его нужно увеличить
            int[] oldElements=elements;
            elements=new int[(int)(elements.length*1.5)];
            System.arraycopy(oldElements,0,elements,0,oldElements.length);//метод для копирования массива в другой
        }
        //вставка элемента в массив
        elements[nextElementIndex]=value;
        nextElementIndex++;
        size++;
    }
    //получение элемента списка по индексу
    public int get(int index){
        return elements[index];
    }


}
