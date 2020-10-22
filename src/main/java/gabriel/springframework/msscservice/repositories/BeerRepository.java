package gabriel.springframework.msscservice.repositories;

import gabriel.springframework.msscservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository <Beer, UUID>{





}
