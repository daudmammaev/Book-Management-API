package app.demo.Repository;

import app.demo.models.Userr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Userr, Integer> {
    UserDetails findByUsername(String username);
}
