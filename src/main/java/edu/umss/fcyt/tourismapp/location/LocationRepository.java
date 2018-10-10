/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umss.fcyt.tourismapp.location;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lopez
 */
@Repository
public interface LocationRepository extends JpaRepository<Location, Long>{   
}
