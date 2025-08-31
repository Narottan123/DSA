public class TowerOfHanoi {
    public static void TowerRecursive(int disk, char source, char aux, char destination) {
        if (disk == 1) {
            System.out.println("Move 1 disk from " + source + " to " + destination);
            return;
        }
        TowerRecursive(disk - 1, source, destination, aux);
        System.out.println("Move disk " + disk + " from " + source + " to " + destination);
        TowerRecursive(disk - 1, aux, source, destination);
    }

    public static void main(String args[]) {
        int disk = 3;
        char source = 'A';
        char aux = 'B';
        char destination = 'c';
        TowerRecursive(3, source, aux, destination);
    }
}
