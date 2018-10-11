package edu.umss.fcyt.tourismapp.touristpackage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TouristPackageRepository extends JpaRepository<Package, Long>
{
	List<Package> findByName(String name);
}