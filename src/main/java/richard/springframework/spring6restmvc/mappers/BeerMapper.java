package richard.springframework.spring6restmvc.mappers;

import org.mapstruct.Mapper;
import richard.springframework.spring6restmvc.entities.Beer;
import richard.springframework.spring6restmvc.model.BeerDTO;

@Mapper
public interface BeerMapper {
    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);
}
