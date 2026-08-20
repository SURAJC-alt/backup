public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.6,7.4,3.1);
        // Box box2 = new Box(box1);
        BoxWeigth box3 = new BoxWeigth();
        BoxWeigth box4 = new BoxWeigth(2,3,4,5);
        System.out.println(box1.l+" "+box1.h+" "+box1.w);
        
    }
}
