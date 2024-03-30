//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {

        int buy1 = buy1(0, 4);
        int buy2 = buy2(3, 4, 5);
        double buy3 = buy3(3, 4, 5);
        double buy4 = buy4(3, 0, 0);

        System.out.println(buy1);
        System.out.println(buy2);
        System.out.println(buy3);
        System.out.println(buy4);
    }

    public static int buy1(int caomei, int pinguo) {

        int i = 8 * caomei + 13 * pinguo;

        return i;
    }

    public static int buy2(int caomei, int pinguo, int manguo) {

        int buy = buy1(caomei, pinguo);

        int i = buy + 20 * manguo;

        return i;
    }

    public static double buy3(int caomei, int pinguo, int manguo) {

        int i = buy2(caomei, pinguo, manguo);
        double v = 0.2 * 8 * caomei;
        double v1 = i - v;
        return v1;
    }

    public static double buy4(int caomei, int pinguo, int manguo) {
        double v = buy3(caomei, pinguo, manguo);
        double floor = Math.floor(v /100);
        double v1 = v - floor * 10;
        return v1;
    }

}