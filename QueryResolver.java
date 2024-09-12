@Component
public class QueryResolver implements GraphQLResolver<Query> {
    @Autowired
    private UserRepository userRepository;

    public List<User> users(Long lastId, int pageSize) {
        Pageable pageable = PageRequest.of(0, pageSize);
        return userRepository.findByLastId(lastId, pageable);
    }
}
