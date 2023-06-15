import solvingArray.MyArrayList;
public class Stack {
    MyArrayList<Object> arrayList = new MyArrayList<>();
    public void push(Object item){
        arrayList.add(item);
    }

    public void pop(){
        arrayList.removeByIndex(arrayList.size()-1);
    }
    public Object peek(){
       return arrayList.get(arrayList.size()-1);
    }
    public Boolean search(Object item){
        return arrayList.contain(item);
    }

    public Boolean isEmpty(){
        return arrayList.size() == 0;
    }
    public int getSize(){
        return arrayList.size();
    }
}
