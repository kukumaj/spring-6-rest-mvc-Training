package richard.springframework.spring6restmvc.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import richard.springframework.spring6restmvc.entities.Customer;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
class CustomerRepositoryTest {
    @Autowired
    CustomerRepository customerRepository;

    @Test
    void testSaveCustomer() {
        Customer customer = customerRepository.save(Customer.builder()
                .name("New Name")
                .build());
        assertThat(customer.getId()).isNotNull();
    }


}