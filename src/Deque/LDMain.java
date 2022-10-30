package Deque;

public class LDMain {
    public static void main(String[] args) {
        LinkedDeque<String> ld = new LinkedDeque<>();
        ld.addToFront("Mike");
        ld.addToFront("Marissa");

        System.out.println("getFront: " + ld.getFront() + " size: " + ld.getSize());
        System.out.println("getBack: " + ld.getBack() + " size: " + ld.getSize());
        try {
            System.out.println("removeFront: " + ld.removeFront() + " size: " + ld.getSize());
        } catch (EmptyQueueException e) {
            System.out.println(e);
        }

        System.out.println("getBack: " + ld.getBack() + " size: " + ld.getSize());
        try {
            System.out.println("removeBack: " + ld.removeBack() + " size: " + ld.getSize());
        } catch (EmptyQueueException e) {
            System.out.println(e);
        }

    }
}
