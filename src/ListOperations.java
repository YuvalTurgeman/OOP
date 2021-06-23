public class ListOperations {

    public static <T> void printVertical(List <T> someList){
        for(int i = 0;i< someList.size();i++)
            System.out.println(someList.get(i));
    }

    public static <T> void reverse(List <T> someList){
        int size = someList.size();
        for(int i = 0; i < size/2;i++){
            T element1 = someList.get(i);
            T element2 = someList.get(size - 1 - i);
            someList.set(element2,i);
            someList.set(element1,size - 1 - i);
        }
    }

}
