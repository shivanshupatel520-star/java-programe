package loopsL7;
import java.util.*;
import java.awt.geom.*;

public class MMbox {

    static double EPS = 1e-9;

    // Polygon area (Shoelace formula)
    static double area(List<Point2D.Double> poly) {
        double a = 0;
        int n = poly.size();
        for (int i = 0; i < n; i++) {
            Point2D.Double p = poly.get(i);
            Point2D.Double q = poly.get((i + 1) % n);
            a += p.x * q.y - p.y * q.x;
        }
        return Math.abs(a) / 2.0;
    }

    // Line intersection
    static Point2D.Double intersect(Line2D.Double l1, Line2D.Double l2) {
        double A1 = l1.y2 - l1.y1;
        double B1 = l1.x1 - l1.x2;
        double C1 = A1 * l1.x1 + B1 * l1.y1;

        double A2 = l2.y2 - l2.y1;
        double B2 = l2.x1 - l2.x2;
        double C2 = A2 * l2.x1 + B2 * l2.y1;

        double det = A1 * B2 - A2 * B1;

        if (Math.abs(det) < EPS) return null; // parallel

        double x = (B2 * C1 - B1 * C2) / det;
        double y = (A1 * C2 - A2 * C1) / det;

        return new Point2D.Double(x, y);
    }

    // Offset polygon inward by H
    static List<Point2D.Double> shrink(List<Point2D.Double> poly, double H) {
        int n = poly.size();
        List<Line2D.Double> shifted = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Point2D.Double p1 = poly.get(i);
            Point2D.Double p2 = poly.get((i + 1) % n);

            double dx = p2.x - p1.x;
            double dy = p2.y - p1.y;
            double len = Math.hypot(dx, dy);
            if (len < 2 * H + 0.1) return null;

            // normalized inward normal
            double nx = -dy / len;
            double ny = dx / len;

            // shift the line inward by H
            shifted.add(new Line2D.Double(
                    p1.x + nx * H, p1.y + ny * H,
                    p2.x + nx * H, p2.y + ny * H
            ));
        }

        List<Point2D.Double> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Point2D.Double pt = intersect(
                    shifted.get(i),
                    shifted.get((i + 1) % n)
            );
            if (pt == null) return null;
            result.add(pt);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        List<Point2D.Double> pts = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] s = sc.nextLine().trim().split("\\s+");
            pts.add(new Point2D.Double(
                    Double.parseDouble(s[0]),
                    Double.parseDouble(s[1])
            ));
        }

        double best = 0.0;
        for (double H = 0.1; H <= 50; H += 0.1) {
            List<Point2D.Double> shrinked = shrink(pts, H);
            if (shrinked == null) break;
            double a = area(shrinked);
            best = Math.max(best, a * H);
        }

        System.out.printf("%.2f\n", best);
    }
}
