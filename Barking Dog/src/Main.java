public class Main {
    public static void main(String[] args) {
        boolean[] toWakeUp = new boolean[10];
        int i=0;
        while(true)
        {
            toWakeUp[i] = BarkingDog.shouldWakeUp(true, 1);
            System.out.println(toWakeUp[i]);
            i++;

            toWakeUp[i] = BarkingDog.shouldWakeUp(false, 2);
            System.out.println(toWakeUp[i]);
            i++;

            toWakeUp[i] = BarkingDog.shouldWakeUp(true, 8);
            System.out.println(toWakeUp[i]);
            i++;

            toWakeUp[i] = BarkingDog.shouldWakeUp(true, -1);
            System.out.println(toWakeUp[i]);
            i++;

            break;
        }
    }
}
