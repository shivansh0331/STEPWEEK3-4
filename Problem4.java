static void mergeSortAssets(Asset[] arr, int l, int r) {
    if (l >= r) return;
    int m = (l + r) / 2;

    mergeSortAssets(arr, l, m);
    mergeSortAssets(arr, m + 1, r);
    mergeAssets(arr, l, m, r);
}

static void mergeAssets(Asset[] arr, int l, int m, int r) {
    List<Asset> temp = new ArrayList<>();
    int i = l, j = m + 1;

    while (i <= m && j <= r)
        temp.add(arr[i].ret <= arr[j].ret ? arr[i++] : arr[j++]);

    while (i <= m) temp.add(arr[i++]);
    while (j <= r) temp.add(arr[j++]);

    for (int k = 0; k < temp.size(); k++)
        arr[l + k] = temp.get(k);
}
