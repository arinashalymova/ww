package com.ваш_пакет.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.paket.model.Point;

public interface PointRepository extends JpaRepository<Point, Long> {

}
