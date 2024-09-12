public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByLastId(Long lastId, Pageable pageable);
}
