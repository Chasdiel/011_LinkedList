class Node
{
    public Integer wartosc;
    public Node nastepnik = null;

    public Node(Integer liczba){
        this.wartosc = liczba;
    }

    //remove passed value recursively
    public void removeByValueRecurs(int value){
        if(this.wartosc == value){
            System.out.println("Sam sobie utnij glowe!");
        }else{
            if (nastepnik != null) {
                if (nastepnik.wartosc !=value) {
                    nastepnik.removeByValueRecurs(value);
                } else{
                    //operacje usuwania - sprawdzanie przypadkow
                    if (nastepnik.nastepnik != null){
                        System.out.println("Usunalem element o wartosci " + nastepnik.wartosc);
                        nastepnik = nastepnik.nastepnik; // usuwam nastepnika i przypisuje jego wartosc do nastepnego
                    } else {
                        System.out.println("Usunalem element o wartosci " + nastepnik.wartosc);
                        System.out.println("element o wartosci " + nastepnik.wartosc + " byl ostatnim elementem listy");
                        nastepnik = null;
                    }
                }
            } else {
                System.out.println("Obiekt o wartosci " + value + " nie istnieje.");
            }
        }
    }
    //remove passed value
    public void removeByValue(int value) {
        Node node = this;
        if (node.wartosc == value) {
            System.out.println("Nie mozesz pozbawic obiektu glowy. To niemoralne!");
        } else {
            while ((node.nastepnik!=null) &&(node.nastepnik.wartosc != value) ) {
//                System.out.println("tak, sprawdzam kolejny");
                node = node.nastepnik;
            }
            if (node.nastepnik == null ) {
                System.out.println("Z checia bym usunal obiekt o wartosci" + value + ", ale nie ma tu nic takiego."); } else
            if (node.nastepnik.nastepnik != null){
                System.out.println("Usunalem element o wartosci " + node.nastepnik.wartosc);
                node.nastepnik = node.nastepnik.nastepnik; // usuwam nastepnika i przypisuje jego wartosc do nastepnego
            } else {
                System.out.println("Usunalem element o wartosci " + node.nastepnik.wartosc);
                System.out.println("element o wartosci " + node.nastepnik.wartosc + " byl ostatnim elementem listy");
                node.nastepnik = null;
            }
        }
    }

    //delete n-th element
    public void removeN(int nth) {
        Node node = this;
        int i = 1;

        if (nth == i) {
            System.out.println("Nie mozesz pozbawic obiektu glowy. To niemoralne!");
        } else {
            while ((i != nth - 1) ) {
//                System.out.println("tak, sprawdzam kolejny");
                node = node.nastepnik;
                i++;
            }
            if ((node == null) || (node.nastepnik == null) ) {
                System.out.println("Z checia bym to usunal, ale nie ma tu nic takiego.");
            } else if (node.nastepnik.nastepnik != null){
                System.out.println("Usunalem element " + nth + " o wartosci " + node.nastepnik.wartosc);
                node.nastepnik = node.nastepnik.nastepnik; // usuwam nastepnika i przypisuje jego wartosc do nastepnego
            } else
            {
                System.out.println("Usunalem element " + nth + " o wartosci " + node.nastepnik.wartosc);
                System.out.println(nth + " byl ostatnim elementem listy");
                node.nastepnik = null;
            }
        }
    }

    //delete n-th element recursively
    public void removeNRecurs(int nth){
        if(nth==1){
            System.out.println("Sam sobie utnij glowe!");
        }else{
            if (nth > 2) {
                if (nastepnik != null) {
                    nastepnik.removeNRecurs(nth - 1);
                } else {
                    System.out.println("Nie mozna wykonac takiej operacji. Za duzy podany indeks");
                }
            } else{
                //operacje usuwania - sprawdzanie przypadkow
                if (nastepnik == null ) {
                    System.out.println("Z checia bym to usunal, ale nie ma tu nic takiego.");
                } else if (nastepnik.nastepnik != null){
                    System.out.println("Usunalem element " + nth + " o wartosci " + nastepnik.wartosc);
                    nastepnik = nastepnik.nastepnik; // usuwam nastepnika i przypisuje jego wartosc do nastepnego
                } else{
                    System.out.println("Usunalem element " + nth + " o wartosci " + nastepnik.wartosc);
                    System.out.println(nth + " byl ostatnim elementem listy");
                    nastepnik = null;
                }
            }
        }
    }


    //print all objects
    public void listRecurs(){
        System.out.println(wartosc);
        if (nastepnik != null )
            nastepnik.listRecurs();
    }

    public void listRecursBackward(){
        if (nastepnik != null ) {
            System.out.println("istnieje nastepnik");
            nastepnik.listRecursBackward();
        }
        System.out.println(wartosc);
    }

    public void list2(){
        Node node = this;
        while (node.nastepnik != null){
            System.out.println(node.wartosc);
            node = node.nastepnik;
        }
        System.out.println(node.wartosc);
    }

    //counting all objects
    public int count1(){
        if (this.nastepnik != null )
            return 1 + nastepnik.count1();
        return 1;
    }

    public int count2(){
        Node node = this;
        int quantity = 1;
        while (node.nastepnik != null){
            node = node.nastepnik;
            quantity++;
        }
        return quantity;
    }

    //adding objects
    public void add(Node node)
    {
        if(node != null)
        {
            if(nastepnik != null)
                nastepnik.add(node);
            else
                nastepnik = node;
        }
        else
            System.out.println("Nie moge! Litosci.");
    }
}