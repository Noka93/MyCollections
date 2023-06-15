import solvingArray.MyArrayList;

public class Queque {
    MyArrayList<Object>arrayList = new MyArrayList<>();

    public void offer(Object e){
        arrayList.add(e);
    }

    public Boolean add(Object e){
        if (e == null) throw new IllegalArgumentException();
        arrayList.add(e);
        return true;
    }
    public void poll(){
        arrayList.removeByIndex(arrayList.size()-1);
    }

    public void remove(){
        arrayList.removeByIndex(arrayList.size()-1);
    }

    public void element(){
        arrayList.get(arrayList.size()-1);
    }
    public void peek(){
        arrayList.get(arrayList.size());
    }

//    private Boolean isEmpty(){
//        return arrayList.size() == 0;
//    }
    public int size(){
        return arrayList.size();
    }

    public void getAll(){
        arrayList.getAll();
    }
}

