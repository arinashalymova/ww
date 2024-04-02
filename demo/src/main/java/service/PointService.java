public interface PointService {
    Point addPoint(Point point);
    Point updatePoint(Long id, Point pointDetails);
    void deletePoint(Long id);
    List<Point> getAllPoints();
    List<Point> getPointsSortedByDistance(double centerLatitude, double centerLongitude);
}

