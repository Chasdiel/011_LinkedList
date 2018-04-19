public class LinkedListTest
{
    public static void main(String args[])
    {
        Node list = new Node(1);

        list.add(new Node(2));
        list.add(new Node(3));
        list.add(new Node(4));
        list.add(new Node(5));

//        System.out.println(list.wartosc);
//        System.out.println(list.nastepnik.wartosc);
//        System.out.println(list.nastepnik.nastepnik.wartosc);
//        System.out.println(list.nastepnik.nastepnik.nastepnik.wartosc);
//        System.out.println(list.nastepnik.nastepnik.nastepnik.nastepnik.wartosc);
        System.out.println("ilosc wystapien " + list.count1());
        System.out.println("ilosc wystapien2 " + list.count2());

        System.out.println("wypisz 1 ");
        list.listRecurs();
        int tempRemove = 6;
//        System.out.println("Usuwam element " + tempRemove + ":::");
////        list.removeN(tempRemove);
//        list.removeNRecurs(tempRemove);
        System.out.println();
//        System.out.println("Usuwam przez wartosc");
//        list.removeByValue(tempRemove);
        System.out.println("Usuwam przez wartosc rekurencyjnie");
        list.removeByValueRecurs(tempRemove);
        System.out.println();
        System.out.println("wypisz 1 ");
        list.listRecurs();
        System.out.println("wypisz 1 od tylu ");
        list.listRecursBackward();
//
//        System.out.println("wypisz 2");
//        list.list2();
    }
}

//ADD +
//COUNT +
//LISTALL +
//DELETE usuwanie n-tego elementu lub usuwanie wartosci
//	- obie rekurencyjnie i na pętli (jeśli się da)



