package lap_trinh_tong_quat;

import java.util.List;

public class Week11<T> {
    /**
     * sortGeneric.
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j).compareTo(arr.get(j + 1)) > 0) {
                    T temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
        return arr;
    }
}
