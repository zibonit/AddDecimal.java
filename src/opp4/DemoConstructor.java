package opp4;

public class DemoConstructor {
        int x;
        int y;

        double a;
        double b;

    public DemoConstructor(){
        x=10;
        y=15;
    }

    public DemoConstructor(int x, int y){
       this.x= x;
        this.y= y;
    }

        void add() {
            int sum = x+y;
            System.out.println(sum);
        }
        void addDouble(){
        double sum = a +b;
            System.out.println(sum);
        }
        public static  void main(String[] args) {

        DemoConstructor dc1 = new DemoConstructor();
            dc1.add();

            DemoConstructor dc2 = new DemoConstructor();
            dc2.addDouble();

            DemoConstructor dc3 = new DemoConstructor(200,300);
            dc3.add();
        }

    }

