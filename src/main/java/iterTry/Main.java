package iterTry;

public class Main {
    public static void main(String[] args){
        iterTry.ListNode<Integer> start= new iterTry.ListNode<>();

        start.add(5);
        start.add(6);
        start.add(7);
        start.add(9);

        for(Integer str: start){
            System.out.println(str);
        }

//        ListNodeIterator iter = (ListNodeIterator) start.iterator();
//        while(iter.hasNext()){
//            System.out.println(iter.nextEle.data);
//            iter.next();
//        }

    }
}
