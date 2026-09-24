class mybook {
    int pages;
    String title;

    mybook(int num, String title) {
        pages = num;
        this.title = title;
    }
}

class Main {
    public static void main(String[] args) {
        mybook obj = new mybook(100, "Java");
        System.out.println(obj.pages);
        System.out.println(obj.title);
        mybook obj2 = new mybook(200, "Python");
        System.out.println(obj2.pages);
        System.out.println(obj2.title);
    }
}