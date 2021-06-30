package com.company.coursera;

public class SuccessorWithDelete {

    public static void main(String[] args){
        SuccessorWithDelete swd = new SuccessorWithDelete(30);
        swd.remove(11);
        swd.remove(13);
        swd.remove(12);
        swd.remove(10);
        swd.remove(9);
        swd.remove(15);
        System.out.println(swd.successor(11));
        System.out.println(swd.successor(13));
        System.out.println(swd.successor(12));
        System.out.println(swd.successor(10));
        System.out.println(swd.successor(9));
        System.out.println(swd.successor(15));


    }
    // 0-1-2-3-4-5-6-7-8-9-10-11-12-13-14-15-16-17-18-19-20-21-22-23-24-25-26-27-28-29-30
    // 0-1-2-3-4-5-6-7-8-9-10-11-12-13-14-15-16-17-18-19-20-21-22-23-24-25-26-27-28-29-30

    private QuickFind uf;
    public SuccessorWithDelete(int N) {
        uf = new QuickFind(N);
    }
    public void remove(int x) {
        uf.union(x, x+1);
    }
    public int successor(int x) {
        return uf.find(x);
    }



}
