package priv.nightree.others.postofficelocation;

public class PostOfficeLocation {
    public static void main(String[] args) {
        int[] pos = {1, 2, 3, 4, 5, 1000};
        int num = 2;

        int[] diff = new int[pos.length - 1];
        for (int i = 0; i < pos.length; i++) {
            diff[i] = pos[i + 1] - pos[i];
        }
    }
}
