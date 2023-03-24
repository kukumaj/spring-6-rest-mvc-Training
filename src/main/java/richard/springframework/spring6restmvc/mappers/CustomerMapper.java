package richard.springframework.spring6restmvc.mappers;

import org.mapstruct.Mapper;
import richard.springframework.spring6restmvc.entities.Customer;
import richard.springframework.spring6restmvc.model.CustomerDTO;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);
}
