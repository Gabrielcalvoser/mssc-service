package gabriel.springframework.msscservice.mapper;

import gabriel.springframework.msscservice.domain.Beer;
import gabriel.springframework.msscservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerDomainToBeerDto (Beer beer);

    Beer beerDtoToBeerDomain (BeerDto beerDto);

}
