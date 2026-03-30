static int floor(int[] arr, int target) {
    int l = 0, r = arr.length - 1, res = -1;

    while (l <= r) {
        int mid = (l + r) / 2;

        if (arr[mid] <= target) {
            res = arr[mid];
            l = mid + 1;
        } else r = mid - 1;
    }
    return res;
}

static int ceiling(int[] arr, int target) {
    int l = 0, r = arr.length - 1, res = -1;

    while (l <= r) {
        int mid = (l + r) / 2;

        if (arr[mid] >= target) {
            res = arr[mid];
            r = mid - 1;
        } else l = mid + 1;
    }
    return res;
}
