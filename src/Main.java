public class Main {

    public static void main(String[] args) {
        LinkedStringListImpl newList = new LinkedStringListImpl();


        System.out.println(newList);
        System.out.println(newList.size());
        System.out.println(newList.get(0));

        newList.add("hi");
        System.out.println(newList);
        System.out.println(newList.size());
        System.out.println(newList.get(0));

        newList.add("there");
        System.out.println(newList);
        System.out.println(newList.size());
        System.out.println(newList.get(1));

        newList.add("my");
        System.out.println(newList);
        System.out.println(newList.size());
        System.out.println(newList.get(2));

        newList.add("long");
        System.out.println(newList);
        System.out.println(newList.size());
        System.out.println(newList.get(3));


        newList.add("lost");
        System.out.println(newList);
        System.out.println(newList.size());
        System.out.println(newList.get(4));

        newList.add("buddy");
        System.out.println(newList);
        System.out.println(newList.size());
        System.out.println(newList.get(5));

        System.out.println(newList.get(9));

        newList.remove(0);
        System.out.println(newList);

        newList.remove(4);
        System.out.println(newList);

        newList.remove(10);
        System.out.println(newList);

        newList.remove(1);
        System.out.println(newList);

        newList.replace(0,"hi");
        System.out.println(newList);

        newList.replace(19,"out of bounds");
        System.out.println(newList);

        newList.replace(1,null);
        System.out.println(newList);

        newList.replace(2,null);
        System.out.println(newList);

        newList.collapse();
        System.out.println(newList);
        

    }
}
