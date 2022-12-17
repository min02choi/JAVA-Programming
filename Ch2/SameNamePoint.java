package GeakPu.Ch2;

class SameNamePoint {
    int x, y;
}

class NameTest {
    public static SameNamePoint SameNamePoint(int x, int y) {
        SameNamePoint p = new SameNamePoint();
        p.x = x;
        p.y = y;
        return p;
    }

    public static void main(String args[]) {
        int SameNamePoint;
        SameNamePoint pa[] = new SameNamePoint[2];
        for (SameNamePoint = 0; SameNamePoint < 2; SameNamePoint++) {
            pa[SameNamePoint] = new SameNamePoint();
            pa[SameNamePoint].x = SameNamePoint;
            pa[SameNamePoint].y = SameNamePoint;
        }
        System.out.println(pa[0].x + "," + pa[0].y);
        System.out.println(pa[1].x + "," + pa[1].y);
        SameNamePoint p = SameNamePoint(3, 4);
        System.out.println(p.x + "," + p.y);
    }
}