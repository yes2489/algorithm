import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // 직선 정보
    static class Line {
        char type; // x는 세로, y는 가로
        int value; // 직선의 위치 (0 ~ 10)

        public Line(char type, int value) {
            this.type = type;
            this.value = value;
        }
    }

    // 좌표 정보
    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Point> points = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int px = sc.nextInt();
            int py = sc.nextInt();
            points.add(new Point(px, py));
        }

        // 가능한 모든 직선 목록 생성
        ArrayList<Line> lines = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            lines.add(new Line('x', i));
            lines.add(new Line('y', i));
        }

        int size = lines.size();

        // 총 직선 중 서로 다른 3개를 고르는 반복문
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                for (int k = j + 1; k < size; k++) {

                    // 선택된 3개의 직선
                    Line line1 = lines.get(i);
                    Line line2 = lines.get(j);
                    Line line3 = lines.get(k);

                    // 지금 고른 3개 선으로 전부 지울 수 있음?
                    boolean allCovered = true;

                    for (Point p : points) {
                        // 현재 점 p가 3개의 직선 중 하나라도 겹침?
                        boolean isCovered = false;

                        // line1 검사
                        if ((line1.type == 'x' && p.x == line1.value)
                                || (line1.type == 'y' && p.y == line1.value)) {
                            isCovered = true;
                        }

                        // line2 검사
                        if ((line2.type == 'x' && p.x == line2.value)
                                || (line2.type == 'y' && p.y == line2.value)) {
                            isCovered = true;
                        }

                        // line3 검사
                        if ((line3.type == 'x' && p.x == line3.value)
                                || (line3.type == 'y' && p.y == line3.value)) {
                            isCovered = true;
                        }

                        // 만약 하나라도 cover 못하면 실패
                        if (!isCovered) {
                            allCovered = false;
                            break;
                        }
                    }

                    // 모든 점이 3개 선 안에 들어오면 성공
                    if (allCovered) {
                        System.out.println(1);
                        return;
                    }
                }
            }
        }

        // 모든 조합 확인했는데 성공 못했다면 0
        System.out.println(0);
    }
}