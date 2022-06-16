package algorithms;

public class BinarySearch {

    public static Integer findIndex(int[] list, int element) {
        var down = 0;
        var up = list.length - 1;

        while (down <= up) {
            var half = (down + up) / 2;
            var kick = list[half];
            if (kick == element) {
                return half;
            } else if (kick > element) {
                up = --half;
            } else {
                down = ++half;
            }
        }
        return null;
    }
}
