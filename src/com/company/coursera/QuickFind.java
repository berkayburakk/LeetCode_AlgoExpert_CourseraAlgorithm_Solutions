package com.company.coursera;

public class QuickFind {
    private int[] id;

    public static void main(String[] args) {

    }

    public QuickFind(int N){
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    private void validate(int p) {
        int n = id.length;
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n-1));
        }
    }
    public int find(int p) {
        validate(p);
        return id[p];
    }
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];

        for (int i = 0; i < id.length; i++) {
            if(id[i]==pid)
                id[i] = qid;
        }
    }



}
