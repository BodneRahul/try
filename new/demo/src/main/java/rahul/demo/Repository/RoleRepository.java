package rahul.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rahul.demo.Entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {


    Optional<Role> findByName(String name);
}
