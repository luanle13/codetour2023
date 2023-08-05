import java.util.*;

public class Main {
    public static class Point implements Comparable<Point>{
        public double distance;
        public int id;

        public Point(double distance, int id) {
            this.distance = distance;
            this.id = id;
        }

        @Override
        public int compareTo(Point o) {
            if (this.distance > o.distance) return 1;
            else if (this.distance < o.distance) return -1;
            else return 0;
        }
    }

    public static double calculateDistance(double x1, double y1, double z1, double x2, double y2, double z2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) + Math.pow((z2 - z1), 2));
        return distance;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        double r = scanner.nextDouble();
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();
        double z0 = scanner.nextDouble();
        int[] a = new int[n];
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < n; i++){
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double z = scanner.nextDouble();
            int value = scanner.nextInt();
            a[i] = value;
            double distance = calculateDistance(x0, y0, z0, x, y, z);
            if (distance <= r){
                points.add(new Point(distance, i));
            }
        }

        Collections.sort(points);
        long ans = 0;
        for (int i = 0; i < Math.min(k, points.size()); i++){
            ans += a[points.get(i).id];
        }

        System.out.println(ans);
    }
}