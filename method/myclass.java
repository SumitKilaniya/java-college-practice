class myclass {
    int num1;
    int num2;

    myclass() {
        this.num1 = 0;
        this.num2 = 0;
    }

    myclass(int x, int y) {
        this.num1 = x;
        this.num2 = y;
    }
}

class main {
    public static void main(String[] args) {
        myclass obj = new myclass();
        System.out.println(obj.num1);

        myclass obj2 = new myclass(10, 100);
        System.out.println(obj2.num2);
    }
}